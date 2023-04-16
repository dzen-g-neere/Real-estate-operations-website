package com.dzen.flatcom.house;

import com.dzen.flatcom.apartment.parametrs.InternetConnection;
import lombok.Data;

@Data
public class HouseDTO{
    private long id;
    private String name;
    private String address;
    private String serviceType;
    private String description;
    private float price;
    private String currency;
    private float area;
    private int roomsAmount;
    private int builtYear;
    private InternetConnection internetConnection;
    private boolean hasOven;
    private boolean hasTV;
    private boolean hasFurniture;
    private boolean subwayNearby;
    private boolean hasGas;
    private boolean hasElectricity;
    private boolean hasHeating;
}
