package api;

import constants.ScheduleType;

/**
 * Created by nitin.yadav on 08-06-2017.
 */
public abstract class Scheduler {

    private ScheduleType scheduleType = null;

    public Scheduler(ScheduleType scheduleType){
        this.scheduleType = scheduleType;
    }

    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public abstract Long getAppServerId();
}
