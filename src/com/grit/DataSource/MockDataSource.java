package com.grit.DataSource;

import com.grit.Models.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

public class MockDataSource implements IDataSource {

    private ArrayList<CustomerDTO> Customers;

    public MockDataSource() {
        Customers = new ArrayList<>(){
            {
                add(new CustomerDTO("Rafael", "Milanés", 19911116L));
                add(new CustomerDTO("John", "Smith", 19811016L));

            }
        };
    }

    public List<CustomerDTO> GetData(){
        return Customers;
    }

}
