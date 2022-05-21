import java.util.ArrayList;

public class Question
{
    String id;
    String quizId;
    Type type;
    Level level;
    int score;
    String questionText;
    ArrayList<Answer> answers;

    public Question(String id , String quizId, Type type, Level level, int score, String questionText, ArrayList<Answer> answers) {
        this.id = id;
        this.quizId = quizId;
        this.type = type;
        this.level = level;
        this.score = score;
        this.questionText = questionText;
        this.answers = answers;
    }
}
