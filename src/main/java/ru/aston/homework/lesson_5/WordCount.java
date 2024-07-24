package ru.aston.homework.lesson_5;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public void wordsCount() {
        String[] words = {"Шарик", "Бобик", "Барсик", "Тузик", "Вася", "Пушок", "Барсик", "Вася", "Барсик", "Пушок"};
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Уникальные слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word);
        }
        System.out.println("Количество повторений:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}