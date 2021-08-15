package Graphics;



 
public class TriangleA implements AreaA{
	int base,height,a;
	public TriangleA(){
	}
	public TriangleA(int b,int h){
		base=b;
		height=h;
	}
	public void area(){
		a= ( height * base ) / 2;
		System.out.println("Area = "+a);
	}
}