package com.demo.service;

import com.demo.dto.ShopExecution;
import com.demo.entity.Shop;

import java.io.File;

public interface ShopService {
    ShopExecution addShop(Shop shop, File shopImg);
}
