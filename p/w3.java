package p.w3;
import p.e4;
import java.lang.Class;
import p.f4;
import p.j4;
import p.k4;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import p.t3;
import java.lang.Object;
import java.lang.String;
import p.l4;
import p.h4;
import p.u3;
import p.v3;
import p.i4;
import p.p3;
import p.g4;
import p.q3;
import p.s3;
import java.lang.CharSequence;

public final class w3	// class@002abf from classes.dex
{
    public final Object a;
    public final int b;
    public final Class c;
    public final l4 d;
    public static final w3 e;
    public static final w3 f;
    public static final w3 g;
    public static final w3 h;
    public static final w3 i;
    public static final w3 j;
    public static final w3 k;
    public static final w3 l;

    static {
       w3 ow3 = new w3(1);
       ow3 = new w3(2);
       ow3 = new w3(4);
       ow3 = new w3(8);
       w3.e = new w3(16);
       int i = 32;
       ow3 = new w3(i);
       ow3 = new w3(64);
       ow3 = new w3(128);
       ow3 = new w3(256, e4.class);
       ow3 = new w3(512, e4.class);
       ow3 = new w3(1024, f4.class);
       ow3 = new w3(2048, f4.class);
       w3.f = new w3(4096);
       w3.g = new w3(8192);
       ow3 = new w3(0x4000);
       ow3 = new w3(0x8000);
       ow3 = new w3(0x10000);
       ow3 = new w3(0x20000, j4.class);
       w3.h = new w3(0x40000);
       w3.i = new w3(0x80000);
       w3.j = new w3(0x100000);
       ow3 = new w3(0x200000, k4.class);
       int sDK_INT = Build$VERSION.SDK_INT;
       int i1 = 0;
       int i2 = 23;
       AccessibilityNodeInfo$AccessibilityAction uAccessibili = (sDK_INT >= i2)? t3.c(): i1;
       w3 ow31 = new w3(uAccessibili, 0x1020036, null, null, null);
       w3 AccessibilityNodeInfo$AccessibilityAction uAccessibili1 = (sDK_INT >= i2)? t3.v(): i1;
       w3 ow32 = new w3(uAccessibili1, 0x1020037, null, null, h4.class);
       uAccessibili = (sDK_INT >= i2)? t3.y(): i1;
       ow32 = new w3(uAccessibili, 0x1020038, null, null, null);
       w3.k = ow32;
       AccessibilityNodeInfo$AccessibilityAction uAccessibili2 = (sDK_INT >= i2)? t3.j(): i1;
       uAccessibili1 = new w3(uAccessibili2, 0x1020039, null, null, null);
       uAccessibili = (sDK_INT >= i2)? t3.m(): i1;
       ow32 = new w3(uAccessibili, 0x102003a, null, null, null);
       w3.l = ow32;
       uAccessibili2 = (sDK_INT >= i2)? t3.p(): i1;
       uAccessibili1 = new w3(uAccessibili2, 0x102003b, null, null, null);
       ow32 = 29;
       uAccessibili = (sDK_INT >= ow32)? u3.h(): i1;
       ow32 = new w3(uAccessibili, 0x1020046, null, null, null);
       uAccessibili2 = (sDK_INT >= ow32)? u3.y(): i1;
       uAccessibili1 = new w3(uAccessibili2, 0x1020047, null, null, null);
       uAccessibili = (sDK_INT >= ow32)? u3.B(): i1;
       ow32 = new w3(uAccessibili, 0x1020048, null, null, null);
       uAccessibili2 = (sDK_INT >= ow32)? u3.D(): i1;
       uAccessibili1 = new w3(uAccessibili2, 0x1020049, null, null, null);
       uAccessibili = (sDK_INT >= i2)? t3.s(): i1;
       ow32 = new w3(uAccessibili, 0x102003c, null, null, null);
       v3 ov3 = 24;
       uAccessibili1 = (sDK_INT >= ov3)? ov3.j(): i1;
       ow32 = new w3(uAccessibili1, 0x102003d, null, null, i4.class);
       AccessibilityNodeInfo$AccessibilityAction uAccessibili3 = (sDK_INT >= 26)? p3.k(): i1;
       w3 ov31 = new w3(uAccessibili3, 0x1020042, null, null, g4.class);
       ov31 = 28;
       AccessibilityNodeInfo$AccessibilityAction uAccessibili4 = (sDK_INT >= ov31)? q3.j(): i1;
       w3 ow33 = new w3(uAccessibili4, 0x1020044, null, null, null);
       uAccessibili2 = (sDK_INT >= ov31)? q3.z(): i1;
       w3 ow34 = new w3(uAccessibili2, 0x1020045, null, null, null);
       ow33 = 30;
       uAccessibili3 = (sDK_INT >= ow33)? s3.g(): i1;
       ov31 = new w3(uAccessibili3, 0x102004a, null, null, null);
       uAccessibili1 = (sDK_INT >= ow33)? s3.n(): i1;
       ow32 = new w3(uAccessibili1, 0x1020054, null, null, null);
       uAccessibili3 = (sDK_INT >= i)? AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_START: i1;
       ov31 = new w3(uAccessibili3, 0x1020055, null, null, null);
       uAccessibili4 = (sDK_INT >= i)? AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_DROP: i1;
       ow33 = new w3(uAccessibili4, 0x1020056, null, null, null);
       uAccessibili3 = (sDK_INT >= i)? AccessibilityNodeInfo$AccessibilityAction.ACTION_DRAG_CANCEL: i1;
       ov31 = new w3(uAccessibili3, 0x1020057, null, null, null);
       if (sDK_INT >= 33) {
          i1 = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
       }
       ow33 = new w3(i1, 0x1020058, null, null, null);
    }
    public void w3(int p0){
       super(null, p0, null, null, null);
    }
    public void w3(int p0,Class p1){
       super(null, p0, null, null, p1);
    }
    public void w3(Object p0,int p1,String p2,l4 p3,Class p4){
       super();
       this.b = p1;
       this.d = p3;
       this.a = (p0 == null)? new AccessibilityNodeInfo$AccessibilityAction(p1, p2): p0;
       this.c = p4;
       return;
    }
    public final int a(){
       return this.a.getId();
    }
    public final CharSequence b(){
       return this.a.getLabel();
    }
    public final boolean equals(Object p0){
       w3 ta;
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof w3) {
          return false;
       }
       p0 = p0.a;
       if ((ta = this.a) == null) {
          if (p0 != null) {
             return false;
          }
       }else if(!ta.equals(p0)){
          return false;
       }
       return true;
    }
    public final int hashCode(){
       w3 ta;
       int i = ((ta = this.a) != null)? ta.hashCode(): 0;
       return i;
    }
}
