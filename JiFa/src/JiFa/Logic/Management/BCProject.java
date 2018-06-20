package JiFa.Logic.Management;

import java.util.Date;

import JiFa.Logic.Interface.Project;

public class BCProject extends AbstractMedium implements Project  {
private Date deadLine;

@Override
public Date getDeadline() {
	return deadLine;
}

@Override
public void setDeadline(Date date) {
	deadLine = date;
	
}

}
