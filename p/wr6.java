package p.wr6;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import android.text.TextPaint;
import java.lang.Object;
import android.text.Layout$Alignment;
import android.text.StaticLayout;
import java.lang.Math;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.text.StaticLayout$Builder;
import p.eh;
import p.jx1;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import p.vr6;
import java.lang.Exception;

public final class wr6	// class@002b92 from classes.dex
{
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout$Alignment e;
    public int f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public boolean k;
    public TextUtils$TruncateAt l;
    public static final int m;
    public static boolean n;
    public static Constructor o;
    public static TextDirectionHeuristic p;

    static {
       int i = (Build$VERSION.SDK_INT >= 23)? 1: 0;
       wr6.m = i;
    }
    public void wr6(CharSequence p0,TextPaint p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p0.length();
       this.e = Layout$Alignment.ALIGN_NORMAL;
       this.f = Integer.MAX_VALUE;
       this.g = 0;
       this.h = 0x3f800000;
       this.i = wr6.m;
       this.j = true;
       this.l = null;
    }
    public final StaticLayout a(){
       TextDirectionHeuristic rTL;
       wr6 l;
       Constructor o;
       wr6 owr6 = this;
       if (owr6.a == null) {
          owr6.a = "";
       }
       int i = 0;
       int i1 = Math.max(i, owr6.c);
       wr6 a = owr6.a;
       wr6 b = owr6.b;
       if (owr6.f == 1) {
          a = TextUtils.ellipsize(a, b, (float)i1, owr6.l);
       }
       int i2 = Math.min(a.length(), owr6.d);
       owr6.d = i2;
       int sDK_INT = Build$VERSION.SDK_INT;
       int i3 = 0;
       int i4 = 23;
       if (sDK_INT >= i4) {
          if (owr6.k != null && owr6.f == 1) {
             owr6.e = Layout$Alignment.ALIGN_OPPOSITE;
          }
          StaticLayout$Builder uBuilder = eh.m(a, i2, b, i1);
          jx1.u(uBuilder, owr6.e);
          jx1.w(uBuilder, owr6.j);
          rTL = (owr6.k != null)? TextDirectionHeuristics.RTL: TextDirectionHeuristics.LTR;
          eh.w(uBuilder, rTL);
          if ((l = owr6.l) != null) {
             jx1.v(uBuilder, l);
          }
          eh.v(uBuilder, owr6.f);
          l = owr6.g;
          if ((i3 - l) || (0x3f800000 - owr6.h)) {
             jx1.s(uBuilder, l, owr6.h);
          }
          if (owr6.f > 1) {
             jx1.t(uBuilder, owr6.i);
          }
          return eh.n(uBuilder);
       }else if(wr6.n){
          try{
             o = (owr6.k != null && sDK_INT >= i4)? 1: 0;
             TextDirectionHeuristic textDirectio = TextDirectionHeuristic.class;
             TextDirectionHeuristic rTL1 = (o)? TextDirectionHeuristics.RTL: TextDirectionHeuristics.LTR;
             wr6.p = rTL1;
             Class[] uClassArray = new Class[13];
             uClassArray[i] = CharSequence.class;
             Class tYPE = Integer.TYPE;
             uClassArray[1] = tYPE;
             uClassArray[2] = tYPE;
             uClassArray[3] = TextPaint.class;
             uClassArray[4] = tYPE;
             uClassArray[5] = Layout$Alignment.class;
             uClassArray[6] = textDirectio;
             Class tYPE1 = Float.TYPE;
             uClassArray[7] = tYPE1;
             uClassArray[8] = tYPE1;
             uClassArray[9] = Boolean.TYPE;
             uClassArray[10] = TextUtils$TruncateAt.class;
             uClassArray[11] = tYPE;
             uClassArray[12] = tYPE;
             o = StaticLayout.class.getDeclaredConstructor(uClassArray);
             wr6.o = o;
             o.setAccessible(1);
             wr6.n = true;
          }catch(java.lang.Exception e0){
             throw new vr6(e0);
          }
       }
       try{
          o = wr6.o;
          o.getClass();
          Object[] objArray = new Object[13];
          objArray[i] = a;
          objArray[1] = Integer.valueOf(i);
          objArray[2] = Integer.valueOf(owr6.d);
          objArray[3] = b;
          objArray[4] = Integer.valueOf(i1);
          objArray[5] = owr6.e;
          rTL = wr6.p;
          rTL.getClass();
          objArray[6] = rTL;
          objArray[7] = Float.valueOf(0x3f800000);
          objArray[8] = Float.valueOf(0);
          objArray[9] = Boolean.valueOf(owr6.j);
          objArray[10] = null;
          objArray[11] = Integer.valueOf(i1);
          objArray[12] = Integer.valueOf(owr6.f);
          return o.newInstance(objArray);
       }catch(java.lang.Exception e0){
          throw new vr6(e0);
       }
    }
}
