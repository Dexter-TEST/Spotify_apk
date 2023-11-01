package p.io3;
import p.ru2;
import java.lang.String;
import java.lang.Object;
import p.ju2;
import p.ko3;
import p.qu2;

public final class io3 implements ru2	// class@0019d2 from classes.dex
{
    public final int a;
    public final String b;
    public final int c;

    public void io3(String p0,int p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final int e(ju2 p0){
       io3 tc = this.c;
       io3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return qu2.c(tb, tc, p0);
       }
       return ko3.a(tb, tc, p0);
    }
}
