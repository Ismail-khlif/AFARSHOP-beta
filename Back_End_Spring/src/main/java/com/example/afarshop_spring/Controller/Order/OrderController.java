package com.example.afarshop_spring.Controller.Order;

import com.example.afarshop_spring.Entity.*;
import com.example.afarshop_spring.Repository.*;
import com.example.afarshop_spring.Service.Order.OrderServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/order/")
public class OrderController {

    OrderServices orderService;

    @GetMapping("/retrive_all_orders")
    public List<Order> retrieveOrderList(){
        return orderService.findAll();
    }

    @GetMapping("/retrive_order/{orderId}")
    public Order retrieveOrder(@PathVariable("orderId") Long orderId){
        return orderService.retrieveItem(orderId);
    }

    @PostMapping("/add_order")
    public Order addOrder(@RequestBody Order order){
        return orderService.add(order);
    }

    @PutMapping("/update_order")
    public Order updateOrder(@RequestBody Order order){
        return orderService.update(order);
    }

    @DeleteMapping("/delete_order/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId){
        orderService.delete(orderId);
    }

}