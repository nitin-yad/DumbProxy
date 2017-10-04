package impl;


import api.ProxyServer;
import api.Scheduler;
import constants.RequestType;
import constants.ScheduleType;
import dto.ProxyResponse;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class FtpServer extends ProxyServer {

    public FtpServer(ScheduleType scheduleType) {
        super(RequestType.FTP,scheduleType);
    }

    @Override
    public ProxyResponse sendRequest() {
        Scheduler scheduler = SchedulerFactory.setUpScheduler(this.getScheduleType());
        System.out.println("Sending ftp request to ftpServer: "+scheduler.getAppServerId());
        return new ProxyResponse(200,"Done");
    }
}
