
public class movieinitials {
	private String movieName;
	private String director;
	private int timeMin;
	private double rating;
	private int rottomat;
	
	public movieinitials() {
		super();
		this.movieName = "";
		this.director = "";
		this.timeMin = 0;
		this.rating = 0;
		this.rottomat = 0;
	}
	
	
	
	public movieinitials(String movieName, String director, int time, double rating, int rottomat) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.timeMin = time;
		this.rating = rating;
		this.rottomat = rottomat;
	}



	public String getMovieName() {
		return movieName;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public String getDirector() {
		return director;
	}



	public void setDirector(String director) {
		this.director = director;
	}



	public int getTimeMin() {
		return timeMin;
	}



	public void setTimeMin(int time) {
		this.timeMin = time;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public double getRottomat() {
		return rottomat;
	}



	public void setRottomat(int rottomat) {
		this.rottomat = rottomat;
	}



	@Override
	public String toString() {
		return "movieinitials \nName = " + movieName + "\ndirector = "+ director + "\nminutes long = " + timeMin + "\nIMDB rating ="
				+ rating + "\nrottten tomato = " + rottomat;
	}
	
	
	

}
