package cn.jijl.alarm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //取消数据源的自动创建
public class AlarmRun {
    public static void main(String[] args) {
        SpringApplication.run(AlarmRun.class, args);
    }
}
