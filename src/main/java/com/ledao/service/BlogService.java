package com.ledao.service;

import com.ledao.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * 博客Service接口
 *
 * @author LeDao
 * @company
 * @create 2020-09-11 00:33
 */
public interface BlogService {

    /**
     * 分页分条件查询博客
     *
     * @param map
     * @return
     */
    List<Blog> list(Map<String, Object> map);

    /**
     * 获取记录数
     *
     * @param map
     * @return
     */
    Long getCount(Map<String, Object> map);

    /**
     * 添加博客
     *
     * @param blog
     * @return
     */
    Integer add(Blog blog);

    /**
     * 修改博客
     *
     * @param blog
     * @return
     */
    Integer update(Blog blog);

    /**
     * 根据id删除博客
     *
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 根据id查找博客
     *
     * @param id
     * @return
     */
    Blog findById(Integer id);

    /**
     * 根据日期分月分组查询
     *
     * @return
     */
    List<Blog> countList();

    /**
     * 根据博客类型查询博客
     *
     * @param blogTypeId
     * @return
     */
    List<Blog> findByBlogTypeId(Integer blogTypeId);
}
