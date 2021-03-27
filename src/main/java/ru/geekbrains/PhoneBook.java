package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook {
    private HashMap <String, ArrayList<String>> map = new HashMap<>();

    public void add (String secondName, String number) {
        if(map.containsKey(secondName)) {
            map.get(secondName).add(number);
        }
        else {
            map.put(secondName, new ArrayList<>(Arrays.asList(number)));
        }
    }

    public ArrayList<String> get (String secondName) {
        if (map.containsKey(secondName)) {
            return map.get(secondName);
        }
        else return new ArrayList<>(Arrays.asList("Нет людей с такой фамилией в базе"));
    }

}
