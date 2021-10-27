package com.example.Shopping2.Shopping2.Controller;

import com.example.Shopping2.Shopping2.Entity.BuyerEntity;
import com.example.Shopping2.Shopping2.Entity.CartEntity;
import com.example.Shopping2.Shopping2.Entity.ProductEntity;
import com.example.Shopping2.Shopping2.Entity.SellerEntity;
import com.example.Shopping2.Shopping2.Repository.BuyerRepository;
import com.example.Shopping2.Shopping2.Repository.CartRepository;
import com.example.Shopping2.Shopping2.Repository.ProductRepository;
import com.example.Shopping2.Shopping2.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SellerRepository sellerRepository;
    @Autowired
    private BuyerRepository buyerRepository;
    @Autowired
    private CartRepository cartRepository;


    public ProductController(ProductRepository productRepository, SellerRepository sellerRepository, BuyerRepository buyerRepository) {
        this.productRepository = productRepository;
        this.sellerRepository = sellerRepository;
        this.buyerRepository = buyerRepository;
    }



    @PostMapping(value = "/addProductdetails/{prodShpId}")
    public ProductEntity addProductData(@PathVariable int prodShpId,@RequestBody ProductEntity productEntity)
    {

//        List<ProductEntity> productEntityList=productRepository.findAll();
//
//        if(productEntityList.size()==0) {
//            throw new RuntimeException("Null Object");
//        }
//        else
//        {
            productEntity.setProdShpId(prodShpId);
            return productRepository.save(productEntity);
//        }
    }

    @PostMapping(value = "/addSellerDetails")
    public SellerEntity addShipperData(@RequestBody SellerEntity sellerEntity)
    {
        List<SellerEntity> sellerEntityList=sellerRepository.findAll();

        if(sellerEntityList.size()==0) {
            throw new RuntimeException("Null Object");
        }
        else
        {
            return sellerRepository.save(sellerEntity);
        }
    }

    @PostMapping(value = "/addBuyerDetails")
    public BuyerEntity addBuyerData(@RequestBody BuyerEntity buyerEntity)
    {
        List<BuyerEntity> buyerEntityList=buyerRepository.findAll();

        if(buyerEntityList.size()==0) {
            throw new RuntimeException("Null Object");
        }
        else
        {
            return buyerRepository.save(buyerEntity);
        }
    }
//
//    @GetMapping(value = "/addBuyerProducts/{customerID}")
//    public BuyerEntity addBuyerProducts(@PathVariable BuyerEntity customerId,@RequestBody BuyerEntity buyerEntity)
//    {
//        BuyerEntity buyerEntity1=new BuyerEntity();
////       buyerEntity1.setCustomerId(buyerEntity.getCustomerId());
////       buyerEntity1.setCustomerName(buyerEntity.getCustomerName());
////       buyerEntity1.setCustomerAddress(buyerEntity.getCustomerAddress());
////       buyerEntity1.setCustomerCity(buyerEntity.getCustomerCity());
////       buyerEntity1.setProductEntities(buyerEntity.getProductEntities());
//        ProductEntity product1=new ProductEntity();
//        buyerEntity1.setProductEntities(buyerEntity.getProductEntities().add(product1));
//       return buyerRepository.save(buyerEntity1);
//    }



    @GetMapping(value = "/getProductData/{prodShpId}")
    public List<ProductEntity> getData(@PathVariable int prodShpId ) throws NoSuchFieldException {
       return productRepository.findAllByProdShpId(prodShpId);

    }
    @GetMapping(value = "/getAllProductData")
    public List<ProductEntity> getAllProductData() throws NoSuchFieldException {
        return productRepository.findAll();

    }

    @PutMapping(value = "/UpdateProductData")
    public ProductEntity  updateData(@PathVariable int prodId,@RequestBody ProductEntity productEntityDetails) throws NoSuchFieldException {
        Optional<ProductEntity>  productEntity =productRepository.findById(prodId);
        if (productEntity.isEmpty()){
            throw new NoSuchFieldException();
        }
        else {
            ProductEntity prodUpEntity=productEntity.get();
            prodUpEntity.setProdName(productEntityDetails.getProdName());
            prodUpEntity.setProdPrice(productEntityDetails.getProdPrice());
            prodUpEntity.setQuantity(productEntityDetails.getQuantity());
            return productRepository.save(prodUpEntity);
        }
    }
    @PostMapping(value = "/addCartDetails")
    public CartEntity addCartData(@RequestBody CartEntity cartEntity)
    {

        return cartRepository.save(cartEntity);

    }

//    @PutMapping(value = "/UpdateProductQuantity")
//    public ProductEntity  updateData(@PathVariable int prodId,@RequestBody ProductEntity productEntityDetails) throws NoSuchFieldException {
//        Optional<ProductEntity>  productEntity =productRepository.findById(prodId);
//        if (productEntity==null){
//            throw new NoSuchFieldException();
//        }
//        else {
//            ProductEntity prodUpEntity=productEntity.get();
//            prodUpEntity.setProdName(productEntityDetails.getProdName());
//            prodUpEntity.setProdPrice(productEntityDetails.getProdPrice());
//            prodUpEntity.setQuantity(productEntityDetails.getQuantity());
//            return productRepository.save(prodUpEntity);
//        }




}
