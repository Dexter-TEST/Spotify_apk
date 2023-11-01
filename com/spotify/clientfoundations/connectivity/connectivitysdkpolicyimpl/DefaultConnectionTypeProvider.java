package com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectionTypeProvider;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectionTypeProvider$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.NativeConnectionTypeProvider;

public final class DefaultConnectionTypeProvider	// class@000554 from classes.dex
{
    public static final DefaultConnectionTypeProvider$Companion Companion;

    static {
       DefaultConnectionTypeProvider.Companion = new DefaultConnectionTypeProvider$Companion(null);
    }
    public void DefaultConnectionTypeProvider(){
       super();
    }
    public static native final NativeConnectionTypeProvider create(NativeConnectivityManager p0);
}
