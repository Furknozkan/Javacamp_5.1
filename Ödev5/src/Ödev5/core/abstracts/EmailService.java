package �dev5.core.abstracts;

import �dev5.entities.concretes.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerify(User user);

}
