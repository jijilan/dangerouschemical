//package cn.jijl.entrance.service;
//
//import cn.jijl.springcloud.entities.CommonResult;
//import cn.jijl.springcloud.entities.Payment;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
///**
// * @Author jijl
// * @Date 16:35 2020/7/14
// **/
//@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
//public interface PaymentService {
//
//    @GetMapping(value = "/paymentSQL/{id}")
//    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
//
//}
