package Bots;
import java.util.Scanner;

class QuestionAnswerMaths {
    String Questions;
    String Answers;
    public QuestionAnswerMaths(String Q, String Ans) {
        this.Questions = Q;
        this.Answers = Ans;
    }
}
public class Mathematics_Bot {

    QuestionAnswerMaths[] QuesAnswers = new QuestionAnswerMaths[3];
    String WelcomeMsg;
    String QuestionAsked;
    public Mathematics_Bot() {
        QuesAnswers[0] = new QuestionAnswerMaths("What is the Pythagorean Theorem?","The Pythagorean Theorem states that in a right-angled triangle: a² + b² = c².");
        QuesAnswers[1] = new QuestionAnswerMaths("What is a prime number?","A prime number is a number greater than 1 that has no divisors other than 1 and itself.");
        QuesAnswers[2] = new QuestionAnswerMaths("What is the value of Pi?","Pi is approximately 3.14159 and represents the ratio of a circle’s circumference to its diameter.");
        this.WelcomeMsg = "Welcome to Mathematics Chatbot, you can ask questions related to Mathematics";
    }
    public void WelcomeMsgChatbot() {
        System.out.println(this.WelcomeMsg);
    }
    public void AskQuestion() {
        try {
            System.out.println("Feel free to ask any questions related to Health & Wellness Tips");
            Scanner takeInput = new Scanner(System.in);
            String getQuestion = takeInput.nextLine();
            this.QuestionAsked = getQuestion;
            if (this.QuestionAsked.equals(QuesAnswers[0].Questions)) {
                System.out.println(QuesAnswers[0].Answers);
            }
            if (this.QuestionAsked.equals(QuesAnswers[1].Questions)) {
                System.out.println(QuesAnswers[1].Answers);
            }
            if (this.QuestionAsked.equals(QuesAnswers[2].Questions)) {
                System.out.println(QuesAnswers[2].Answers);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
