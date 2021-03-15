package com.example.mybatisplus.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.demo.pojo.JeecgMonthlyGrowthAnalysis;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author honglei
 * @since 2021-03-13
 */

public interface JeecgMonthlyGrowthAnalysisMapper extends BaseMapper<JeecgMonthlyGrowthAnalysis> {

    List<JeecgMonthlyGrowthAnalysis> index(String x);



}
