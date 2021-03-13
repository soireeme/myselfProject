package com.example.mybatisplus.demo.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * @author honglei
 * @version 1.0
 * @date 2021/3/12 17:17
 * @desp
 */
public class MpConfig {
    public static void main(String[] args) {
        try{
            // 1、创建代码生成器
            AutoGenerator mpg = new AutoGenerator();
            // 2、全局配置
            GlobalConfig gc = new GlobalConfig();
            String projectPath = System.getProperty("user.dir");
            gc.setOutputDir("E:\\yurun\\workspace\\myBatisDemo" + "/src/main/java/");//项目的本地路径加上代码生成的位置。
            gc.setAuthor("honglei");//作

            gc.setOpen(false); //生成后是否打开资源管理器
            gc.setFileOverride(false); //重新生成时文件是否覆盖
            gc.setServiceName("%sService");	//去掉Service接口的首字母I
            //gc.setIdType(IdType.ID_WORKER_STR); //主键策略
            gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
            //gc.setSwagger2(true);//开启Swagger2模式（如果没有用swagger可以去掉这句）

            mpg.setGlobalConfig(gc);

            // 3、数据源配置（一定要记得配置，就算application.properties配过了这里也要重新配置）
            DataSourceConfig dsc = new DataSourceConfig();
            dsc.setUrl("jdbc:mysql://localhost:3306/jeecg-boot?serverTimezone=GMT%2B8");
            dsc.setDriverName("com.mysql.cj.jdbc.Driver");
            dsc.setUsername("root");
            dsc.setPassword("soiree");
            dsc.setDbType(DbType.MYSQL);
            mpg.setDataSource(dsc);

            // 4、包配置
            PackageConfig pc = new PackageConfig();
            pc.setParent("com.example.mybatisplus.demo");
            pc.setController("controller");
            pc.setEntity("pojo");
            pc.setService("service");
            pc.setMapper("mapper");
            mpg.setPackageInfo(pc);

            // 5、策略配置
            StrategyConfig strategy = new StrategyConfig();
            strategy.setInclude("demo");//（数据库中的表，根据这个给数据表生成对应的controller，entity，service，mapper代码）
            strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
            strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀

            strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
            strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作

            strategy.setRestControllerStyle(true); //restful api风格控制器
            strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符

            mpg.setStrategy(strategy);
            mpg.execute();

        }catch (Exception e){
            e.printStackTrace();
        }
    }





    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

}
