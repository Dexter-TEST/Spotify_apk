package p.e63;
import p.wf2;
import p.gi3;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import p.nb;
import p.w55;
import java.lang.Object;
import p.co5;
import p.jc7;
import p.jc;
import p.z37;
import p.fv1;
import p.ld;
import java.util.regex.Pattern;
import p.ne4;
import p.h17;
import java.lang.Float;
import p.g15;
import java.util.UUID;

public final class e63 extends gi3 implements wf2	// class@001428 from classes.dex
{
    public final int a;
    public static final e63 A;
    public static final e63 B;
    public static final e63 C;
    public static final e63 D;
    public static final e63 b;
    public static final e63 c;
    public static final e63 t;
    public static final e63 v;
    public static final e63 w;
    public static final e63 x;
    public static final e63 y;
    public static final e63 z;

    static {
       e63.b = new e63(0);
       e63.c = new e63(3);
       e63.t = new e63(4);
       e63.v = new e63(6);
       e63.w = new e63(7);
       e63.x = new e63(8);
       e63.y = new e63(9);
       e63.z = new e63(10);
       e63.A = new e63(11);
       e63.B = new e63(12);
       e63.C = new e63(13);
       e63.D = new e63(14);
    }
    public void e63(int p0){
       this.a = p0;
       super(0);
    }
    public final Handler a(){
       switch (this.a){
           case 3:
           default:
             return new Handler(Looper.getMainLooper());
       }
       return new Handler(Looper.getMainLooper());
    }
    public final String c(){
       w55 a;
       switch (this.a){
           case 1:
           default:
             a = nb.t.a.a;
             co5.l(a, "SEARCH.pageIdentifier.path\(\)");
             return a;
       }
       a = nb.c.a.a;
       co5.l(a, "CONTENT_PICKER.pageIdentifier.path\(\)");
       return a;
    }
    public final Object invoke(){
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
             return new g15();
           case 1:
             return this.c();
           case 2:
             return this.c();
           case 3:
             return this.a();
           case 4:
             return Float.valueOf(0);
           case 5:
             return this.a();
           case 6:
           case 8:
           case 9:
           case 7:
             return a;
           case 10:
             a = new h17();
             break;
           case 11:
             return new ne4();
           case 12:
             return Pattern.compile("spotify[\\w_\\-!.~\'\(\)*:%]*");
           case 13:
             return new jc(z37.a, new fv1());
           default:
             UUID uUID = UUID.randomUUID();
             co5.l(uUID, "randomUUID\(\)");
             return uUID;
       }
    }
}
