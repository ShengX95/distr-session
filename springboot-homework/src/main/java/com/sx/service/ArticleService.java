package com.sx.service;

import com.sx.pojo.Article;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleService {
    public List<Article> getAll();
    Page<Article> getArticlePage(int page, int limit);
}
