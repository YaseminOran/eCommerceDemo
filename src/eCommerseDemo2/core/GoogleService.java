package eCommerseDemo2.core;

public interface GoogleService {
	void register(int id, String email,String password,String firstName,String lastName);
    void login(String email, String password);

}
