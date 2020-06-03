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
@TableName("sys_msg")
public class Msg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息ID
     */
    private String msgId;

    /**
     * 消息标题
     */
    private String msgTitle;

    /**
     * 消息来源
     */
    private String msgSource;

    /**
     * 消息目标
     */
    private String msgDestination;

    /**
     * 最后更新
     */
    private LocalDateTime lastTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
