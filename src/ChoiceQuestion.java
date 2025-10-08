import java.util.*;

public class ChoiceQuestion extends Question {
    private List<String> choices = new ArrayList<>();

    public ChoiceQuestion(String text) {
        super(text, "");
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            setAnswer(String.valueOf(choices.size())); // store correct choice index
        }
    }

    @Override
    public void displayQuestion() {
        System.out.println(getText());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ": " + choices.get(i));
        }
    }
}
