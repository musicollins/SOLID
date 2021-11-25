package com.grit.DataSource;

import com.grit.Models.CustomerDTO;

import java.util.List;

public interface IDataSource {
    List<CustomerDTO> GetData();
}
