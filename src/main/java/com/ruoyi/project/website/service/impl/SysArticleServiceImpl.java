package com.ruoyi.project.website.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.website.mapper.SysArticleMapper;
import com.ruoyi.project.website.domain.SysArticle;
import com.ruoyi.project.website.service.ISysArticleService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-07-24
 */
@Service
public class SysArticleServiceImpl implements ISysArticleService 
{
    @Autowired
    private SysArticleMapper sysArticleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public SysArticle selectSysArticleById(Long id)
    {
        return sysArticleMapper.selectSysArticleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysArticle 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysArticle> selectSysArticleList(SysArticle sysArticle)
    {
        return sysArticleMapper.selectSysArticleList(sysArticle);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysArticle 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysArticle(SysArticle sysArticle)
    {
        sysArticle.setCreateTime(DateUtils.getNowDate());
        return sysArticleMapper.insertSysArticle(sysArticle);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysArticle 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysArticle(SysArticle sysArticle)
    {
        sysArticle.setUpdateTime(DateUtils.getNowDate());
        return sysArticleMapper.updateSysArticle(sysArticle);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSysArticleByIds(Long[] ids)
    {
        return sysArticleMapper.deleteSysArticleByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteSysArticleById(Long id)
    {
        return sysArticleMapper.deleteSysArticleById(id);
    }
}
