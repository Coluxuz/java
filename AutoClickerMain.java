import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;

public class AutoClickerMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("----AutoClicker----");

        System.out.printf("Enter the number of desired clicks: ");
        int clicks = in.nextInt();
        System.out.printf("Enter Delay between clicks in milliseconds:");
        int delay = in.nextInt();
        System.out.println();

        System.out.println("Program will start in 3 seconds.");

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delay);

        for (int i =0;i<=clicks;i++){
            clicker.clickMouse(InputEvent.BUTTON1_MASK);
        }

        System.out.println("AutoClicker Complete");
    }

}
