package com.components.shoppingcartserver.entities;

import com.components.shoppingcartserver.annotations.Column;
import com.components.shoppingcartserver.annotations.Entity;
import com.components.shoppingcartserver.annotations.Id;
import com.components.shoppingcartserver.utils.SQLDataTypes;

@Entity(tableName = "cart-item")
public class CartItem {
    @Id(autoIncrement = true)
    @Column(columnName = "id", columnType = SQLDataTypes.INTEGER)
    private int id;

    @Column(columnName = "user_id", columnType = SQLDataTypes.INTEGER)
    private int user_id;

    @Column(columnName = "product_id", columnType = SQLDataTypes.INTEGER)
    private int product_id;

    @Column(columnName = "price", columnType = SQLDataTypes.DOUBLE)
    private double price;

    @Column(columnName = "quantity", columnType = SQLDataTypes.INTEGER)
    private int quantity;

    public CartItem() {
    }

    public CartItem(int id, int user_id, int product_id, double price, int quantity) {
        this.id = id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }
}
