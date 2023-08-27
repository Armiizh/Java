import java.util.ArrayList;
import java.util.List;

public class Journalist {

    private static final int ARTICLES_NUMBER_FOR_NEWSPAPER = 4;
    private final List<Article> articles;
    private int newspapersCount;

    public Journalist() {
        articles = new ArrayList<>();
    }

    public void handleArticle(Article article) {
        if (articles.size() == ARTICLES_NUMBER_FOR_NEWSPAPER) {
            System.out.println(new Newspaper(articles, newspapersCount).toString());
            newspapersCount++;
            articles.clear();
        } else {
            articles.add(article);
        }
    }
}
