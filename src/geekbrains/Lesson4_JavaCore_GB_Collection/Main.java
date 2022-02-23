package geekbrains.Lesson4_JavaCore_GB_Collection;

import java.util.*;

public class Main {

    public static ArrayList<String> listString = new ArrayList<>();

    public static void main(String[] args) {

//        Задание №1
        for (int i = 0; i < 10; i++) {
            listString.add("сЛоВо" + i);
        }
        for (int i = 0; i < 10; i++) {
            listString.add("сЛоВо" + i);
        }
        System.out.println(listString);
        System.out.println("Размер списка:  " + listString.size());

        HashSet<String> targetSet = new HashSet<>(listString);
        System.out.println("Сортировка:  " + targetSet.size());

        HashMap<String,Integer> result = new HashMap<>();
        for(String str: targetSet){
            result.put(str,count(str));
        }

        System.out.println(result);

//        Задание №2

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петров", "+7 (911) 322-22-23");
        phoneBook.add("Иванов", "+7 (911) 444-44-44");
        phoneBook.add("Петров", "+7 (911) 322-22-23");
        phoneBook.add("Сидоров", "+7 (911) 555-55-55");
        phoneBook.add("Андреев", "+7 (911) 666-69-69");
        phoneBook.add("Петров", "+7 (911) 772-27-72");
        phoneBook.add("Иванов", "+7 (911) 802-08-02");
        phoneBook.add("Петров", "+7 (911) 999-09-90");
        phoneBook.get("Петров");
        phoneBook.get("Иванов");
        phoneBook.get("Сидоров");

    }

    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : listString){
            if(strThis.equals(str)) result++;
        }
        return result;
    }








}
