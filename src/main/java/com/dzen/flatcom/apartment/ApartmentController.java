package com.dzen.flatcom.apartment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//Chain of responsibility -> -> ->
//Decorator
@RestController
public class ApartmentController {
    @Autowired
    public ApartmentController(ApartmentRepository apartmentRepository, ApartmentMapper apartmentMapper) {
        this.apartmentRepository = apartmentRepository;
        this.apartmentMapper = apartmentMapper;
    }
    ApartmentRepository apartmentRepository;
    ApartmentMapper apartmentMapper;
    @RequestMapping(value = "api/apartment/create", method = {RequestMethod.POST})
    public ResponseEntity<?> createApartment(@Validated @RequestBody ApartmentDTO apartmentDTO) {
        System.out.println("apartmentDTO = " + apartmentDTO);
        Apartment newApartment = apartmentMapper.toUser(apartmentDTO);
        apartmentRepository.save(newApartment);
        return new ResponseEntity<>("Apartment successfully created!", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/apartment/update", method = {RequestMethod.POST})
    public ResponseEntity<?> updateApartment(@RequestBody ApartmentDTO apartmentDTO) {
        Apartment updateApartment = apartmentRepository.getReferenceById(apartmentDTO.getId());
        updateApartment.setArea(apartmentDTO.getArea());
        updateApartment.setAddress(apartmentDTO.getAddress());
        updateApartment.setBuiltYear(apartmentDTO.getBuiltYear());
        updateApartment.setHasFurniture(apartmentDTO.isHasFurniture());
        updateApartment.setHasTV(apartmentDTO.isHasTV());
        updateApartment.setHasOven(apartmentDTO.isHasOven());
        updateApartment.setRoomsAmount(apartmentDTO.getRoomsAmount());
        updateApartment.setSubwayNearby(apartmentDTO.isSubwayNearby());
        updateApartment.setStudioType(apartmentDTO.isStudioType());
        updateApartment.setServiceType(apartmentDTO.getServiceType());
        updateApartment.setCurrency(apartmentDTO.getCurrency());
        updateApartment.setDescription(apartmentDTO.getDescription());
        updateApartment.setPrice(apartmentDTO.getPrice());
        apartmentRepository.save(updateApartment);
        return new ResponseEntity<>("Apartment successfully updated!", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/apartment/get", method = {RequestMethod.POST})
    public ResponseEntity<?> getApartments() {
        return new ResponseEntity<>(apartmentRepository.findAll(), HttpStatus.OK);
    }
    @RequestMapping(value = "/api/apartment/delete", method = {RequestMethod.DELETE})
    public ResponseEntity<?> deleteApartment(@RequestBody ApartmentDTO apartmentDTO) {
        apartmentRepository.deleteById(apartmentDTO.getId());
        return new ResponseEntity<>("Apartment successfully deleted!", HttpStatus.OK);
    }
}
