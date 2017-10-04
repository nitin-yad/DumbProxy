package impl;

import api.Scheduler;
import constants.ScheduleType;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class RRScheduler extends Scheduler {

    public static ProxyServerState proxyServerState = ProxyServerState.getServerState();
    private static final Long FIRST_SERVER_ID = 0L;

    public RRScheduler(){
        super(ScheduleType.RR);
    }

    @Override
    public Long getAppServerId() {
        Long nextAppServer = (proxyServerState.getLastUsed()+1)%ProxyServerState.getServerCount();
        proxyServerState.setLastUsed(nextAppServer);
        return nextAppServer;
    }
}
