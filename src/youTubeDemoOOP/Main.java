package youTubeDemoOOP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nesne olusturmadýysan referans olarak new ile yaz.
CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
	customerManager.GiveCredit();
	}

}
