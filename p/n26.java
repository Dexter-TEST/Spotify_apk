package p.n26;
import p.zf2;
import p.gi3;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.ContextWrapper;
import p.gg4;
import p.ig4;
import p.jc7;
import java.lang.CharSequence;
import p.kh4;
import p.oh6;
import p.j13;
import p.g23;
import java.lang.Class;
import p.s23;
import p.p23;
import p.tt2;
import p.n13;
import p.k13;
import java.lang.Byte;
import p.kg4;
import p.vv1;
import java.lang.Boolean;
import p.cu1;
import p.u65;
import p.de5;
import p.he5;
import p.uw6;
import java.lang.Integer;
import java.lang.Long;
import p.nw6;
import java.util.List;
import p.og4;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import p.lg4;
import android.view.ViewParent;
import p.vh5;
import p.pd;
import p.i01;
import p.q26;
import p.nb7;
import java.lang.StringBuilder;

public final class n26 extends gi3 implements zf2	// class@001f55 from classes.dex
{
    public final int a;
    public static final n26 A;
    public static final n26 B;
    public static final n26 C;
    public static final n26 D;
    public static final n26 E;
    public static final n26 F;
    public static final n26 G;
    public static final n26 H;
    public static final n26 I;
    public static final n26 J;
    public static final n26 K;
    public static final n26 L;
    public static final n26 M;
    public static final n26 N;
    public static final n26 O;
    public static final n26 P;
    public static final n26 b;
    public static final n26 c;
    public static final n26 t;
    public static final n26 v;
    public static final n26 w;
    public static final n26 x;
    public static final n26 y;
    public static final n26 z;

    static {
       n26.b = new n26(0);
       n26.c = new n26(1);
       n26.t = new n26(2);
       n26.v = new n26(3);
       n26.w = new n26(4);
       n26.x = new n26(5);
       n26.y = new n26(6);
       n26.z = new n26(7);
       n26.A = new n26(8);
       n26.B = new n26(9);
       n26.C = new n26(10);
       n26.D = new n26(11);
       n26.E = new n26(18);
       n26.F = new n26(19);
       n26.G = new n26(20);
       n26.H = new n26(21);
       n26.I = new n26(22);
       n26.J = new n26(23);
       n26.K = new n26(24);
       n26.L = new n26(25);
       n26.M = new n26(26);
       n26.N = new n26(27);
       n26.O = new n26(28);
       n26.P = new n26(29);
    }
    public void n26(int p0){
       this.a = p0;
       super(1);
    }
    public final Context a(Context p0){
       Context uContext = null;
       switch (this.a){
           case 1:
             co5.o(p0, "it");
             if (p0 instanceof ContextWrapper) {
                uContext = p0.getBaseContext();
             }
             break;
           default:
             co5.o(p0, "it");
             if (p0 instanceof ContextWrapper) {
                uContext = p0.getBaseContext();
             }
             return uContext;
       }
       return uContext;
    }
    public final gg4 c(gg4 p0){
       gg4 b;
       String str = "it";
       int i = 0;
       gg4 ogg4 = null;
       switch (this.a){
           case 5:
             co5.o(p0, "destination");
             if ((b = p0.b) != null && b.C == p0.y) {
                i = 1;
             }
             if (i) {
                ogg4 = b;
             }
             return ogg4;
             break;
           case 6:
             co5.o(p0, "destination");
             if ((b = p0.b) != null && b.C == p0.y) {
                i = 1;
             }
             if (i) {
                ogg4 = b;
             }
             return ogg4;
             break;
           case 7:
           default:
             co5.o(p0, str);
             if (p0 instanceof ig4) {
                ogg4 = p0.m(p0.C, true);
             }
             return ogg4;
       }
       co5.o(p0, str);
       return p0.b;
    }
    public final Object invoke(Object p0){
       jc7 a = jc7.a;
       int i = 0;
       s23 os23 = null;
       switch (this.a){
           case 0:
             co5.o(p0, "$this$initializer");
             return new q26();
           case 1:
             return this.a(p0);
           case 2:
             return this.a(p0);
           case 3:
             co5.o(p0, "$this$anim");
             p0.a = i;
             p0.b = i;
             return a;
           case 4:
             co5.o(p0, "$this$popUpTo");
             p0.a = true;
             return a;
           case 5:
             return this.c(p0);
           case 6:
             return this.c(p0);
           case 7:
             return this.c(p0);
           case 8:
             return this.c(p0);
           case 9:
             co5.o(p0, "it");
             p0 = p0.getParent();
             if (p0 instanceof View) {
                os23 = p0;
             }
             return os23;
             break;
           case 10:
             co5.o(p0, "it");
             p0 = p0.getTag(R.id.nav_controller_view_tag);
             if (p0 instanceof WeakReference) {
                os23 = p0.get();
             }else if(p0 instanceof lg4){
                os23 = p0;
             }
             return os23;
             break;
           case 11:
             co5.o(p0, "$this$navOptions");
             p0.b = true;
             return a;
           case 12:
             co5.o(p0, "obj");
             return p0.n();
           case 13:
             co5.o(p0, "db");
             return Boolean.valueOf(p0.M());
           case 14:
             co5.o(p0, "obj");
             return p0.d();
           case 15:
             co5.o(p0, "it");
             return os23;
           case 16:
             co5.o(p0, "obj");
             return Long.valueOf(p0.Z());
           case 17:
             co5.o(p0, "obj");
             return Integer.valueOf(p0.u());
           case 18:
             co5.o(p0, "it");
             if (p0 instanceof de5) {
                os23 = p0;
             }
             return os23;
             break;
           case 19:
             co5.o(p0, "it");
             return Boolean.valueOf(p0.t);
           case 20:
             co5.o(p0, "it");
             return p0.c;
           case 21:
             return p0.b();
           case 22:
             if (!co5.c(p0.b, "EventSenderStats2NonAuth") && !co5.c(p0.b, "EventSenderStats")) {
                i = true;
             }
             return Boolean.valueOf(i);
             break;
           case 23:
             Object[] objArray = new Object[true];
             objArray[i] = p0;
             return kg4.q(objArray, true, "%02x", "format\(this, *args\)");
           case 24:
             if (p0 != null) {
                n13.v.getClass();
                os23 = k13.b(p0);
             }
             return os23;
             break;
           case 25:
             g23.c.getClass();
             if (p0 != null) {
                s23.c.getClass();
                os23 = p23.b(p0);
             }
             return os23;
             break;
           case 26:
             co5.o(p0, "it");
             return p0.b.toString();
           case 27:
             co5.o(p0, "it");
             p0.stopNestedScroll();
             return a;
           case 28:
             co5.o(p0, "it");
             p0.toString();
             return a;
           default:
             co5.o(p0, "it");
             return "UBI DEBUG [IMPRESSION]: "+p0;
       }
    }
}
