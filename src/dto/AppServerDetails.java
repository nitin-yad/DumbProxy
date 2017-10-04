package dto;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class AppServerDetails {
    private Long serverId;
    private Long requestCount;

    public AppServerDetails(Long serverId, Long requestCount){
        this.serverId = serverId;
        this.requestCount = requestCount;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Long requestCount) {
        this.requestCount = requestCount;
    }
}
