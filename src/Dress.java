

public class Dress extends Clothes{
	
	public Dress(String size, String material, String color, Double lapelWidth, String type, int workTime) {
		super(size, material, color, lapelWidth, type, workTime);
	}
	
	public void printAll()
	{
		System.out.println("Material: "+this.Material);
		System.out.println("Type: "+this.Type);
		System.out.println("Size: "+this.Size);
		System.out.println("Color: "+this.Color);
		System.out.println("Completion Time: "+this.workTime);
		System.out.println("Lapel Width:" + this.LapelWidth);
	}
	
}
