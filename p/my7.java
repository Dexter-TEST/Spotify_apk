package p.my7;
import p.wy7;
import p.xy7;
import java.lang.String;
import java.lang.Object;
import p.yx1;
import java.lang.Class;
import java.util.List;
import java.util.Arrays;
import p.fh5;
import java.util.Map;
import p.uy7;
import p.ty7;
import p.jd;
import java.io.File;
import p.dx7;

public final class my7 implements wy7	// class@001f30 from classes.dex
{
    public int a;
    public long b;
    public Object c;
    public final Object t;

    public void my7(xy7 p0,String p1,int p2,long p3){
       super();
       this.c = p0;
       this.t = p1;
       this.a = p2;
       this.b = p3;
    }
    public void my7(yx1 p0){
       super();
       p0.getClass();
       this.t = p0;
    }
    public final Object c(){
       uy7 ouy7;
       ty7 d;
       my7 tc = this.c;
       my7 tt = this.t;
       my7 ta = this.a;
       my7 tb = this.b;
       tc.getClass();
       int i = 1;
       String[] stringArray = new String[i];
       int i1 = 0;
       stringArray[i1] = tt;
       int i2 = 5;
       if ((ouy7 = tc.c(new fh5(tc, i2, Arrays.asList(stringArray))).get(tt)) != null) {
          i2 = ((d = ouy7.c.d) != i2 && (d != 6 && d != 4))? 0: 1;
          if (!i2) {
          label_0050 :
             xy7 a = tc.a;
             if (a.c(ta, tb, tt).exists()) {
                dx7.g(a.c(ta, tb, tt));
             }
             ouy7.c.d = 4;
             return null;
          }
       }
       Object[] objArray = new Object[i];
       objArray[i1] = tt;
       Object[] objArray1 = new Object[i1];
       xy7.f.c(String.format("Could not find pack %s while trying to complete it", objArray), objArray1);
       goto label_0050 ;
    }
}
