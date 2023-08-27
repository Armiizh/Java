public abstract class Chain implements Choice {

    private GoodEnding next;

    public void setNext(GoodEnding next) {
        this.next = next;
    }

    public String getChoice(Select select) {
        if (Way(select)==1) {
            print("Встретил ты Оленя");
        } else if (Way(select)==2) {
            print("Встретил ты кабана");
        } else if (Way(select)==4) {
            print("Встретил ты осла");
        } else {
            print("Не понимаю куда ты идешь");
        }
        return String.valueOf(Way(select));
    }

    private static void print(String result) {
        System.out.println(result);
    }

    abstract int Way(Select select);
}
