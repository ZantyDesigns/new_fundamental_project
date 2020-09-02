package com.qa.fundamental_project.repo;

import com.qa.fundamental_project.domain.Trails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrailRepository extends JpaRepository<Trails, Long> {
}
