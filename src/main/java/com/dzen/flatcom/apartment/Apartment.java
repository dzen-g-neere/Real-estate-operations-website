package com.dzen.flatcom.apartment;

import com.dzen.flatcom.apartment.parametrs.InternetConnection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
//Decorator
@Entity
@Data
public class Apartment{
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
    private boolean studioType;
    private int builtYear;
    private InternetConnection internetConnection;
    private boolean hasOven;
    private boolean hasTV;
    private boolean hasFurniture;
    private boolean subwayNearby;
    private String uploadDate;
}
