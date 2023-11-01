package com.spotify.connectivity.connectiontype.InternetConnectionChecker;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class InternetConnectionChecker	// class@000699 from classes.dex
{
    private final Context mContext;

    public void InternetConnectionChecker(Context p0){
       super();
       p0.getClass();
       this.mContext = p0;
    }
    public boolean isInternetConnected(){
       NetworkInfo activeNetwor;
       boolean b = ((activeNetwor = this.mContext.getSystemService("connectivity").getActiveNetworkInfo()) != null && activeNetwor.isConnectedOrConnecting())? true: false;
       return b;
    }
}
