package basic;

public class Objectexample1
{
	String brand,model;
	
	void printof()
	{
		System.out.println("Brand is = " +brand);
		System.out.println("Model is = "+model);
		
	}
	public static void main(String[] args) {
		Objectexample1 Objectexample = new Objectexample1();
		Objectexample.brand=("VW");
		Objectexample.model=("2017");
		Objectexample.printof();
	}

}
