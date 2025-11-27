
package com.sihamcode.pressin.controllers;
import com.sihamcode.pressin.entities.Article;
import com.sihamcode.pressin.repositories.ArticleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ArticleController {

    private final  ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    // Lister tous les clients
    @GetMapping
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    // Ajouter un client
   // @PostMapping
   // public Article createArticle(@RequestBody Article article) {
        //return ArticleRepository.save(article);}
    }
