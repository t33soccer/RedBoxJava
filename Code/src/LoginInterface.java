//Interface for User and Admin classes
public interface LoginInterface {
	public String getID();
	public void setID(String setIDString);
	public String getPassword();
	public void setPassword(String setPasswordString);
	public boolean getAdminRights();
	public void setAdminRights(boolean setAdminRightsBool);
}
