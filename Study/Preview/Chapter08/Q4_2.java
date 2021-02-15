package chapter8;

public class Q4_2 {
	public class Engineer extends Q4{
		private String skillset;
		
		public Engineer(String name) {
			super(name);
			name = "ddd";
			grade = "BRONZE";
		}
		
		public String getSkillSet() {
			return skillset;
		}
		public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
	}
}
