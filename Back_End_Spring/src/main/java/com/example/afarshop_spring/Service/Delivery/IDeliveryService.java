package com.example.afarshop_spring.Service.Delivery;

import com.example.afarshop_spring.Entity.Delivery;

import java.util.List;

public interface IDeliveryService {
    List<Delivery> retrieveAllDeliveries();
    Delivery addDelivery(Delivery delivery);
    void deleteDelivery(Long id);
    Delivery updateDelivery(Delivery delivery);

}