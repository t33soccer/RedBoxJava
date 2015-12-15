import java.util.HashMap;
import java.util.Map;


/**
 * User class inherited from the Login Interface
 *
 */
public class User implements LoginInterface{
	
	//public constructor for interface attributes
	public User(String myID, String myPassword){
		this.userID = myID;
		this.userPassword = myPassword;
		currentRentables = new HashMap<String,RentableInterface>();
	}
	
	//methods inherited from interface
	@Override
	public String getID() {
		return this.userID;
	}
	@Override
	public void setID(String setIDString) {
		// TODO Auto-generated method stub
		this.userID = setIDString;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.userPassword;
	}

	@Override
	public void setPassword(String setPasswordString) {
		// TODO Auto-generated method stub
		this.userPassword = setPasswordString;
	}
	
	@Override
	public boolean getAdminRights(){
		return this.userAdminRights;
	}
	
	@Override
	public void setAdminRights(boolean setAdminRightsBool){
		this.userAdminRights = setAdminRightsBool;
	}
	
	//methods specific to user
	public String getFirstName(){
		return this.userFirstName;
	}
	
	public void setFirstName(String setFirstNameString){
		this.userFirstName = setFirstNameString;
	}
	
	public String getLastName(){
		return this.userLastName;
	}
	
	public void setLastName(String setLastNameString){
		this.userLastName = setLastNameString;
	}
	
	public String getAddress(){
		return this.userAddress;
	}
	
	public void setAddress(String setAddressString){
		this.userAddress = setAddressString;
	}
	
	public String getCity(){
		return this.userCity;
	}
	
	public void setCity(String setCityString){
		this.userCity = setCityString;
	}
	
	public String getState(){
		return this.userState;
	}
	
	public void setState(String setStateString){
		this.userState = setStateString;
	}
	
	public String getZip(){
		return this.userZip;
	}
	
	public void setZip(String setZipString){
		this.userZip = setZipString;
	}
	
	public String getEmail(){
		return this.userEmail;
	}
	
	public void setEmail(String setEmailString){
		this.userEmail = setEmailString;
	}
	
	public String getPhoneNumber(){
		return this.userPhoneNumber;
	}
	
	public void setPhoneNumber(String setPhoneNumberString){
		this.userPhoneNumber = setPhoneNumberString;
	}
	
	public Double getBalance(){
		return this.userBalance;
	}
	
	public void setBalance(Double setBalanceDouble){
		this.userBalance = setBalanceDouble;
	}
	//Map methods
	public Map<String, RentableInterface> returnRentables(){
		return this.currentRentables;
	}
	
	public void rentAdd(RentableInterface myRentable){
		myRentable.setRentedStatus(true);
		currentRentables.put(myRentable.getID(), myRentable);
	}
	
	public void rentRemove(RentableInterface myRentable){
		myRentable.setRentedStatus(false);
		currentRentables.remove(myRentable.getID());
	}
	//method for testing User class
	public void displayUserInfo(){
		System.out.println("My ID: "+this.getID());
		System.out.println("My First Name: "+this.getFirstName());
		System.out.println("My Last Name: "+this.getLastName());
		System.out.println("My Address: "+this.getAddress());
		System.out.println("My City: "+this.getCity());
		System.out.println("My State: "+this.getState());
		System.out.println("My Zip: "+this.getZip());
		System.out.println("My Email: "+this.getEmail());
		System.out.println("My Phone Number: "+this.getPhoneNumber());
		System.out.println("My Balance: "+this.getBalance());
	}
	//interface attributes
	private String userID;
	private String userPassword;
	private boolean userAdminRights;
	//attributes specific to User
	private String userFirstName;
	private String userLastName;
	private String userAddress;
	private String userCity;
	private String userState;
	private String userZip;
	private String userEmail;
	private String userPhoneNumber;
	private Double userBalance;
	private Map<String, RentableInterface> currentRentables;
	
}
