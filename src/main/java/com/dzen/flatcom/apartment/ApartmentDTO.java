package com.dzen.flatcom.apartment;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class ApartmentDTO{
    private long id;
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    private String serviceType;
    private String description;
    @NotBlank
    private float price;
    @NotBlank
    private String currency;
    private float area;
    private int roomsAmount;
    private boolean studioType;
    private int builtYear;
    private String internetConnection;
    private boolean hasOven;
    private boolean hasTV;
    private boolean hasFurniture;
    private boolean subwayNearby;
    private String uploadDate;
}
