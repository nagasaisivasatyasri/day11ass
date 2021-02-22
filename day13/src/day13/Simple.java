package day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;

public class Simple {
	private static Logger log=Logger.getLogger(Simple.class);
	private static Layout layout=new SimpleLayout();
	private static Appender app=new ConsoleAppender(layout);
	
	private static Layout l1=new PatternLayout("{ %C }  %d{YYYY-dd-MM} %m %n");
	private static Layout layout2=new HTMLLayout();
	private static Layout layout3=new XMLLayout();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Appender fapp=new FileAppender(l1,"logging3.txt");
		Appender fapp1=new FileAppender(layout2,"index.html");
		Appender fapp2=new FileAppender(layout3,"index2.xml");

		Simple s=new Simple();
		log.addAppender(app);
		log.addAppender(fapp);
		log.addAppender(fapp1);
		log.addAppender(fapp2);
		s.display();
		s.div(6, 0);
		s.add(34, 45);
		s.sub(65, 35);
	}
public void display() {
	System.out.println("Displaying");
	log.debug("Completed");
}
public void div(int a,int b) {
	try {
	int d=a/b;}
	catch(Exception e) {
		
		e.printStackTrace();
		log.error("Exception occured");
	}
	System.out.println("done");
	log.debug("Exception resolved");
}
public void add(int a,int b) {
	System.out.println("Addition= "+(a+b));
	log.debug("addition is completed");
}
public void sub(int a,int b) {
	System.out.println("Subtraction= "+(a-b));
	log.debug("Subtraction is completed");
}
}
