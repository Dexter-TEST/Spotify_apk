package com.spotify.clientfoundations.connectivity.connectivitysdkcredentialsstorage.PrefsCredentialsStorage;
import com.spotify.clientfoundations.connectivity.connectivitysdkcredentialsstorage.PrefsCredentialsStorage$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.prefs.prefs.Prefs;
import java.lang.String;
import com.spotify.connectivity.auth.NativeCredentialsStorage;

public final class PrefsCredentialsStorage	// class@000551 from classes.dex
{
    public static final PrefsCredentialsStorage$Companion Companion;

    static {
       PrefsCredentialsStorage.Companion = new PrefsCredentialsStorage$Companion(null);
    }
    public void PrefsCredentialsStorage(){
       super();
    }
    public static native final NativeCredentialsStorage create(Prefs p0,String p1);
}
