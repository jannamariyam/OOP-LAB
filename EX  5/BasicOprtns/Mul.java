package BasicOprtns;

interface ArithC{
	void mul1();
}

public class Mul implements ArithC{
	int x,y;
	public Mul(int a,int b){
		x=a;
		y=b;
	}
	public void mul1(){
		System.out.println(x+" * "+y+" = "+(x*y));
	}
}