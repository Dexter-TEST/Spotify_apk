package com.spotify.connectivity.pubsub.PushedMessageSource;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import p.co5;

public final class PushedMessageSource	// class@00080d from classes.dex
{
    private final Map attributes;
    private final String ident;
    private final List payload;

    public void PushedMessageSource(String p0,List p1,Map p2){
       co5.o(p0, "ident");
       co5.o(p1, "payload");
       co5.o(p2, "attributes");
       super();
       this.ident = p0;
       this.payload = p1;
       this.attributes = p2;
    }
    public final Map getAttributes(){
       return this.attributes;
    }
    public final String getIdent(){
       return this.ident;
    }
    public final List getPayload(){
       return this.payload;
    }
}
