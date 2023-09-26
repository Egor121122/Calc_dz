package org.example;

public class Calculator {
    public static void main(String[] args) {
        String result;
        int[] value = {Integer.parseInt(args[0]),Integer.parseInt(args[2])};
        // змінна, з масивом типу int

        if(value[1] == 0 && args[1].equals("/"))
            result = "error1";
        else{
            result = switch (args[1]) {
                case "+" -> String.valueOf(value[0] + value[1]);
                case "-" -> String.valueOf(value[0] - value[1]);
                case "*" -> String.valueOf(value[0] * value[1]);
                case "/" -> String.valueOf(value[0] / value[1]);
                default -> "error0";
            };
        }
        //Виконати дію. Перевірка на помилку

        if(result.equals("error0"))
            System.out.println("некорректный знак");
        else if (result.equals("error1"))
            System.out.println("дiлити на 0 не можна");
        else
            System.out.println("Result: " + result);
        //Відображення відповіді
    }
}