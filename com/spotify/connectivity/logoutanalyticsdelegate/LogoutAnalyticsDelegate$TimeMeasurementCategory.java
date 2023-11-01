package com.spotify.connectivity.logoutanalyticsdelegate.LogoutAnalyticsDelegate$TimeMeasurementCategory;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

final class LogoutAnalyticsDelegate$TimeMeasurementCategory extends Enum	// class@000752 from classes.dex
{
    private final String raw;
    private static final LogoutAnalyticsDelegate$TimeMeasurementCategory[] $VALUES;
    public static final LogoutAnalyticsDelegate$TimeMeasurementCategory TOTAL_LOGOUT_DURATION;

    private static final LogoutAnalyticsDelegate$TimeMeasurementCategory[] $values(){
       LogoutAnalyticsDelegate$TimeMeasurementCategory[] timeMeasurem = new LogoutAnalyticsDelegate$TimeMeasurementCategory[]{LogoutAnalyticsDelegate$TimeMeasurementCategory.TOTAL_LOGOUT_DURATION};
       return timeMeasurem;
    }
    static {
       LogoutAnalyticsDelegate$TimeMeasurementCategory.TOTAL_LOGOUT_DURATION = new LogoutAnalyticsDelegate$TimeMeasurementCategory("TOTAL_LOGOUT_DURATION", 0, "auth.logout");
       LogoutAnalyticsDelegate$TimeMeasurementCategory.$VALUES = LogoutAnalyticsDelegate$TimeMeasurementCategory.$values();
    }
    private void LogoutAnalyticsDelegate$TimeMeasurementCategory(String p0,int p1,String p2){
       this.raw = p2;
    }
    public static LogoutAnalyticsDelegate$TimeMeasurementCategory valueOf(String p0){
       return Enum.valueOf(LogoutAnalyticsDelegate$TimeMeasurementCategory.class, p0);
    }
    public static LogoutAnalyticsDelegate$TimeMeasurementCategory[] values(){
       return LogoutAnalyticsDelegate$TimeMeasurementCategory.$VALUES.clone();
    }
    public final String getRaw(){
       return this.raw;
    }
}
