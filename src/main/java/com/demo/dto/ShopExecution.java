package com.demo.dto;

import com.demo.entity.Shop;
import com.demo.enums.ShopStateEnum;

import java.util.List;

public class ShopExecution {
    //结果状态
    private Integer state;
    //状态标识
    private String stateInfo;

    //店铺数量
    private Integer count;

    //操作的shop
    private Shop shop;

    //shop列表
    private List<Shop> shopList;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    public ShopExecution() {

    }

    /**
     * 店铺操作失败的时候使用的构造器
     *
     * @param shopStateEnum
     */
    public ShopExecution(ShopStateEnum shopStateEnum) {
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
    }

    /**
     * 店铺操作成功的时候使用的构造器
     *
     * @param shopStateEnum
     * @param shop
     */
    public ShopExecution(ShopStateEnum shopStateEnum, Shop shop) {
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
        this.shop = shop;
    }

    /**
     * 店铺操作成功的时候使用的构造器
     *
     * @param shopStateEnum
     * @param shopList
     */
    public ShopExecution(ShopStateEnum shopStateEnum, List<Shop> shopList) {
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
        this.shopList = shopList;
    }

}
