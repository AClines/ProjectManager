package SqlEntity;

public class taskEntity {
	public int taskNum;//主键，任务编号，自动生成编号
	public int programNum;//外键，项目编号，依赖program表
	public int userNum;//外键，用户编号，依赖user表
	public String taskName;//任务名称
	public String taskStartTime;//任务起始时间
	public String taskEndTime;//任务截止时间
	public String taskRate;//任务进度
	public int taskLevel;//任务级别
	//get和set方法
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
	//toString方法
	@Override
	public String toString() {
		return "taskEntity [taskNum=" + taskNum + ", programNum=" + programNum + ", userNum=" + userNum + ", taskName="
				+ taskName + ", taskStartTime=" + taskStartTime + ", taskEndTime=" + taskEndTime + ", taskRate="
				+ taskRate + ", taskLevel=" + taskLevel + "]";
	}
	
}
