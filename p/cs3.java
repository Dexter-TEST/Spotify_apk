package p.cs3;
import p.zf2;
import p.gi3;
import p.pb7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.vw0;
import p.pw1;
import p.zw0;
import java.lang.Boolean;
import p.la6;
import java.util.Iterator;
import p.nb7;
import p.ts7;
import p.iw5;
import p.m95;
import p.i70;

public final class cs3 extends gi3 implements zf2	// class@001269 from classes.dex
{
    public final int a;
    public static final cs3 b;
    public static final cs3 c;
    public static final cs3 t;
    public static final cs3 v;
    public static final cs3 w;
    public static final cs3 x;

    static {
       cs3.b = new cs3(0);
       cs3.c = new cs3(5);
       cs3.t = new cs3(6);
       cs3.v = new cs3(7);
       cs3.w = new cs3(8);
       cs3.x = new cs3(10);
    }
    public void cs3(int p0){
       this.a = p0;
       super(1);
    }
    public final String a(pb7 p0){
       String str = "it";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             return "UBI DEBUG [INTERACTION - NON-AUTH]: "+p0;
       }
       co5.o(p0, str);
       return "UBI DEBUG [INTERACTION]: "+p0;
    }
    public final Object invoke(Object p0){
       String str = "it";
       Object obj = null;
       switch (this.a){
           case 0:
             return this.a(p0);
           case 1:
             co5.o(p0, str);
             return "UBI DEBUG [IMPRESSION - NON-AUTH]: "+p0;
           case 2:
             return this.a(p0);
           case 3:
             co5.o(p0, str);
             return p0.iterator();
           case 4:
             return p0;
           case 5:
             boolean b = (p0 == null)? true: false;
             b = Boolean.valueOf(b);
             break;
           case 6:
             co5.o(p0, "line");
             return p0;
           case 7:
             if (p0 instanceof zw0) {
                obj = p0;
             }
             return obj;
             break;
           case 8:
             if (p0 instanceof pw1) {
                obj = p0;
             }
             return obj;
             break;
           case 9:
             return obj;
           default:
             co5.o(p0, "entry");
             return Boolean.valueOf(i70.o(p0.a));
       }
    }
}
