package satya;

public class ThisEx1 {
	int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisEx1 e=new ThisEx1();
e.addition();
	}
	public void addition()
	{
		int a=78;
		System.out.println(a+this.a);
		System.out.println(a-this.a);
	}


}
