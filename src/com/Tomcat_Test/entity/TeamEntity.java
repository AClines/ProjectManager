package SqlEntity;

public class TeamEntity {
	public int teamNum;//����,�Ŷӱ��,�Զ����ɱ��
	public String teamName;//�Ŷ�����
	public String teamManager;//�ӳ�
	
	//get��set����
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
	//toString ����
	@Override
	public String toString() {
		return "TeamEntity [teamNum=" + teamNum + ", teamName=" + teamName + ", teamManager=" + teamManager + "]";
	}
	
	
}
