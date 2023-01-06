import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.Robot;

public class Spammer {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Scanner in = new Scanner(System.in);

        int x=1;
        System.out.println("enter your text:");
        String Text = in.nextLine();

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        System.out.println("The spamming will start in 5 sec:");
        Thread.sleep(5000);

        while (x<=10) {
            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }
}
