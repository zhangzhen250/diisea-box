package com.ruoyi.project.website.controller;

import java.util.List;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.domain.BaseEntity;
import com.ruoyi.project.website.domain.SysArticle;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;

import com.ruoyi.project.website.service.ISysArticleService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 网站文章Controller
 * 
 * @author ruoyi
 * @date 2020-07-24
 */
@RestController
@RequestMapping("/system/article")
public class SysArticleController extends BaseController
{
    @Autowired
    private ISysArticleService sysArticleService;

    /**
     * 查询网站文章列表
     */
//    @PreAuthorize("@ss.hasPermi('system:article:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysArticle sysArticle)
    {
        startPage();
        List<SysArticle> list = sysArticleService.selectSysArticleList(sysArticle);
        return getDataTable(list);
    }

    /**
     * 导出网站文章列表
     */
    @PreAuthorize("@ss.hasPermi('system:article:export')")
    @Log(title = "网站文章", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(SysArticle sysArticle)
    {
        List<SysArticle> list = sysArticleService.selectSysArticleList(sysArticle);
        ExcelUtil<SysArticle> util = new ExcelUtil<SysArticle>(SysArticle.class);
        return util.exportExcel(list, "article");
    }

    /**
     * 获取网站文章详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:article:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysArticleService.selectSysArticleById(id));
    }

    /**
     * 新增网站文章
     */
    @PreAuthorize("@ss.hasPermi('system:article:add')")
    @Log(title = "网站文章", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysArticle sysArticle)
    {

        sysArticle.setCreateBy(SecurityUtils.getUsername());
        return toAjax(sysArticleService.insertSysArticle(sysArticle));
    }

    /**
     * 修改网站文章
     */
    @PreAuthorize("@ss.hasPermi('system:article:edit')")
    @Log(title = "网站文章", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Validated @RequestBody SysArticle sysArticle)
    {
        System.out.println(sysArticle);
        sysArticle.setUpdateBy(SecurityUtils.getUsername());
        return toAjax(sysArticleService.updateSysArticle(sysArticle));
    }

    /**
     * 删除网站文章
     */
    @PreAuthorize("@ss.hasPermi('system:article:remove')")
    @Log(title = "网站文章", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysArticleService.deleteSysArticleByIds(ids));
    }
}
