
/**
 * Movie Class which implements the Rentable interface
 *
 */
public class Movie implements RentableInterface {

	//Constructor for inherited attributes
	public Movie(String inID, String inTitle, String inType, Double inPrice) {
		this.setID(inID);
		this.setTitle(inTitle);
		this.setType(inType);
		this.setPrice(inPrice);
	}
	//inhertied methods from interface
	@Override
	public String getID() {
		return this.myRentID;
	}

	@Override
	public void setID(String setIDString) {
		this.myRentID = setIDString;
	}

	@Override
	public String getTitle() {
		return this.myTitle;
	}

	@Override
	public void setTitle(String setTitleString) {
		this.myTitle = setTitleString;
	}

	@Override
	public String getType() {
		return this.myType;
	}

	@Override
	public void setType(String setTypeString) {
		this.myType = setTypeString;
	}

	@Override
	public Double getPrice() {
		return this.myPrice;
	}

	@Override
	public void setPrice(Double setPriceDouble) {
		this.myPrice = setPriceDouble;
	}

	@Override
	public boolean getRentedStatus() {
		return this.myRentedStatus;
	}

	@Override
	public void setRentedStatus(boolean setRentedStatus) {
		this.myRentedStatus = setRentedStatus;
	}
	
	//methods specific to Movie Class
	public Double getMovieRating(){
		return this.myMovieRating;
	}
	
	public void setMovieRating(Double setMovieRatingDouble){
		this.myMovieRating = setMovieRatingDouble;
	}
	
	public String getMoviePlot(){
		return this.myMoviePlot;
	}
	
	public void setMoviePlot(String setMoviePlotString){
		this.myMoviePlot = setMoviePlotString;
	}
	
	public String getMovieCategory(){
		return this.myMovieCategory;
	}
	
	public void setMovieCategory(String setMovieCategoryString){
		this.myMovieCategory = setMovieCategoryString;
	}
	
	public String getMovieType(){
		return this.myMovieType;
	}
	
	public void setMovieType(String setMovieTypeString){
		this.myMovieType = setMovieTypeString;
	}
	//method for testing Movie class
	public void displayMovieInfo(){
		System.out.println("My ID: "+this.getID());
		System.out.println("My Title: "+this.getTitle());
		System.out.println("My Type: "+this.getType());
		System.out.println("My Price: "+this.getPrice());
		System.out.println("My Rented Status: "+this.getRentedStatus());
		System.out.println("My Rating: "+this.getMovieRating());
		System.out.println("My Plot: "+this.getMoviePlot());
		System.out.println("My Category: "+this.getMovieCategory());
		System.out.println("My Movie Type: "+this.getMovieType());
	}
	
	//fields for Interface
	private String myRentID;
	private String myTitle;
	private String myType;
	private Double myPrice;
	private boolean myRentedStatus;
	
	//fields for Movie
	private Double myMovieRating;
	private String myMoviePlot;
	private String myMovieCategory;
	private String myMovieType;

}
