package SqlEntity;

public class TeamEntity {
	public int teamNum;//主键,团队编号,自动生成编号
	public String teamName;//团队名称
	public String teamManager;//队长
	
	//get和set方法
	public int getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(int teamNum) {
		this.teamNum = teamNum;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamManager() {
		return teamManager;
	}
	public void setTeamManager(String teamManager) {
		this.teamManager = teamManager;
	}
	//toString 方法
	@Override
	public String toString() {
		return "TeamEntity [teamNum=" + teamNum + ", teamName=" + teamName + ", teamManager=" + teamManager + "]";
	}
	
	
}
