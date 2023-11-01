package com.spotify.connectivity.connectiontype.AutoValue_InternetState;
import com.spotify.connectivity.connectiontype.InternetState;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectiontype.AutoValue_InternetState$1;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.InternetState$Builder;
import com.spotify.connectivity.connectiontype.AutoValue_InternetState$Builder;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

final class AutoValue_InternetState extends InternetState	// class@00068a from classes.dex
{
    private final ConnectionType connectionType;
    private final boolean flightModeEnabled;
    private final boolean mobileDataDisabled;

    private void AutoValue_InternetState(ConnectionType p0,boolean p1,boolean p2){
       super();
       this.connectionType = p0;
       this.flightModeEnabled = p1;
       this.mobileDataDisabled = p2;
    }
    public void AutoValue_InternetState(ConnectionType p0,boolean p1,boolean p2,AutoValue_InternetState$1 p3){
       super(p0, p1, p2);
    }
    public ConnectionType connectionType(){
       return this.connectionType;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof InternetState) {
          return false;
       }
       if (!this.connectionType.equals(p0.connectionType()) || (this.flightModeEnabled != p0.flightModeEnabled() || this.mobileDataDisabled != p0.mobileDataDisabled())) {
          b = false;
       }
       return b;
    }
    public boolean flightModeEnabled(){
       return this.flightModeEnabled;
    }
    public int hashCode(){
       int i = 0xf4243;
       int i1 = (this.connectionType.hashCode() ^ i) * i;
       int i2 = 1231;
       int i3 = (this.flightModeEnabled != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.mobileDataDisabled == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public boolean mobileDataDisabled(){
       return this.mobileDataDisabled;
    }
    public InternetState$Builder toBuilder(){
       return new AutoValue_InternetState$Builder(this, null);
    }
    public String toString(){
       return en6.q("InternetState{connectionType="+this.connectionType+", flightModeEnabled="+this.flightModeEnabled+", mobileDataDisabled=", this.mobileDataDisabled, "}");
    }
}
