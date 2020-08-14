package com.slp.forme.entity.auto;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.sql.Blob;
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
@TableName("FORME_DEFINITION")
@Setter
@Getter
public class FormeDefinition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;

    @TableField("COLOUM_REF")
    private String coloumRef;

    @TableField("INTERFACE_NAME")
    private String interfaceName;

    @TableField("INTERFACE_DESC")
    private Blob interfaceDesc;

    @TableField("CREATE_USER")
    private String createUser;

    @TableField("CREATE_TIMESTAMP")
    private LocalDateTime createTimestamp;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("UPDATE_TIMESTAMP")
    private LocalDateTime updateTimestamp;


}
