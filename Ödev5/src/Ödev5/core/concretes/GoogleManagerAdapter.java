package �dev5.core.concretes;

import �dev5.business.GoogleRegister.GoogleManager;
import �dev5.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}
