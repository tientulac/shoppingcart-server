package com.components.shoppingcartserver.unitTest;

import com.components.shoppingcartserver.config.DatabaseConnection;
import com.components.shoppingcartserver.entities.Product;
import com.components.shoppingcartserver.entities.dto.CartItemDTO;
import com.components.shoppingcartserver.repository.JpaRepository;
import org.testng.annotations.Test;

import java.sql.Connection;

public class ProductTest {
    @Test
    public void getConnection() {
        Connection conn = DatabaseConnection.getConnection();
        JpaRepository<CartItemDTO> jpaProduct = new JpaRepository<CartItemDTO>(CartItemDTO.class);
        for (CartItemDTO p : jpaProduct.getListCartItem())
        {
            System.out.println(p.getProduct_image());
        }
    }
}
