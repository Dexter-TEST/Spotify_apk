package com.spotify.connectivity.connectivityapi.StoredCredentials$Authenticated;
import com.spotify.connectivity.connectivityapi.StoredCredentials;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class StoredCredentials$Authenticated extends StoredCredentials	// class@0006c6 from classes.dex
{
    private final String canonicalUsername;

    public void StoredCredentials$Authenticated(String p0){
       co5.o(p0, "canonicalUsername");
       super(null);
       this.canonicalUsername = p0;
    }
    public final String getCanonicalUsername(){
       return this.canonicalUsername;
    }
}
