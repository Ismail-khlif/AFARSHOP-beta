package com.example.afarshop_spring.Controller.Store;

import com.example.afarshop_spring.Entity.Store;
import com.example.afarshop_spring.Service.Store.IStoreServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StoreController {

    IStoreServices storeServices;


    @PostMapping("/addStore")
    public Store addStore (@RequestBody Store store){
        return storeServices.addStore(store);
    }

    @PutMapping("/updateStore")
    public Store updateStore (@RequestBody Store store ){
        return storeServices.updateStore(store);
    }

    @DeleteMapping("/deleteStore/{storeId}")
    public void deleteStore(@PathVariable("storeId") Long storeId){
        storeServices.deleteStore(storeId);
    }

    @GetMapping("/getStore/{storeId}")
    public Store getStore (@PathVariable("storeId") Long storeId){
        return  storeServices.getStore(storeId);
    }

    @GetMapping("/getAllStores")
    public List<Store> getAllStores (){
        return  storeServices.getAllStores();
    }



}
