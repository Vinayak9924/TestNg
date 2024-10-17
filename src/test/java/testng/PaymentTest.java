package testng;

import org.testng.annotations.Test;

public class PaymentTest {
    @Test(priority=1,groups= {"sanity","regression","functional"})
	void paymentInRs() {
		System.out.println("payment in rupees");
	}
    @Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentInDollors() {
		System.out.println("payment in Dollors");
	}
}
