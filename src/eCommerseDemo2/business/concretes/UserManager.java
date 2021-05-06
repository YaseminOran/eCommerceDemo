package eCommerseDemo2.business.concretes;

import java.util.List;

import eCommerseDemo2.business.abstracts.UserService;
import eCommerseDemo2.dataAccess.abstracts.UserDao;
import eCommerseDemo2.entites.concretes.User;

public class UserManager implements UserService{
	private UserDao dao;

	public UserManager(UserDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void add(User user) {
		dao.add(user);
		
	}

	@Override
	public void remove(User user) {
		dao.remove(user);
		
	}

	@Override
	public void update(User user) {
		dao.update(user);
		
	}

	@Override
	public void verifyUser(int id) {
		
		User user = dao.get(id);
		user.setVerified(true);
		System.out.println("Kullanıcı  doğrulandı..");
		
		
	}

	@Override
	public User get(int id) {
		return dao.get(id);
		
	}

	@Override
	public User getByEmail(String email) {
		
		return dao.getByEmail(email);
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		return dao.getByEmailAndPassword(email, password);
	}

	@Override
	public List<User> getAll() {
		return dao.getAll();
	}

	

}
