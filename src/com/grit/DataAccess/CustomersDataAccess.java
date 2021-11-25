package com.grit.DataAccess;

import com.grit.DataSource.IDataSource;
import com.grit.Models.CustomerDTO;

import java.util.List;

public class CustomersDataAccess implements IDataAccess {

    private final IDataSource dataSource;

    public CustomersDataAccess(IDataSource dataSource) {
        this.dataSource = dataSource;

    }


    public List<CustomerDTO> GetAll(){
        return dataSource.GetData();
    }
}
