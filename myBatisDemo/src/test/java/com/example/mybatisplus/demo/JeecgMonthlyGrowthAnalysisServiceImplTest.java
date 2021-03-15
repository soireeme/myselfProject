package com.example.mybatisplus.demo;


import com.example.mybatisplus.demo.pojo.JeecgMonthlyGrowthAnalysis;
import com.example.mybatisplus.demo.service.impl.JeecgMonthlyGrowthAnalysisServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


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


    @Test
    public  void  test(){

        //JeecgMonthlyGrowthAnalysis s=jeecgMonthlyGrowthAnalysisServiceImpl.getById(1); System.out.println(s);
        System.out.println(jeecgMonthlyGrowthAnalysisServiceImpl.index("1"));

    }


}
