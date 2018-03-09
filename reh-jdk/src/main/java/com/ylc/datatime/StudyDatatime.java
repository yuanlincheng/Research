package com.ylc.datatime;

import java.time.Clock;

/**
 * Created by tree on 2017/6/11.
 */
public class StudyDatatime {
    //获取当前的毫秒数
    public long getMillis() {
        Clock clock = Clock.systemUTC();
        return clock.millis();
    }
}
