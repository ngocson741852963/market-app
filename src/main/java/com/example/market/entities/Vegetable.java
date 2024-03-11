package com.example.market.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "vegetables")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "VegetableID")
    private Integer id;

    @Column(name = "Vegetable_Name", length = 50)
    private String name;

    @Column(name = "Unit")
    private String unit;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "Image")
    private String image;

    @Column(name = "Price")
    private Float price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(
            name = "CategoryID",
            nullable = false,
            referencedColumnName = "CategoryID"
    )
    private Category category;

    @OneToMany(
            mappedBy = "vegetable",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private Set<OrderDetail> orderDetails;
}
