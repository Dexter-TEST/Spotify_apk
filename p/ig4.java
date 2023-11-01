package p.ig4;
import java.lang.Iterable;
import p.ch3;
import p.gg4;
import p.dh4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.jo6;
import p.ko6;
import p.ry7;
import java.util.Iterator;
import p.la6;
import p.pa6;
import java.util.ArrayList;
import p.oa6;
import p.ko1;
import p.fg4;
import p.hg4;
import java.lang.Comparable;
import p.dj0;
import p.uk;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import p.io2;
import android.content.res.TypedArray;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import p.av6;

public final class ig4 extends gg4 implements Iterable, ch3	// class@00198b from classes.dex
{
    public final jo6 B;
    public int C;
    public String D;
    public String E;
    public static final int F;

    public void ig4(dh4 p0){
       co5.o(p0, "navGraphNavigator");
       super(p0);
       this.B = new jo6();
    }
    public final boolean equals(Object p0){
       boolean b;
       if (p0 != null && p0 instanceof ig4) {
          ig4 tB = this.B;
          ArrayList uArrayList = oa6.H(pa6.F(ry7.V(tB)));
          ig4 oig4 = p0;
          ig4 b1 = oig4.B;
          ko6 oko6 = ry7.V(b1);
          while (oko6.hasNext()) {
             uArrayList.remove(oko6.next());
          }
          if (super.equals(p0) && (tB.g() == b1.g() && (this.C == oig4.C && uArrayList.isEmpty()))) {
             b = true;
          label_004d :
             return b;
          }
       }
       b = false;
       goto label_004d ;
    }
    public final fg4 g(ko1 p0){
       fg4 uofg41;
       fg4 uofg4 = super.g(p0);
       ArrayList uArrayList = new ArrayList();
       hg4 ohg4 = new hg4(this);
       while (ohg4.hasNext()) {
          if ((uofg41 = ohg4.next().g(p0)) != null) {
             uArrayList.add(uofg41);
          }
       }
       fg4[] uofg4Array = new fg4[]{uofg4,dj0.t0(uArrayList)};
       return dj0.t0(uk.n0(uofg4Array));
    }
    public final int hashCode(){
       ig4 tC = this.C;
       ig4 tB = this.B;
       int i = tB.g();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          if (tB.a != null) {
             tB.d();
          }
          int i2 = tC * 31;
          i2 = i2 + tB.b[i1];
          i2 = i2 * 31;
          i2 = i2 + tB.h(i1).hashCode();
       }
       return tC;
    }
    public final Iterator iterator(){
       return new hg4(this);
    }
    public final void k(Context p0,AttributeSet p1){
       int resourceId;
       String str;
       co5.o(p0, "context");
       super.k(p0, p1);
       TypedArray typedArray = p0.getResources().obtainAttributes(p1, io2.C);
       co5.l(typedArray, "context.resources.obtain…vGraphNavigator\n        \)");
       int i = 0;
       int i1 = ((resourceId = typedArray.getResourceId(i, i)) != this.y)? 1: 0;
       if (i1) {
          if (this.E != null) {
             this.C = i;
             this.E = null;
          }
          this.C = resourceId;
          this.D = null;
          if (resourceId <= 0xffffff) {
             str = String.valueOf(resourceId);
          }else {
             try{
                str = p0.getResources().getResourceName(resourceId);
             }catch(android.content.res.Resources$NotFoundException e0){
                str = String.valueOf(resourceId);
             }
             co5.l(str, "try {\n                co….toString\(\)\n            }");
          }
          this.D = str;
          typedArray.recycle();
          return;
       }else {
          throw new IllegalArgumentException("Start destination "+resourceId+" cannot use the same id as the graph "+this.toString());
       }
    }
    public final void l(gg4 p0){
       int i1;
       ig4 tB;
       co5.o(p0, "node");
       gg4 y = p0.y;
       gg4 z = p0.z;
       int i = 0;
       gg4 tz = (y == null && z == null)? 0: 1;
       if (i1) {
          tz = this.z;
          String str = "Destination ";
          if (tz != null && !((co5.c(z, tz) ^ 1))) {
             throw new IllegalArgumentException(str+p0+" cannot have the same route as graph "+this.toString());
          }else if(y != this.y){
             z = 1;
          }else {
             tB = 0;
          }
          if (z) {
             tB = this.B;
             if ((y = tB.e(y, null)) == p0) {
                return;
             }else if(p0.b == null){
                i = 1;
             }
             if (i) {
                if (y != null) {
                   y.b = null;
                }
                p0.b = this;
                tB.f(p0.y, p0);
                return;
             }else {
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove\(\) to remove the previous parent.".toString());
             }
          }else {
             throw new IllegalArgumentException(str+p0+" cannot have the same id as graph "+this.toString());
          }
       }else {
          throw new IllegalArgumentException("Destinations must have an id or route. Call setId\(\), setRoute\(\), or include an android:id or app:route in your navigation XML.".toString());
       }
    }
    public final gg4 m(int p0,boolean p1){
       gg4 ogg4;
       gg4 tb;
       Integer integer = null;
       if ((ogg4 = this.B.e(p0, integer)) == null) {
          if (p1 && (tb = this.b) != null) {
             integer = tb.m(p0, true);
          }
       }else {
          integer = ogg4;
       }
       return integer;
    }
    public final gg4 n(String p0,boolean p1){
       gg4 ogg4;
       gg4 tb;
       co5.o(p0, "route");
       Integer integer = null;
       if ((ogg4 = this.B.e("android-app://androidx.navigation/".concat(p0).hashCode(), integer)) == null) {
          if (p1 && (tb = this.b) != null) {
             ogg4 = (av6.p0(p0))? 1: 0;
             if (!ogg4) {
                integer = tb.n(p0, true);
             }
          }
       }else {
          integer = ogg4;
       }
       return integer;
    }
    public final String toString(){
       StringBuilder str = super.toString();
       ig4 tE = this.E;
       boolean b = true;
       int i = (tE != null && !av6.p0(tE))? 0: 1;
       gg4 ogg4 = (!i)? this.n(tE, b): null;
       if (ogg4 == null) {
          ogg4 = this.m(this.C, b);
       }
       str = str+" startDestination=";
       if (ogg4 == null) {
          if ((tE = this.E) != null) {
             str = str+tE;
          }else if((tE = this.D) != null){
             str = str+tE;
          }else {
             str = str+"0x"+Integer.toHexString(this.C);
          }
       }else {
          str = str+"{"+ogg4.toString()+"}";
       }
       str = str;
       co5.l(str, "sb.toString\(\)");
       return str;
    }
}
