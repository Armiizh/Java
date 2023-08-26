public abstract class FAQChain implements Answer {

    private FAQChain next;
    private Question.Status FaqStatus;

    public void setNext(FAQChain next, Question.Status FaqStatus) {
        this.next = next;
        this.FaqStatus = FaqStatus;
    }

    public String getAnswer(Question question) {
        if (satisfyCondition1(question) == 11 ||
                satisfyCondition1(question) == 21 ||
                satisfyCondition1(question) == 31) {
            System.out.print(getQuestionType1());
            return Ans1(question);
        }

        else if (satisfyCondition1(question) == 12 ||
                satisfyCondition1(question) == 22 ||
                satisfyCondition1(question) == 32) {
            System.out.print(getQuestionType1());
            return Ans2(question);
        }

        else if (satisfyCondition1(question) == 13 ||
                satisfyCondition1(question) == 23 ||
                satisfyCondition1(question) == 33) {
            System.out.print(getQuestionType1());
            return Ans3(question);
        }



        else if (satisfyCondition2(question) == 11 ||
                satisfyCondition2(question) == 21 ||
                satisfyCondition2(question) == 31) {
            System.out.print("Вопрос " + getQuestionType2());
            return Ans1(question);
        }else if (next == null) {
            return next.getAnswer(question);
        }
        return null;
    }

    abstract int satisfyCondition1(Question question);
    abstract int satisfyCondition2(Question question);
    abstract String getQuestionType1();
    abstract String getQuestionType2();

}
