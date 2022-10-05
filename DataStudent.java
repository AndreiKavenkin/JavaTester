package Lesson9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class DataStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Андрей", Arrays.asList(new Course("Английский"),
                new Course("Java "), new Course("Физика"))));
        students.add(new Student("Коля", Arrays.asList(new Course("Математика"),
                new Course("Физика"), new Course("Тестирование"), new Course("Python"))));
        students.add(new Student("Игорь", Arrays.asList(new Course("Основы ООП"),
                new Course("Английский"), new Course("Физика"), new Course("Тестирование"))));
        students.add(new Student("Руслан", Arrays.asList(new Course("Python"),
                new Course("Java "),new Course("Физика"))));
        students.add(new Student("Вася", Arrays.asList(new Course("Математика"),
                new Course("Физика"), new Course("Python"), new Course("Английский"),new Course("Java "))));
        students.add(new Student("Сергей", Arrays.asList(new Course("Математика"),
                new Course("Java "), new Course("Английский"))));
        System.out.println("---------> Список уникальных курсов на которые подписаны студенты <---------");
        System.out.println(students.stream()
                .map(Student::getCourses)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet()));
        System.out.println("---------> Три самых любознательных студента <---------");
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));
        System.out.println("---------> Студенты которые посещают курс 'Тестирование' <---------");
        Course course = new Course("Тестирование");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
