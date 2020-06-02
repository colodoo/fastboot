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
@TableName("sys_org")
public class Org implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构ID
     */
    private String orgId;

    /**
     * 机构名
     */
    private String orgName;

    /**
     * 父机构ID
     */
    private String parentOrgId;

    /**
     * 排序
     */
    private Integer sortNo;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
