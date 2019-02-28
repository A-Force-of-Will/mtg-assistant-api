package mtgassistant.model;

public class Token {
	
	private String name;
	
	private Color color;
	
	private int amount;
	
//	private Keywords keyWords;
	
	private int power;
	
	private int toughness;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

//	public Keywords getKeyWords() {
//		return keyWords;
//	}
//
//	public void setKeyWords(Keywords keyWords) {
//		this.keyWords = keyWords;
//	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}
}