package com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import java.lang.String;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class ApplicationScopeConfiguration	// class@000561 from classes.dex
{
    private String cachePath;
    private boolean enablePerformanceTracing;
    private String performanceTracingLogsPath;
    private String settingsPath;

    public void ApplicationScopeConfiguration(){
       super(null, null, false, null, 15, null);
    }
    public void ApplicationScopeConfiguration(String p0,String p1,boolean p2,String p3){
       super();
       this.cachePath = p0;
       this.settingsPath = p1;
       this.enablePerformanceTracing = p2;
       this.performanceTracingLogsPath = p3;
    }
    public void ApplicationScopeConfiguration(String p0,String p1,boolean p2,String p3,int p4,DefaultConstructorMarker p5){
       if ((p4 & 0x01)) {
          p0 = null;
       }
       if ((p4 & 0x02)) {
          p1 = null;
       }
       if ((p4 & 0x04)) {
          p2 = false;
       }
       if ((p4 & 0x08)) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static ApplicationScopeConfiguration copy$default(ApplicationScopeConfiguration p0,String p1,String p2,boolean p3,String p4,int p5,Object p6){
       ApplicationScopeConfiguration cachePath;
       ApplicationScopeConfiguration settingsPath;
       ApplicationScopeConfiguration enablePerfor;
       ApplicationScopeConfiguration performanceT;
       if ((p5 & 0x01)) {
          cachePath = p0.cachePath;
       }
       if ((p5 & 0x02)) {
          settingsPath = p0.settingsPath;
       }
       if ((p5 & 0x04)) {
          enablePerfor = p0.enablePerformanceTracing;
       }
       if ((p5 & 0x08)) {
          performanceT = p0.performanceTracingLogsPath;
       }
       return p0.copy(cachePath, settingsPath, enablePerfor, performanceT);
    }
    public final String component1(){
       return this.cachePath;
    }
    public final String component2(){
       return this.settingsPath;
    }
    public final boolean component3(){
       return this.enablePerformanceTracing;
    }
    public final String component4(){
       return this.performanceTracingLogsPath;
    }
    public final ApplicationScopeConfiguration copy(String p0,String p1,boolean p2,String p3){
       return new ApplicationScopeConfiguration(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ApplicationScopeConfiguration) {
          return false;
       }
       if (!co5.c(this.cachePath, p0.cachePath)) {
          return false;
       }
       if (!co5.c(this.settingsPath, p0.settingsPath)) {
          return false;
       }
       if (this.enablePerformanceTracing != p0.enablePerformanceTracing) {
          return false;
       }
       if (!co5.c(this.performanceTracingLogsPath, p0.performanceTracingLogsPath)) {
          return false;
       }
       return true;
    }
    public final String getCachePath(){
       return this.cachePath;
    }
    public final boolean getEnablePerformanceTracing(){
       return this.enablePerformanceTracing;
    }
    public final String getPerformanceTracingLogsPath(){
       return this.performanceTracingLogsPath;
    }
    public final String getSettingsPath(){
       return this.settingsPath;
    }
    public int hashCode(){
       ApplicationScopeConfiguration tsettingsPat;
       ApplicationScopeConfiguration tcachePath = this.cachePath;
       int i = 0;
       int i1 = (tcachePath == null)? 0: tcachePath.hashCode();
       i1 = i1 * 31;
       int i2 = ((tsettingsPat = this.settingsPath) == null)? 0: tsettingsPat.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tsettingsPat = this.enablePerformanceTracing) != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       if ((tsettingsPat = this.performanceTracingLogsPath) != null) {
          i = tsettingsPat.hashCode();
       }
       return (i1 + i);
    }
    public final void setCachePath(String p0){
       this.cachePath = p0;
    }
    public final void setEnablePerformanceTracing(boolean p0){
       this.enablePerformanceTracing = p0;
    }
    public final void setPerformanceTracingLogsPath(String p0){
       this.performanceTracingLogsPath = p0;
    }
    public final void setSettingsPath(String p0){
       this.settingsPath = p0;
    }
    public String toString(){
       return hr7.a("ApplicationScopeConfiguration\(cachePath="+this.cachePath+", settingsPath="+this.settingsPath+", enablePerformanceTracing="+this.enablePerformanceTracing+", performanceTracingLogsPath=", this.performanceTracingLogsPath, ')');
    }
}
