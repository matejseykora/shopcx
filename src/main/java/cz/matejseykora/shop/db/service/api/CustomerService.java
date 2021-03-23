package cz.matejseykora.shop.db.service.api;

import cz.matejseykora.shop.domain.Customer;
import org.springframework.lang.Nullable;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();

    @Nullable
    Customer get(int id);

    @Nullable
    Integer addCustomer(Customer customer); // returns generated id
}
