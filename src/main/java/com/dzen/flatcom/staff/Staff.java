package com.dzen.flatcom.staff;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


public abstract class Staff {

    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
}
