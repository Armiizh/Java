import java.util.List;

public class Newspaper {

    private final List<Article> articles;
    private final int id;

    public Newspaper(List<Article> articles, int id) {
        this.articles = articles;
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Newspaper number ");
        description.append(id);
        description.append(" with articles:");
        for (Article article : articles) {
            description.append(article.toString());
            description.append("\n");
        }
        return description.toString();
    }
}
