package House;

public class SingleFamilyHome extends House {
 
	
public int bathrooms = 0;
public int bedrooms = 0;
public int howManyFloors = 0;
public String flooring = null;
public boolean fireplace = false;
public boolean jacuzzi = false;
public int numberOfJacuzzi = 0;
public int numberOfFirePlaces = 0;
public String wallColor = null;
public int windows = 0;
public boolean deck = false;
public String typeOfDeck = null;








public SingleFamilyHome(int bathrooms, int bedrooms, int howManyFloors, String flooring, boolean fireplace,
		boolean jacuzzi, int numberOfFirePlaces, int numberOfJacuzzi, String wallColor, int windows, boolean deck, String typeOfDeck) {
	super();
	this.bathrooms = bathrooms;
	this.bedrooms = bedrooms;
	this.howManyFloors = howManyFloors;
	this.flooring = flooring;
	this.fireplace = fireplace;
	this.jacuzzi = jacuzzi;
	this.numberOfJacuzzi = numberOfJacuzzi;
	this.numberOfFirePlaces = numberOfFirePlaces;
	this.wallColor = wallColor;
	this.windows = windows;
	this.deck = deck;
	this.typeOfDeck = typeOfDeck;
}





public SingleFamilyHome() {
	super();
}





public int getBathrooms() {
	return bathrooms;
}



public void setBathrooms(int bathrooms) {
	this.bathrooms = bathrooms;
}



public int getBedrooms() {
	return bedrooms;
}



public void setBedrooms(int bedrooms) {
	this.bedrooms = bedrooms;
}



public int getHowManyFloors() {
	return howManyFloors;
}



public void setHowManyFloors(int howManyFloors) {
	this.howManyFloors = howManyFloors;
}



public String getFlooring() {
	return flooring;
}



public void setFlooring(String flooring) {
	this.flooring = flooring;
}



public boolean isFireplace() {
	return fireplace;
}



public void setFireplace(boolean fireplace) {
	this.fireplace = fireplace;
}



public boolean isJacuzzi() {
	return jacuzzi;
}



public void setJacuzzi(boolean jacuzzi) {
	this.jacuzzi = jacuzzi;
}

public int getNumberOfJacuzzi() {
	return numberOfJacuzzi;
}



public void setNumberOfJacuzzi(int numberOfJacuzzi) {
	this.numberOfJacuzzi = numberOfJacuzzi;
}


public int getNumberOfFirePlaces() {
	return numberOfFirePlaces;
}



public void setNumberOfFirePlaces(int numberOfFirePlaces) {
	this.numberOfFirePlaces = numberOfFirePlaces;
}



public String getWallColor() {
	return wallColor;
}



public void setWallColor(String wallColor) {
	this.wallColor = wallColor;
}



public int getWindows() {
	return windows;
}



public void setWindows(int windows) {
	this.windows = windows;
}



public boolean isDeck() {
	return deck;
}



public void setDeck(boolean deck) {
	this.deck = deck;
}


public String getTypeOfDeck() {
	return typeOfDeck;
}



public void setTypeOfDeck(String typeOfDeck) {
	this.typeOfDeck = typeOfDeck;
}


@Override
public void walls() {
	// TODO Auto-generated method stub
	
}
@Override
public void roof() {
	// TODO Auto-generated method stub
	
}
@Override
public void floor() {
	// TODO Auto-generated method stub
	
}
@Override
public void kitchen() {
	// TODO Auto-generated method stub
	
}





@Override
public String toString() {
	return "Here is the Home you have designed:" + '\n' +
			"This home has " +howManyFloors+ " floors, "  + bedrooms + " bedrooms and "+ bathrooms + " bathrooms."  + '\n' 
			+ "This comes with the option of " + flooring + " flooring." + '\n'+ ""
			+ "The plan you selected also has " + numberOfFirePlaces + " fireplace and " + numberOfJacuzzi + " jacuzzi."
			+ '\n' + "The walls will be painted " + wallColor + ". The outside of the house will feature "
			+ windows + " windows." +'\n'+ "You also chose the " + typeOfDeck + " option for your Deck."+'\n'+
			"Thank you for choosing Roland's Home as you premier home builder." +'\n'+
			"See you soon";
}







	
	
	
}
