package Ödev5.core.abstracts;

import Ödev5.entities.concretes.User;

public interface EmailService {
	void sendVerifyEmail(User user);
	void clickToVerify(User user);

}
