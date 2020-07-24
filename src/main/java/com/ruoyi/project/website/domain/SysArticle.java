package com.ruoyi.project.website.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_article
 * 
 * @author ruoyi
 * @date 2020-07-24
 */
public class SysArticle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String articleTitle;

    /** 文章类型（1、2、3、4） */
    @Excel(name = "文章类型", readConverterExp = "1=、2、3、4")
    private String articleType;

    /** 文章内容 */
    @Excel(name = "文章内容")
    private String articleContent;

    /** 开启状态 */
    @Excel(name = "开启状态")
    private String status;

    /** 关键字 */
    @Excel(name = "关键字")
    private String keyWord;


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setArticleTitle(String articleTitle) 
    {
        this.articleTitle = articleTitle;
    }

    public String getArticleTitle() 
    {
        return articleTitle;
    }
    public void setArticleType(String articleType)
    {
        this.articleType = articleType;
    }

    public String getArticleType()
    {
        return articleType;
    }
    public void setArticleContent(String articleContent) 
    {
        this.articleContent = articleContent;
    }

    public String getKeyWord() {return keyWord;}
    public void setKeyWord(String keyWord) {this.keyWord = keyWord;}

    public String getArticleContent() 
    {
        return articleContent;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("articleTitle", getArticleTitle())
            .append("articleType", getArticleType())
            .append("articleContent", getArticleContent())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
