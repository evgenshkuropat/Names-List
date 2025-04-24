package app;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        // Виведення нумерованого списку
        uiOperator.getOutput(handler.formListOutput(repository.getData()));

        // Виведення імені за індексом
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2)); // Індекс 2 для "Lucy"
    }
}