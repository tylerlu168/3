import java.util.ArrayList;
import java.util.Scanner;

public class Quiz
{
    ArrayList<Question> questionList = new ArrayList<Question>(); // do i need static??? check after compile
    Scanner input = new Scanner(System.in);
    public void addQuestion()
    {
        System.out.println("What is the question Text?");
        String questionInput = input.nextLine();
        System.out.println("What is the answer?");
        String answerInput = input.nextLine();
        System.out.println("How Difficult (1-3)?");
        int difficulty = input.nextInt();

        input.nextLine();

        questionList.add(new Question(questionInput, answerInput, difficulty));

    }

    public void removeQuestion()
    {
        System.out.println("Choose the question to remove?");

        for (int i = 0; i < questionList.size(); i++)
        {
            System.out.println(i + ". " + questionList.get(i).getQuestion());
        }
        int choice = input.nextInt();

        input.nextLine();

        questionList.remove(choice);
    }

    public void modifyQuestion()
    {
        System.out.println("Choose the question to modify?");

        for (int i = 0; i < questionList.size(); i++)
        {
            System.out.println(i + ". " + questionList.get(i).getQuestion());
        }
        int choice = input.nextInt();

        input.nextLine();

        System.out.println("What is the question Text?");
        String questionInput = input.nextLine();
        System.out.println("What is the answer?");
        String answerInput = input.nextLine();
        System.out.println("How Difficult?");
        int difficulty = input.nextInt();

        input.nextLine();

        questionList.get(choice).setQuestion(questionInput);
        questionList.get(choice).setAnswer(answerInput);
        questionList.get(choice).setDifficulty(difficulty);
    }

    public void giveQuiz()
    {
        int correctCounter = 0;
        for (int i = 0; i < questionList.size(); i++)
        {
            System.out.println(questionList.get(i).getQuestion());
            String answer = input.nextLine();
            if (answer.equals(questionList.get(i).getAnswer()))
            {
                System.out.println("Correct");
                correctCounter++;
            }
            else
            {
                System.out.println("Incorrect");
            }
        }

        System.out.println("You got " + correctCounter + " out of " + questionList.size());

    }


}
