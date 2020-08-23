package com.lp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author root
 * @since 2020-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("table1")
public class Table1 extends Model<Table1> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("context")
    private String context;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
