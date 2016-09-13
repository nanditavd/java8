package samples.java.nandita;

public class MultipleDefaultMethods {
	
	interface Vechicle{
		default void print(){
			System.out.println("Vechicle");
		}
	}
	
	interface Car{
		default void print(){
			System.out.println("Car");
		}
	}
	
	class Ferrari implements Car,Vechicle{
		public void print(){
			Car.super.print();
		}
	}

	public static void main(String[] args) {
		
		MultipleDefaultMethods dm = new MultipleDefaultMethods();
		Ferrari ferrari = dm.new Ferrari();
		ferrari.print();

	}

}
