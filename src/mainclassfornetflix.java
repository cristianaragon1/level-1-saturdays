
public class mainclassfornetflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Hoodwinked", 5);
		Movie movie2 = new Movie("Hoodwinked Too!", 10);
		Movie movie3 = new Movie("Spongebob Squarepants, The Movie", 1);
		Movie movie4 = new Movie("Over the Hedge", 10);
		Movie movie5 = new Movie("Spy Kids: All The Time in the World", 3);
		NetflixQueue netflixone = new NetflixQueue();
		netflixone.addMovie(movie1);
		netflixone.addMovie(movie2);
		netflixone.addMovie(movie3);
		netflixone.addMovie(movie4);
		netflixone.addMovie(movie5);
		netflixone.printMovies();

	}
}
