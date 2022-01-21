package com.sunglowsys.domain;

import javax.persistence.*;

@Entity
@Table(name = "order_one_to_many")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ord_id")
    private Long id;

    @Column(nullable = false)
    private String itemName;
    private String brand;
    private double price;

    public Order(String itemName, String brand, double price) {
        this.itemName = itemName;
        this.brand = brand;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
