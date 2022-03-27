package com.components.shoppingcartserver.entities;

import com.components.shoppingcartserver.annotations.Column;
import com.components.shoppingcartserver.annotations.Entity;
import com.components.shoppingcartserver.annotations.Id;
import com.components.shoppingcartserver.utils.SQLDataTypes;

import java.util.Date;

@Entity(tableName = "product")
public class Product {
    @Id(autoIncrement = true)
    @Column(columnName = "id", columnType = SQLDataTypes.INTEGER)
    private int id;
    @Column(columnName = "name", columnType = SQLDataTypes.VARCHAR255)
    private String name;
    @Column(columnName = "image", columnType = SQLDataTypes.VARCHAR255)
    private String image;
    @Column(columnName = "price", columnType = SQLDataTypes.DOUBLE)
    private double price;
    @Column(columnName = "status", columnType = SQLDataTypes.INTEGER)
    private int status;

    public Product() {
    }

    public Product(int id, String name, String image, double price, int status) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
