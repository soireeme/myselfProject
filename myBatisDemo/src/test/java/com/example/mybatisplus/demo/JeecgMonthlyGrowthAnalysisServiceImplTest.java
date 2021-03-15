package com.example.mybatisplus.demo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.demo.mapper.JeecgMonthlyGrowthAnalysisMapper;
import com.example.mybatisplus.demo.pojo.JeecgMonthlyGrowthAnalysis;
import com.example.mybatisplus.demo.service.impl.JeecgMonthlyGrowthAnalysisServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Map;


/**
 * @author honglei
 * @version 1.0
 * @date 2021/3/13 15:17
 * @desp
 */
@SpringBootTest
public class JeecgMonthlyGrowthAnalysisServiceImplTest {
    @Resource
    private JeecgMonthlyGrowthAnalysisServiceImpl jeecgMonthlyGrowthAnalysisServiceImpl;

    @Resource
    private JeecgMonthlyGrowthAnalysisMapper jeecgMonthlyGrowthAnalysisMapper;


    @Test
    public void test() {

        //JeecgMonthlyGrowthAnalysis s=jeecgMonthlyGrowthAnalysisServiceImpl.getById(1); System.out.println(s);
        System.out.println(jeecgMonthlyGrowthAnalysisServiceImpl.index("1"));

    }


    @Test
    public void test002() {
        QueryWrapper<JeecgMonthlyGrowthAnalysis> queryWrapper = new QueryWrapper();
        queryWrapper.eq(true, "id", 5);
        System.out.println(jeecgMonthlyGrowthAnalysisMapper.selectList(queryWrapper));

        Page<JeecgMonthlyGrowthAnalysis> userPage = new Page<>(2 , 2 , false);
        QueryWrapper<JeecgMonthlyGrowthAnalysis> queryWrapperPage = new QueryWrapper();
        queryWrapperPage.ge(true,"year","2018");
        jeecgMonthlyGrowthAnalysisMapper.selectPage(userPage,queryWrapperPage);
        Page userPage1 = new Page<>(2 , 2 , true);

        jeecgMonthlyGrowthAnalysisMapper.selectMapsPage(userPage1,queryWrapperPage);
        System.out.println(userPage1);

    }
}
