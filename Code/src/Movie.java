
public class Movie implements RentableInterface {

	
	public Movie(String inID, String inTitle, String inType, Double inPrice) {
		this.setID(inID);
		this.setTitle(inTitle);
		this.setType(inType);
		this.setPrice(inPrice);
		this.setRentedStatus(false);
	}
	
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
