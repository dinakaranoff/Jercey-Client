package Jersey_Client.Jersey_Client;

import com.dina.json.User;

public class RestClient {
    private static final String REST_URI 
		      = "http://localhost:8080/Test/rest/UserService/";
 
		    public  Client client = ClientBuilder.newClient();
 
		    public void getJsonEmployee(String  id) {
		        Response response= client
		          .target(REST_URI)
		          .path(id)
		          .request(MediaType.APPLICATION_JSON)
		          .get(User.class);
		        
		        System.out.println("OKK");
		    }
	
	
		public static void main(String[] args) {
			RestClient tes=new RestClient();
			tes.getJsonEmployee("users");
		}

}
