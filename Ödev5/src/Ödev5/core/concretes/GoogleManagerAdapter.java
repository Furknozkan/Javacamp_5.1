package Ödev5.core.concretes;

import Ödev5.business.GoogleRegister.GoogleManager;
import Ödev5.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}
