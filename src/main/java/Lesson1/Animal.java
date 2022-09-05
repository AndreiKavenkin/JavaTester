package Lesson1;

public abstract class Animal implements Participant{
    private String name;
    private boolean onDistance;
    private int RunDistance;
    private int JumpHeight;
    private int SwimDistance;
    public Animal(String name, int RunDistance, int JumpHeight, int SwimDistance) {
        this.name = name;
        this.RunDistance = RunDistance;
        this.JumpHeight = JumpHeight;
        this.SwimDistance = SwimDistance;
        this.onDistance = true;
    }
    public boolean isOnDistance() {
        return onDistance;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void run(int distance) {
        if (distance <= RunDistance) {
            System.out.println(name + " -> пробежал дистанцию.");
        } else {
            System.out.println(name + " -> не пробежал дистанцию.");
            onDistance = false;
        }
    }
    @Override
    public void jump(int height) {
        if (height <= JumpHeight) {
            System.out.println(name + " -> перепрыгнул барьер.");
        } else {
            System.out.println(name + " -> не перепрыгнул барьер.");
            onDistance = false;
        }
    }
    @Override
    public void swim(int distance) {
        if (SwimDistance == 0) {
            System.out.println(name + " -> не умеет плавать.");
            onDistance = false;
        } else if (distance <= SwimDistance) {
            System.out.println(name + " -> проплыл дистанцию.");
        } else {
            System.out.println(name + " -> не проплыл дистанцию.");
            onDistance = false;
        }
    }
}
