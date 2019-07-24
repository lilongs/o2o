package com.demo.service;

import com.demo.dto.ShopExecution;
import com.demo.entity.Shop;

import java.io.InputStream;

public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName);
}
