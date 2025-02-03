package com.design.patterns.design_patterns_gof.modules.services;

import com.design.patterns.design_patterns_gof.modules.entities.Address;
import com.design.patterns.design_patterns_gof.modules.entities.Client;
import com.design.patterns.design_patterns_gof.modules.repositories.AddressRepository;
import com.design.patterns.design_patterns_gof.modules.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ViaCepService viaCepService;

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public void insert(Client client) {
        saveClientWithCEP(client);
    }


    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }

    public void update(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if (clientBd.isPresent()) {
            saveClientWithCEP(client);
        }
    }

    private void saveClientWithCEP(Client client) {
        String cep = client.getAddress().getCep();
        Address address = addressRepository.findById(cep).orElseGet(() -> {
            Address newAddress = viaCepService.getAddress(cep);
            addressRepository.save(newAddress);
            return newAddress;
        });
        client.setAddress(address);
        clientRepository.save(client);
    }
}
