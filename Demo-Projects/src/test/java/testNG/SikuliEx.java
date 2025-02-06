package testNG;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliEx {

	public static void main(String[] args) throws Throwable {
		
		Screen src = new Screen();
		
		Pattern search = new Pattern("C:\\Users\\LENOVO\\Desktop\\softtest\\search.png");
		src.type(search, "Notepad");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern page = new Pattern("C:\\Users\\LENOVO\\Desktop\\softtest\\pageimg.png");
		src.type(page, "Nirmala Abhishek Palankar");
		

	}

}
