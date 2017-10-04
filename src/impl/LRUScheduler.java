package impl;

import api.Scheduler;
import constants.ScheduleType;
import dto.AppServerDetails;

import java.util.List;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class LRUScheduler extends Scheduler{

    public static ProxyServerState proxyServerState = ProxyServerState.getServerState();
    private static final Long FIRST_SERVER_ID = 1L;
    private static final Long MIN_USE = 0L;

    public LRUScheduler(){
        super(ScheduleType.LRU);
    }

    @Override
    public Long getAppServerId() {
        List<AppServerDetails> proxyServerDetails = proxyServerState.getProxyServerDetails();
        return findLeastUsed(proxyServerDetails);
    }

    private Long findLeastUsed(List<AppServerDetails> proxyServerDetails){
        AppServerDetails minUsed = proxyServerDetails.get(0);
        for(AppServerDetails appServerDetails : proxyServerDetails){
            if(appServerDetails.getRequestCount()==MIN_USE){
                minUsed = appServerDetails;
                break;
            }else{
                if(appServerDetails.getRequestCount() < minUsed.getRequestCount())
                    minUsed = appServerDetails;
            }
        }
        minUsed.setRequestCount(minUsed.getRequestCount()+1);
        return minUsed.getServerId();
    }
}
