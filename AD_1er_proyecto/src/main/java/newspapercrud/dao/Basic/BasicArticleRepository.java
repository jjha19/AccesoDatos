package newspapercrud.dao.Basic;

import newspapercrud.dao.model.ArticleEntity;
import newspapercrud.dao.model.ArticleRepository;

import java.util.ArrayList;
import java.util.List;

public class BasicArticleRepository implements ArticleRepository {



    public List<ArticleEntity> getAll() {
        List<ArticleEntity> articles = new ArrayList<>();
        articles.add(new ArticleEntity(1, "Article 1", null, 1));
        articles.add(new ArticleEntity(2, "Article 2", null, 1));
        articles.add(new ArticleEntity(3, "Article 3", null, 2));
        return articles;

    }

    @Override
    public ArticleEntity get(int id) {
        return null;
    }

    @Override
    public int save(ArticleEntity article) {
        return 1;
    }

    @Override
    public boolean delete(ArticleEntity article) {
        return false;
    }

    @Override
    public void update(ArticleEntity article) {

    }
}
