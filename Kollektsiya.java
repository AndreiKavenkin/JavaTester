package Lesson4;

import java.util.*;

public class Kollektsiya {
    public static void main(String[] args) {
        Massive();
        Directory();
    }
    public static void Massive(){
        System.out.println("----------Массив с набором слов----------");
        List<String> words = Arrays.asList(
                "Renault", "Xpeng", "Tesla", "Lada", "Vokswagen",
                "Opel", "Renault", "Opel", "Lada", "Vokswagen",
                "BMW", "Vokswagen", "Uaz", "Tesla", "Uaz",
                "Volvo", "Tesla", "Vokswagen", "Renault", "Xpeng"
        );
        HashSet<String> unique = new HashSet<>(words);
        System.out.println("Первоначальный массив: " + words);
        System.out.println("Уникальные слова: " + unique);
        for (Object key : unique) {
            System.out.println("Количество слов " + key + " в списке равно: " + Collections.frequency(words,key));
        }
    }
    public static void Directory(){
        System.out.println("----------Телефонный справочник----------");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Сидоренко", "+375(29)123-45-67");
        phonebook.add("Кавенькин", "+375(44)567-56-66");
        phonebook.add("Воронов", "+375(29)687-42-23");
        phonebook.add("Власов", "+375(44)127-48-27");
        phonebook.add("Сидоренко", "+375(44)103-95-29");
        phonebook.add("Кавенькин", "+375(29)457-92-56");
        phonebook.add("Воронов", "+375(29)654-78-61");
        phonebook.add("Вовченко", "+375(44)975-31-24");
        phonebook.add("Ворошилов", "+375(29)246-80-97");

        System.out.println("----------Поиск номера телефона по фамилии----------");
        System.out.println("Сидоренко " + phonebook.get("Сидоренко"));
        System.out.println("Ворошилов " + phonebook.get("Ворошилов"));
        System.out.println("Вовченко " + phonebook.get("Вовченко"));
        System.out.println("Воронов " + phonebook.get("Воронов"));
        System.out.println("Кавенькин " + phonebook.get("Кавенькин"));
        System.out.println("Власов " + phonebook.get("Власов"));
        System.out.println("Матвейчук" + phonebook.get("Матвейчук"));
        System.out.println("----------Запись номера телефона в справочник----------");
        phonebook.add("Кавенькин", "+375(29)246-80-98");
        System.out.println("Кавенькин " + phonebook.get("Кавенькин"));
        phonebook.add("Кавенькин", "+375(29)457-92-56");
        System.out.println("Кавенькин" + phonebook.get("Кавенькин"));
    }
    public static class Phonebook {
        private final HashMap<String, List<String>> book;
        public Phonebook(){
            this.book = new HashMap<>();
        }
        public void add(String surname, String number){
            if(book.containsKey(surname)){
                List<String> numbers = book.get(surname);
                if(!numbers.contains(number)){
                    numbers.add(number);
                    System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
                } else {
                    System.out.printf("Номер %s уже существует для фамилии %s%n", number, surname);
                }
            } else {
                book.put(surname, new ArrayList<>(Collections.singletonList(number)));
                System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
            }
        }
        public List<String> get(String surname){
            if(book.containsKey(surname)){
                return book.get(surname);
            } else {
                System.out.printf("В справочнике нет абонента с фамилией ", surname);
                return new ArrayList<>();
            }
        }
    }
}

