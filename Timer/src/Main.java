//                 Задание
// Написать класс, который каждые N (рандом от 1 до 10) секунд добавляет в фабрику новостей новую
// с рандом заголовком и текстом. Написать колбек, который наружу отдает событие, когда в массиве
// новостей набирается 4 штуки и их обрабатывает редактор и в консоль пишет типа газету.
// Нумеровать выпуск газеты и при наступлении 10-ого выпуска прекратить.
public class Main {
    public static void main(String[] args) {

        Journalist journalist = new Journalist();
        ArticleCallback callback = journalist::handleArticle;
        ArticleFactory factory = new ArticleFactory(callback);
        factory.start();
    }
}