public class Article {

    private final int id;
    private final String header;
    private final String body;

    public Article(int id, String header, String body) {
        this.id = id;
        this.header = header;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Article{"+
                "id="+id+
                ", header='"+header+'\''+
                ", body='"+body+'\''+'}';
    }
}
