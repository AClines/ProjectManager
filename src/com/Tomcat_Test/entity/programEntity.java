package SqlEntity;

public class programEntity {
	public int programNum;//项目编号，主键，自动生成
	public int teamNum;//团队编号，外键，依赖team表
	public String programName;//团队名称
	public String programStartTime;//起始时间
	public String programEndTime;//截止时间
	public String programRate;//项目进度
	
	//get和set方法
	public int getProgramNum() {
		return programNum;
	}
	public void setProgramNum(int programNum) {
		this.programNum = programNum;
	}
	public int getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(int teamNum) {
		this.teamNum = teamNum;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getProgramStartTime() {
		return programStartTime;
	}
	public void setProgramStartTime(String programStartTime) {
		this.programStartTime = programStartTime;
	}
	public String getProgramEndTime() {
		return programEndTime;
	}
	public void setProgramEndTime(String programEndTime) {
		this.programEndTime = programEndTime;
	}
	public String getProgramRate() {
		return programRate;
	}
	public void setProgramRate(String programRate) {
		this.programRate = programRate;
	}
	
	//toString方法
	@Override
	public String toString() {
		return "programEntity [programNum=" + programNum + ", teamNum=" + teamNum + ", programName=" + programName
				+ ", programStartTime=" + programStartTime + ", programEndTime=" + programEndTime + ", programRate="
				+ programRate + "]";
	}
	
}
