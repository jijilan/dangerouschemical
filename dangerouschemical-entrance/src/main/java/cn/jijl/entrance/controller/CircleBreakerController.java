package cn.jijl.entrance.controller;

import cn.jijl.dangerouschemical.enums.ResultEnum;
import cn.jijl.dangerouschemical.result.ResultView;
import cn.jijl.entrance.service.AlarmService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author jijl
 * @Date 16:35 2020/7/14
 **/
@RestController
@Slf4j
@RequestMapping("/entrance/")
public class CircleBreakerController {
//
//    public static final String SERVICE_URL = "http://nacos-payment-provider";
//
//    @Resource
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/consumer/fallback/{id}")
////    @SentinelResource(value = "fallback")
////    @SentinelResource(value = "fallback",fallback ="handlerFallback")
//    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler")
//    public ResultView fallback(@PathVariable Long id) {
//        ResultView result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, ResultView.class, id);
//
//        if (id == 4) {
//            throw new IllegalArgumentException("IllegalArgument ,非法参数异常...");
//        } else if (result.getData() == null) {
//            throw new NullPointerException("NullPointerException,该ID没有对应记录，空指针异常");
//        }
//
//        return result;
//    }
//
//
//    public ResultView handlerFallback(@PathVariable Long id, Throwable e) {
//        return ResultView.error(ResultEnum.CODE_6002, "异常handlerFallback，exception内容： " + e.getMessage());
//    }
//
//    public ResultView blockHandler(@PathVariable Long id, BlockException e) {
//        return ResultView.error(ResultEnum.CODE_6003, "blockHandler-sentinel 限流，BlockException： " + e.getMessage());
//    }

    //======= OpenFeign
    @Resource
    private AlarmService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public ResultView paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }

    @GetMapping(value = "test")
    public ResultView test() {
        return paymentService.test();
    }
}
