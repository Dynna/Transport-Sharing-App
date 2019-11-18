package com.utm.udrive.dao;
import com.utm.udrive.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface TripRepository extends  JpaRepository<Trip, Long>,QueryByExampleExecutor<Trip>{
    Optional<Trip>findById(Long id);
}
