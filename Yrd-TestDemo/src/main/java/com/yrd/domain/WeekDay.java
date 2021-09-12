package com.yrd.domain;

import jdk.nashorn.internal.objects.annotations.Getter;


public enum WeekDay {
    Monday("N",1),Tuesday("Y",2)//,WednesDay,Thursday,Friday,Saturday,Sunday
    ;

    private String name;
    private int index;

    public static String getName(int index){
        for(WeekDay weekDay:WeekDay.values()){
            if(weekDay.index == index){
                return weekDay.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    WeekDay(String name, int index) {
        this.name = name;
        this.index = index;
    }

    //@Override
    //public String toString() {
    //    return String.valueOf(name);
    //}
}
