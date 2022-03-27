package com.components.shoppingcartserver.entities;

import com.components.shoppingcartserver.annotations.Column;
import com.components.shoppingcartserver.annotations.Entity;
import com.components.shoppingcartserver.annotations.Id;
import com.components.shoppingcartserver.utils.SQLDataTypes;

@Entity(tableName = "shopping-cart")
public class ShoppingCart {
    @Id(autoIncrement = true)
    @Column(columnName = "id", columnType = SQLDataTypes.INTEGER)
    private int id;

    @Id(autoIncrement = true)
    @Column(columnName = "user_id", columnType = SQLDataTypes.INTEGER)
    private int user_id;

    @Id(autoIncrement = true)
    @Column(columnName = "ship_address", columnType = SQLDataTypes.VARCHAR255)
    private String ship_address;

    @Id(autoIncrement = true)
    @Column(columnName = "ship_phone", columnType = SQLDataTypes.VARCHAR255)
    private String ship_phone;

    @Id(autoIncrement = true)
    @Column(columnName = "total_price", columnType = SQLDataTypes.DOUBLE)
    private double total_price;

    public ShoppingCart() {
    }

    public ShoppingCart(int id, int user_id, String ship_address, String ship_phone, double total_price) {
        this.id = id;
        this.user_id = user_id;
        this.ship_address = ship_address;
        this.ship_phone = ship_phone;
        this.total_price = total_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public String getShip_phone() {
        return ship_phone;
    }

    public void setShip_phone(String ship_phone) {
        this.ship_phone = ship_phone;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
}
