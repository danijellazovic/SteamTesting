package pages;

public class Steam {
	private HomePage homePage;
	private GamePage gamePage;
	private LogInPage logInPage;
	
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;

	}

	public LogInPage getLogInPage() {
		if (logInPage == null) {
			logInPage = new LogInPage();
		}
		return logInPage;

	}
	
	public GamePage getGamePage() {
		if (gamePage == null) {
			gamePage = new GamePage();
			
		}
		return gamePage;
	
		
		}
	}

