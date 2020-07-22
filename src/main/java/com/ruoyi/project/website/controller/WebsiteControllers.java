package com.ruoyi.project.website.controller;

import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.website.domain.Article;
import com.ruoyi.project.website.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/website/article")
public class WebsiteControllers extends BaseController {

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 新增文章
     * @param article
     * @return
     */
    @PostMapping("/add")
    public AjaxResult add(@RequestBody Article article){

        article.setCreateBy(SecurityUtils.getUsername());
        return  toAjax(articleMapper.insert(article));

    }

}
