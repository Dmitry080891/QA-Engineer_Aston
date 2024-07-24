package ru.aston.homework.lesson_5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;
    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(surname, phoneNumbers);
        }
    }
    public Set<String> get(String surname) {
        return phoneBook.get(surname);
    }
}
