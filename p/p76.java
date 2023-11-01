package p.p76;
import p.ng2;
import p.gi3;
import java.lang.Object;
import p.b86;
import java.lang.String;
import p.co5;
import p.en6;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import p.fh5;
import p.ds3;
import p.fb4;
import java.lang.Class;
import p.li5;
import p.n91;
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
import p.zq7;
import p.j8;
import androidx.fragment.app.Fragment;
import p.lg4;
import p.tu6;
import p.qf4;
import p.ay6;
import p.m26;
import p.iq6;
import p.vk;
import p.vb4;
import p.nb7;
import p.mb7;
import p.jc7;
import java.lang.Number;
import java.util.List;
import p.ij;
import java.util.concurrent.Executor;
import p.sz1;
import java.lang.Runnable;

public final class p76 extends gi3 implements ng2	// class@002209 from classes.dex
{
    public final int a;
    public final Object b;

    public void p76(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super(2);
    }
    public final void a(int p0,b86 p1){
       int i2;
       qf4 oqf4;
       m26 value;
       fh5 uofh5;
       li5 str2;
       n91 uofh51;
       lq5 str2;
       ob7 oob7;
       zq7 str21;
       int i = 2;
       String str = "uri";
       p76 tb = this.b;
       int i1 = 1;
       String str1 = "item";
       switch (this.a){
           case 0:
             co5.o(p1, str1);
             i2 = en6.A(p1.a);
             b86 c = p1.c;
             if (i2) {
                if (i2 != i1) {
                   if (i2 == i) {
                      uofh5 = tb.w();
                      co5.o(c, str);
                      uofh5 = uofh5.c;
                      uofh5.getClass();
                      str2 = new li5(uofh5);
                      uofh51 = new n91(str2);
                      str2 = new lq5(uofh51, Integer.valueOf(p0), c);
                      oob7 = new ob7();
                      oob7.c(str2.t);
                      oob7.b = str2.v.c.c.a;
                      oob7.d = new ib7(i1, "ui_hide", "hit", new HashMap());
                      uofh5.b.b(oob7.a());
                   }
                }else {
                   uofh5 = tb.w();
                   co5.o(c, str);
                   uofh5 = uofh5.c;
                   uofh5.getClass();
                   str2 = new li5(uofh5);
                   uofh51 = new n91(str2);
                   str21 = new zq7(uofh51, Integer.valueOf(p0), c);
                   oob7 = new ob7();
                   oob7.c(str21.c);
                   oob7.b = str21.t.c.c.a;
                   oob7.d = new ib7(i1, "ui_hide", "hit", new HashMap());
                   uofh5.b.b(oob7.a());
                }
             }else {
                uofh5 = tb.w();
                uofh5 = uofh5.c;
                uofh5.getClass();
                str2 = new li5(uofh5);
                uofh51 = new n91(str2);
                j8 str22 = new j8(uofh51, Integer.valueOf(p0), c);
                oob7 = new ob7();
                oob7.c(str22.t);
                oob7.b = str22.v.c.c.a;
                oob7.d = new ib7(i1, "ui_hide", "hit", new HashMap());
                uofh5.b.b(oob7.a());
             }
             if ((oqf4 = tu6.p(tb).g()) != null && (value = oqf4.B.getValue()) != null) {
                b86 b = p1.b;
                vk ovk = null;
                b86 uob86 = (b instanceof iq6)? b: ovk;
                if (b instanceof vk) {
                   ovk = b;
                }
                value.e(new vb4(p1.g, uob86, ovk), "searchResult_mobius");
             }
             break;
           default:
             co5.o(p1, str1);
             i2 = en6.A(p1.a);
             p1 = p1.c;
             if (i2) {
                if (i2 != i1) {
                   if (i2 == i) {
                      uofh5 = tb.w();
                      co5.o(p1, str);
                      uofh5 = uofh5.c;
                      uofh5.getClass();
                      str2 = new li5(uofh5);
                      uofh51 = new n91(str2);
                      uofh5.b.a(new lq5(uofh51, Integer.valueOf(p0), p1).i());
                   }
                }else {
                   uofh5 = tb.w();
                   co5.o(p1, str);
                   uofh5 = uofh5.c;
                   uofh5.getClass();
                   str2 = new li5(uofh5);
                   uofh51 = new n91(str2);
                   str21 = new zq7(uofh51, Integer.valueOf(p0), p1);
                   mb7 omb7 = new mb7();
                   omb7.c(str21.c);
                   omb7.b = str21.t.c.c.a;
                   uofh5.b.a(omb7.a());
                }
             }else {
                uofh5 = tb.w();
                uofh5 = uofh5.c;
                uofh5.getClass();
                str2 = new li5(uofh5);
                uofh51 = new n91(str2);
                uofh5.b.a(new j8(uofh51, Integer.valueOf(p0), p1).j());
             }
             return;
       }
       tu6.p(tb).k();
       return;
    }
    public final Object b(Object p0,Object p1){
       jc7 a = jc7.a;
       switch (this.a){
           case 0:
             this.a(p0.intValue(), p1);
             return a;
           case 1:
             this.a(p0.intValue(), p1);
             return a;
           default:
             p0 = this.b;
             try{
                ij oij = new ij(p1, 19, p0);
                sz1.c().execute(oij);
                return e0;
             }catch(java.lang.Exception e0){
             }
       }
    }
}
