package com.example.market.entities;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailID implements Serializable {

    private Order order;
    private Vegetable vegetable;
}
