package newspapercrud.dao;

import newspapercrud.dao.model.ArticleEntity;
import newspapercrud.dao.model.TypeEntity;
import newspapercrud.domain.model.ArticleDTO;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {

    public List<ArticleEntity> getAll() {
        List<ArticleEntity> articles = new ArrayList<>();
        articles.add(new ArticleEntity(1, "Article 1", null, 1));
        articles.add(new ArticleEntity(2, "Article 2", null, 1));
        articles.add(new ArticleEntity(3, "Article 3", null, 2));
        return articles;

    }
}
