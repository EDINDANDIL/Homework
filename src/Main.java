
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        System.out.print("Введите целое число: ");

        Scanner c = new Scanner(System.in);
        int num = c.nextInt();

        String ans = ""; // Будущий ответ, сюда буду приписывать остатки от деления на 2

        // цикл перевода в двоичную
        while (num>0){
            String Ost = Integer.toString(num%2); // Остаток от деления в строке
            ans = Ost + ans;
            num = num/2;
        }

        System.out.println("Ответ: " + ans);

    }
}