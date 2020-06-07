package com.zhisan.fastboot.common.result;

/**
 * @author zhisan
 */
public enum ResultEnum {
    /**
     * 成功
     */
    ok("000000", "成功"),
    /**
     * 失败
     */
    error("999999", "失败"),
    /**
     * 正在处理
     */
    wait("111111", "正在处理结果");

    private String code;
    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
