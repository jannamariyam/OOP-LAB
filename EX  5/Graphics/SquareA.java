package Graphics;




public class SquareA implements AreaA{
	int side,a;
	public SquareA(){
	}
	public SquareA(int s){
		side=s;
	}
	public void area(){
		a= side * side;
		System.out.println("Area = "+a);
	}
}