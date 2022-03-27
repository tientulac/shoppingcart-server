package com.components.shoppingcartserver.resource;

import com.components.shoppingcartserver.entities.CartItem;
import com.components.shoppingcartserver.entities.Product;
import com.components.shoppingcartserver.entities.ShoppingCart;
import com.components.shoppingcartserver.repository.JpaRepository;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("shopping")
public class ShoppingCartResource {
    JpaRepository<Product> productJpaRepository = new JpaRepository<Product>(Product.class);
    JpaRepository<CartItem> cartItemJpaRepository = new JpaRepository<CartItem>(CartItem.class);
    JpaRepository<ShoppingCart> shoppingCartJpaRepository = new JpaRepository<ShoppingCart>(ShoppingCart.class);

    @GET()
    @Path("product")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        try {
            return Response.status(Response.Status.OK).entity(productJpaRepository.findAll()).build();
        }
        catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
            return Response.status(Response.Status.OK).entity(null).build();
        }
    }

    @GET()
    @Path("cartItem")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCartItem() {
        try {
            return Response.status(Response.Status.OK).entity(cartItemJpaRepository.getListCartItem()).build();
        }
        catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
            return Response.status(Response.Status.OK).entity(null).build();
        }
    }

    @POST()
    @Path("cartItem")
    @Produces(MediaType.APPLICATION_JSON)
    public Response insertCartItem(Product product) {
        try {
            List<CartItem> listCheck = cartItemJpaRepository.checkCartItem(product.getId());
            if (!(listCheck.size() > 0)) {
                CartItem cartItem = new CartItem();
                cartItem.setUser_id(1);
                cartItem.setProduct_id(product.getId());
                cartItem.setPrice(product.getPrice());
                cartItem.setQuantity(1);
                return Response.status(Response.Status.OK).entity(cartItemJpaRepository.save(cartItem)).build();
            }
            else {
                List<CartItem> cartItemList = cartItemJpaRepository.findAll();
                for (CartItem c : cartItemList)
                {
                    if (c.getProduct_id() == product.getId()) {
                        c.setQuantity(c.getQuantity() + 1);
                        c.setPrice(c.getPrice() + product.getPrice());
                        return Response.status(Response.Status.OK).entity(cartItemJpaRepository.update(c)).build();
                    }
                }
            }
        }
        catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
            return Response.status(Response.Status.OK).entity(null).build();
        }
        return null;
    }

    @GET()
    @Path("shoppingCart")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getShoppingCart() {
        try {
            return Response.status(Response.Status.OK).entity(shoppingCartJpaRepository.findAll()).build();
        }
        catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
            return Response.status(Response.Status.OK).entity(null).build();
        }
    }

    @POST()
    @Path("shoppingCart")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getShoppingCart(ShoppingCart shoppingCart) {
        try {
            return Response.status(Response.Status.OK).entity(shoppingCartJpaRepository.save(shoppingCart)).build();
        }
        catch (Exception e) {
            System.err.println("Exception message: " + e.getMessage());
            return Response.status(Response.Status.OK).entity(null).build();
        }
    }
}
