package p.v71;
import p.zf2;
import p.gi3;
import p.w71;
import java.lang.String;
import p.si5;
import java.lang.Object;
import p.co5;
import p.yi2;
import p.l06;
import p.zf4;
import p.fm5;
import p.yi5;
import java.lang.Class;
import java.lang.System;

public final class v71 extends gi3 implements zf2	// class@002995 from classes.dex
{
    public final int a;
    public final w71 b;
    public final String c;

    public void v71(w71 p0,String p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super(1);
    }
    public final si5 a(String p0){
       v71 tc = this.c;
       v71 tb = this.b;
       String str = "partner";
       switch (this.a){
           case 0:
           default:
             co5.o(p0, str);
             w71.c(tb).getClass();
             return w71.e(tb, System.getProperty(tc), new zf4(p0, 3));
       }
       co5.o(p0, str);
       return w71.e(tb, w71.b(tb).a(tc), new zf4(p0, 2));
    }
    public final Object invoke(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.a(p0);
       }
       return this.a(p0);
    }
}
