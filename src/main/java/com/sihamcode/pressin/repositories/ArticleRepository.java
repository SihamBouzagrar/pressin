
package com.sihamcode.pressin.repositories;
import com.sihamcode.pressin.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article, Long> {
}
