import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws AWTException, InterruptedException {
		JOptionPane.showMessageDialog(null, "Press 'OK' once you have navigated to the correct page");
		int mY1 = MouseInfo.getPointerInfo().getLocation().y;
		int mX1 = MouseInfo.getPointerInfo().getLocation().x;
		click(mX1, mY1);
		click(mX1, mY1);
		click(mX1, mY1);
		click(mX1, mY1);
		TimeUnit.MILLISECONDS.sleep(4250);
		System.out.println("GO");

		Robot bot = new Robot();
		while(true){

			click(mX1, mY1);
			TimeUnit.MILLISECONDS.sleep(10);
			click(mX1+75, mY1-30);
		}
	}
	public static void click(int x, int y) throws AWTException{
	    Robot bot = new Robot();
	    bot.mouseMove(x, y);    
	    bot.mousePress(InputEvent.BUTTON1_MASK);
	    bot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	
}
