package cn.jijl.alarm.modules.controller;


import cn.jijl.alarm.modules.service.IAlarmInfoService;
import cn.jijl.dangerouschemical.result.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 报警信息表 前端控制器
 * </p>
 *
 * @author jijl
 * @since 2020-07-20
 */
@RestController
@RequestMapping("/alarm/")
public class AlarmInfoController {
    @Autowired
    private IAlarmInfoService alarmInfoService;

    @GetMapping("test")
    public ResultView test() {
        return alarmInfoService.test();
    }
}
