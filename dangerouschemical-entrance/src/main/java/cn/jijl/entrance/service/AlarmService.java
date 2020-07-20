package cn.jijl.entrance.service;

import cn.jijl.dangerouschemical.result.ResultView;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author jijl
 * @Description: 服务降级
 * @Date 20:28 2020/7/20
 **/
@FeignClient(value = "dangerouschemical-alarm-service", fallback = AlarmFallbackService.class)
public interface AlarmService {

    @GetMapping(value = "/paymentSQL/{id}")
    public ResultView paymentSQL(@PathVariable("id") Long id);

    @GetMapping("/alarm/test")
    public ResultView test();
}
