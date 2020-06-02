package com.zhisan.fastboot.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhisan
 * @since 2020-06-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_log")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    private String logId;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 日志来源
     */
    private String logSource;

    /**
     * 日志内容
     */
    private String logContent;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
