package p.ff1;
import java.lang.String;
import p.pv1;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.lang.StringBuilder;

public final class ff1	// class@0015b5 from classes.dex
{
    public final String a;
    public final long b;
    public final long c;
    public final pv1 d;

    public void ff1(String p0,long p1,long p2,pv1 p3){
       co5.o(p0, "eventName");
       co5.o(p3, "state");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       ff1 uoff1 = ff1.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(uoff1, class)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type com.spotify.eventsender.droppedevents.DroppedEventsEntity");
          if (this.d != p0.d) {
             return false;
          }else if(!co5.c(this.a, p0.a)){
             return false;
          }else if(this.b - p0.b){
             return false;
          }else if(this.c - p0.c){
             return false;
          }else {
             return true;
          }
       }
    }
    public final int hashCode(){
       return (this.d.hashCode() + (((((this.a.hashCode() * 31) + (int)this.b) * 31) + (int)this.c) * 31));
    }
    public final String toString(){
       return "DroppedEventsEntity\(eventName="+this.a+", count="+this.b+", unreportedCount="+this.c+", state="+this.d+')';
    }
}
