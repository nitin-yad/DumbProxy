package impl;

import dto.AppServerDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class ProxyServerState {

    private static final Long serverCount = 100L;
    private static List<AppServerDetails> proxyServerDetails = new ArrayList<AppServerDetails>();
    private Long lastUsed = -1L;

    private static ProxyServerState instance = null;

    private static final Object lock = new Object();

    static {
        for(Long  l = 0L; l<serverCount; l++){
            proxyServerDetails.add(new AppServerDetails(l,0l));
        }
    }

    public static ProxyServerState getServerState(){
        ProxyServerState newState = instance;
        if (newState == null){
            synchronized (lock) {
                newState = instance;
                if (newState == null) {
                    newState = new ProxyServerState();
                    instance = newState;
                }
            }
        }
        return newState;
    }

    public List<AppServerDetails> getProxyServerDetails() {
        return proxyServerDetails;
    }

    public void setProxyServerDetails(List<AppServerDetails> proxyServerState) {
        this.proxyServerDetails = proxyServerState;
    }

    public Long getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Long lastUsed) {
        this.lastUsed = lastUsed;
    }

    public static Long getServerCount() {
        return serverCount;
    }
}
