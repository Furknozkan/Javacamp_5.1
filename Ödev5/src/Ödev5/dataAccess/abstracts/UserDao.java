package �dev5.dataAccess.abstracts;

import java.util.List;

import �dev5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean emailExist(User user);
	

}
