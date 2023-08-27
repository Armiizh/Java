import java.util.Timer;
import java.util.TimerTask;

public class ArticleFactory {

    private final ArticleCallback articleCallback;
    private final Timer timer;

    private int count;

    public ArticleFactory(ArticleCallback articleCallback) {
        this.articleCallback = articleCallback;
        this.timer = new Timer();
    }

    void start() {
        final TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                articleCallback.provideArticle(new Article(count, "Article header "+count, "Article body"));
                if (++count == 40) {
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 1000, 3000);
    }
}
