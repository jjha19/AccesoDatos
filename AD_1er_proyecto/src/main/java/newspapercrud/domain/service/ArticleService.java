package newspapercrud.domain.service;

import jakarta.inject.Inject;
import lombok.Data;
import newspapercrud.dao.Basic.BasicArticleRepository;
import newspapercrud.dao.model.ArticleEntity;
import newspapercrud.domain.model.ArticleDTO;

import java.util.ArrayList;
import java.util.List;

@Data

public class ArticleService {
    private final BasicArticleRepository basicArticleRepository;

    @Inject
    public ArticleService(BasicArticleRepository basicArticleRepository) {
        this.basicArticleRepository = basicArticleRepository;
    }


    public List<ArticleDTO> getArticles() {
        List<ArticleEntity> articles = basicArticleRepository.getAll();
        List<ArticleDTO> articleDTOs = new ArrayList<>();
        articles.forEach(article -> {
            articleDTOs.add(new ArticleDTO(article.getId(), article.getName(), null, 5));
        });

        return articleDTOs;
    }

    public int addArticle(ArticleDTO articleDTO) {
        int id = 1;
        return id;
    }
}
