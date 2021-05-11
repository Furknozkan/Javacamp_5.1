package �dev5.core.concretes;

import �dev5.core.abstracts.EmailService;
import �dev5.entities.concretes.User;

public class EmailManager implements EmailService{

	@Override
	public void sendVerifyEmail(User user) {
		System.out.println("do�rulama epostas� g�nderildi");
		
	}

	@Override
	public void clickToVerify(User user) {
		System.out.println("kayd�n�z� do�rulamak iin t�klay�n�z");
		
	}

}
