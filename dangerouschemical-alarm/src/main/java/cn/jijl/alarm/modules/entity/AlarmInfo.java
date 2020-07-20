package cn.jijl.alarm.modules.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 报警信息表
 * </p>
 *
 * @author jijl
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AlarmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报警记录id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 报警编号
     */
    private String alarmNum;

    /**
     * 报警类型id
     */
    private Integer alarmCode;

    /**
     * 加油站id
     */
    private Integer stationId;

    /**
     * 记录时间
     */
    private Date recordTime;

    /**
     * 视频地址
     */
    private String videoUrl;

    /**
     * 10s shot video address
     */
    private String shotVideoUrl;

    /**
     * 报警开始时间
     */
    private Date alarmBeginTime;

    /**
     * 报警结束时间
     */
    private Date alarmEndTime;

    /**
     * 持续时间
     */
    private String duration;

    /**
     * 处理状态（0：未处理；1：已处理；2：处理中）
     */
    private Integer processingStatus;

    /**
     * 处理时间
     */
    private Date processingTime;

    /**
     * 处理人员
     */
    private String processingUser;

    private String addUser;

    private Date addTime;

    private String editUser;

    private Date editTime;

    /**
     * rtsp
     */
    private String rtsp;

    /**
     * （0：未处理； 1：误报   2:确认处理中，3.确认已处理）
     */
    private Integer erroAlarm;

    /**
     * 处理人员
     */
    private Integer erroAlarmUser;

    /**
     * 处理时间
     */
    private Date erroAlarmTime;

    private Integer helpStatus;

    private Integer helpUser;

    private Date helpTime;

    /**
     * 车辆违停:车牌号;
     */
    private String otherInfor1;

    /**
     * 车辆违停:车辆颜色;
     */
    private String otherInfor2;

    /**
     * 车辆违停:车辆型号;
     */
    private String otherInfor3;

    /**
     * (0:正常，1：删除)
     */
    private Integer status;

    /**
     * (0:未处理，1：误报，2：疑是异常，3：确定异常)
     */
    private Integer operationState;

    /**
     * 备注
     */
    private String remark;


}
