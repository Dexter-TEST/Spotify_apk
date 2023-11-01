package p.ey1;
import java.lang.String;
import java.lang.Object;
import java.util.WeakHashMap;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;

public final class ey1	// class@00151e from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public Integer d;
    public final boolean e;
    public final WeakHashMap f;

    public void ey1(String p0){
       super(null, p0);
       this.e = true;
    }
    public void ey1(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = null;
       this.d = null;
       this.f = new WeakHashMap(1);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ey1) {
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
       return true;
    }
    public final int hashCode(){
       ey1 ta;
       ey1 tc;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = tp2.g(this.b, (i1 * 31), 31);
       int i2 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 + i2) * 31;
       if ((tc = this.d) != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "Face\(faceImageUri="+this.a+", username="+this.b+", displayName="+this.c+", customBackgroundColor="+this.d+')';
    }
}
