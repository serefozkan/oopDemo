package youTubeDemoOOP;

public abstract class BaseCreditManager implements ICreditManager{
public abstract void Calculate(); //ortak olmadigi,degisken oldugu icin abstract imza
public void Save() { //ortak oldugu icin body.
	System.out.println("müsteri kaydedildi " );
}
}
