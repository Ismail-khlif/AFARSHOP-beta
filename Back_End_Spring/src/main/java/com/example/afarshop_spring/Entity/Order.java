package com.example.afarshop_spring.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderId")
    private Long orderId;
    private Long cartId;
    @Temporal (TemporalType.DATE)
    private Date orderDate  ;
    private String orderStatus;
    private String orderAddress;
    private Float amountBill;
    private Long deliveryId;
    private Long payementId;

}
