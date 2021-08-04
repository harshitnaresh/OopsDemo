package OopsDemo3;

public interface Shape {
	
	//Implicitly public,static and final
	public String LABEL="Shape";
	
	//Interface methods are implicitly abstract and public
	void draw();
	double getArea();
	

}
