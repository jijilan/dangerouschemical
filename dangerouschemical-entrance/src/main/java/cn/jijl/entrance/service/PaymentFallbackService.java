//package cn.jijl.entrance.service;
//
//import cn.jijl.springcloud.entities.CommonResult;
//import cn.jijl.springcloud.entities.Payment;
//import org.springframework.stereotype.Component;
//
///**
// * @Author jijl
// * @Date 16:35 2020/7/14
// **/
//@Component
//public class PaymentFallbackService implements   PaymentService {
//
//
//    @Override
//    public CommonResult<Payment> paymentSQL(Long id) {
//        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
//    }
//}
