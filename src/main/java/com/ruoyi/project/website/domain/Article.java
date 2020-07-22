package com.ruoyi.project.website.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName(value = "sys_article")
public class Article {

    @TableId(type = IdType.AUTO)
    private int Id;

    @TableField(value = "article_title")
    private String title;

    @TableField(value = "article_type")
    private String type;

    @TableField(value = "article_content")
    private String content;

    private String status;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String remark;
}
