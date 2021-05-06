package eCommerseDemo2.business.concretes;

import eCommerseDemo2.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send(String message, String to) {
		System.out.println("E-posta Manager : " + message + " mesajı " + to + " adresine gönderildi.");
		
	}

}
