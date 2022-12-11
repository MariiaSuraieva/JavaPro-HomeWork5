package hillel.suraieva;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("-------2-------");
        printThreeWords();
        System.out.println("-------3-------");
        checkSumSign();
        System.out.println("-------4-------");
        printColor();
        System.out.println("-------5-------");
        compareNumbers();
        System.out.println("-------6-------");
        System.out.println(checkSum(5, 6));
        System.out.println("-------7-------");
        plusOrMinus(-5);
        System.out.println("-------8-------");
        System.out.println(isNegative(5));
        System.out.println("-------9-------");
        printText("хаюшки приветушки", 2);
        System.out.println("-------10-------");
        System.out.println(isYearLeap(-15));


    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = 1,
                b = 2,
                sum = a + b;
        if (sum >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма негативная");

    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
            return;
        }
        if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 5,
                b = 6;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }


    public static void plusOrMinus(int a) {
        if (a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
    }


    public static boolean isNegative(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void printText(String line, int kol) {
        if (kol > 0) {
            for (int i = 0; i < kol; i++) {
                System.out.println(line);
            }
        } else System.out.println("Введено некорректное количество строк");
    }


    public static boolean isYearLeap(int year) {
        if(year>0){
        if (year % 4 == 0) {
            if (year % 100 == 0 && !(year % 400 == 0)) return false;
            else return true;
        } else return false;} else System.out.println("Введен невозможный номер года, результат недействителен");
        return false;
    }


}
