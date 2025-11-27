package com.sihamcode.pressin.services;

import com.sihamcode.pressin.entities.Article;
import com.sihamcode.pressin.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    public Article getById(Long id) {
        return articleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Article introuvable"));
    }

    public Article create(Article article) {
        return articleRepository.save(article);
    }

    public Article update(Long id, Article details) {
        Article a = getById(id);
        a.setNom(details.getNom());
        a.setPrix(details.getPrix());
        return a;
       
    }

    public void delete(Long id) {
        articleRepository.deleteById(id);
    }
}
