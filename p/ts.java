package p.ts;
import p.e01;
import android.content.Context;
import p.ah0;
import java.lang.String;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class ts extends e01	// class@0027d6 from classes.dex
{
    public final Context a;
    public final ah0 b;
    public final ah0 c;
    public final String d;

    public void ts(Context p0,ah0 p1,ah0 p2,String p3){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null applicationContext");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null wallClock");
       }
       this.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null monotonicClock");
       }
       this.c = p2;
       if (p3 == null) {
          throw new NullPointerException("Null backendName");
       }
       this.d = p3;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof e01) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return en6.p("CreationContext{applicationContext="+this.a+", wallClock="+this.b+", monotonicClock="+this.c+", backendName=", this.d, "}");
    }
}
