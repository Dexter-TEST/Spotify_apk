package p.o31;
import p.tm5;
import p.p31;
import java.lang.Object;
import p.c21;
import p.s41;
import p.x41;

public final class o31 implements tm5	// class@00209d from classes.dex
{
    public final int a;
    public final p31 b;

    public void o31(p31 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       int i = 17;
       int i1 = 12;
       o31 tb = this.b;
       switch (this.a){
           case 0:
             return new c21(tb.b, 18, 0);
           case 1:
             return new s41(tb.b, 6, 0);
           case 2:
             return new c21(tb.b, 13, 0);
           case 3:
             return new c21(tb.b, 8, 0);
           case 4:
             return new c21(tb.b, 14, 0);
           case 5:
             return new c21(tb.b, 3, 0);
           case 6:
             return new c21(tb.b, 9, 0);
           case 7:
             return new c21(tb.b, 15, 0);
           case 8:
             return new c21(tb.b, 16, 0);
           case 9:
             return new c21(tb.b, 11, 0);
           case 10:
             return new c21(tb.b, 6, 0);
           case 11:
             return new c21(tb.b, 7, 0);
           case 12:
             return new c21(tb.b, i1, 0);
           case 13:
             return new s41(tb.b, i, 0);
           case 14:
             return new s41(tb.b, 25, 0);
           case 15:
             return new c21(tb.b, 24, 0);
           case 16:
             return new c21(tb.b, 5, 0);
           case 17:
             return new s41(tb.b, 16, 0);
           case 18:
             return new x41(tb.b, 0, 0);
           case 19:
             return new x41(tb.b, 13, 0);
           case 20:
             return new s41(tb.b, i1, 0);
           case 21:
             return new c21(tb.b, 10, 0);
           default:
             return new c21(tb.b, i, 0);
       }
    }
}
