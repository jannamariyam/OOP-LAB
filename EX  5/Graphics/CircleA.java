package Graphics;




public class CircleA implements AreaA{
	int radius,a;
	public CircleA(){
	}
	public CircleA(int r){
		radius=r;
	}
	public void area(){
		a = (22/7) * radius * radius ;
		System.out.println("Area = "+a);
	}
}