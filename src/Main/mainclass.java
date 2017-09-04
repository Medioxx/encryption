package Main;

import Window.mainWindow;
import Window.resultWindow;

public class mainclass {

	public static void main(String[] args) {
		mainWindow p=  new mainWindow();
		resultWindow s= new resultWindow("test", "kocham nuttele");
		p.setVisible(true);
		s.setVisible(true);
		System.out.println(p);

	}

}
