package com.spotify.connectivity.sessionstate.SessionState;
import android.os.Parcelable;
import java.lang.Object;
import com.spotify.connectivity.sessionstate.SessionState$Builder;
import com.spotify.connectivity.sessionstate.$AutoValue_SessionState$Builder;
import java.lang.String;
import com.spotify.connectivity.sessionstate.PaymentState;
import com.spotify.connectivity.sessionstate.AutoValue_SessionState;

public abstract class SessionState implements Parcelable	// class@000832 from classes.dex
{
    public static final String PRODUCT_TYPE_FREE = "free";
    public static final String PRODUCT_TYPE_PREMIUM = "premium";

    public void SessionState(){
       super();
    }
    public static SessionState$Builder builder(){
       return new $AutoValue_SessionState$Builder().currentUser("").loggedIn(false).loggingIn(false).loggingOut(false).currentAccountType(false).countryCode("").connected(false).canStream(false).paymentState(new PaymentState(null)).productType("");
    }
    public static SessionState create(String p0,boolean p1,boolean p2,boolean p3,int p4,String p5,boolean p6,boolean p7,String p8,String p9){
       AutoValue_SessionState v11 = new AutoValue_SessionState(p0, p1, p2, p3, p4, p5, p6, p7, new PaymentState(p8), p9);
       return v11;
    }
    public abstract boolean canStream();
    public abstract boolean connected();
    public abstract String countryCode();
    public abstract int currentAccountType();
    public abstract String currentUser();
    public abstract boolean loggedIn();
    public abstract boolean loggingIn();
    public abstract boolean loggingOut();
    public abstract PaymentState paymentState();
    public abstract String productType();
    public abstract SessionState$Builder toBuilder();
}
