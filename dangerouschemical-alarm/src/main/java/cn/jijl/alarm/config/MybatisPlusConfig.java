package cn.jijl.alarm.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author jijl
 * @Description: MybatisPlus分页插件
 * @Date 16:03 2020/7/20
 **/
@Configuration
@MapperScan("cn.jijl.alarm.modules.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
