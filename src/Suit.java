
public class Suit extends Clothes{

	public Suit(String size, String material, String color, Double lapelWidth, String type, int workTime) {
		super(size, material, color, lapelWidth, type, workTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printAll() {
		System.out.println("Material: "+this.Material);
		System.out.println("Type: "+this.Type);
		System.out.println("Size: "+this.Size);
		System.out.println("Color: "+this.Color);
		System.out.println("Completion Time: "+this.workTime);
		System.out.println("Lapel Width:" + this.LapelWidth);
		
	}

	
}
