package �dev5;

import �dev5.business.GoogleRegister.GoogleManager;



import �dev5.business.abstracts.UserService;
import �dev5.business.concretes.LoginManager;
import �dev5.business.concretes.UserManager;
import �dev5.core.concretes.CheckManager;
import �dev5.core.concretes.EmailManager;
import �dev5.core.concretes.GoogleManagerAdapter;
import �dev5.dataAccess.concretes.HibernateUserDao;
import �dev5.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		UserManager userManager =  new UserManager(new LoginManager( new HibernateUserDao(), new CheckManager(), new EmailManager()));
		User user1 = new User("furkan","�zkan","ABCDEFSS","f@gmail.com");
		User user2 = new User("Mahmut","�zkan","ABCDEFGH","M");
		User user3 = new User("Mehmet","�zkan","FGH","M�@gmail.com");
		
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
