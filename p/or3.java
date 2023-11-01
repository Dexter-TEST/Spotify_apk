package p.or3;
import p.kr3;
import p.rr3;
import java.util.EnumSet;
import java.lang.Object;
import p.nr3;
import p.wr3;
import java.util.AbstractCollection;
import p.zr3;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import java.lang.StringBuilder;

public final class or3 implements kr3	// class@002175 from classes.dex
{
    public final rr3 a;
    public final zr3 b;
    public final zr3 c;
    public final zr3 d;
    public final zr3 e;
    public final zr3 f;
    public final zr3 g;

    public void or3(rr3 p0,EnumSet p1){
       super();
       nr3 onr3 = new nr3(this, 0);
       nr3 onr31 = new nr3(this, 1);
       onr31 = new nr3(this, 2);
       nr3 onr32 = new nr3(this, 3);
       nr3 onr33 = new nr3(this, 4);
       nr3 onr34 = new nr3(this, 5);
       nr3 onr35 = new nr3(this, 6);
       this.a = p0;
       p1.contains(wr3.a);
       fv1 n = zr3.n;
       if (p1.contains(wr3.b)) {
       }else {
          onr3 = n;
       }
       this.b = onr3;
       if (!p1.contains(wr3.c)) {
          fv1 uofv1 = n;
       }
       this.c = onr31;
       if (!p1.contains(wr3.t)) {
          onr32 = n;
       }
       this.d = onr32;
       if (!p1.contains(wr3.v)) {
          onr33 = n;
       }
       this.e = onr33;
       if (!p1.contains(wr3.w)) {
          onr34 = n;
       }
       this.f = onr34;
       if (!p1.contains(wr3.x)) {
          onr35 = n;
       }
       this.g = onr35;
       return;
    }
    public static String g(String p0,String p1){
       return new StringBuilder((Logger.h(p1) + (Logger.h(p0) + 3)))+'['+p0+"] "+p1;
    }
    public final zr3 a(){
       return this.e;
    }
    public final zr3 b(){
       return this.c;
    }
    public final zr3 c(){
       return this.d;
    }
    public final zr3 d(){
       return this.f;
    }
    public final zr3 e(){
       return this.g;
    }
    public final zr3 f(){
       return this.b;
    }
}
