package impl;

import api.ProxyServer;
import constants.RequestType;
import constants.ScheduleType;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class ServerFactory {

    public static ProxyServer setUpProxyServer(RequestType requestType, ScheduleType scheduleType){
        ProxyServer proxyServer = null;
        switch(requestType){
            case HTTP:
                proxyServer = new HttpProxyServer(scheduleType);
                break;
            case FTP:
                proxyServer = new FtpServer(scheduleType);
                break;
            default:
                // we can throw some exception
                break;
        }
        return proxyServer;
    }
}
