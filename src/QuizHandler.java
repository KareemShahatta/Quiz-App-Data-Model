import java.util.ArrayList;
import java.util.Collections;

public class QuizHandler
{
    private final User studentUser = new User("User_Kareem" , "Kareem", "Sh" , "Kshahatta@mail.dccc.edu", "P455W0RD", false, "Welcome, Student");
    private final User hostUser = new User("HOST_USER_1" , "Michael", "Whitehead" , "quizme@mail.dccc.edu", "H05T", true, "Welcome, Michael");


    public Quiz generateQuiz1() {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Answer> question_1_answers = new ArrayList<>();
        ArrayList<Answer> question_2_answers = new ArrayList<>();
        ArrayList<Answer> question_3_answers = new ArrayList<>();
        ArrayList<Answer> question_4_answers = new ArrayList<>();

        Quiz quiz_1 = new Quiz("QU1" , "Unit 1 quiz", "This is a Computer Science test for DPR101 class. You will be quizzed on Unit 1, and its worth 5 points" , 5 , true , hostUser.id, questions);


        Question question_1 = new Question("Question_1" , quiz_1.id , Type.MULTYPLE_CHOICE , Level.EASY, 1 , "What is Computer Science?" , question_1_answers);

        Answer answer_1_a = new Answer("Answer_1_a" , quiz_1.id, question_1.id , true , false, "Science related to studying dinosaurs.");
        Answer answer_1_b = new Answer("Answer_1_b" , quiz_1.id, question_1.id , true , false, "Science related to studying light");
        Answer answer_1_c = new Answer("Answer_1_c" , quiz_1.id, question_1.id , true , true, "Science related to studying computers");

        questions.add(question_1);
        question_1_answers.add(answer_1_a);
        question_1_answers.add(answer_1_b);
        question_1_answers.add(answer_1_c);


        Question question_2 = new Question("Question_2" , quiz_1.id , Type.MULTYPLE_CHOICE , Level.EASY, 1 , "Which of the following is a CPU producing company?" , question_2_answers);

        Answer answer_2_a = new Answer("Answer_2_a" , quiz_1.id, question_2.id , true , false, "Volvo");
        Answer answer_2_b = new Answer("Answer_2_b" , quiz_1.id, question_2.id , true , true, "Intel");
        Answer answer_2_c = new Answer("Answer_2_c" , quiz_1.id, question_2.id , true , false, "McDonald");

        questions.add(question_2);
        question_2_answers.add(answer_2_a);
        question_2_answers.add(answer_2_b);
        question_2_answers.add(answer_2_c);

        Question question_3 = new Question("Question_3" , quiz_1.id , Type.MULTYPLE_CHOICE , Level.EASY, 1 , "Which of the following is a a data type in Java?" , question_3_answers);

        Answer answer_3_a = new Answer("Answer_3_a" , quiz_1.id, question_3.id , true , true, "int");
        Answer answer_3_b = new Answer("Answer_3_b" , quiz_1.id, question_3.id , true , false, "number");
        Answer answer_3_c = new Answer("Answer_3_c" , quiz_1.id, question_3.id , true , false, "crayon");

        questions.add(question_3);
        question_3_answers.add(answer_3_a);
        question_3_answers.add(answer_3_b);
        question_3_answers.add(answer_3_c);

        Question question_4 = new Question("Question_4" , quiz_1.id , Type.TRUE_AND_FALSE , Level.MEDIUM, 2 , "Java is an Object Oriented Programming Language?" , question_4_answers);

        Answer answer_4_a = new Answer("Answer_4_a" , quiz_1.id, question_4.id , true , true, "True");
        Answer answer_4_b = new Answer("Answer_4_b" , quiz_1.id, question_4.id , true , false, "False");

        questions.add(question_4);
        question_4_answers.add(answer_4_a);
        question_4_answers.add(answer_4_b);

        Collections.shuffle(questions);
        return quiz_1;
    }
    public Quiz generateQuiz2() {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Answer> question_1_answers = new ArrayList<>();
        ArrayList<Answer> question_2_answers = new ArrayList<>();
        ArrayList<Answer> question_3_answers = new ArrayList<>();
        ArrayList<Answer> question_4_answers = new ArrayList<>();
        ArrayList<Answer> question_5_answers = new ArrayList<>();

        Quiz quiz_2 = new Quiz("QU2" , "Unit 5 quiz", "This is a Computer Science test for DPR204 class. You will be quizzed on Unit 5, and its worth 10 points" , 10 , true , hostUser.id, questions);


        Question question_1 = new Question("Question_1" , quiz_2.id , Type.MULTYPLE_CHOICE , Level.MEDIUM, 2 , "What does OOP means?" , question_1_answers);

        Answer answer_1_a = new Answer("Answer_1_a" , quiz_2.id, question_1.id , true , true, "Object Oriented Programming.");
        Answer answer_1_b = new Answer("Answer_1_b" , quiz_2.id, question_1.id , true , false, "Out Of Print");
        Answer answer_1_c = new Answer("Answer_1_c" , quiz_2.id, question_1.id , true , false, "Its another way of saying Oops");

        questions.add(question_1);
        question_1_answers.add(answer_1_a);
        question_1_answers.add(answer_1_b);
        question_1_answers.add(answer_1_c);


        Question question_2 = new Question("Question_2" , quiz_2.id , Type.MULTYPLE_CHOICE , Level.MEDIUM, 2 , "What is Encapsulation" , question_2_answers);

        Answer answer_2_a = new Answer("Answer_2_a" , quiz_2.id, question_2.id , true , false, "Putting things in Capsules");
        Answer answer_2_b = new Answer("Answer_2_b" , quiz_2.id, question_2.id , true , false, "It a fancy word my English teacher use");
        Answer answer_2_c = new Answer("Answer_2_c" , quiz_2.id, question_2.id , true , true, "Mechanism of wrapping the data");

        questions.add(question_2);
        question_2_answers.add(answer_2_a);
        question_2_answers.add(answer_2_b);
        question_2_answers.add(answer_2_c);

        Question question_3 = new Question("Question_3" , quiz_2.id , Type.MULTYPLE_CHOICE , Level.MEDIUM, 2 , "{Cat cat = new Cat()} What is that code?" , question_3_answers);

        Answer answer_3_a = new Answer("Answer_3_a" , quiz_2.id, question_3.id , true , false, "A code to summon an actual cat");
        Answer answer_3_b = new Answer("Answer_3_b" , quiz_2.id, question_3.id , true , false, "Cats");
        Answer answer_3_c = new Answer("Answer_3_c" , quiz_2.id, question_3.id , true , true, "A code to create an object from class Cat");

        questions.add(question_3);
        question_3_answers.add(answer_3_a);
        question_3_answers.add(answer_3_b);
        question_3_answers.add(answer_3_c);

        Question question_4 = new Question("Question_4" , quiz_2.id , Type.TRUE_AND_FALSE , Level.HARD, 4 , "ArrayLists are the same as Arrays?" , question_4_answers);

        Answer answer_4_a = new Answer("Answer_4_a" , quiz_2.id, question_4.id , true , true, "True");
        Answer answer_4_b = new Answer("Answer_4_b" , quiz_2.id, question_4.id , true , false, "False");

        questions.add(question_4);
        question_4_answers.add(answer_4_a);
        question_4_answers.add(answer_4_b);

        Question question_5 = new Question("Question_5" , quiz_2.id , Type.TRUE_AND_FALSE , Level.HARD, 5 , "We can make an ArrayList for any object" , question_5_answers);

        Answer answer_5_a = new Answer("Answer_5_a" , quiz_2.id, question_5.id , true , true, "True");
        Answer answer_5_b = new Answer("Answer_5_b" , quiz_2.id, question_5.id , true , false, "False");

        questions.add(question_5);
        question_5_answers.add(answer_5_a);
        question_5_answers.add(answer_5_b);

        Collections.shuffle(questions);
        return quiz_2;
    }

