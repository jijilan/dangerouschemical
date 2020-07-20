package cn.jijl.dangerouschemical.enums;

import lombok.Getter;

/**
 * @Author jijl
 * @Description: 自定义参数枚举
 * @Date 17:15 2020/7/20
 **/
@Getter
public enum ResultEnum {


    CODE_1(1, "操作成功！"),
    CODE_2(2, "操作失败！"),
    CODE_3(3, "用户未登陆！"),
    CODE_4(4, "账号或者密码错误！"),


    CODE_401(401, "账号或者密码错误！"),

    CODE_403(403, "没有获取授权！"),

    CODE_404(404, "找不到该路径！"),

    CODE_405(405, "请求方式错误！"),

    CODE_406(406, "Not Acceptable"),

    CODE_415(415, "请求参数格式错误！"),

    CODE_500(500, "服务器出错了，请联系后台开发人员！"),
    CODE_6001(6001, "服务降级返回！"),
    CODE_6002(6002, "异常handlerFallback！"),
    CODE_6003(6003, "blockHandler-sentinel 限流!");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
