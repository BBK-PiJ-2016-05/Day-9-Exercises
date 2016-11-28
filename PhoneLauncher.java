public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		
		
		//OldPhone myOldPhone = new OldPhone("BT");
		//System.out.println("Old Phone " + myOldPhone.getBrand());
		//myOldPhone.call("07957595406");
		//System.out.println("");
		
		//MobilePhone myMobilePhone = new MobilePhone("Nokia");
		//System.out.println("Mobile Phone " + myMobilePhone.getBrand());
		//myMobilePhone.call("07957595406");
		//myMobilePhone.ringAlarm("annoying");
		//myMobilePhone.playGame("snake");
		//System.out.println("");
		
		MobilePhone myPhone = new SmartPhone("Sony");
		testPhone(myPhone);
	}
	
	public void testPhone(Phone inputPhone){
		SmartPhone myPhone = (SmartPhone) inputPhone;
		System.out.println("Smart Phone " + myPhone.getBrand());
		myPhone.call("07957595406");
		myPhone.call("01689851281");
		myPhone.call("02083006104");
		myPhone.call("00441234340460");
		myPhone.ringAlarm("beautiful music");
		myPhone.playGame("Facebook");
		myPhone.browseWeb("www.bbc.co.uk");
		myPhone.findPosition();
		myPhone.printLastNumbers();
	}
}