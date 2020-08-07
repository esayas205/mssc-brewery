package guru.springframwork.msscbrewery.service;

import guru.springframwork.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("New Customer")
                .build();
    }

    @Override
    public CustomerDto newCustomer(CustomerDto customer) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("New Customer")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(UUID customerId) {

    }
}
