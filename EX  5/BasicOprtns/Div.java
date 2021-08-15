package BasicOprtns;

interface ArithD{
	void div1();
}

public class Div implements ArithD{
	int x,y;
	public Div(int a,int b){
		x=a;
		y=b;
	}
	public void div1(){
		System.out.println(x+" / "+y+" = "+(x/y));
	}
}