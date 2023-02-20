package com.example.afarshop_spring.Repository;

import com.example.afarshop_spring.Entity.HomeDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeDeliveryRepository extends JpaRepository<HomeDelivery,Long> {
}
