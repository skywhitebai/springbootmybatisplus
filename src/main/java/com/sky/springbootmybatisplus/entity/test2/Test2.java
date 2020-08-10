package com.sky.springbootmybatisplus.entity.test2;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author sky
 * @since 2020-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Test2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String testName;

    private String testValue;

    private LocalDateTime createTime;

    private Long createBy;

    private LocalDateTime updateTime;

    private Long updateBy;

    /**
     * 1删除0正常
     */
    private Integer dr;


}
