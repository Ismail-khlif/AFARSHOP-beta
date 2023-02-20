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



public class HomeDelivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="home_id")
    private Long HomeId;
    @JsonFormat(pattern="dd/MM/yy")
    private Date deliveryDate;
    private String address ;
    private int postalCode;


    @OneToOne(mappedBy = "homeDelivery")
    @JsonIgnore
    private Delivery delivery ;
}