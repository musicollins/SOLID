package com.grit.Models;

import java.util.UUID;

public class CustomerDTO {
    public UUID Id;
    public Long pNr;
    public String Firstname;
    public String Lastname;
    public String Fullname = Firstname+ " " + Lastname;

    public CustomerDTO(String firstname, String lastname, Long pnr) {
        Id = UUID.randomUUID();
        Firstname = firstname;
        Lastname = lastname;
        pNr = pnr;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "Id=" + Id +
                ", pNr=" + pNr +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Fullname='" + Fullname + '\'' +
                '}';
    }
}
