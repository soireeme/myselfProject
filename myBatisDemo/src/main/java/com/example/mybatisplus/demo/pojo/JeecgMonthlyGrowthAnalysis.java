package com.example.mybatisplus.demo.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author honglei
 * @since 2021-03-13
 */
@Data
public class JeecgMonthlyGrowthAnalysis implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String year;

    /**
     * 月份
     */
    private String month;

    /**
     * 佣金/主营收入
     */
    private BigDecimal mainIncome;

    /**
     * 其他收入
     */
    private BigDecimal otherIncome;


}
