public class Q1 extends FAQChain {


    @Override
    int satisfyCondition1(Question question) {
        new Question(Question.Status.razvilka1end);
        if (question.getVibor()=="налево") {
            return 11;
        } else if (question.getVibor()=="направо") {
            return 12;
        } else if (question.getVibor()=="прямо") {
            return 13;
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
        return "Идешь идешь налево и встречаешь оленя, который рассказывает тебе Пушкина";
    }

    @Override
    public String Ans2(Question question) {
        return "Идешь идешь направо и встречаешь оленя, который рассказывает тебе Есенина";
    }

    public String Ans3(Question question) {
        return "Пойдешь прямо рыбу встретишь, которая читает Басту";
    }

    @Override
    public String Ans11(Question question) {
        return null;
    }
}
