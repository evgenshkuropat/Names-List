package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    // Метод для отримання списку імен
    public List<String> getData() {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Lucy");
        list.add("Denis");
        list.add("Tom");
        return list;
    }
}