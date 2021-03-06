package design.swira.aennyapp.pojo.aenny.msgres;


import com.google.gson.annotations.SerializedName;


public class FavouriteExistsResponse {

	@SerializedName("Status")
	private boolean status;

	@SerializedName("Message")
	private String message;

	@SerializedName("$id")
	private String id;

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}



	@Override
 	public String toString(){
		return 
			"Response{" + 
			"status = '" + status + '\'' + 
			",message = '" + message + '\'' + 
			",$id = '" + id + '\'' + 
			"}";
		}
}