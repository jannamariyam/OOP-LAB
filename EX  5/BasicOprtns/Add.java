package BasicOprtns;

interface ArithA{
	void add1();
}

public class Add implements ArithA{
	int x,y;
	public Add(int a,int b){
		x=a;
		y=b;
	}
	public void add1(){
		System.out.println(x+" + "+y+" = "+(x+y));
	}
}