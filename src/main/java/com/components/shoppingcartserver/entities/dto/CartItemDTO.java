package com.components.shoppingcartserver.entities.dto;

import com.components.shoppingcartserver.annotations.Column;
import com.components.shoppingcartserver.entities.CartItem;
import com.components.shoppingcartserver.utils.SQLDataTypes;

public class CartItemDTO {
    private int id;

    private int user_id;

    private int product_id;

    private String product_name;

    private String product_image;

    private double price;

    private int quantity;

    public CartItemDTO() {
    }


    public CartItemDTO(int id, int user_id, int product_id, String product_name, String product_image, double price, int quantity) {
        this.id = id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_image = product_image;
        this.price = price;
        this.quantity = quantity;
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

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
