package satya;

public class VArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VArgsEx vr=new VArgsEx();
System.out.println(add(4,5));
System.out.println(add(4,5,6));
int a[]= {12,13,14,15};
System.out.println(add(a));
	}
static int add(int ... a)
{
	int sum=0;
	for(int x:a)
	{
		sum=sum+x;
	}
	return sum;
}
}
