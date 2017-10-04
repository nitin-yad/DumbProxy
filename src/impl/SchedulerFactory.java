package impl;

import api.Scheduler;
import constants.ScheduleType;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public class SchedulerFactory {
    public static Scheduler setUpScheduler(ScheduleType scheduleType){
        Scheduler scheduler = null;
        switch(scheduleType){
            case RR:
                scheduler = new RRScheduler();
                break;
            case LRU:
                scheduler = new LRUScheduler();
                break;
            default:
                // we can throw some exception
                break;
        }
        return scheduler;
    }
}
