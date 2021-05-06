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
		googleService.register(2, "saçmalayalım", "kafamagöremail", "Yasemin", "Arslan"); // Başarısız eposta invalid
		googleService.register(3, "saçmalama@gmail.com", "xy", "Yasemin", "Arslan"); // Başarısız şifre invalid
		googleService.register(4, "saçmalama@gmail.com", "k", "Y", "A"); // Başarısız ad-soyad invalid
		googleService.register(5, "yasemin.arslan@gmail.com", "yasemin1234", "Yasemin", "Arslan"); // Başarısız e-posta mevcut


		googleService.login("yasemin.arslan@gmail.com", "yasemin1234"); // Başarşsşz üye doşrulama yapmamşş.
		userService.verifyUser(1); // Kullanşcşyş doşrulayalşm.
		googleService.login("yasemin.arslan@gmail.com", "yasemin1234"); // Başarısız şifre yanlış.
		googleService.login("yasemin.arslan@gmail.com", "yasemin1234"); // Başarşlş.
		googleService.login("", ""); // Başarşsşz e-posta parola zorunlu

		googleService.login("yasemin.arslan@gmail.com", "yasemin1234"); // Başarısız üye doğrulama yapmamış.
		userService.verifyUser(1); // Kullanıcıyı doğrulayalım.
		googleService.login("yasemin.arslan@gmail.com", "yasemin1234"); // Başarısız şifre yanlış.
		googleService.login("yasemin.arslan@gmail.com", "yasemin1234"); // Başarılı.
		googleService.login("", ""); // Başarısız e-posta parola zorunlu

		
		GoogleService googleAuthService = new GoogleManagerAdapter();
		googleAuthService.register(6, "ysmnrn@gmail.com", "yasemin1234", "Yasemin", "Arslan");
		googleAuthService.login("ysmnrn@gmail.com", "yasemin1234");
		
		


	}

	
}
