package com.dzen.flatcom.staff;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;


public class Promoter extends Staff{
    private boolean createAdvertisement(){
        return true;
    }
    private boolean viewAdvertisement(){
        return true;
    }
    private boolean updateAdvertisement(){
        return true;
    }
    private boolean deleteAdvertisement(){
        return true;
    }
}
