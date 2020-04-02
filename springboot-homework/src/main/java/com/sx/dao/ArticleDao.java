package com.sx.dao;

import com.sx.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends JpaRepository<Article, Integer>, JpaSpecificationExecutor<Article> {
}
