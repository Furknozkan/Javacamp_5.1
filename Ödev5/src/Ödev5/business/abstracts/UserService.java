package �dev5.business.abstracts;

import �dev5.entities.concretes.User;

public interface UserService {
	void login(String email, String password);
	void register(User user);
	void registerGoogle();

}
