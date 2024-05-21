package com.tenco;

public class MyLogger {

	// 객체를 메모리에 미리 띄움.
	private static ConsoleLogger consoleLogger = new ConsoleLogger();
	private static FileLogger fileLogger = new FileLogger("mLogger.txt");

	// 콘솔창에 로그 찍는 기능
	public static void logToConsole(String message) {
		consoleLogger.log(message);// 외부에서는 MyLogger. 가능
	}

	// 콘솔창 + 파일에 저장하는 기능
	public static void logToFile(String message) {
		logToConsole(message);
		fileLogger.log(message);
	}

	// 테스트 코드
	public static void main(String[] args) {

	}

}
