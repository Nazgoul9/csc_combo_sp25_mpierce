public class movieinitialsdriver {
	
	public static void main(String[] args) {
		
		
		movieinitials movie1 = new movieinitials();
		movieinitials movie2 = new movieinitials();
		
		movie1.setDirector("alan taylor");
		movie1.setMovieName("Thor: the Dark World");
		movie1.setTimeMin(112);
		movie1.setRating(6.5);
		movie1.setRottomat(67);
		moviePrintData(movie1);
		System.out.println();
		System.out.println(movie1.toString());
		System.out.println();
		movie2.setDirector("Nikolaj Arcel");
		movie2.setMovieName("the dark tower");
		movie2.setTimeMin(95);
		movie2.setRating(5.6);
		movie2.setRottomat(16);
		moviePrintData(movie2);
		System.out.println();
		
		}

	private static void moviePrintData(movieinitials tDarkWorld) {
		System.out.println("name: "+tDarkWorld.getMovieName());
		System.out.println("director: "+tDarkWorld.getDirector());
		System.out.println("minutes long: "+tDarkWorld.getTimeMin());
		System.out.println("IMDB rating: "+tDarkWorld.getRating());
		System.out.println("rotten tomato: "+tDarkWorld.getRottomat()+"%");
		
	}

	
		
	}
		

	


