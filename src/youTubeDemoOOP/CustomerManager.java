package youTubeDemoOOP;

public class CustomerManager {
	//encapsulation
	Customer customer;
	ICreditManager iCreditManager;
	BaseCreditManager credit;
	public CustomerManager(Customer customer,ICreditManager iCreditManager){
		this.customer=customer;
		this.iCreditManager=iCreditManager;
		this.credit=credit;
	}
public void Save() {
	System.out.println("m�steri kaydedildi " );
}
public void Delete() {
	System.out.println("m�steri silindi "  );
}
public void GiveCredit() {
	 iCreditManager.Calculate();
	 System.out.println("kredi verildi ");
}
}
