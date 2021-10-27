package com.example.Shopping2.Shopping2.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "BuyerDetails")
public class BuyerEntity {

        @Id
        @Column(name = "customer_id")
        private long customerId;

        @Column(name = "customer_name")
        private String customerName;

        @Column(name = "customer_address")
        private String customerAddress;

        @Column(name = "customer_city")
        private String customerCity;

        @OneToOne(cascade = CascadeType.ALL)
        private CartEntity cartEntity;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "buyerEntity")
//    private Set<ProductEntity> productEntities;

        public BuyerEntity() {
        }

        public BuyerEntity(long customerId, String customerName, String customerAddress, String customerCity) {
            this.customerId = customerId;
            this.customerName = customerName;
            this.customerAddress = customerAddress;
            this.customerCity = customerCity;
        }

        public long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(long customerId) {
            this.customerId = customerId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerAddress() {
            return customerAddress;
        }

        public void setCustomerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
        }

        public String getCustomerCity() {
            return customerCity;
        }

        public void setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
        }

//    public Set<ProductEntity> getProductEntities() {
//        return productEntities;
//    }
//
//    public void setProductEntities(Set<ProductEntity> productEntities) {
//        this.productEntities = productEntities;
//    }

    public CartEntity getCartEntity() {
        return cartEntity;
    }

    public void setCartEntity(CartEntity cartEntity) {
        this.cartEntity = cartEntity;
    }
}

