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
@Table(name = "Payement")
public class Payement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payementId")
    private Long payementId;
    @Temporal(TemporalType.DATE)
    private Date payementDate;
    private String payementMethod;
    private String bankTransferStatus;
    private String transactionStatus;
}