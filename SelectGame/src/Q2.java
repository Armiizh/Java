public class Q2 extends FAQChain {

    @Override
    int satisfyCondition1(Question question) {
        if (question.getVibor().toLowerCase()=="налево") {
            return 21;
        } else if (question.getVibor().toLowerCase()=="направо") {
            return 22;
        } else if (question.getVibor().toLowerCase()=="прямо") {
            return 23;
        } else {
            return 0;
        }
    }

    @Override
    int satisfyCondition2(Question question) {
        return 0;
    }

    @Override
    String getQuestionType1() {
        return "Путь первый: ";
    }

    @Override
    String getQuestionType2() {
        return null;
    }

    @Override
    public String Ans1(Question question) {
        return "Идешь идешь направо и видишь как рыба рыбака ловит";
    }
    @Override
    public String Ans2(Question question) {
        return "Идешь идешь направо и встречаешь оленя, который рассказывает тебе Пушкина";
    }
    @Override
    public String Ans3(Question question) {
        return "Рыба нарисует дерево";
    }

    @Override
    public String Ans11(Question question) {
        return null;
    }
}