package com.example.mybatisplus.demo.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxd
 * @since 2021-03-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Demo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 关键词
     */
    private String keyWord;

    /**
     * 打卡时间
     */
    private Date punchTime;

    /**
     * 工资
     */
    private BigDecimal salaryMoney;

    /**
     * 奖金
     */
    private Double bonusMoney;

    /**
     * 性别 {男:1,女:2}
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个人简介
     */
    private String content;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 所属部门编码
     */
    private String sysOrgCode;


}