    public void printGeneralIntro() {
        System.out.println("Host: " + hostUser.id + "\n" + hostUser.firstName + " " +  hostUser.lastName + "\nWelcome, " + hostUser.firstName + "\nEmail: " + hostUser.email + "\n");
    }

    public void printUserView(Quiz quiz) {
        System.out.println("=================================================================================================================");
        System.out.println("Quiz Topic: " + quiz.title);
        System.out.println(quiz.summary + "\n");

        for(int i = 0; i < quiz.questions.size() ; i++)
        {
            System.out.println( i + 1 + ")(" + quiz.questions.get(i).score + " points)");
            System.out.println(quiz.questions.get(i).questionText);

            for(int j = 0; j < quiz.questions.get(i).answers.size() ; j++)
            {
                System.out.println( numberToAlphabetFormatter(j + 1) + ". " + quiz.questions.get(i).answers.get(j).answerText);
            }

            System.out.print("\n"); //Space between each question
        }
    }
    public void printHostView(Quiz quiz) {
        System.out.println(
                "__________________________\n" +
                " INSTRUCTOR VERSION BELOW \n" +
                "__________________________\n");
        System.out.println("Quiz Topic: " + quiz.title);
        System.out.println(quiz.summary + "\n");

        for(int i = 0; i < quiz.questions.size() ; i++)
        {
            System.out.println( i + 1 + ")(" + quiz.questions.get(i).score + " points)");
            System.out.println(quiz.questions.get(i).questionText);

            for(int j = 0; j < quiz.questions.get(i).answers.size() ; j++)
            {
                System.out.println( numberToAlphabetFormatter(j + 1) + ". " + quiz.questions.get(i).answers.get(j).answerText);
            }

            System.out.println("\n Correct Answer: " + getCorrectAnswerText(quiz.questions.get(i)) + "\n");
        }
    }

    private String getCorrectAnswerText(Question question) {
        for(Answer answer : question.answers)
        {
            if(answer.isCorrect)
            {
                return answer.answerText;
            }
        }

        return "NA";
    }

    private char numberToAlphabetFormatter(int number) {
        switch (number)
        {
            case 1 :   return 'A';
            case 2 :   return 'B';
            case 3 :   return 'C';
            case 4 :   return 'D';
            case 5 :   return 'E';
            default: return 'X';
        }
    }
}
