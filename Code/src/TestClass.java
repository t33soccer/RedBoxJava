import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JOptionPane;


//A testing class to test each created class
public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GUIMethods myMethods = new GUIMethods();
		
//		Map<String, User> userMap = myMethods.loadUserAccountsMap();
//		
//		User user1 = (User) userMap.get("wardj");
//		System.out.println(user1.getPassword());
//		char[] charArray = user1.getPassword().toCharArray();
//		System.out.println(charArray);
//		System.out.println(String.valueOf(charArray));
		
//		Map<String, Movie> movieMap = myMethods.loadMovieMap();
//		Movie inMovie = (Movie) movieMap.get("000");
//		inMovie.setTitle("Aladin");
//		ArrayList<Movie> movieList = myMethods.sortMovieByTitle(movieMap);
//		for (Movie mov : movieList){
//			mov.displayMovieInfo();
//		}
		
//		Map<String,VideoGame> videogameMap = myMethods.loadVideoGameMap();
//		VideoGame inVideoGame = (VideoGame) videogameMap.get("000");
//		inVideoGame.setTitle("Heros of The Storm");
//		myMethods.returnVideoGameMap(videogameMap);
//		ArrayList<VideoGame> videogameList = myMethods.sortVideoGameByRating(videogameMap);
//		for (VideoGame vg : videogameList){
//			vg.displayVideoGameInfo();
//		}
		
		Map<String, User> userMap = myMethods.loadUserAccountsMap();
		myMethods.returnUserMap(userMap);
//		user1.displayUserInfo();
//		System.out.println(user1.getFirstName());
//		System.out.println(inMovie.getRentedStatus());
//		user1.rentAdd(inMovie);
//		System.out.println(inMovie.getRentedStatus());
//		user1.rentRemove(inMovie);
//		System.out.println(inMovie.getRentedStatus());
	}

}
