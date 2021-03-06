package generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: liujiebang
 * @Date: Create in 2018/9/22
 * @Description:
 **/



public class CodeGenerator {


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath ="D:\\workSpace\\dangerousChemicalSpringCloud\\dangerouschemical-alarm";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("jijl");
        gc.setOpen(false);
        gc.setBaseColumnList(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("jijl");
        dsc.setUrl("jdbc:mysql://47.106.169.138:3306/dangerouschemical_alarm?useUnicode=true&useSSL=false");
        dsc.setTypeConvert(new MySqlTypeConvert() {

            // 自定义数据库表字段类型转换【可选】
            @Override
            public IColumnType processTypeConvert(GlobalConfig gc,String fieldType) {
                System.out.println("转换类型：" + fieldType);
                if (fieldType.toLowerCase().contains("date")) {
                    return DbColumnType.DATE;
                }
                return super.processTypeConvert(gc, fieldType);
            }
        });

        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName(scanner("模块名"));
        pc.setParent("cn.jijl.alarm.modules");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList;
        focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                if (!StringUtils.isEmpty(pc.getModuleName())) {
                    return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                            + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                } else {
                    return projectPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                }
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        //strategy.setTablePrefix(new String[] { "sys_","wx_"});//根据表前缀匹配
        //strategy.setInclude(scanner("表名"));
        strategy.setInclude("alarm_info");

        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }
}

