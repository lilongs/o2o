package com.demo.service;

import com.demo.BaseTest;
import com.demo.dto.ShopExecution;
import com.demo.entity.Area;
import com.demo.entity.PersonInfo;
import com.demo.entity.Shop;
import com.demo.entity.ShopCategory;
import com.demo.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
    public void TestaddShop() {
        Shop shop=new Shop();
        PersonInfo owner=new PersonInfo();
        Area area=new Area();
        ShopCategory shopCategory=new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(1L);
        shop.setShopId(5L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺1");
        shop.setShopDesc("Test1");
        shop.setShopAddr("Test1");
        shop.setPhone("test1");
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");

        File shopImg=new File("E:\\Demo\\JAVA\\o2o\\src\\main\\resources\\timg.jpg");
        ShopExecution se= shopService.addShop(shop,shopImg);
        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());

    }
}
