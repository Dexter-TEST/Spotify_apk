package p.vv1;
import java.lang.String;
import java.lang.Long;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;
import p.tp2;
import java.lang.StringBuilder;

public final class vv1	// class@002a6f from classes.dex
{
    public final String a;
    public final String b;
    public final byte[] c;
    public final String d;
    public final Long e;
    public final long f;
    public final long g;

    public void vv1(String p0,String p1,byte[] p2,String p3,Long p4,long p5,long p6){
       co5.o(p0, "eventId");
       co5.o(p1, "eventName");
       co5.o(p2, "sequenceId");
       co5.o(p3, "sequenceStr");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       vv1 ovv1 = vv1.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(ovv1, class)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type com.spotify.eventsender.eventsender.dao.EventStatsData");
          if (!co5.c(this.a, p0.a)) {
             return false;
          }else if(!co5.c(this.b, p0.b)){
             return false;
          }else if(!Arrays.equals(this.c, p0.c)){
             return false;
          }else if(!co5.c(this.d, p0.d)){
             return false;
          }else if(!co5.c(this.e, p0.e)){
             return false;
          }else if(this.f - p0.f){
             return false;
          }else if(this.g - p0.g){
             return false;
          }else {
             return true;
          }
       }
    }
    public final int hashCode(){
       vv1 te;
       int i = 31;
       int i1 = tp2.g(this.d, ((Arrays.hashCode(this.c) + tp2.g(this.a, (this.b.hashCode() * 31), i)) * 31), i);
       int i2 = ((te = this.e) != null)? te.hashCode(): 0;
       te = this.f;
       te = this.g;
       return (((((i1 + i2) * 31) + (int)(te ^ (te >> 32))) * 31) + (int)(te ^ (te >> 32)));
    }
    public final String toString(){
       return tp2.o("EventStatsData\(eventId="+this.a+", eventName="+this.b+", sequenceId="+Arrays.toString(this.c)+", sequenceStr="+this.d+", sequenceNumberMin="+this.e+", sequenceNumberNext="+this.f+", storageSize=", this.g, ')');
    }
}
