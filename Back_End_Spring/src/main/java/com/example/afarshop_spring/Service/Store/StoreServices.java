package com.example.afarshop_spring.Service.Store;

import com.example.afarshop_spring.Entity.Store;
import com.example.afarshop_spring.Repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class StoreServices implements IStoreServices {

        @Autowired
        StoreRepository storeRepository;

        @Override
        public Store addStore (Store store){
            return storeRepository.save(store);
        }

        @Override
        public Store updateStore ( Store store){
            return storeRepository.save(store);
        }

        @Override
        public void deleteStore(Long storeId){
            storeRepository.deleteById(storeId);
        }

        @Override
        public Store getStore (Long storeId){
            return storeRepository.findById(storeId).orElse(null);
        }

        @Override
        public List<Store> getAllStores (){
            return storeRepository.findAll();
        }
}
