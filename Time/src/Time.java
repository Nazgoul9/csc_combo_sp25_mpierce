
public class Time {
 
	private int hour;
	private int min;
	private double sec;
	
	
	
	public Time(int hour, int min, double sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public Time() {
		this.hour
	}
	public int getHour() {
		return hour;
	}
	public int getMin() {
		return min;
	}
	public double getSec() {
		return sec;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void setSec(double sec) {
		this.sec = sec;
	}
	
	
	@Override
	public String toString() {
		return hour + ":" + min + ":" + sec ;
	}
	
	
}
