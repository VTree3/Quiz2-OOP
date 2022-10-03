import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	Vector<Clothes>clothesVec = new Vector<>();
	public void viewClothes()
	{
		int i=1;
		for (Clothes clothes : clothesVec) {
			System.out.println(i+".");
			clothes.printAll();
		}
	}
	public void addClothes()
	{
		String size;
		do
		{
			System.out.printf("Input cloth size[S | M | L]: ");
			size = scan.nextLine();
		}while(!size.equalsIgnoreCase("S") && !size.equalsIgnoreCase("M") && !size.equalsIgnoreCase("L"));
		String material;
		do
		{
			System.out.printf("Input cloth material [Cotton | Silk]: ");
			material = scan.nextLine();
		}while(!material.equals("Cotton") && !material.equals("Silk"));
		String color;
		do
		{
			System.out.printf("Input color [5..13]: ");
			color = scan.nextLine();
		}while(color.length()<5 || color.length()>13);
		Double lapel;
		do
		{
			System.out.printf("Input lapel width [2.25 - 4.50]: ");
			lapel = scan.nextDouble();
			scan.nextLine();
		}while(lapel<2.25 || lapel>4.50);
		String type;
		do
		{
			System.out.printf("Input cloth type [Dress | Suit]: ");
			type = scan.nextLine();
		}while(!type.equals("Dress") && !type.equals("Suit"));
		int baseworkTime=0;
		if(size.equalsIgnoreCase("S"))
		{
			baseworkTime=2;
		}
		if(size.equalsIgnoreCase("M"))
		{
			baseworkTime=3;
		}
		if(size.equalsIgnoreCase("L"))
		{
			baseworkTime=4;
		}
		int worktime = 0;
		if(type.equals("Dress"))
		{
			int randomNumber = rand.nextInt(12, 19);
			double temp= 2.25;
			worktime=(int) ((baseworkTime + randomNumber) *(lapel*2.25));
			System.out.println("Your cloth will be ready in "+worktime+" day(s)");
			Clothes clothes = new Dress(size, material, color, lapel, type, worktime);
			clothesVec.addElement(clothes);
			System.out.println("Cloth successfully inserted.");
			System.out.println("Press enter to continue...");
			scan.nextLine();
		}
		if(type.equals("Suit"))
		{
			int randomNumber = rand.nextInt(14, 22);
			worktime=(int) ((baseworkTime + randomNumber) *(lapel*1.75));
			System.out.println("Your cloth will be ready in "+worktime+" day(s)");
			Clothes clothes = new Suit(size, material, color, lapel, type, worktime);
			clothesVec.addElement(clothes);
			System.out.println("Cloth successfully inserted.");
			System.out.println("Press enter to continue...");
			scan.nextLine();
		}
	}
	public void removeClothes()
	{
		if(clothesVec.isEmpty())
		{
			System.out.println("There is no clothes...");
		}
		System.out.println("Input cloth no. [1 - "+clothesVec.size()+"]");
		int idxDel;
		idxDel = scan.nextInt();
		scan.nextLine();
		if(idxDel>0 && idxDel<=clothesVec.size())
		{
			clothesVec.remove(idxDel-1);
			System.out.println("Data succesfully deleted. Press enter to continue...");
			scan.nextLine();
		}
		else
		{
			System.out.println("Data not found!");
		}
		

		
	}
	public Main() {
		int menu=0;
		do
		{
			System.out.println("====================");
			System.out.println("    QueensMan");
			System.out.println("====================");
			System.out.println("1. View Clothes");
			System.out.println("2. Add Clothes");
			System.out.println("3. Remove Clothes");
			System.out.println("4. Exit");
			System.out.print(">> ");
			menu = scan.nextInt();
			scan.nextLine();
			switch(menu)
			{
			case 1:
					viewClothes();
				break;
			case 2:
					addClothes();
				break;
			case 3:
					removeClothes();
					break;
			}
			
		}while(menu!=4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
