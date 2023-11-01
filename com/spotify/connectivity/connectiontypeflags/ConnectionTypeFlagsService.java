package com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsService;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsApi;
import p.tb6;
import p.lc;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesWriter;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class ConnectionTypeFlagsService implements ConnectionTypeFlagsApi, tb6	// class@0006b5 from classes.dex
{
    private final ConnectionTypePropertiesWriter flags;
    private final lc props;

    public void ConnectionTypeFlagsService(lc p0,ConnectionTypePropertiesWriter p1){
       co5.o(p0, "props");
       co5.o(p1, "flags");
       super();
       this.props = p0;
       this.flags = p1;
       p0.b();
       p1.storeNetCapabilitiesValidatedDisabled(p0.b());
       p1.storeShouldUseSingleThread(p0.a());
    }
    public ConnectionTypeFlagsApi getApi(){
       return this;
    }
    public Object getApi(){
       return this.getApi();
    }
    public final ConnectionTypePropertiesWriter getFlags(){
       return this.flags;
    }
    public final lc getProps(){
       return this.props;
    }
    public void shutdown(){
    }
}
