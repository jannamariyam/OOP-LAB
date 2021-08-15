package Graphics;

interface AreaA{
	void area();
}

public class RectangleA implements AreaA{
	int length,breadth,a;
	public RectangleA(){
	}
	public RectangleA(int l,int b){
		length=l;
		breadth=b;
	}
	public void area(){
		a= length * breadth;
		System.out.println("Area = "+a);
	}
}