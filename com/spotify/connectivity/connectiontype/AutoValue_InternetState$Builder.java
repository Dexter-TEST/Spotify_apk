package com.spotify.connectivity.connectiontype.AutoValue_InternetState$Builder;
import com.spotify.connectivity.connectiontype.InternetState$Builder;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.InternetState;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Boolean;
import com.spotify.connectivity.connectiontype.AutoValue_InternetState$1;
import java.lang.String;
import p.kg4;
import com.spotify.connectivity.connectiontype.AutoValue_InternetState;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;

final class AutoValue_InternetState$Builder implements InternetState$Builder	// class@000689 from classes.dex
{
    private ConnectionType connectionType;
    private Boolean flightModeEnabled;
    private Boolean mobileDataDisabled;

    public void AutoValue_InternetState$Builder(){
       super();
    }
    private void AutoValue_InternetState$Builder(InternetState p0){
       super();
       this.connectionType = p0.connectionType();
       this.flightModeEnabled = Boolean.valueOf(p0.flightModeEnabled());
       this.mobileDataDisabled = Boolean.valueOf(p0.mobileDataDisabled());
    }
    public void AutoValue_InternetState$Builder(InternetState p0,AutoValue_InternetState$1 p1){
       super(p0);
    }
    public InternetState build(){
       String str = (this.connectionType == null)? " connectionType": "";
       if (this.flightModeEnabled == null) {
          str = kg4.l(str, " flightModeEnabled");
       }
       if (this.mobileDataDisabled == null) {
          str = kg4.l(str, " mobileDataDisabled");
       }
       if (str.isEmpty()) {
          return new AutoValue_InternetState(this.connectionType, this.flightModeEnabled.booleanValue(), this.mobileDataDisabled.booleanValue(), null);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public InternetState$Builder connectionType(ConnectionType p0){
       if (p0 == null) {
          throw new NullPointerException("Null connectionType");
       }
       this.connectionType = p0;
       return this;
    }
    public InternetState$Builder flightModeEnabled(boolean p0){
       this.flightModeEnabled = Boolean.valueOf(p0);
       return this;
    }
    public InternetState$Builder mobileDataDisabled(boolean p0){
       this.mobileDataDisabled = Boolean.valueOf(p0);
       return this;
    }
}
