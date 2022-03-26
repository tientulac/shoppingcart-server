package com.components.shoppingcartserver.unitTest;

import com.components.shoppingcartserver.config.DatabaseConnection;
import com.components.shoppingcartserver.entities.Product;
import com.components.shoppingcartserver.repository.JpaRepository;
import org.testng.annotations.Test;

import java.sql.Connection;

public class ProductTest {
    @Test
    public void getConnection() {
        Connection conn = DatabaseConnection.getConnection();
        JpaRepository<Product> jpaProduct = new JpaRepository<Product>(Product.class);
        for (Product p : jpaProduct.findAll())
        {
            System.out.println(p.getName());
        }
    }
}
