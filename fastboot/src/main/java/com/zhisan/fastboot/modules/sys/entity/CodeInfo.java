package com.zhisan.fastboot.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sys_code_info")
public class CodeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码信息ID
     */
    private String codeInfoId;

    /**
     * 代码类型ID
     */
    private String codeTypeId;

    /**
     * 代码名
     */
    private String name;

    /**
     * 代码值
     */
    private String value;

    /**
     * 排序
     */
    private Integer sort;


}
