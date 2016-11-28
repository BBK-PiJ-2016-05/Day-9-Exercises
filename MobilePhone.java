public class MobilePhone extends OldPhone {
	
	private String[] calledNumbers;
	
	public MobilePhone(String brand){
		super(brand);
		calledNumbers = new String[10];
	}
	
	public void ringAlarm (String alarm){
		System.out.println("Alarm set as " + alarm);
	}
	
	public void playGame (String game){
		System.out.println("Playing " + game);
	}
	
	@Override
	public void call (String number){
		super.call(number);
		rememberNumber(number);
	}
	
	public void rememberNumber (String number){
		for(int i = 1; i <= 9; i++) {
			if(calledNumbers[i] != null){
				calledNumbers[i-1] = calledNumbers[i];
			}
		}
		calledNumbers[9] = number;
	}
	
	public void printLastNumbers(){
		for(int i = 9; i >= 0; i--) {
			if(calledNumbers[i] != null){
				System.out.println("Number " + (10-i) + " " + calledNumbers[i]);
			}
		}
	}
	
}