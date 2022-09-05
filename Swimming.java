package Lesson1;

public class Swimming extends Obstacle{
    private int length;
    public Swimming(int length) {
        this.length = length;
    }
    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}
