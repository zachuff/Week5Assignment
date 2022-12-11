package Logger;

public class AsteriskLogger implements Logger{
	
	public void Log (String Log) {
		System.out.println("***" + Log + "***");
	}
	
	public void Error(String Error) {
		for (int i = 0; i < Error.length() + 10; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("***ERROR: " + Error + "***");
		
		for (int i = 0; i < Error.length() + 10; i++) {
			System.out.print("*");
		}
	}
}
