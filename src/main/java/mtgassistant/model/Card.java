package mtgassistant.model;

public class Card {
	
//	private int colorless;
//	
//	private int red;
//	
//	private int blue;
//	
//	private int green;
//	
//	private int white;
//	
//	private int black;
	
	private String name;
	
	private int totalCMC;
	
	private Color color;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalCMC() {
		return totalCMC;
	}

	public void setTotalCMC(int totalCMC) {
		this.totalCMC = totalCMC;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}