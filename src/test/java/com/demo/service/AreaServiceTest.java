package com.demo.service;

import com.demo.BaseTest;
import com.demo.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList=areaService.getAreaList();
        assertEquals("芜湖",areaList.get(0).getAreaName());
    }
}
