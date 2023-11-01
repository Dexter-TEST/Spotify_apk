package com.spotify.offline_esperanto.proto.a;
import p.u74;
import com.google.protobuf.b;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import com.google.protobuf.c;
import java.lang.String;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;

public final class a extends b implements u74	// class@000ac3 from classes.dex
{

    public void a(){
       super(EsOffline$GetContextsRequest.g());
    }
    public final void c(String p0){
       this.copyOnWrite();
       EsOffline$GetContextsRequest.e(this.instance, p0);
    }
    public final void d(EsOffline$ContextInfoPolicy p0){
       this.copyOnWrite();
       EsOffline$GetContextsRequest.f(this.instance, p0);
    }
}
