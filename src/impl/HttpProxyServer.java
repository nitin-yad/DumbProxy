package impl;

import api.ProxyServer;
import api.Scheduler;
import constants.RequestType;
import constants.ScheduleType;
import dto.ProxyResponse;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class HttpProxyServer extends ProxyServer {
    public HttpProxyServer(ScheduleType scheduleType) {
        super(RequestType.HTTP, scheduleType);
    }

    @Override
    public ProxyResponse sendRequest() {
        Scheduler scheduler = SchedulerFactory.setUpScheduler(this.getScheduleType());
        System.out.println("Sending http request to httpServer: "+scheduler.getAppServerId());
        return new ProxyResponse(200,"Done");
    }
}
