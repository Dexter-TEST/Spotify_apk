package p.a47;
import java.util.UUID;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import p.c47;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class a47	// class@000f12 from classes.dex
{
    public final UUID a;
    public final String b;
    public final Map c;
    public final Map d;
    public final Set e;
    public final String f;
    public final UUID g;
    public final Long h;
    public final c47 i;

    public void a47(UUID p0,String p1,ConcurrentHashMap p2,ConcurrentHashMap p3,Set p4,String p5,c47 p6){
       co5.o(p0, "measurementId");
       co5.o(p1, "category");
       co5.o(p2, "metadata");
       co5.o(p3, "dimensions");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = null;
       this.h = null;
       this.i = p6;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof a47) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (!co5.c(this.f, p0.f)) {
          return false;
       }
       if (!co5.c(this.g, p0.g)) {
          return false;
       }
       if (!co5.c(this.h, p0.h)) {
          return false;
       }
       if (!co5.c(this.i, p0.i)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       a47 tf;
       int i = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + tp2.g(this.b, (this.a.hashCode() * 31), 31)) * 31)) * 31)) * 31;
       int i1 = 0;
       int i2 = ((tf = this.f) == null)? 0: tf.hashCode();
       i = (i + i2) * 31;
       i2 = ((tf = this.g) == null)? 0: tf.hashCode();
       i = (i + i2) * 31;
       i2 = ((tf = this.h) == null)? 0: tf.hashCode();
       i = (i + i2) * 31;
       if ((tf = this.i) != null) {
          i1 = tf.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return "TimeMeasurement\(measurementId="+this.a+", category="+this.b+", metadata="+this.c+", dimensions="+this.d+", points="+this.e+", featureId="+this.f+", parentMeasurementId="+this.g+", parentEpochOffset="+this.h+", error="+this.i+')';
    }
}
