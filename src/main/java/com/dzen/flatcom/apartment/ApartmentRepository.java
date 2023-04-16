package com.dzen.flatcom.apartment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    Apartment findApartmentById(Long id);
    List<Apartment> findTop15ByOrderByUploadDateDesc(String uploadDate);
}
