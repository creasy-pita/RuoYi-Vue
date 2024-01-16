package com.ruoyi.project.system.service;

import com.ruoyi.project.system.domain.News;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-01-16
 */
public interface INewsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public News selectNewsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param news 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<News> selectNewsList(News news);

    /**
     * 新增【请填写功能名称】
     * 
     * @param news 【请填写功能名称】
     * @return 结果
     */
    public int insertNews(News news);

    /**
     * 修改【请填写功能名称】
     * 
     * @param news 【请填写功能名称】
     * @return 结果
     */
    public int updateNews(News news);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    public int deleteNewsByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteNewsById(Long id);
}
