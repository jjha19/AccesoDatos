package newspapercrud.ui;

import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.Data;
import newspapercrud.domain.model.ArticleDTO;
import newspapercrud.domain.service.ArticleService;

import java.util.List;

@Data

public class ArticleUi {
    private final ArticleService articleService;

    @Inject
    public ArticleUi(ArticleService articleService) {
        this.articleService = articleService;
    }

    public List<ArticleDTO> getArticles() {
        return articleService.getArticles();
    }

}
