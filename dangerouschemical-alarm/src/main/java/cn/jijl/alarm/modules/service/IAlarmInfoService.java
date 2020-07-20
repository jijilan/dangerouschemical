package cn.jijl.alarm.modules.service;

import cn.jijl.alarm.modules.entity.AlarmInfo;
import cn.jijl.dangerouschemical.result.ResultView;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 报警信息表 服务类
 * </p>
 *
 * @author jijl
 * @since 2020-07-20
 */
public interface IAlarmInfoService extends IService<AlarmInfo> {

    ResultView test();
}
