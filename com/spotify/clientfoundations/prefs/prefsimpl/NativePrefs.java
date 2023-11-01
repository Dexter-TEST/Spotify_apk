package com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.clientfoundations.prefs.prefs.Prefs;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;

public final class NativePrefs implements Prefs	// class@000594 from classes.dex
{
    private long nThis;
    public static final NativePrefs$Companion Companion;

    static {
       NativePrefs.Companion = new NativePrefs$Companion(null);
    }
    private void NativePrefs(){
       super();
    }
    public static native final NativePrefs create();
    public native final void destroy();
}
