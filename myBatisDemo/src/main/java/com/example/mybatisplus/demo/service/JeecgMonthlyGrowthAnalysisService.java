package com.example.mybatisplus.demo.service;

import com.example.mybatisplus.demo.pojo.JeecgMonthlyGrowthAnalysis;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author honglei
 * @since 2021-03-13
 */
public interface JeecgMonthlyGrowthAnalysisService extends IService<JeecgMonthlyGrowthAnalysis> {


    List<JeecgMonthlyGrowthAnalysis> index(String x);
}
