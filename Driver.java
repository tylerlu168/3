import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Quiz quizInputs = new Quiz();
        Scanner input = new Scanner(System.in);

        int terminate = 0;

        while(terminate == 0)
        {
            System.out.println("What would you like to do?" + "\n" +
                                "1. Add a question to the quiz" + "\n" +
                                "2. Remove a question from the quiz" + "\n" +
                                "3. Modify a question in the quiz" + "\n" +
                                "4. Take the quiz" + "\n" +
                                "5. Quit");

            int choice = input.nextInt();

            if (choice == 1)
            {
                quizInputs.addQuestion();
            }
            else if (choice == 2)
            {
                quizInputs.removeQuestion();
            }
            else if (choice == 3)
            {
                quizInputs.modifyQuestion();
            }
            else if (choice == 4)
            {
                quizInputs.giveQuiz();
            }
            else if (choice == 5)
            {
                terminate = 1;
            }
        }
    }
}