package com.spotify.connectivity.platformconnectiontype.NetworkCallbackEventToConnectionTypeTransformer$apply$1;
import p.yf2;
import com.spotify.connectivity.platformconnectiontype.NetworkCallbackEventToConnectionTypeTransformer;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.NetworkCallbackEvent;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.String;
import p.co5;

final class NetworkCallbackEventToConnectionTypeTransformer$apply$1 implements yf2	// class@000799 from classes.dex
{
    final NetworkCallbackEventToConnectionTypeTransformer $tmp0;

    public void NetworkCallbackEventToConnectionTypeTransformer$apply$1(NetworkCallbackEventToConnectionTypeTransformer p0){
       this.$tmp0 = p0;
       super();
    }
    public final ConnectionType apply(NetworkCallbackEvent p0){
       co5.o(p0, "p0");
       return NetworkCallbackEventToConnectionTypeTransformer.access$toConnectionType(this.$tmp0, p0);
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
