import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;

public class GUIMethods {

	public Map<String,User> loadUserAccountsMap() throws IOException{
		Map<String,User> loginUserMap = new HashMap<String,User>();
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Trey\\Documents\\GitHub\\RedBoxJava\\Code\\src\\userData.txt"));
		
		String line = "";
		
		while ((line = in.readLine()) != null){
			String parts[] = line.split("-");
			User temp = new User(parts[0],parts[1]);
			temp.setAdminRights(Boolean.parseBoolean(parts[2]));
			temp.setFirstName(parts[3]);
			temp.setLastName(parts[4]);
			temp.setAddress(parts[5]);
			temp.setCity(parts[6]);
			temp.setState(parts[7]);
			temp.setZip(parts[8]);
			temp.setEmail(parts[9]);
			temp.setPhoneNumber(parts[10]);
			temp.setBalance(Double.parseDouble(parts[11]));
			loginUserMap.put(parts[0],temp);
		}
		in.close();
		return loginUserMap;
	}
	
	public void returnUserMap(Map<String,User> myMap) throws IOException{
		File outFile = new File("C:\\Users\\Trey\\Documents\\GitHub\\RedBoxJava\\Code\\src\\userData.txt");
		outFile.createNewFile();
		FileWriter outWriter = new FileWriter(outFile);
		Collection<User> c = myMap.values();
		final Iterator<User> itr = c.iterator();
		User myEntry = (User) itr.next();
		while(itr.hasNext()){
			outWriter.write(myEntry.getID());
			outWriter.write("-");
			outWriter.write(myEntry.getPassword());
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getAdminRights()));
			outWriter.write("-");
			outWriter.write(myEntry.getFirstName());
			outWriter.write("-");
			outWriter.write(myEntry.getLastName());
			outWriter.write("-");
			outWriter.write(myEntry.getAddress());
			outWriter.write("-");
			outWriter.write(myEntry.getCity());
			outWriter.write("-");
			outWriter.write(myEntry.getState());
			outWriter.write("-");
			outWriter.write(myEntry.getZip());
			outWriter.write("-");
			outWriter.write(myEntry.getEmail());
			outWriter.write("-");
			outWriter.write(myEntry.getPhoneNumber());
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getBalance()));
			outWriter.write(System.getProperty("line.separator"));
			myEntry = (User) itr.next();
		}
		outWriter.write(myEntry.getID());
		outWriter.write("-");
		outWriter.write(myEntry.getPassword());
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getAdminRights()));
		outWriter.write("-");
		outWriter.write(myEntry.getFirstName());
		outWriter.write("-");
		outWriter.write(myEntry.getLastName());
		outWriter.write("-");
		outWriter.write(myEntry.getAddress());
		outWriter.write("-");
		outWriter.write(myEntry.getCity());
		outWriter.write("-");
		outWriter.write(myEntry.getState());
		outWriter.write("-");
		outWriter.write(myEntry.getZip());
		outWriter.write("-");
		outWriter.write(myEntry.getEmail());
		outWriter.write("-");
		outWriter.write(myEntry.getPhoneNumber());
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getBalance()));
		outWriter.flush();
		outWriter.close();
	}
	
	public Map<String,Movie> loadMovieMap() throws NumberFormatException, IOException{
		Map<String,Movie> movieMap = new HashMap<String,Movie>();
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Trey\\Documents\\GitHub\\RedBoxJava\\Code\\src\\movieData.txt"));
		
		String line = "";
		
		while ((line = in.readLine()) != null){
			String parts[] = line.split("-");
			Movie temp = new Movie(parts[0],parts[1],parts[2],Double.parseDouble(parts[3]));
			temp.setRentedStatus(Boolean.parseBoolean(parts[4]));
			temp.setMovieRating(Double.parseDouble(parts[5]));
			temp.setMoviePlot(parts[6]);
			temp.setMovieCategory(parts[7]);
			temp.setMovieType(parts[8]);
			movieMap.put(temp.getID(),temp);
		}
		in.close();
		return movieMap;
	}
	
	public void returnMovieMap(Map<String,Movie> myMap) throws IOException{
		File outFile = new File("C:\\Users\\Trey\\Documents\\GitHub\\RedBoxJava\\Code\\src\\movieData.txt");
		outFile.createNewFile();
		FileWriter outWriter = new FileWriter(outFile);
		Collection<Movie> c = myMap.values();
		final Iterator<Movie> itr = c.iterator();
		Movie myEntry = (Movie) itr.next();
		while(itr.hasNext()){
			outWriter.write(myEntry.getID());
			outWriter.write("-");
			outWriter.write(myEntry.getTitle());
			outWriter.write("-");
			outWriter.write(myEntry.getType());
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getPrice()));
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getRentedStatus()));
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getMovieRating()));
			outWriter.write("-");
			outWriter.write(myEntry.getMoviePlot());
			outWriter.write("-");
			outWriter.write(myEntry.getMovieCategory());
			outWriter.write("-");
			outWriter.write(myEntry.getMovieType());
			outWriter.write(System.getProperty("line.separator"));
			myEntry = (Movie) itr.next();
		}
		outWriter.write(myEntry.getID());
		outWriter.write("-");
		outWriter.write(myEntry.getTitle());
		outWriter.write("-");
		outWriter.write(myEntry.getType());
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getPrice()));
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getRentedStatus()));
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getMovieRating()));
		outWriter.write("-");
		outWriter.write(myEntry.getMoviePlot());
		outWriter.write("-");
		outWriter.write(myEntry.getMovieCategory());
		outWriter.write("-");
		outWriter.write(myEntry.getMovieType());
		outWriter.flush();
		outWriter.close();
	}
	
	public Map<String,VideoGame> loadVideoGameMap() throws NumberFormatException, IOException{
		Map<String,VideoGame> videogameMap = new HashMap<String,VideoGame>();
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Trey\\Documents\\GitHub\\RedBoxJava\\Code\\src\\videogameData.txt"));
		
		String line = "";
		
		while ((line = in.readLine()) != null){
			String parts[] = line.split("-");
			VideoGame temp = new VideoGame(parts[0],parts[1],parts[2],Double.parseDouble(parts[3]));
			temp.setRentedStatus(Boolean.parseBoolean(parts[4]));
			temp.setVideoGameRating(Double.parseDouble(parts[5]));
			temp.setVideoGameSummary(parts[6]);
			temp.setVideoGameCategory(parts[7]);
			temp.setVideoGamePlatform(parts[8]);
			videogameMap.put(temp.getID(),temp);
		}
		in.close();
		return videogameMap;
	}
	
	public void returnVideoGameMap(Map<String,VideoGame> myMap) throws IOException{
		File outFile = new File("C:\\Users\\Trey\\Documents\\GitHub\\RedBoxJava\\Code\\src\\videogameData.txt");
		outFile.createNewFile();
		FileWriter outWriter = new FileWriter(outFile);
		Collection<VideoGame> c = myMap.values();
		final Iterator<VideoGame> itr = c.iterator();
		VideoGame myEntry = (VideoGame) itr.next();
		while(itr.hasNext()){
			outWriter.write(myEntry.getID());
			outWriter.write("-");
			outWriter.write(myEntry.getTitle());
			outWriter.write("-");
			outWriter.write(myEntry.getType());
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getPrice()));
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getRentedStatus()));
			outWriter.write("-");
			outWriter.write(String.valueOf(myEntry.getVideoGameRating()));
			outWriter.write("-");
			outWriter.write(myEntry.getVideoGameSummary());
			outWriter.write("-");
			outWriter.write(myEntry.getVideoGameCategory());
			outWriter.write("-");
			outWriter.write(myEntry.getVideoGamePlatform());
			outWriter.write(System.getProperty("line.separator"));
			myEntry = (VideoGame) itr.next();
		}
		outWriter.write(myEntry.getID());
		outWriter.write("-");
		outWriter.write(myEntry.getTitle());
		outWriter.write("-");
		outWriter.write(myEntry.getType());
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getPrice()));
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getRentedStatus()));
		outWriter.write("-");
		outWriter.write(String.valueOf(myEntry.getVideoGameRating()));
		outWriter.write("-");
		outWriter.write(myEntry.getVideoGameSummary());
		outWriter.write("-");
		outWriter.write(myEntry.getVideoGameCategory());
		outWriter.write("-");
		outWriter.write(myEntry.getVideoGamePlatform());
		outWriter.flush();
		outWriter.close();
	}
	
	public ArrayList<Movie> sortMovieByTitle(Map<String,Movie> myMap){
		ArrayList<Movie> sortedList = new ArrayList<Movie>(myMap.values());
		 Collections.sort(sortedList, new Comparator<Movie>() {

				@Override
				public int compare(Movie mov1, Movie mov2) {
					String str1 = mov1.getTitle();
					String str2 = mov2.getTitle();
			        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
			        if (res == 0) {
			            res = str1.compareTo(str2);
			        }
			        return res;
				}
		    });
		return sortedList;
	}
	
	public ArrayList<Movie> sortMovieByCategory(Map<String,Movie> myMap){
		ArrayList<Movie> sortedList = new ArrayList<Movie>(myMap.values());
		 Collections.sort(sortedList, new Comparator<Movie>() {

				@Override
				public int compare(Movie mov1, Movie mov2) {
					String str1 = mov1.getMovieCategory();
					String str2 = mov2.getMovieCategory();
			        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
			        if (res == 0) {
			            res = str1.compareTo(str2);
			        }
			        return res;
				}
		    });
		return sortedList;
	}
	
	public ArrayList<Movie> sortMovieByRating(Map<String,Movie> myMap){
		ArrayList<Movie> sortedList = new ArrayList<Movie>(myMap.values());
		 Collections.sort(sortedList, new Comparator<Movie>() {

				@Override
				public int compare(Movie mov1, Movie mov2) {
					if (mov1.getMovieRating()>mov2.getMovieRating())
						return -1;
					if (mov2.getMovieRating()>mov1.getMovieRating())
						return 1;
					return 0;
				}
		    });
		return sortedList;
	}
	
	public ArrayList<VideoGame> sortVideoGameByTitle(Map<String,VideoGame> myMap){
		ArrayList<VideoGame> sortedList = new ArrayList<VideoGame>(myMap.values());
		 Collections.sort(sortedList, new Comparator<VideoGame>() {

				@Override
				public int compare(VideoGame mov1, VideoGame mov2) {
					String str1 = mov1.getTitle();
					String str2 = mov2.getTitle();
			        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
			        if (res == 0) {
			            res = str1.compareTo(str2);
			        }
			        return res;
				}
		    });
		return sortedList;
	}
	
	public ArrayList<VideoGame> sortVideoGameByCategory(Map<String,VideoGame> myMap){
		ArrayList<VideoGame> sortedList = new ArrayList<VideoGame>(myMap.values());
		 Collections.sort(sortedList, new Comparator<VideoGame>() {

				@Override
				public int compare(VideoGame mov1, VideoGame mov2) {
					String str1 = mov1.getVideoGameCategory();
					String str2 = mov2.getVideoGameCategory();
			        int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
			        if (res == 0) {
			            res = str1.compareTo(str2);
			        }
			        return res;
				}
		    });
		return sortedList;
	}
	
	public ArrayList<VideoGame> sortVideoGameByRating(Map<String,VideoGame> myMap){
		ArrayList<VideoGame> sortedList = new ArrayList<VideoGame>(myMap.values());
		 Collections.sort(sortedList, new Comparator<VideoGame>() {

				@Override
				public int compare(VideoGame vg1, VideoGame vg2) {
					if (vg1.getVideoGameRating()>vg2.getVideoGameRating())
						return -1;
					if (vg2.getVideoGameRating()>vg1.getVideoGameRating())
						return 1;
					return 0;
				}
		    });
		return sortedList;
	}
	
}
