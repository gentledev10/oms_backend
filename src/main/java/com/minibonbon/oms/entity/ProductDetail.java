package com.minibonbon.oms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class ProductDetail {

    @NotBlank
    private String detail;

    @NotNull
    private Integer count;
}
