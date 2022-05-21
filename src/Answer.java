public class Answer
{
    String id;
    String quizId;
    String questionId;
    boolean isActive;
    boolean isCorrect;
    String answerText;

    public Answer(String id, String quizId, String questionId, boolean isActive, boolean isCorrect, String answerText) {
        this.id = id;
        this.quizId = quizId;
        this.questionId = questionId;
        this.isActive = isActive;
        this.isCorrect = isCorrect;
        this.answerText = answerText;
    }
}
