package com.spotify.remoteconfig.NativeRemoteConfigImpl;
import com.spotify.remoteconfig.NativeRemoteConfig;
import p.ef4;
import java.lang.Object;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.jt5;
import p.it5;

public final class NativeRemoteConfigImpl implements NativeRemoteConfig	// class@000bf2 from classes.dex
{
    private long nThis;
    private it5 resolveClient;
    public static final ef4 Companion;

    static {
       NativeRemoteConfigImpl.Companion = new ef4();
    }
    private void NativeRemoteConfigImpl(){
       super();
    }
    public static final NativeRemoteConfigImpl access$createInternal(Transport p0){
       return NativeRemoteConfigImpl.createInternal(p0);
    }
    public static final void access$initialize(NativeRemoteConfigImpl p0){
       p0.initialize();
    }
    public static final NativeRemoteConfigImpl create(Transport p0){
       NativeRemoteConfigImpl.Companion.getClass();
       co5.o(p0, "service");
       NativeRemoteConfigImpl nativeRemote = NativeRemoteConfigImpl.access$createInternal(p0);
       NativeRemoteConfigImpl.access$initialize(nativeRemote);
       return nativeRemote;
    }
    private static native final NativeRemoteConfigImpl createInternal(Transport p0);
    private native final Transport getTransportToNative();
    private final void initialize(){
       Transport transportToN = this.getTransportToNative();
       co5.o(transportToN, "transport");
       this.resolveClient = new jt5(transportToN);
    }
    public native void destroy();
    public long getNThis(){
       return this.nThis;
    }
    public final it5 getResolveClient(){
       NativeRemoteConfigImpl tresolveClie;
       if ((tresolveClie = this.resolveClient) != null) {
          return tresolveClie;
       }
       co5.N("resolveClient");
       throw null;
    }
}
