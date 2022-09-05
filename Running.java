package Lesson1;

public class Running extends Obstacle{
    private int length;
    public Running(int length) {
        this.length = length;
    }
    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
