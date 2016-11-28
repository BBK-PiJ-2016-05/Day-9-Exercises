public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand){
		super(brand);
	}
	
	public void browseWeb (String site){
		System.out.println("Opening site " + site);
	}
	
	public void findPosition (){
		System.out.println("Your GPS latitude is 51.492337");
		System.out.println("Your GPS longitude is -0.039009");
	}
	
	@Override
	public void call (String number){
		if(number.substring(0, 2).equals("00")){
			System.out.println("Calling " + number + " through the internet to save money");
			super.rememberNumber(number);
		}
		else {
			super.call(number);
		}
	}
}