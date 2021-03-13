package com.example.mybatisplus.demo.service.impl;

import com.example.mybatisplus.demo.pojo.Demo;
import com.example.mybatisplus.demo.mapper.DemoMapper;
import com.example.mybatisplus.demo.service.DemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxd
 * @since 2021-03-13
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

}
