package Ödev5;

import Ödev5.business.GoogleRegister.GoogleManager;



import Ödev5.business.abstracts.UserService;
import Ödev5.business.concretes.LoginManager;
import Ödev5.business.concretes.UserManager;
import Ödev5.core.concretes.CheckManager;
import Ödev5.core.concretes.EmailManager;
import Ödev5.core.concretes.GoogleManagerAdapter;
import Ödev5.dataAccess.concretes.HibernateUserDao;
import Ödev5.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		UserManager userManager =  new UserManager(new LoginManager( new HibernateUserDao(), new CheckManager(), new EmailManager()));
		User user1 = new User("furkan","Özkan","ABCDEFSS","f@gmail.com");
		User user2 = new User("Mahmut","Özkan","ABCDEFGH","M");
		User user3 = new User("Mehmet","Özkan","FGH","MÖ@gmail.com");
		
		userManager.register(user1);
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		
		userManager.register(user2);
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		
		userManager.register(user3);
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		
		userManager.login("f@gmail.com","ABCDEFSS" );
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("----------------");
		
		userManager.login("m", "mm");
	}
}
