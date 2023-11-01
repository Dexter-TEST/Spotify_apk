package com.spotify.cosmos.cosmonaut.TypedResponse;
import com.spotify.cosmos.cosmonaut.TypedResponse$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import p.co5;
import com.spotify.cosmos.cosmonaut.TypedResponse$Builder;
import p.tp2;
import java.lang.StringBuilder;

public final class TypedResponse	// class@000881 from classes.dex
{
    private final Object body;
    private final Map headers;
    private final int status;
    private final String uri;
    public static final TypedResponse$Companion Companion;

    static {
       TypedResponse.Companion = new TypedResponse$Companion(null);
    }
    public void TypedResponse(int p0,String p1,Map p2,Object p3){
       co5.o(p1, "uri");
       co5.o(p2, "headers");
       super();
       this.status = p0;
       this.uri = p1;
       this.headers = p2;
       this.body = p3;
    }
    public static final TypedResponse$Builder builder(){
       return TypedResponse.Companion.builder();
    }
    public static TypedResponse copy$default(TypedResponse p0,int p1,String p2,Map p3,Object p4,int p5,Object p6){
       TypedResponse status;
       TypedResponse uri;
       TypedResponse headers;
       if ((p5 & 0x01)) {
          status = p0.status;
       }
       if ((p5 & 0x02)) {
          uri = p0.uri;
       }
       if ((p5 & 0x04)) {
          headers = p0.headers;
       }
       if ((p5 & 0x08)) {
          p4 = p0.body;
       }
       return p0.copy(status, uri, headers, p4);
    }
    public final int component1(){
       return this.status;
    }
    public final String component2(){
       return this.uri;
    }
    public final Map component3(){
       return this.headers;
    }
    public final Object component4(){
       return this.body;
    }
    public final TypedResponse copy(int p0,String p1,Map p2,Object p3){
       co5.o(p1, "uri");
       co5.o(p2, "headers");
       return new TypedResponse(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TypedResponse) {
          return false;
       }
       if (this.status != p0.status) {
          return false;
       }
       if (!co5.c(this.uri, p0.uri)) {
          return false;
       }
       if (!co5.c(this.headers, p0.headers)) {
          return false;
       }
       if (!co5.c(this.body, p0.body)) {
          return false;
       }
       return true;
    }
    public final Object getBody(){
       return this.body;
    }
    public final Map getHeaders(){
       return this.headers;
    }
    public final int getStatus(){
       return this.status;
    }
    public final String getUri(){
       return this.uri;
    }
    public int hashCode(){
       TypedResponse tbody;
       int i = (this.headers.hashCode() + tp2.g(this.uri, (this.status * 31), 31)) * 31;
       int i1 = ((tbody = this.body) == null)? 0: tbody.hashCode();
       return (i + i1);
    }
    public final TypedResponse$Builder toBuilder(){
       return new TypedResponse$Builder().status(this.status).uri(this.uri).headers(this.headers).body(this.body);
    }
    public String toString(){
       return "TypedResponse\(status="+this.status+", uri="+this.uri+", headers="+this.headers+", body="+this.body+')';
    }
}
