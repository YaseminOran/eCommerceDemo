package eCommerseDemo2;
import eCommerseDemo2.business.abstracts.UserService;
import eCommerseDemo2.business.concretes.AuthManager;
import eCommerseDemo2.business.concretes.EmailManager;
import eCommerseDemo2.business.concretes.UserValidationManager;
import eCommerseDemo2.core.GoogleManagerAdapter;
import eCommerseDemo2.core.GoogleService;
import eCommerseDemo2.dataAccess.concretes.InMemoryUserDao;
import eCommerseDemo2.business.concretes.UserManager;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new InMemoryUserDao());
		GoogleService googleService = new AuthManager(userService, new UserValidationManager(), new EmailManager());
		googleService.register(1, "yasemin.arslan@gmail.com", "yasemin1234", "Yasemin", "Arslan"); // Başarılı
		googleService.register(2, "yasemin.arslan@gmail.com", "yasemin1234", "Yasemin", "Arslan"); // Başarısız e-posta mevcut

		GoogleService googleAuthService = new GoogleManagerAdapter();
		googleAuthService.register(3, "ysmnrn@gmail.com", "yasemin1234", "Yasemin", "Arslan");
		googleAuthService.login("ysmnrn@gmail.com", "yasemin1234");
		
		


	}

	
}
