
public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String text, boolean answer) {
        super(text, answer ? "true" : "false");
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText() + " (true/false)");
    }
}
