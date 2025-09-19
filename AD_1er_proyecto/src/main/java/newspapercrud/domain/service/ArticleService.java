package newspapercrud.domain.service;

import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.Data;
import newspapercrud.dao.ArticleRepository;
import newspapercrud.dao.model.ArticleEntity;
import newspapercrud.domain.model.ArticleDTO;

import java.util.ArrayList;
import java.util.List;

@Data

public class ArticleService {
    private final ArticleRepository articleRepository;

    @Inject
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    public List<ArticleDTO> getArticles() {
        List<ArticleEntity> articles = articleRepository.getAll();
        List<ArticleDTO> articleDTOs = new ArrayList<>();
        articles.forEach(article -> {
            articleDTOs.add(new ArticleDTO(article.getId(), article.getName(), null, 5));
        });

        return articleDTOs;
    }
}
