package com.zhen.gulimall.product;

import com.aliyun.oss.OSSClient;
import com.zhen.gulimall.product.entity.BrandEntity;
import com.zhen.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    OSSClient ossClient;

    @Test
    public void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("huawei");
        brandService.save(brandEntity);
    }

    @Test
    public void testUpload() throws FileNotFoundException {

        InputStream inputStream = new FileInputStream("C:\\Users\\gaozh\\Desktop\\pics\\DigitalPhoto.jpg");

        ossClient.putObject("gulimall-hello", "DigitalPhoto.jpg", inputStream);

        ossClient.shutdown();

        System.out.println("upload finished");
    }

}
