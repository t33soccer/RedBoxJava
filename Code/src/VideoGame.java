


/**
 * Video Game Class which implements RentableInterface
 *
 */
public class VideoGame implements RentableInterface {
	
	// Constructor to initialize interface attributes
	public VideoGame(String inID, String inTitle, String inType, Double inPrice) {
		this.setID(inID);
		this.setTitle(inTitle);
		this.setType(inType);
		this.setPrice(inPrice);
	}
	//Implemented interface methods
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
	
	//specific methods to Video Game Class
	public Double getVideoGameRating(){
		return this.videoGameRating;
	}
	
	public void setVideoGameRating(Double setVideoGameRatingDouble){
		this.videoGameRating = setVideoGameRatingDouble;
	}
	
	public String getVideoGameSummary(){
		return this.videoGameSummary;
	}
	
	public void setVideoGameSummary(String setVideoGameSummaryString){
		this.videoGameSummary = setVideoGameSummaryString;
	}
	
	public String getVideoGameCategory(){
		return this.videoGameCategory;
	}
	
	public void setVideoGameCategory(String setVideoGameCategoryString){
		this.videoGameCategory = setVideoGameCategoryString;
	}
	
	public String getVideoGamePlatform(){
		return this.videoGamePlatform;
	}
	
	public void setVideoGamePlatform(String setVideoGamePlatformString){
		this.videoGamePlatform = setVideoGamePlatformString;
	}
	
	// testing method to display class info
	public void displayVideoGameInfo(){
		System.out.println("My ID: "+this.getID());
		System.out.println("My Title: "+this.getTitle());
		System.out.println("My Type: "+this.getType());
		System.out.println("My Price: "+this.getPrice());
		System.out.println("My Rented Status: "+this.getRentedStatus());
		System.out.println("My Rating: "+this.getVideoGameRating());
		System.out.println("My Summary: "+this.getVideoGameSummary());
		System.out.println("My Category: "+this.getVideoGameCategory());
		System.out.println("My Platform: "+this.getVideoGamePlatform());
	}
	
	//fields for Interface
	private String myRentID;
	private String myTitle;
	private String myType;
	private Double myPrice;
	private boolean myRentedStatus;
	
	//fields for VideoGame
	private Double videoGameRating;
	private String videoGameSummary;
	private String videoGameCategory;
	private String videoGamePlatform;
}
