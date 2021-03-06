package eCommerseDemo2.business.abstracts;

import java.util.List;

import eCommerseDemo2.entites.concretes.User;

public interface UserService {
	void add(User user);
	   void remove(User user);
	   void update(User user);
	   void verifyUser(int id);
	   User get(int id);
	   User getByEmail(String email);
	   User getByEmailAndPassword(String email,String password);
	   List<User> getAll();
	}


