public class Q11 extends  FAQChain {

    @Override
    int satisfyCondition1(Question question) {
        return 0;
    }

    @Override
    int satisfyCondition2(Question question) {
        if (question.getVibor().toLowerCase()=="налево")  {
            return 11;
        } else if (question.getVibor().toLowerCase()=="направо") {
            return 12;
        } else if (question.getVibor().toLowerCase()=="прямо") {
            return 13;
        } else {
            return 0;
        }
    }

    @Override
    String getQuestionType1() {
        return null;
    }

    @Override
    String getQuestionType2() {
        return "первый левый: ";
    }

    @Override
    public String Ans11(Question question) {
        return "Сосиска";
    }

    @Override
    public String Ans1(Question question) {
        return null;
    }

    public String Ans2(Question question) {
        return "Пойдешь направо петуха встретишь";
    }

    @Override
    public String Ans3(Question question) {
        return "СОСОСО";
    }

}

