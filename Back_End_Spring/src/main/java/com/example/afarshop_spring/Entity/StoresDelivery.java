package com.example.afarshop_spring.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter


public class StoresDelivery implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="store_id")
    private Long storeId;
    @JsonFormat(pattern="dd/MM/yy")
    private Date pickUpDate;
    private String store ;

    @OneToOne(mappedBy = "storesDelivery")
    @JsonIgnore
    private Delivery delivery ;



}
