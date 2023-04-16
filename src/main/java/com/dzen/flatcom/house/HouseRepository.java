package com.dzen.flatcom.house;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
    House findHouseById(Long id);
}
