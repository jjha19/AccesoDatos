package newspapercrud.ui;

import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.Data;
import newspapercrud.dao.Basic.BasicArticleRepository;
import newspapercrud.dao.model.ArticleRepository;
import newspapercrud.domain.model.ArticleDTO;
import newspapercrud.domain.model.TypeDTO;
import newspapercrud.domain.service.ArticleService;

import java.util.List;
import java.util.Scanner;

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

    public int addArticle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the name of the article you want to add?");
        String name = sc.nextLine();
        System.out.println("Whats the type of the article?");
        String typeName = sc.nextLine();
        TypeDTO typeDTO = new TypeDTO(1, typeName);

        ArticleDTO articulo = new ArticleDTO(0, name, typeDTO, 0);

        int id = articleService.addArticle(articulo);
        return id;
    }
}
