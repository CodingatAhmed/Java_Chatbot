package Bot_Interface;
public class Bot_Interface {
    String Welcome;
    public Bot_Interface() {
        this.Welcome = "Welcome to our Chatbot, you can ask your questions here related to subjects like Mathematics & Science, and even question related to health issues";
    }
    public void WelcomeMessage() {
        System.out.println(this.Welcome);
    }
}