package ru.geekbrains;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("Один", "Два", "Три", "Четыре", "Пять",
                "Шесть", "Семь", "Восемь", "Восемь", "Восемь",
                "Один", "Девять", "Три", "Три", "Пять",
                "Один", "Пять", "Три", "Четыре", "Пять"));

        HashSet<String> set = new HashSet<>(list);

        HashMap<String, Integer> map = new HashMap<>();

        for(String a : set) {
            int n = 0;
            for (String b : list) {
                if (b.equals(a)) {
                    n++;
                }
            }
            map.put(a,n);
        }

        System.out.println(map);

        PhoneBook pb = new PhoneBook();
        pb.add("Иванов", "8923423423234");
        pb.add("Иванов", "8923423123234");
        pb.add("Иванов", "8923428423234");
        pb.add("Петров", "12312312123123");
        pb.add("Васильев", "1123123123123");

        System.out.println(pb.get("Иванов"));
        System.out.println(pb.get("Петров"));
        System.out.println(pb.get("Васильев"));
        System.out.println(pb.get("Олегов"));
    }



}
