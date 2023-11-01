package p.tv1;
import java.lang.Object;
import p.pv1;
import p.ef1;
import java.lang.Class;
import p.co5;
import java.lang.String;
import java.util.Arrays;

public final class tv1	// class@0027ea from classes.dex
{
    public final ef1[] a;

    public void tv1(){
       super();
       int t = pv1.t;
       ef1[] uoef1Array = new ef1[t];
       for (int i = 0; i < t; i = i + 1) {
          uoef1Array[i] = new ef1(0, 0);
       }
       this.a = uoef1Array;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       tv1 otv1 = tv1.class;
       Class class = (p0 != null)? p0.getClass(): null;
       if (!co5.c(otv1, class)) {
          return false;
       }else {
          co5.j(p0, "null cannot be cast to non-null type com.spotify.eventsender.droppedevents.EventStatesCounter");
          if (!Arrays.equals(this.a, p0.a)) {
             return false;
          }else {
             return true;
          }
       }
    }
    public final int hashCode(){
       return Arrays.hashCode(this.a);
    }
}
