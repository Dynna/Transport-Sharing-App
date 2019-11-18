package com.utm.udrive.dao;


import com.utm.udrive.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>, QueryByExampleExecutor<Car> {
        Optional<Car> findById(Long Id);
}
