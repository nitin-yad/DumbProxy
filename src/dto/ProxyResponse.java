package dto;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class ProxyResponse {
    int responseCode;
    String responseDetails;

    public ProxyResponse(int responseCode, String responseDetails){
        this.responseCode = responseCode;
        this.responseDetails = responseDetails;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDetails() {
        return responseDetails;
    }

    public void setResponseDetails(String responseDetails) {
        this.responseDetails = responseDetails;
    }
}
