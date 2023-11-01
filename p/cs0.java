package p.cs0;
import p.ng2;
import p.gi3;
import p.es0;
import java.lang.Object;
import p.jc7;
import p.de5;
import java.lang.Number;
import java.lang.String;
import p.co5;
import p.zf2;
import p.he5;
import java.lang.Class;
import p.eb4;
import p.bb7;
import p.jx;
import java.lang.Integer;
import p.nq5;
import p.j8;
import p.nb7;
import p.ds3;
import p.vk;
import p.iq6;
import p.or7;
import p.oy6;
import p.wc4;
import p.xc4;
import p.ge5;
import p.ce7;
import p.mb7;
import p.kb7;
import p.fb7;
import p.gb7;
import p.li5;
import p.lq5;

public final class cs0 extends gi3 implements ng2	// class@001267 from classes.dex
{
    public final int a;
    public final es0 b;

    public void cs0(es0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(2);
    }
    public final Object b(Object p0,Object p1){
       es0 b;
       es0 k;
       eb4 uoeb4;
       jc7 a = jc7.a;
       String str = "step";
       String str1 = "item";
       cs0 tb = this.b;
       switch (this.a){
           case 0:
             int i = p1.intValue();
             co5.o(p0, str1);
             b = tb.b;
             k = tb.k;
             b.getClass();
             co5.o(k, str);
             uoeb4 = bb7.a(k);
             bb7 a1 = b.a;
             if (p0 instanceof de5) {
                de5 c = p0.c;
                de5 b1 = p0.b;
                if (c instanceof jx) {
                   a1.a(new j8(new nq5(uoeb4, Integer.valueOf(b1)), Integer.valueOf(i), p0.b()).j());
                }else {
                   int i1 = 1;
                   tb = (c instanceof vk)? 1: c instanceof iq6;
                   if (tb) {
                      a1.a(new oy6(new or7(uoeb4, Integer.valueOf(b1)), Integer.valueOf(i), p0.b()).o());
                   }else if(c instanceof wc4){
                      v6 = c instanceof xc4;
                   }
                   if (i1) {
                      a1.a(new oy6(new or7(uoeb4, Integer.valueOf(b1)), Integer.valueOf(i), p0.b()).o());
                   }
                }
             }else if(p0 instanceof ge5){
                i = new ce7(new or7(uoeb4, Integer.valueOf(p0.a)), Integer.valueOf(i));
                p0 = new mb7();
                p0.c(i.b);
                p0.b = i.c.c.a;
                a1.a(p0.a());
             }
             return a;
             break;
           case 1:
           default:
             co5.o(p1, "uri");
             b = tb.b;
             k = tb.k;
             b.getClass();
             co5.o(k, str);
             uoeb4 = bb7.a(k);
             li5 oli5 = new li5(uoeb4);
             b.a.a(new lq5(oli5, Integer.valueOf(p0.intValue()), p1).i());
             return a;
       }
       p1.intValue();
       co5.o(p0, str1);
       tb.c.invoke(p0);
       return a;
    }
}
