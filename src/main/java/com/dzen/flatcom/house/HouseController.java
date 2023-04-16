package com.dzen.flatcom.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {
    @Autowired
    public HouseController(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }
    HouseRepository houseRepository;
    @RequestMapping(value = "api/house/create", method = {RequestMethod.POST})
    public ResponseEntity<?> createHouse(@RequestBody HouseDTO houseDTO) {
        System.out.println("houseDTO = " + houseDTO);
        House newHouse = new House();
        newHouse.setArea(houseDTO.getArea());
        newHouse.setAddress(houseDTO.getAddress());
        newHouse.setBuiltYear(houseDTO.getBuiltYear());
        newHouse.setHasFurniture(houseDTO.isHasFurniture());
        newHouse.setHasTV(houseDTO.isHasTV());
        newHouse.setHasOven(houseDTO.isHasOven());
        newHouse.setRoomsAmount(houseDTO.getRoomsAmount());
        newHouse.setSubwayNearby(houseDTO.isSubwayNearby());
        newHouse.setServiceType(houseDTO.getServiceType());
        newHouse.setCurrency(houseDTO.getCurrency());
        newHouse.setDescription(houseDTO.getDescription());
        newHouse.setPrice(houseDTO.getPrice());
        newHouse.setHasElectricity(houseDTO.isHasElectricity());
        newHouse.setHasGas(houseDTO.isHasGas());
        newHouse.setHasHeating(houseDTO.isHasHeating());
        houseRepository.save(newHouse);
        return new ResponseEntity<>("House successfully created!", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/house/update", method = {RequestMethod.POST})
    public ResponseEntity<?> updateHouse(@RequestBody HouseDTO houseDTO) {
        House updateHouse = houseRepository.findHouseById(houseDTO.getId());
        updateHouse.setArea(houseDTO.getArea());
        updateHouse.setAddress(houseDTO.getAddress());
        updateHouse.setBuiltYear(houseDTO.getBuiltYear());
        updateHouse.setHasFurniture(houseDTO.isHasFurniture());
        updateHouse.setHasTV(houseDTO.isHasTV());
        updateHouse.setHasOven(houseDTO.isHasOven());
        updateHouse.setRoomsAmount(houseDTO.getRoomsAmount());
        updateHouse.setSubwayNearby(houseDTO.isSubwayNearby());
        updateHouse.setServiceType(houseDTO.getServiceType());
        updateHouse.setCurrency(houseDTO.getCurrency());
        updateHouse.setDescription(houseDTO.getDescription());
        updateHouse.setPrice(houseDTO.getPrice());
        updateHouse.setHasElectricity(houseDTO.isHasElectricity());
        updateHouse.setHasGas(houseDTO.isHasGas());
        updateHouse.setHasHeating(houseDTO.isHasHeating());
        houseRepository.save(updateHouse);
        return new ResponseEntity<>("House successfully updated!", HttpStatus.OK);
    }

    @RequestMapping(value = "/api/house/get", method = {RequestMethod.POST})
    public ResponseEntity<?> getApartments() {
        return new ResponseEntity<>(houseRepository.findAll(), HttpStatus.OK);
    }
    @RequestMapping(value = "/api/house/delete", method = {RequestMethod.DELETE})
    public ResponseEntity<?> deleteApartment(@RequestBody HouseDTO houseDTO) {
        houseRepository.deleteById(houseDTO.getId());
        return new ResponseEntity<>("House successfully deleted!", HttpStatus.OK);
    }
}
