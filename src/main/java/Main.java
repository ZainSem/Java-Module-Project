import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int racerQuantity = 3;
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();


        for (int i = 0; i < racerQuantity; i++){

            System.out.println("— Введите название машины №" + (i + 1) + ":");
            String name = scanner.next();

            while(true){
                System.out.println("— Введите скорость машины №" + (i + 1) + ":");
                int speed = scanner.nextInt();

                if(speed < 0 || speed >= 250){
                    System.out.println("— Неправильная скорость");
                }else{
                    race.race(speed,name);
                    break;
                }
            }


        }
        System.out.println("Самая быстрая машина " + race.winner);

    }


}
