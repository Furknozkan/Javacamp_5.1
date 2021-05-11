package Ödev5.core.concretes;

import Ödev5.core.abstracts.EmailService;
import Ödev5.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("doðrulama epostasý gönderildi");
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("kaydýnýzý doðrulamak iin týklayýnýz");
		
	}

}
