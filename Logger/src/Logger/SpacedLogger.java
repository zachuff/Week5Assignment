package Logger;

public class SpacedLogger implements Logger{
	
	public void Log(String Log) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Log.length(); i++) {
			result.append(Log.charAt(i) + " ");
		}
		System.out.println(result.toString());
	}
	
	public void Error(String Error) {
		StringBuilder message = new StringBuilder();
		for (int i = 0; i < Error.length(); i++) {
			message.append(Error.charAt(i) + " ");
		}
		System.out.println();
		
		System.out.println("ERROR: " + message.toString());
	}
}
