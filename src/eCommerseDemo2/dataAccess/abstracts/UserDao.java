package eCommerseDemo2.dataAccess.abstracts;

import java.util.List;

import eCommerseDemo2.entites.concretes.User;

public interface UserDao {
	void add(User user);
    void remove(User user);
    void update(User user);
    User get(int id);
    User getByEmail(String email);
    User getByEmailAndPassword(String email,String password);
    List<User> getAll();

}
