package com.slp.forme.entity.auto;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sanglp
 * @since 2020-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("FORME_DEFINITION_DETAIL")
@Setter
@Getter
public class FormeDefinitionDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;

    @TableField("PAR_ID")
    private String parId;

    @TableField("COLUMN_NAME")
    private String columnName;

    @TableField("COLUMN_DESC")
    private String columnDesc;

    @TableField("CREATE_USER")
    private String createUser;

    @TableField("CREATE_TIMESTAMP")
    private LocalDateTime createTimestamp;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("UPDATE_TIMESTAMP")
    private LocalDateTime updateTimestamp;


}
