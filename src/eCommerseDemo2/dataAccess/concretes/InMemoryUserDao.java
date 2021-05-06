package eCommerseDemo2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerseDemo2.dataAccess.abstracts.UserDao;
import eCommerseDemo2.entites.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void remove(User user) {
		//users.removeIf(obj->obj.getId() == user.getId());
		
	}

	@Override
	public void update(User user) {
		
		
	}

	@Override
	public User get(int id) {
		
		return null;

	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if(user.getEmail() == email)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
