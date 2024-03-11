package com.example.market.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "orderdetails")
@IdClass(OrderDetailID.class)
public class OrderDetail {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "OrderID")
    private Order order;

    @Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "VegetableID")
    private Vegetable vegetable;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Price")
    private Float price;
}
