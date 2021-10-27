package com.example.Shopping2.Shopping2.Entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class CartEntity {


        @Id
        @Column(name = "Cart_Id")
        private int cartId;

        @Column(name = "Product_Id")
        private int productId;

        @Column(name = "Product_Name")
        private String productName;

        @Column(name= "Product_Quantity")
        private int productQuantity;

        @Column(name = "Product_Price")
        private float productPrice;

        @Column(name="Total_Amount")
        private float totalAmount;

//        @OneToOne(cascade = CascadeType.ALL)
//        private BuyerEntity buyer;

        @OneToMany(cascade = CascadeType.ALL)
        private Set<ProductEntity> productEntities;


        public int getOrderId() {
            return cartId;
        }

        public void setOrderId(int orderId) {
            this.cartId = orderId;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getProductQuantity() {
            return productQuantity;
        }

        public void setProductQuantity(int productQuantity) {
            this.productQuantity = productQuantity;
        }

        public float getProductPrice() {

            return productPrice;
        }

        public void setProductPrice(float productPrice) {

            this.productPrice = productPrice;
        }

        public float getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(float totalAmount) {
            this.totalAmount = totalAmount;
        }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

//    public BuyerEntity getBuyer() {
//        return buyer;
//    }
//
//    public void setBuyer(BuyerEntity buyer) {
//        this.buyer = buyer;
//    }

    public Set<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(Set<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }
}


