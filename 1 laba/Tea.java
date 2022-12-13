package bsu.rfe.java.group9.lab1.zubritskiy.varA12;

public class Tea extends Food implements Nutritious {
	private String color;
    public Tea(String color) 
	{
	super("Чай");
	this.color = color;
	}
    
    public int calculateCaLories() 
    {
    	return 10;
    }

	public void consume() {
	System.out.println(this + " выпили");
	}

	public String getSize() {
	return color;
	}
	
	public void setSize(String color) {
	this.color = color;
	}

	public boolean equals(Object arg0) {
	if (super.equals(arg0)) {
	if (!(arg0 instanceof Tea)) return false; 
	return color.equals(((Tea)arg0).color); 
	} else
	return false;
	}

	public String toString() {
	return super.toString() + " цвет '" + color.toUpperCase() + "'";
	}
	}
		
	
	
	
	

