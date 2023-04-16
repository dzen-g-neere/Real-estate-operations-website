package com.dzen.flatcom.staff;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class Admin extends Staff{
    private boolean restartServer(){
        return true;
    }
}
