package javaprojectweek6;

public class Card {
	
	private String name;
	private int value;
	
	public Card(String cardName, int cardvalue) {
		this.setName(cardName);
		this.setValue(cardvalue);
	}
	
	public void describeCard() {
		System.out.println(name + "of" + value);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
