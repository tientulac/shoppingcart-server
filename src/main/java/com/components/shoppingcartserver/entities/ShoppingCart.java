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
    private int ship_address;

    @Id(autoIncrement = true)
    @Column(columnName = "ship_phone", columnType = SQLDataTypes.VARCHAR255)
    private int ship_phone;

    @Id(autoIncrement = true)
    @Column(columnName = "ship_phone", columnType = SQLDataTypes.DOUBLE)
    private double total_price;

    public ShoppingCart() {
    }

    public ShoppingCart(int id, int user_id, int ship_address, int ship_phone, double total_price) {
        this.id = id;
        this.user_id = user_id;
        this.ship_address = ship_address;
        this.ship_phone = ship_phone;
        this.total_price = total_price;
    }
}
