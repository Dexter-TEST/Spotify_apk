package com.spotify.connectivity.authtoken.RxWebToken;
import android.net.Uri;
import io.reactivex.rxjava3.core.Observable;

public interface abstract RxWebToken	// class@000678 from classes.dex
{

    Observable loadToken(Uri p0);
}
