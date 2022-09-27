package com.wornofkeys;

public enum DaysOfWeek {
    //enum are some kind of things that cannot be changed or shouldn't be changed
    //enum are concrete and never going to change not even the variables passed
    SUNDAY("sunday",false),
    MONDAY("monday",true),
    TUESDAY("tuesday",true),
    WEDNESDAY("wednesday",true),
    THURSDAY("thursday",true),
    FRIDAY("friday",true),
    SATURDAY("saturday",false);

    private String name;
    private boolean workday;
    DaysOfWeek(String name, boolean workday) {
        this.name = name;
        this.workday = workday;
    }

    //Getters
    public String getDisplayName() {
        return name;
    }

    public boolean isWorkday() {
        return workday;
    }
}
