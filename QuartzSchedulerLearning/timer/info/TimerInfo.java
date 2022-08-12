package com.michelon.timer.info;

public class TimerInfo {
    private int totalFireAccount;
    private boolean runForever;
    private long repeatIntervalMs;
    private long initialOffSetMs;
    private String callBackData;

    public int getTotalFireAccount() {
        return totalFireAccount;
    }

    public void setTotalFireAccount(int totalFireAccount) {
        this.totalFireAccount = totalFireAccount;
    }

    public boolean isRunForever() {
        return runForever;
    }

    public void setRunForever(boolean runForever) {
        this.runForever = runForever;
    }

    public long getRepeatIntervalMs() {
        return repeatIntervalMs;
    }

    public void setRepeatIntervalMs(long repeatIntervalMs) {
        this.repeatIntervalMs = repeatIntervalMs;
    }

    public long getInitialOffSetMs() {
        return initialOffSetMs;
    }

    public void setInitialOffSetMs(long initialOffSetMs) {
        this.initialOffSetMs = initialOffSetMs;
    }

    public String getCallBackData() {
        return callBackData;
    }

    public void setCallBackData(String callBackData) {
        this.callBackData = callBackData;
    }
}
