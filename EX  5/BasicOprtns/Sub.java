package BasicOprtns;

interface ArithB{
	void sub1();
}

public class Sub implements ArithB{
	int x,y;
	public Sub(int a,int b){
		x=a;
		y=b;
	}
	public void sub1(){
		System.out.println(x+" - "+y+" = "+(x-y));
	}
}