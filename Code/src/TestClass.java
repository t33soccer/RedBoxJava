import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GUIMethods myMethods = new GUIMethods();
		
//		Map<String, User> userMap = myMethods.loadUserAccountsMap();
//		User user1 = (User) userMap.get("wardj");
//		user1.setFirstName("John");
//		myMethods.returnUserMap(userMap);
		
		Map<String, Movie> movieMap = myMethods.loadMovieMap();
//		Movie inMovie = (Movie) movieMap.get("000");
//		inMovie.setTitle("Aladin");
		ArrayList<Movie> movieList = myMethods.sortMovieByTitle(movieMap);
		for (Movie mov : movieList){
			mov.displayMovieInfo();
		}
		
//		Map<String,VideoGame> videogameMap = myMethods.loadVideoGameMap();
//		VideoGame inVideoGame = (VideoGame) videogameMap.get("000");
//		inVideoGame.setTitle("Heros of The Storm");
//		myMethods.returnVideoGameMap(videogameMap);
//		ArrayList<VideoGame> videogameList = myMethods.sortVideoGameByRating(videogameMap);
//		for (VideoGame vg : videogameList){
//			vg.displayVideoGameInfo();
//		}
		
//		Map<String, User> userMap = myMethods.loadUserAccountsMap();
//		User user1 = (User) userMap.get("wardj");
//		user1.displayUserInfo();
//		System.out.println(user1.getFirstName());
//		System.out.println(inMovie.getRentedStatus());
//		user1.rentAdd(inMovie);
//		System.out.println(inMovie.getRentedStatus());
//		user1.rentRemove(inMovie);
//		System.out.println(inMovie.getRentedStatus());
	}

}
