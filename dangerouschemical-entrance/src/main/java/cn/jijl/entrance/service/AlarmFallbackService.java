package cn.jijl.entrance.service;

import cn.jijl.dangerouschemical.enums.ResultEnum;
import cn.jijl.dangerouschemical.result.ResultView;
import org.springframework.stereotype.Component;

/**
 * @Author jijl
 * @Date 16:35 2020/7/14
 **/
@Component
public class AlarmFallbackService implements AlarmService {


    @Override
    public ResultView paymentSQL(Long id) {
        return ResultView.error(ResultEnum.CODE_6001);
    }

    @Override
    public ResultView test() {
        return ResultView.error(ResultEnum.CODE_6001);
    }
}
