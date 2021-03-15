package com.example.mybatisplus.demo.service.impl;

import com.example.mybatisplus.demo.pojo.JeecgMonthlyGrowthAnalysis;
import com.example.mybatisplus.demo.mapper.JeecgMonthlyGrowthAnalysisMapper;
import com.example.mybatisplus.demo.service.JeecgMonthlyGrowthAnalysisService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author honglei
 * @since 2021-03-13
 */
@Service
public class JeecgMonthlyGrowthAnalysisServiceImpl extends ServiceImpl<JeecgMonthlyGrowthAnalysisMapper, JeecgMonthlyGrowthAnalysis> implements JeecgMonthlyGrowthAnalysisService {

    @Override
    public List<JeecgMonthlyGrowthAnalysis> index(String x) {
        return  baseMapper.index("1");
    }
}
