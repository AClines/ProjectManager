package SqlEntity;

public class taskEntity {
	public int taskNum;//�����������ţ��Զ����ɱ��
	public int programNum;//�������Ŀ��ţ�����program��
	public int userNum;//������û���ţ�����user��
	public String taskName;//��������
	public String taskStartTime;//������ʼʱ��
	public String taskEndTime;//�����ֹʱ��
	public String taskRate;//�������
	public int taskLevel;//���񼶱�
	//get��set����
	public int getTaskNum() {
		return taskNum;
	}
	public void setTaskNum(int taskNum) {
		this.taskNum = taskNum;
	}
	public int getProgramNum() {
		return programNum;
	}
	public void setProgramNum(int programNum) {
		this.programNum = programNum;
	}
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskStartTime() {
		return taskStartTime;
	}
	public void setTaskStartTime(String taskStartTime) {
		this.taskStartTime = taskStartTime;
	}
	public String getTaskEndTime() {
		return taskEndTime;
	}
	public void setTaskEndTime(String taskEndTime) {
		this.taskEndTime = taskEndTime;
	}
	public String getTaskRate() {
		return taskRate;
	}
	public void setTaskRate(String taskRate) {
		this.taskRate = taskRate;
	}
	public int getTaskLevel() {
		return taskLevel;
	}
	public void setTaskLevel(int taskLevel) {
		this.taskLevel = taskLevel;
	}
	//toString����
	@Override
	public String toString() {
		return "taskEntity [taskNum=" + taskNum + ", programNum=" + programNum + ", userNum=" + userNum + ", taskName="
				+ taskName + ", taskStartTime=" + taskStartTime + ", taskEndTime=" + taskEndTime + ", taskRate="
				+ taskRate + ", taskLevel=" + taskLevel + "]";
	}
	
}
