package Lesson1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[] {
                              new Running(10),
                              new Barrier(5),
                              new Swimming(5)});
        Team team = new Team("Зверинец",
                    new Cat("Гарфилд", 30, 10, 0),
                    new Dog("Шарик", 25, 10, 15),
                    new Mouse("Рататуй", 10, 4, 4),
                    new Bison("Фердинанд", 15, 4, 10));
        team.getTeamInfo();
        c.doIt(team);
        team.showResults();
    }
}
