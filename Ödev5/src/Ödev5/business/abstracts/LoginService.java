package �dev5.business.abstracts;

import �dev5.entities.concretes.User;

public interface LoginService {
	void register(User user);
	void login(User user);
	void login(String email, String password);
	

}
