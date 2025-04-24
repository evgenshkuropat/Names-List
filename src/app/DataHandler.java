package app;


public class DataHandler {

        try {
            String name = list.get(index); // Отримуємо ім'я за індексом
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!"; // Обробка випадку, коли індекс неправильний
        }
    }

    // Метод для формування виведення нумерованого списку імен
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);

        // Перебір імен і створення нумерованого списку
        for (String name : list) {
            sb.append(String.format("%d) %s%n", count.getAndIncrement(), name));
        }

        return "\nNames:\n" + sb.toString(); // Результат
    }
}