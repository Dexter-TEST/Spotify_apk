package p.m9;
import p.ir0;
import p.hr0;
import p.v9;
import java.lang.Object;
import p.t8;
import p.ya;
import java.lang.String;
import java.lang.Class;
import p.co5;
import p.e9;
import p.eb4;
import p.bb7;
import p.li5;
import java.lang.Integer;
import p.lq5;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import p.gb7;
import p.pb7;
import p.nb3;
import p.ds3;
import p.ab;
import p.c9;
import p.zk;
import p.xq7;
import p.za;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;

public final class m9 implements ir0	// class@001e52 from classes.dex
{
    public final int a;
    public final hr0 b;
    public final v9 c;

    public void m9(hr0 p0,v9 p1){
       this.a = 1;
       this.b = p0;
       this.c = p1;
       super();
    }
    public void m9(v9 p0,hr0 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       v9 d;
       String str4;
       String str = "hit";
       String str1 = "uri";
       String str2 = "step";
       m9 tb = this.b;
       int i = 1;
       m9 tc = this.c;
       switch (this.a){
           case 0:
           case 1:
             tb.accept(ya.a);
             if (p0.a.length() <= 0) {
                i = 0;
             }
             if (i) {
                tc.g.getClass();
                co5.o(p0.a, str1);
             }
             return;
             break;
           default:
             d = tc.d;
             xq7 c9 a2 = p0.a;
             d.getClass();
             co5.o(a2, str2);
             a2 = new xq7(new zk(bb7.a(a2)));
             ob7 oob71 = new ob7();
             oob71.c(a2.b);
             oob71.b = a2.c.b.a;
             HashMap hashMap = new HashMap();
             String str3 = "";
             if ((str4 = str3.toString()) != null) {
                str3 = str4;
             }
             hashMap.put("destination", str3);
             oob71.d = new ib7(i, "ui_navigate", str, hashMap);
             d.a.b(oob71.a());
             tb.accept(new za(p0.b));
             return;
       }
       d = tc.d;
       e9 a = p0.a;
       d.getClass();
       co5.o(a, str2);
       e9 c = p0.c;
       co5.o(c, str1);
       eb4 uoeb4 = bb7.a(a);
       li5 a1 = new li5(uoeb4);
       p0 = p0.b;
       lq5 olq5 = new lq5(a1, Integer.valueOf(p0), c);
       ob7 oob7 = new ob7();
       oob7.c(olq5.t);
       oob7.b = olq5.v.c.a;
       oob7.d = new ib7(i, "filter", str, new HashMap());
       d.a.b(oob7.a());
       tb.accept(new ab(p0));
       return;
    }
}
