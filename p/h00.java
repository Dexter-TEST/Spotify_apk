package p.h00;
import p.eq0;
import p.i00;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tq0;
import p.jr7;
import p.zq0;
import android.os.Build$VERSION;
import p.ji4;
import java.lang.Boolean;

public final class h00 extends eq0	// class@0017b1 from classes.dex
{
    public final int f;

    public void h00(i00 p0){
       this.f = 1;
       co5.o(p0, "tracker");
       super(p0);
    }
    public void h00(tq0 p0,int p1){
       this.f = p1;
       if (p1 != 2) {
          if (p1 != 3) {
             if (p1 != 4) {
                co5.o(p0, "tracker");
                super(p0);
                return;
             }else {
                co5.o(p0, "tracker");
                super(p0);
                return;
             }
          }else {
             co5.o(p0, "tracker");
             super(p0);
             return;
          }
       }else {
          co5.o(p0, "tracker");
          super(p0);
          return;
       }
    }
    public final boolean a(jr7 p0){
       zq0 a;
       boolean b = false;
       String str = "workSpec";
       switch (this.f){
           case 0:
             co5.o(p0, str);
             return p0.j.b;
           case 1:
             co5.o(p0, str);
             return p0.j.d;
           case 2:
             co5.o(p0, str);
             if (p0.j.a == 2) {
                b = true;
             }
             return b;
             break;
           case 3:
             co5.o(p0, str);
             if ((a = p0.j.a) == 3 || (Build$VERSION.SDK_INT >= 30 || a != 6)) {
                b = true;
             }
             return b;
             break;
           default:
             co5.o(p0, str);
             return p0.j.e;
       }
    }
    public final boolean b(Object p0){
       switch (this.f){
           case 0:
             return this.f(p0.booleanValue());
           case 1:
             return this.f(p0.booleanValue());
           case 2:
             return this.e(p0);
           case 3:
             return this.e(p0);
           default:
             return this.f(p0.booleanValue());
       }
    }
    public final boolean e(ji4 p0){
       boolean b = true;
       String str = "value";
       switch (this.f){
           case 2:
             co5.o(p0, str);
             ji4 a = p0.a;
             if (Build$VERSION.SDK_INT >= 26) {
                if (a != null && p0.b != null) {
                   b = false;
                }
             }else if(a == null){
             }
             break;
           default:
             co5.o(p0, str);
             if (p0.a != null && p0.c == null) {
                b = false;
             }
             return b;
       }
       return b;
    }
    public final boolean f(boolean p0){
       switch (this.f){
           case 0:
             return (p0 ^ 0x01);
           case 1:
             return (p0 ^ 0x01);
           default:
             return (p0 ^ 0x01);
       }
    }
}
