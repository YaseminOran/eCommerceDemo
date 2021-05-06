package eCommerseDemo2.business.concretes;

import java.util.regex.Pattern;

import eCommerseDemo2.business.abstracts.UserValidationService;
import eCommerseDemo2.core.utils.Validation;
import eCommerseDemo2.entites.concretes.User;

public class UserValidationManager implements UserValidationService{
	//kaynak:http://www.bahadirakin.com/regex-ile-email-kontrolu/
	
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	
	
	@Override
	public boolean validate(User user) {
		boolean result = Validation.run(
				EmailValid(user.getEmail()),
				PasswordValid(user.getPassword()),
				FirstNameValid(user.getFirstName()),
				LastNameValid(user.getLastName()),
				AllFieldsFilled(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword())
				);
	
		return result;
	}
	private boolean EmailValid(String email) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(email).find();
	}
	
	private boolean PasswordValid(String password) {
		return password.length() > 6;
	}
	private boolean FirstNameValid(String firstName) {
		return firstName.length() > 2;
	}
	private boolean LastNameValid(String lastName) {
		return lastName.length() > 2;
	}
	private boolean AllFieldsFilled(String firstName,String lastName,String email, String password) {
		if(firstName.length() <= 0 || lastName.length() <= 0 || email.length() <= 0 || password.length() <= 0) {
			return false;
		}return true;
	}

}
