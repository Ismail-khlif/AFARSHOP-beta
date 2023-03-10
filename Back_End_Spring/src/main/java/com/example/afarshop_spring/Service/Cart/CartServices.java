package com.example.afarshop_spring.Service.Cart;

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
public class CartServices implements ICRUDService<Cart,Long> , ICartServices {

    CartRepository cartRepsitory;

    @Override
    public List<Cart> findAll() {

        return cartRepsitory.findAll();
    }

    @Override
    public Cart retrieveItem(Long idCart) {
        return cartRepsitory.findById(idCart).get();
    }

    @Override
    public Cart add(Cart cart) {

        return cartRepsitory.save(cart);
    }

    @Override
    public void delete(Long cartId) {

        cartRepsitory.deleteById(cartId);
    }

    @Override
    public Cart update(Cart cart) {
        return cartRepsitory.save(cart);
    }


}