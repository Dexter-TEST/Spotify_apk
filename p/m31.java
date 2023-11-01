package p.m31;
import p.tm5;
import p.p31;
import java.lang.Object;
import p.s41;
import p.c21;
import p.x41;

public final class m31 implements tm5	// class@001e16 from classes.dex
{
    public final int a;
    public final p31 b;

    public void m31(p31 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       int i = 27;
       int i1 = 23;
       m31 tb = this.b;
       switch (this.a){
           case 0:
             return new c21(tb.b, 19, 0);
           case 1:
             return new c21(tb.b, 21, 0);
           case 2:
             return new c21(tb.b, 22, 0);
           case 3:
             return new c21(tb.b, i1, 0);
           case 4:
             return new c21(tb.b, 25, 0);
           case 5:
             return new c21(tb.b, 26, 0);
           case 6:
             return new c21(tb.b, i, 0);
           case 7:
             return new s41(tb.b, 1, 0);
           case 8:
             return new s41(tb.b, 2, 0);
           case 9:
             return new s41(tb.b, 19, 0);
           case 10:
             return new s41(tb.b, i1, 0);
           case 11:
             return new s41(tb.b, 3, 0);
           case 12:
             return new s41(tb.b, 4, 0);
           case 13:
             return new s41(tb.b, 15, 0);
           case 14:
             return new s41(tb.b, 11, 0);
           case 15:
             return new s41(tb.b, 9, 0);
           case 16:
             return new x41(tb.b, 16, 0);
           case 17:
             return new s41(tb.b, 8, 0);
           case 18:
             return new s41(tb.b, 7, 0);
           case 19:
             return new s41(tb.b, 10, 0);
           case 20:
             return new s41(tb.b, 0, 0);
           case 21:
             return new s41(tb.b, 5, 0);
           case 22:
             return new c21(tb.b, 29, 0);
           case 23:
             return new s41(tb.b, 13, 0);
           case 24:
             return new s41(tb.b, 14, 0);
           case 25:
             return new s41(tb.b, 18, 0);
           case 26:
             return new s41(tb.b, 21, 0);
           case 27:
             return new s41(tb.b, 24, 0);
           case 28:
             return new s41(tb.b, 20, 0);
           default:
             return new s41(tb.b, i, 0);
       }
    }
}
