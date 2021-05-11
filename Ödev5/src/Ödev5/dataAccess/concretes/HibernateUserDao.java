package �dev5.dataAccess.concretes;

import java.util.List;

import �dev5.dataAccess.abstracts.UserDao;
import �dev5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		
		
		System.out.println(" Kullan�c� Hibernate ile eklendi"+user.getFirstname());
		
	}

	@Override
	public void delete(User user) {
		System.out.println(" Kullan�c� Hibernate ile silindi"+user.getFirstname());
		
	}

	public void update(User user) {
		System.out.println(" Kullan�c� Hibernate ile g�ncellendi"+user.getFirstname());
		
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
