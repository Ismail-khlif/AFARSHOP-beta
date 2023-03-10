package com.example.afarshop_spring.Service.Order;

import com.example.afarshop_spring.Entity.*;
import com.example.afarshop_spring.Service.*;
import com.example.afarshop_spring.Repository.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class OrderServices implements ICRUDService<Order,Long> , IOrderServices {

    OrderRepository orderRepository;
    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order retrieveItem(Long idItem) {
        return orderRepository.findById(idItem).get();
    }

    @Override
    public Order add(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(Long orderId) {
        orderRepository.deleteById(orderId);

    }



    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }
}