package Logger;


public class AppLogger {
	
	public static void main(String[] args) {
		
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger1.Log("Hello");
		logger1.Error("Hello");
		logger2.Error("Hello");
		logger2.Log("Hello");
	}

}
