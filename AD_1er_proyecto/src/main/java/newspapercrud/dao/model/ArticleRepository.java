package newspapercrud.dao.model;

import java.util.List;

public interface ArticleRepository {
    List<ArticleEntity> getAll();

    ArticleEntity get(int id);;

    int save(ArticleEntity article);

    boolean delete(ArticleEntity article);

    void update(ArticleEntity article);

}
