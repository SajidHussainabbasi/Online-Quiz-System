// Base class
public abstract class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public abstract void displayQuestion();

    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    // For subclasses to set correct answer safely
    protected void setAnswer(String answer) {
        this.answer = answer;
    }
}