package com.fiee.mall.product;


import com.fiee.mall.product.entity.BrandEntity;
import com.fiee.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    private BrandService service;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("主打爱国");
//        BrandEntity id = service.getById(1);

        System.out.println(service.save(brandEntity));
    }

}
