import View.ConsoleMenuView;

import java.util.Scanner;
/*
Created by Marv
*/

public class Main {

    public static void main(String[] args) {
        ConsoleMenuView.showMenuWithResult();
        int count=0;
        if (count > 5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите чмсло:");
            int i = sc.nextInt();
            count++;


            System.out.println("ваше число " + i);

        } else {
            System.out.println("все попытки использованы");
        }
    }
}




