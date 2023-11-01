package com.spotify.connectivity.sessionstate.SessionState$Builder;
import java.lang.Object;
import com.spotify.connectivity.sessionstate.SessionState;
import java.lang.String;
import com.spotify.connectivity.sessionstate.PaymentState;

public abstract class SessionState$Builder	// class@000830 from classes.dex
{

    public void SessionState$Builder(){
       super();
    }
    public abstract SessionState build();
    public abstract SessionState$Builder canStream(boolean p0);
    public abstract SessionState$Builder connected(boolean p0);
    public abstract SessionState$Builder countryCode(String p0);
    public abstract SessionState$Builder currentAccountType(int p0);
    public abstract SessionState$Builder currentUser(String p0);
    public abstract SessionState$Builder loggedIn(boolean p0);
    public abstract SessionState$Builder loggingIn(boolean p0);
    public abstract SessionState$Builder loggingOut(boolean p0);
    public abstract SessionState$Builder paymentState(PaymentState p0);
    public abstract SessionState$Builder productType(String p0);
}
