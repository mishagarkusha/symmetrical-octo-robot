package com.suitt.gk.assignment4.utils;

import java.util.Random;

public class Time {
    private static final Random random = new Random();
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0) {
            hour += 24;
        } else if (hour >= 24) {
            hour -= 24;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0) {
            minute += 60;
            setHour(--hour);
        } else if (minute >= 60) {
            minute -= 60;
            setHour(hour++);
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0) {
            second += 60;
            setMinute(--minute);
        } else if (second >= 60) {
            second -= 60;
            setMinute(minute++);
        }
        this.second = second;
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time(String time) {
        String[] times = time.split(":");
        setHour(Integer.parseInt(times[0]));
        setMinute(Integer.parseInt(times[1]));
        setSecond(Integer.parseInt(times[2]));
    }

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time subtract(Time time2) {
        return new Time(
                hour - time2.hour,
                minute - time2.minute,
                second - time2.second
        );
    }

    @Override
    public String toString() {
        String output = "";

        if (hour < 10) output += "0";
        output += hour + ":";

        if (minute < 10) output += "0";
        output += minute + ":";

        if (second < 10) output += "0";
        output += second;

        return output;
    }

    public static Time getRandomTime() {
        return new Time(random.nextInt(24), random.nextInt(60), random.nextInt(60));
    }
}
