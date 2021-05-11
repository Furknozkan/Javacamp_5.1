package �dev5.core.concretes;

import java.util.regex.Pattern;

import �dev5.core.abstracts.CheckService;

import java.util.regex.Matcher;


public class CheckManager implements CheckService{
	public static final String regex = "^(.+)@(.+)$";

	@Override
	public boolean passwordCheck(String password) {
		if(password.length() < 6) {
			System.out.println("�ifreniz 6 karakterden k���k");
			return false;
		}else {
			return true;
			}
	
	}

	@Override
	public boolean EMailCheck(String Email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Email);
		if(!matcher.matches()) {
			System.out.println("email i email format�nda yaz�n�z");
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean FirstNameCheck(String FirstName) {
		if(FirstName.length() < 2) {
			System.out.println("�sminiz 2 karekterden fazla olmak zorunda");
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean LastNameCheck(String LastName) {
		if(LastName.length() < 2) {
			System.out.println("soy isim 2 karekterden fazla olmak zorunda");
			return false;
		}else {
			return true;
		}
	}

}
