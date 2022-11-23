public interface Quiz {

    public String getCurrentCategory();

    public void shuffleQuestions();

    public void setCategory(String s);

    public String[] getCategoriesAsArray(int n);

    public String getCurrentQuestion();

    public String getCorrectAnswer();

    public String[] getChoicesAsArray();

    public void nextQuestion();

}
