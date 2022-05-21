import java.util.ArrayList;

public class Quiz
{
    String id;
    String title;
    String summary;
    int score;
    boolean isPublished;
    String hostId;
    ArrayList<Question> questions;

    public Quiz(String id, String title, String summary, int score, boolean isPublished, String hostId, ArrayList<Question> questions)
    {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.score = score;
        this.isPublished = isPublished;
        this.hostId = hostId;
        this.questions = questions;
    }
}
