package com.qa.fundamental_project.repo;

import com.qa.fundamental_project.domain.BikeParks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeParkRepository extends JpaRepository<BikeParks, Long> {
}
