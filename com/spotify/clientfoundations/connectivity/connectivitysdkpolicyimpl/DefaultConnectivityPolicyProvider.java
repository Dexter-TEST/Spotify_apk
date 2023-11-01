package com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectivityPolicyProvider;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectivityPolicyProvider$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;

public final class DefaultConnectivityPolicyProvider	// class@000556 from classes.dex
{
    public static final DefaultConnectivityPolicyProvider$Companion Companion;

    static {
       DefaultConnectivityPolicyProvider.Companion = new DefaultConnectivityPolicyProvider$Companion(null);
    }
    public void DefaultConnectivityPolicyProvider(){
       super();
    }
    public static native final NativeConnectivityPolicyProvider create(NativeConnectivityManager p0);
}
