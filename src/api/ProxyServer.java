package api;

import dto.ProxyResponse;
import constants.RequestType;
import constants.ScheduleType;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public abstract class ProxyServer {

    private RequestType requestType = null ;

    private ScheduleType scheduleType = null;

    public ProxyServer( RequestType requestType, ScheduleType scheduleType){
        this.requestType = requestType;
        this.scheduleType = scheduleType;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public abstract ProxyResponse sendRequest();
}
