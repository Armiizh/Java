public class Q3 extends FAQChain {

    @Override
    int satisfyCondition1(Question question) {
        if (question.getVibor().toLowerCase()=="налево") {
            return 31;
        } else if (question.getVibor().toLowerCase()=="направо") {
            return 32;
        } else if (question.getVibor().toLowerCase()=="прямо") {
            return 33;
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
        return "Идешь прямо и спотыкаешься";
    }
    @Override
    public String Ans2(Question question) {
        return "по этой дороге выйдешь к озеру";
    }
    @Override
    public String Ans3(Question question) {
        return "За деревом озеро";
    }

    @Override
    public String Ans11(Question question) {
        return null;
    }
}
