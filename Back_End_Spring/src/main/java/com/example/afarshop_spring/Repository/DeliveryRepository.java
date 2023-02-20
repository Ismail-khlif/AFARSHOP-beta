package com.example.afarshop_spring.Repository;

import com.example.afarshop_spring.Entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Long> {
}