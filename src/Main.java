public class Main
{
    public static void main(String[] args)
    {
        QuizHandler handler = new QuizHandler();

        Quiz quiz1 = handler.generateQuiz1();
        Quiz quiz2 = handler.generateQuiz2();

        handler.printGeneralIntro();

        handler.printUserView(quiz1);
        handler.printHostView(quiz1);

        handler.printUserView(quiz2);
        handler.printHostView(quiz2);

    }

}