package Ödev5.business.abstracts;

import Ödev5.entities.concretes.User;

public interface UserService {
	void login(String email, String password);
	void register(User user);
	void registerGoogle();

}
