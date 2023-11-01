package p.eg7;
import p.o77;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import p.tu6;
import android.animation.TimeInterpolator;
import java.util.Iterator;
import p.g07;
import java.util.ArrayList;
import android.util.Property;
import java.lang.Float;

public final class eg7 implements o77	// class@001483 from classes.dex
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public TimeInterpolator e;
    public List f;

    public void eg7(float p0,float p1,float p2,float p3){
       super();
       this.f = Collections.emptyList();
       this.e = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final float a(float p0){
       eg7 ta = this.a;
       eg7 tb = this.b;
       p0 = ((ta - tb) < 0)? tu6.k(ta, tb, p0): tu6.k(tb, ta, p0);
       float f = tb - ta;
       float f1 = 0;
       float f2 = 0x3f800000;
       if (!(f1 - f)) {
          f = f2 / tb;
       }
       p0 = (p0 - ta) / f;
       tb = this.c;
       eg7 td = this.d;
       p0 = (p0 * td) + ((f2 - p0) * tb);
       if ((ta = this.e) != null) {
          float f3 = td - tb;
          if (!(f1 - f3)) {
             f3 = f2 / td;
          }
          p0 = (p0 - tb) / f3;
          p0 = (ta.getInterpolation(((p0 * f2) + ((f2 - p0) * f1))) - f1) / f2;
          p0 = (td * p0) + ((f2 - p0) * tb);
       }
       if (!this.f.isEmpty()) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             g07 og07 = iterator.next();
             Iterator iterator1 = og07.b.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().set(og07.a, Float.valueOf(p0));
             }
          }
       }
       return p0;
    }
}
