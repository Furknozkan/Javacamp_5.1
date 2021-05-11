package Ödev5.business.concretes;

import Ödev5.business.abstracts.LoginService;
import Ödev5.core.abstracts.CheckService;
import Ödev5.core.abstracts.EmailService;
import Ödev5.core.concretes.CheckManager;
import Ödev5.dataAccess.abstracts.UserDao;
import Ödev5.entities.concretes.User;

public class LoginManager implements LoginService{
	private EmailService emailService;
	private CheckService checkService;
	private CheckManager checkManager;
	private UserDao userDao;
	
	public LoginManager(UserDao userDao, CheckManager checkManager, EmailService emailService) {
		super();
		this.userDao=userDao;
		
		this.emailService=emailService;
		this.checkManager=checkManager;
	}

	@Override
	public void register(User user) {
		
		if(checkManager.FirstNameCheck(user.getFirstname())) {
			System.out.println("Ýsim doðrulandý "+user.getFirstname());
			
		}else {
			System.out.println("lütfen tekrar deneyiniz");
			return;
		}
		
		if(checkManager.LastNameCheck(user.getLastName())) {
			System.out.println("Soy isim doðrulandý "+user.getLastName());
			
		}else {
			System.out.println("lütfen tekrar deneyiniz");
			return;
		}
		if(checkManager.EMailCheck(user.getEmail())) {
			System.out.println("email doðrulandý");
			
		}else {
			System.out.println("lütfen tekrar deneyiniz");
			return;
		}
		
		if(checkManager.passwordCheck(user.getPassword())) {
			System.out.println("parola doðrulandý");
			
		}else {
			return;
		}
		
		
		emailService.clickToVerify(user);
		emailService.sendVerifyEmail(user);
		
		userDao.add(user);
		System.out.println("kayýt baþarýlý "+user.getFirstname());
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String email, String password) {
		if(checkManager.EMailCheck(email)) {
			
			
		}else {
			System.out.println("lütfen tekrar deneyiniz");
			return;
		}
		if(checkManager.passwordCheck(password)) {
		
		}else {
			System.out.println("lütfen tekrar deneyiniz");
			return;
		}
		System.out.println("giriþ baþarýlý");
	}

}
