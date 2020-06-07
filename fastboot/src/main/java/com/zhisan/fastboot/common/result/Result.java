package com.zhisan.fastboot.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhisan
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 数据
     */
    private T data;

    /**
     * 操作成功
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {
        return new Result<>(ResultEnum.ok.getCode(), ResultEnum.ok.getMsg(), data);
    }

    /**
     * 操作成功
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok() {
        return new Result<>(ResultEnum.ok.getCode(), ResultEnum.ok.getMsg(), null);
    }

    /**
     * 操作失败
     *
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(String msg) {
        return new Result<>(ResultEnum.error.getCode(), msg, null);
    }

}
