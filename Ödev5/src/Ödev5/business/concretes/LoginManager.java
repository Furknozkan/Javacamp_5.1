package �dev5.business.concretes;

import �dev5.business.abstracts.LoginService;
import �dev5.core.abstracts.CheckService;
import �dev5.core.abstracts.EmailService;
import �dev5.core.concretes.CheckManager;
import �dev5.dataAccess.abstracts.UserDao;
import �dev5.entities.concretes.User;

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
			System.out.println("�sim do�ruland� "+user.getFirstname());
			
		}else {
			System.out.println("l�tfen tekrar deneyiniz");
			return;
		}
		
		if(checkManager.LastNameCheck(user.getLastName())) {
			System.out.println("Soy isim do�ruland� "+user.getLastName());
			
		}else {
			System.out.println("l�tfen tekrar deneyiniz");
			return;
		}
		if(checkManager.EMailCheck(user.getEmail())) {
			System.out.println("email do�ruland�");
			
		}else {
			System.out.println("l�tfen tekrar deneyiniz");
			return;
		}
		
		if(checkManager.passwordCheck(user.getPassword())) {
			System.out.println("parola do�ruland�");
			
		}else {
			return;
		}
		
		
		emailService.clickToVerify(user);
		emailService.sendVerifyEmail(user);
		
		userDao.add(user);
		System.out.println("kay�t ba�ar�l� "+user.getFirstname());
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String email, String password) {
		if(checkManager.EMailCheck(email)) {
			
			
		}else {
			System.out.println("l�tfen tekrar deneyiniz");
			return;
		}
		if(checkManager.passwordCheck(password)) {
		
		}else {
			System.out.println("l�tfen tekrar deneyiniz");
			return;
		}
		System.out.println("giri� ba�ar�l�");
	}

}
