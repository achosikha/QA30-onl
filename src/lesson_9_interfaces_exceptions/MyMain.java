package lesson_9_interfaces_exceptions;

import lesson_9_interfaces_exceptions.interf.SamsungControlPanel;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        createSamsungControlPanel();
    }

    public static void createSamsungControlPanel(){
        SamsungControlPanel samsung = new SamsungControlPanel(2022, 6709);

        System.out.println("Let's turn on your TV.");
        samsung.turnOnInternet();

        System.out.println("****************************************************************************");

        System.out.println("Let's get data on your internet:");
        System.out.println(samsung.getInternetInformation());

        System.out.println("****************************************************************************");

        System.out.println("Let's try to get access to a private function on your control panel.");
        System.out.println("Please, enter a Pin CODE:");

        if (samsung.validateInternetPinCode(new Scanner(System.in).nextInt())){
            System.out.println("You have entered a correct PIN CODE.");
            System.out.println("You have a FULL ACCESS to the CONTROL PANEL.");
        } else {
            System.out.println("Your PIN CODE VALIDATION FAILED.");
            System.out.println("ACCESS DENIED!");
        }

        System.out.println("********************************************************************************");
        System.out.println(samsung);

        System.out.println("********************************************************************************");

        samsung.turnOnTV();
        samsung.decreaseSoundTV();
        samsung.changeChannelUpTV();
        samsung.turnOffTV();
        System.out.println("What is your ERROR msg? " + samsung.getErrorMsg());
        System.out.println("How many buttons do you have on a TV control panel? " + samsung.getButtonsNumber());
    }
}
