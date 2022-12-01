package com.inusun.springboot.common.constant;

public enum ShouQianBaReportStatus {
    SUCCESS(200, "通讯成功", ""),
    CLIENT_ERROR(400, "客户端错误", "客户端请求错误。"),
    SERVER_ERROR(500, "服务端错误", "服务端异常，请联系收钱吧客服");
    private Integer code;
    private String value;
    private String message;

    ShouQianBaReportStatus(Integer code, String value, String message) {
        this.code = code;
        this.value = value;
        this.message = message;
    }
}
