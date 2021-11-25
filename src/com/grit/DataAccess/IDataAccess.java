package com.grit.DataAccess;

import com.grit.Models.CustomerDTO;

import java.util.List;

public interface IDataAccess {
    List<CustomerDTO> GetAll();
}
