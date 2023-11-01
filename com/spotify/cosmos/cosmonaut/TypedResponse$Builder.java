package com.spotify.cosmos.cosmonaut.TypedResponse$Builder;
import java.lang.Object;
import com.spotify.cosmos.cosmonaut.TypedResponse;
import java.lang.Number;
import java.lang.String;
import java.util.Map;
import java.lang.IllegalStateException;
import p.co5;
import java.lang.Integer;

public final class TypedResponse$Builder	// class@00087f from classes.dex
{
    private Object body;
    private Map headers;
    private Integer status;
    private String uri;

    public void TypedResponse$Builder(){
       super();
    }
    public final TypedResponse$Builder body(Object p0){
       this.body = p0;
       return this;
    }
    public final TypedResponse build(){
       TypedResponse$Builder tstatus;
       TypedResponse$Builder turi;
       TypedResponse$Builder theaders;
       if ((tstatus = this.status) == null) {
          throw new IllegalStateException("status was not set!".toString());
       }
       int i = tstatus.intValue();
       if ((turi = this.uri) == null) {
          throw new IllegalStateException("uri was not set!".toString());
       }
       if ((theaders = this.headers) != null) {
          return new TypedResponse(i, turi, theaders, this.body);
       }
       throw new IllegalStateException("headers was not set!".toString());
    }
    public final TypedResponse$Builder headers(Map p0){
       co5.o(p0, "headers");
       this.headers = p0;
       return this;
    }
    public final TypedResponse$Builder status(int p0){
       this.status = Integer.valueOf(p0);
       return this;
    }
    public final TypedResponse$Builder uri(String p0){
       co5.o(p0, "uri");
       this.uri = p0;
       return this;
    }
}
