package com.beer.msscbeerservice.web.mappers;

import com.beer.msscbeerservice.domain.Customer;
import com.beer.msscbeerservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by Fassil on 27/09/20.
 */
@Mapper
public interface CustomerMapper {
    CustomerDto customerDtoTocustomer(CustomerDto customerDto);
    Customer customerTocustomerDto(Customer customer);
}
