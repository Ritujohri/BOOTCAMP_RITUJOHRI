package assignment1SRP;

class EmailServices {

	private final LocationService locationService = new LocationService();
	private final SecurityService securityService = new SecurityService();

	void sendEmail(String user, String email, String message){
		if(locationService.checkLocation(locationService.retrieveLocation(email))){
			if(securityService.checkPermission(user)){
				if(exists(email)){
					System.out.println("Email is sent to "+email+ " with message : "+message);
				}
			}
		}
	}	


	boolean exists(String email){
		//20 loc to check in DB
		if(email.endsWith("@yahoo.com")) {
			return true;
		}else{
			return false;
		}
	}





}