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
@TableName("sys_code_type")
public class CodeType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码类型ID
     */
    private String codeTypeId;

    /**
     * 代码类型名
     */
    private String codeTypeName;


}
