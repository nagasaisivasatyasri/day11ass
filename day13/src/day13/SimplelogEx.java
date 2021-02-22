package day13;

//import javax.mail.MessagingException;
import org.apache.log4j.Logger;

public class SimplelogEx {
private static Logger log=Logger.getLogger(SimplelogEx.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplelogEx sle = new SimplelogEx();
		sle.display();
		sle.div(4, 0);
		sle.sub(23,14);
		sle.add(4, 4);
		//sle.multiplication(4, 2);

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
		System.out.println("\ndone");
		log.debug("\nException resolved");
	}
	public void add(int a,int b) {
		System.out.println("\nAddition= "+(a+b));
		log.debug("\naddition is completed");
	}
	public void sub(int a,int b) {
		System.out.println("Subtraction= "+(a-b));
		log.debug("Subtraction is completed");
	}


}
