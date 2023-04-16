package com.dzen.flatcom.apartment;

import org.springframework.stereotype.Component;

@Component
class ApartmentMapper {
    public ApartmentDTO toDto(Apartment apartment) {


        return new ApartmentDTO();
    }

    public Apartment toUser(ApartmentDTO apartmentDTO) {
        Apartment newApartment = new Apartment();
        newApartment.setArea(apartmentDTO.getArea());
        newApartment.setAddress(apartmentDTO.getAddress());
        newApartment.setBuiltYear(apartmentDTO.getBuiltYear());
        newApartment.setHasFurniture(apartmentDTO.isHasFurniture());
        newApartment.setHasTV(apartmentDTO.isHasTV());
        newApartment.setHasOven(apartmentDTO.isHasOven());
        newApartment.setRoomsAmount(apartmentDTO.getRoomsAmount());
        newApartment.setSubwayNearby(apartmentDTO.isSubwayNearby());
        newApartment.setStudioType(apartmentDTO.isStudioType());
        newApartment.setServiceType(apartmentDTO.getServiceType());
        newApartment.setCurrency(apartmentDTO.getCurrency());
        newApartment.setDescription(apartmentDTO.getDescription());
        newApartment.setPrice(apartmentDTO.getPrice());
        newApartment.setUploadDate(apartmentDTO.getUploadDate());
        return newApartment;
    }
}
