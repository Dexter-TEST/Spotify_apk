package p.zf4;
import p.zf2;
import p.gi3;
import java.lang.String;
import p.si5;
import java.lang.Object;
import p.co5;
import p.nw6;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class zf4 extends gi3 implements zf2	// class@002ee7 from classes.dex
{
    public final int a;
    public final String b;

    public void zf4(String p0,int p1){
       this.a = p1;
       this.b = p0;
       super(1);
    }
    public final si5 a(String p0){
       zf4 tb = this.b;
       switch (this.a){
           case 2:
           default:
             co5.o(p0, "referrer");
             return new si5(tb, p0, true);
       }
       co5.o(p0, "referrer");
       return new si5(tb, p0, true);
    }
    public final Object invoke(Object p0){
       zf4 tb = this.b;
       switch (this.a){
           case 0:
             return Boolean.valueOf(co5.c(p0, tb));
           case 1:
             co5.o(p0, "db");
             p0.r(tb);
             return null;
           case 2:
             return this.a(p0);
           case 3:
             return this.a(p0);
           default:
             co5.o(p0, "line");
             return tb+p0;
       }
    }
}
