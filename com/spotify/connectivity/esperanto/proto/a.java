package com.spotify.connectivity.esperanto.proto.a;
import p.yf2;
import java.lang.Object;
import com.spotify.connectivity.esperanto.proto.PutRulesResponse;
import com.spotify.connectivity.esperanto.proto.ConnectivityPolicyClientImpl;
import com.spotify.connectivity.esperanto.proto.ConnectivityPolicyService;

public final class a implements yf2	// class@000703 from classes.dex
{
    public final int a;

    public void a(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
           default:
             return ConnectivityPolicyService.a(p0);
       }
       return ConnectivityPolicyClientImpl.a(p0);
    }
}
