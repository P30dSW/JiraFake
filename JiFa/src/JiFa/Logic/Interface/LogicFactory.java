package JiFa.Logic.Interface;

public class LogicFactory {
private static LogicFactory theInstance = null;
private static LogicManagement LogicInstance = null;

public static LogicFactory getInstance(){
	if(theInstance == null){
		theInstance = new LogicFactory();
	}
	return theInstance;
}
public static LogicManagement getLogicInstance(){
	if(LogicInstance == null){
		LogicInstance = new LogicManagement();
	}
	return LogicInstance;
}
}
