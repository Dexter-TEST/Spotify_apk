package com.spotify.offline.NativeOfflinePluginRegistry$Entry;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class NativeOfflinePluginRegistry$Entry	// class@000ab4 from classes.dex
{
    private final byte[] serializedPluginMetadata;
    private final Transport transport;

    public void NativeOfflinePluginRegistry$Entry(byte[] p0,Transport p1){
       co5.o(p0, "serializedPluginMetadata");
       co5.o(p1, "transport");
       super();
       this.serializedPluginMetadata = p0;
       this.transport = p1;
    }
    public final byte[] getSerializedPluginMetadata(){
       return this.serializedPluginMetadata;
    }
    public final Transport getTransport(){
       return this.transport;
    }
}
