package com.example.afarshop_spring.Service.Store;

import com.example.afarshop_spring.Entity.Store;

import java.util.List;

public interface IStoreServices {
    public Store addStore (Store store);

    public void deleteStore(Long storeId);

    public Store updateStore (Store store);

    public Store getStore (Long storeId);

    public List<Store> getAllStores ();

}
