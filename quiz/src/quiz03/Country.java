package quiz03;

public class Country {
	String country;
	int PCI;
	double DI;

	Country(String pCountry, int pPCI, double pDI) {
		country = pCountry;
		PCI = pPCI;
		DI = pDI;
	}
	Country(){
		
	}
	
	
	int PCI() {

		if(PCI >= 30000 && DI >= 6.0) {
			System.out.println("선진국 입니다.");
		}
		else {
			System.out.println("개발도상국 입니다.");
		}
		
		
		return PCI;
	}
	double DI() {

		if(PCI >= 30000 && DI >= 6.0) {
			System.out.println("선진국 입니다.");
		}
		else {
			System.out.println("개발도상국 입니다.");
		}
		return DI;
	}
	
	
}
