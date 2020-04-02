package com.sx.service.impl;

import com.sx.dao.ArticleDao;
import com.sx.pojo.Article;
import com.sx.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shengx
 * @date 2020/3/15 23:16
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Override
    public List<Article> getAll() {
        return articleDao.findAll();
    }

    @Override
    public Page<Article> getArticlePage(int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        return articleDao.findAll(pageable);
    }
}
