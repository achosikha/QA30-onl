package lesson_7_oop_tictactoe;

import lesson_7_oop_tictactoe.atm.ATM;
import lesson_7_oop_tictactoe.game.GameTicTacToe;

public class MyMain {
    public static void main(String[] args) {
        createATMUser();
    }

    public static void createATMUser(){
        ATM archilATM =
                new ATM(
                        "TBC", "Archil Sikharulidze", "ARCHIL SIKHARULIDZE",
                        5671_4567_0192_5698L, 2345);

        System.out.println(archilATM.getATMFullInformation());

        System.out.println("***********************************************");
        ATM kateATM = new ATM();

        System.out.println(kateATM.getATMFullInformation());
    }
    public static void starGame(){
        new GameTicTacToe();
    }
}