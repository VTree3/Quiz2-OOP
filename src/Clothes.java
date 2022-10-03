
public abstract class Clothes {
	protected String Size;
	protected String Material;
	protected String Color;
	protected Double LapelWidth;
	protected String Type;
	protected int workTime;
	public Clothes(String size, String material, String color, Double lapelWidth, String type, int workTime) {
		super();
		Size = size;
		Material = material;
		Color = color;
		LapelWidth = lapelWidth;
		Type = type;
		this.workTime = workTime;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Double getLapelWidth() {
		return LapelWidth;
	}
	public void setLapelWidth(Double lapelWidth) {
		LapelWidth = lapelWidth;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	public abstract void printAll();
	
}
