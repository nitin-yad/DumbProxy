package test;

import api.ProxyServer;
import constants.RequestType;
import constants.ScheduleType;
import impl.ServerFactory;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class Test {

    private static Long httpReqCount = 1000L;
    private static Long ftpReqCount = 1000L;

    public static void main(String[] args){
        ProxyServer httpProxyServer = ServerFactory.setUpProxyServer(RequestType.HTTP, ScheduleType.LRU);
        for(Long l =0L; l< httpReqCount;l++){
            httpProxyServer.sendRequest();

        }
        ProxyServer ftpProxyServer = ServerFactory.setUpProxyServer(RequestType.FTP,ScheduleType.LRU);
        for(Long l =0L; l<ftpReqCount;l++){
            ftpProxyServer.sendRequest();
        }
    }
}
