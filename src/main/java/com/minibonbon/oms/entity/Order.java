package com.minibonbon.oms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "orders")
public class Order {

    @Id
    private String id;

    @NotBlank
    private String buyerId;

    @NotBlank
    private String buyerName;

    @NotBlank
    private String buyerAddress;

    @NotBlank
    private String buyerPhoneNumber;

    @NotNull
    private Date orderDate;

    @Valid
    private List<Product> products;

    @Data
    public static class Product {

        @NotBlank
        private String category;

        @NotBlank
        private String detail;

        @NotNull
        private Integer count;
    }
}
