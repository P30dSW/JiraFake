package JiFa.Logic.Management;

import java.util.ArrayList;
import java.util.Date;

import JiFa.Logic.Interface.Project;

public class BCProject extends AbstractMedium implements Project  {
private Date deadLine;
private ArrayList<BCTask> taskList = null;
@Override
public Date getDeadline() {
	return deadLine;
}

@Override
public void setDeadline(Date date) {
	deadLine = date;
	
}

}
