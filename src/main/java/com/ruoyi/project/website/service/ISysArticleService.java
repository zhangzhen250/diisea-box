package com.ruoyi.project.website.service;

import java.util.List;
import com.ruoyi.project.website.domain.SysArticle;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-07-24
 */
public interface ISysArticleService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public SysArticle selectSysArticleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysArticle 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysArticle> selectSysArticleList(SysArticle sysArticle);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysArticle 【请填写功能名称】
     * @return 结果
     */
    public int insertSysArticle(SysArticle sysArticle);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysArticle 【请填写功能名称】
     * @return 结果
     */
    public int updateSysArticle(SysArticle sysArticle);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysArticleByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteSysArticleById(Long id);
}
