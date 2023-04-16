package com.dzen.flatcom.house;

import com.dzen.flatcom.house.parametrs.InternetConnection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class House{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
