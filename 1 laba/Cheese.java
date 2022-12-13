package bsu.rfe.java.group9.lab1.zubritskiy.varA12;

public class Cheese extends Food implements Nutritious{

	public Cheese() {
		super("Сыр");
	}
	public void consume() {
		System.out.println(this + " съеден");
		}
	public int calculateCaLories() {
    	return 350;
    }
	
}
