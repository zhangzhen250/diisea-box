package com.ruoyi.project.website.controller;


import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.service.ISysDictTypeService;
import com.ruoyi.project.website.domain.SysArticle;
import com.ruoyi.project.website.service.ISysArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 网站文章Controller
 */
@RestController
@RequestMapping("/zz/article")
public class ZzArticleController extends BaseController
{
    @Autowired
    private ISysArticleService sysArticleService;

    @Autowired
    private ISysDictTypeService dictTypeService;

    /**
     * 查询网站文章列表
     */
    @GetMapping("/list")
    public TableDataInfo list(SysArticle sysArticle)
    {
        startPage();
        List<SysArticle> list = sysArticleService.selectSysArticleList(sysArticle);
        return getDataTable(list);
    }

    /**
     * 获取网站文章详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysArticleService.selectSysArticleById(id));
    }

    /**
     * 根据字典类型查询字典数据信息
     */
    @GetMapping(value = "/type/{dictType}")
    public AjaxResult dictType(@PathVariable String dictType)
    {
        return AjaxResult.success(dictTypeService.selectDictDataByType(dictType));
    }

}
