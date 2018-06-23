package JiFa.Logic.Management;

import java.util.ArrayList;
import java.util.Date;

import JiFa.Logic.Interface.Project;
import JiFa.Logic.Interface.Task;

public class BCProject extends AbstractMedium implements Project  {
private String deadLine;
private ArrayList<Task> taskList = null;

public BCProject(){
	taskList = new ArrayList<Task>();
}

@Override
public void addTask(Task tsk) {
	taskList.add(tsk);
	
}

@Override
public void removeTask(Task tsk) {
	taskList.remove(tsk);
	
}

@Override
public String getDeadline() {
	
	return deadLine;
}

@Override
public void setDeadline(String date) {
	deadLine = date;
	
}


}
