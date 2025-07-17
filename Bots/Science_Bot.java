package Bots;
import java.util.Scanner;

class QuestionAnswerScience{
    String Questions;
    String Answers;
    public QuestionAnswerScience(String Q, String Ans) {
        this.Questions = Q;
        this.Answers = Ans;
    }
}
public class Science_Bot {

    QuestionAnswerScience[] QuesAnswers = new QuestionAnswerScience[3];
    String WelcomeMsg;
    String QuestionAsked;
    public Science_Bot() {
        QuesAnswers[0] = new QuestionAnswerScience("What is gravity?","Gravity is the force that attracts objects toward the center of the Earth or any other physical body having mass.");
        QuesAnswers[1] = new QuestionAnswerScience("What is the boiling point of water?","The boiling point of water is 100°C or 212°F at standard atmospheric pressure.");
        QuesAnswers[2] = new QuestionAnswerScience("Why is the sky blue?","The sky appears blue because sunlight is scattered by the Earth's atmosphere, and blue light is scattered more than other colors due to its shorter wavelength.");
        this.WelcomeMsg = "Welcome to Science Chatbot, you can ask questions related to Science";
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
