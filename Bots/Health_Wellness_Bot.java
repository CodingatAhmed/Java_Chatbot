package Bots;
import java.util.Scanner;
// import Bot_Interface.Bot_Interface;
class QuestionAnswerHealth {
    String Questions;
    String Answers;
    public QuestionAnswerHealth(String Q, String Ans) {
        this.Questions = Q;
        this.Answers = Ans;
    }
}
public class Health_Wellness_Bot{
    QuestionAnswerHealth[] QuesAnswers = new QuestionAnswerHealth[3];
    String WelcomeMsg;
    String QuestionAsked;

    public Health_Wellness_Bot() {
        QuesAnswers[0] = new QuestionAnswerHealth("How much water should I drink daily?","Most health experts recommend drinking about 8 glasses (2 liters) of water per day. However, your needs may vary based on your activity level, climate, and overall health.");
        QuesAnswers[1] = new QuestionAnswerHealth("What is a balanced diet?","A balanced diet includes a variety of foods: fruits, vegetables, whole grains, lean proteins, and healthy fats. It provides all the essential nutrients your body needs to function properly.");
        QuesAnswers[2] = new QuestionAnswerHealth("How much sleep do I need?","Adults typically need 7 to 9 hours of sleep per night. Good sleep supports brain function, mood, and overall health.");
        this.WelcomeMsg = "Welcome to Health & Wellness Chatbot, you can ask questions related to Health Tips";
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
