package Ödev5.business.concretes;

import java.util.List;

import Ödev5.business.GoogleRegister.GoogleManager;
import Ödev5.business.abstracts.LoginService;
import Ödev5.business.abstracts.UserService;
import Ödev5.core.abstracts.GoogleService;
import Ödev5.dataAccess.abstracts.UserDao;
import Ödev5.dataAccess.concretes.HibernateUserDao;
import Ödev5.entities.concretes.User;

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