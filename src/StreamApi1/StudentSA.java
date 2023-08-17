package StreamApi1;
import java.util.Objects;

public class StudentSA {


    private String name;

    private int ball;

    public StudentSA(String name, int ball) {
        this.ball = ball;
        this.name = name;

    }




    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}