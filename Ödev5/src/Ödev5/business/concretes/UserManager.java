package �dev5.business.concretes;

import java.util.List;

import �dev5.business.GoogleRegister.GoogleManager;
import �dev5.business.abstracts.LoginService;
import �dev5.business.abstracts.UserService;
import �dev5.core.abstracts.GoogleService;
import �dev5.dataAccess.abstracts.UserDao;
import �dev5.dataAccess.concretes.HibernateUserDao;
import �dev5.entities.concretes.User;

public class UserManager implements  UserService{
	private GoogleService googleService;
	private LoginService loginService;
	
	public UserManager(LoginService loginService) {
		super();
		this.loginService = loginService;
		this.googleService = googleService;
		
		
	}

	@Override
	public void login(String email, String password) {
		loginService.login(email, password);
		
	}

	@Override
	public void register(User user) {
		loginService.register(user);
		
	}

	@Override
	public void registerGoogle() {
		googleService.registerToSystem();
		
	}
}