package com.grit;

import com.grit.DataAccess.CustomersDataAccess;
import com.grit.DataSource.JsonDataSource;
import com.grit.DataSource.MockDataSource;
import com.grit.DataSource.TextfileDataSource;

public class Main {

    public static void main(String[] args) {
	//this is the UI (User Interface)

        CustomersDataAccess dataAccess = new CustomersDataAccess(new MockDataSource());
        var customers = dataAccess.GetAll();

        for(var cust : customers)
        {
            System.out.println(cust);
        }
    }
}
