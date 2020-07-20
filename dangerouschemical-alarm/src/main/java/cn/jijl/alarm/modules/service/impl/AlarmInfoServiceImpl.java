package cn.jijl.alarm.modules.service.impl;

import cn.jijl.alarm.modules.entity.AlarmInfo;
import cn.jijl.alarm.modules.mapper.AlarmInfoMapper;
import cn.jijl.alarm.modules.service.IAlarmInfoService;
import cn.jijl.dangerouschemical.result.ResultView;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 报警信息表 服务实现类
 * </p>
 *
 * @author jijl
 * @since 2020-07-20
 */
@Service
public class AlarmInfoServiceImpl extends ServiceImpl<AlarmInfoMapper, AlarmInfo> implements IAlarmInfoService {

    @Override
    public ResultView test() {
        QueryWrapper<AlarmInfo> qw = new QueryWrapper<>();
        return ResultView.ok(getOne(qw));
    }
}
