package Ödev5.dataAccess.concretes;

import java.util.List;

import Ödev5.dataAccess.abstracts.UserDao;
import Ödev5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		
		
		System.out.println(" Kullanýcý Hibernate ile eklendi"+user.getFirstname());
		
	}

	@Override
	public void delete(User user) {
		System.out.println(" Kullanýcý Hibernate ile silindi"+user.getFirstname());
		
	}

	public void update(User user) {
		System.out.println(" Kullanýcý Hibernate ile güncellendi"+user.getFirstname());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean emailExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
