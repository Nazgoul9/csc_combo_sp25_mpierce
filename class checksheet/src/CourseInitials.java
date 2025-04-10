
public class CourseInitials {
	private String cnum;
	private int minS;
	private int maxS;
	private String RNum;
	private int credits;

	public CourseInitials() {
		this.cnum="";
		this.minS=0;
		this.maxS=0;
		this.RNum ="";
		this.credits=0;
	}
	
	public CourseInitials(String cnum, int minS, int maxS, String rNum, int credits) {
		super();
		this.cnum = cnum;
		this.minS = minS;
		this.maxS = maxS;
		RNum = rNum;
		this.credits = credits;
	}

	public String getCnum() {
		return cnum;
	}
	
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	
	public int getMinS() {
		return minS;
	}
		
	public void setMinS(int minS) {
		this.minS = minS;
	}
	
	public int getMaxS() {
		return maxS;
	}
	
public void setMaxS(int maxS) {
		this.maxS = maxS;
	}

	public String getRNum() {
		return RNum;
	}

	public void setRNum(String rNum) {
		RNum = rNum;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "CourseInitials \n course number = " + cnum + "\n min Students = " + minS + "\n max Students = " + maxS + "\n Room Number = " 
	+ RNum + "\n credits = " + credits;
	}

	
	
	
}
