package day11ass.src;
@FunctionalInterface
interface Myinterface{
	public void total(int...a);
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myinterface m=(x)->{
int  sum=0;
for(int a:x) {
	sum+=a;
	}
System.out.println("sum "+sum);} ;
m.total(45,450,45);
m.total(12,34);
	}

}
