package bsu.rfe.java.group9.lab1.zubritskiy.varA12;
import java.util.Arrays;;
public class MainApplication {
	public static void main(String[] args) throws Exception {
	Food[] breakfast = new Food[20];
    int calor =0;
    int flag =0;
    int sort =0;
    int cheese=0,apple=0,tea=0;
	int itemsSoFar = 0;
	for (String arg: args) {
	String[] parts = arg.split("/");
	
	if (parts[0].equals("Cheese")) {
	breakfast[itemsSoFar] = new Cheese();
	cheese++;
	} 
	else
	if (parts[0].equals("Apple")) {
	breakfast[itemsSoFar] = new Apple(parts[1]);
	apple++;
	}
	else
	if (parts[0].equals("Tea")) 
	{
	breakfast[itemsSoFar] = new Tea(parts[1]);
	tea++;
	}
	if(parts[parts.length-1].equals("-sort"))
    {     
	      sort =1; 
    }

	if(parts[parts.length-1].equals("-calories"))
	{
		flag =1;
	}
	itemsSoFar++;
	}
	if(sort==1) 
	{
		Arrays.sort(breakfast,new FoodComparator());
	}
	for (Food item: breakfast)
	if (item!=null) 
	{
	item.consume();
	calor +=item.calculateCaLories();
	}
	else
	break;
	if(flag==1) 
	{
		System.out.println(" Калорийность завтрака = "+ calor);

	}
	System.out.println("кол-во сыров="+cheese);
	System.out.println("кол-во яблок="+apple);
	System.out.println("кол-во чая=" +tea);
	System.out.println("Всего хорошего!");
	}
}
	
	