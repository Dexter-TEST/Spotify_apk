package com.spotify.connectivity.sessionstate.SessionHelper;
import java.lang.Object;
import com.spotify.connectivity.sessionstate.SessionState;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class SessionHelper	// class@00082f from classes.dex
{

    private void SessionHelper(){
       super();
    }
    public static boolean isReady(SessionState p0){
       boolean b = (p0.loggedIn() && (!TextUtils.isEmpty(p0.currentUser()) && (!TextUtils.isEmpty(p0.countryCode()) && !TextUtils.isEmpty(p0.productType()))))? true: false;
       return b;
    }
}
