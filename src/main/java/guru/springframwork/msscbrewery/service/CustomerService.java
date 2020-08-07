package guru.springframwork.msscbrewery.service;

import guru.springframwork.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID id);

    CustomerDto newCustomer(CustomerDto customer);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
