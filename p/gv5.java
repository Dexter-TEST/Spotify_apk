package p.gv5;
import java.lang.String;
import java.util.regex.Pattern;
import p.ps2;
import p.mp2;
import p.u54;
import java.lang.Object;
import p.zu5;
import p.sm2;
import p.pc2;
import p.he4;
import p.je4;
import java.lang.Class;
import p.co5;
import p.gg1;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import p.en6;
import java.lang.Throwable;
import p.os2;
import java.lang.StringBuilder;
import java.util.List;

public final class gv5	// class@000218 from classes2.dex
{
    public final String a;
    public final ps2 b;
    public String c;
    public os2 d;
    public final zu5 e;
    public final sm2 f;
    public u54 g;
    public final boolean h;
    public final he4 i;
    public final pc2 j;
    public fv5 k;
    public static final char[] l;
    public static final Pattern m;

    static {
       gv5.l = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       gv5.m = Pattern.compile("\(.*/\)?\(\\.|%2e|%2E\){1,2}\(/.*\)?");
    }
    public void gv5(String p0,ps2 p1,String p2,mp2 p3,u54 p4,boolean p5,boolean p6,boolean p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.e = new zu5();
       this.g = p4;
       this.h = p5;
       this.f = (p3 != null)? p3.d(): new sm2();
       if (p6) {
          this.j = new pc2();
       }else if(p7){
          he4 ohe4 = new he4();
          this.i = ohe4;
          ohe4.b(je4.f);
       }
       return;
    }
    public final void a(String p0,String p1,boolean p2){
       Object obj = p0;
       String str = "name";
       gv5 j = this.j;
       if (p2) {
          j.getClass();
          co5.o(obj, str);
          j.a.add(gg1.i(p0, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", true, false, true, false, 83));
          j.b.add(gg1.i(p1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", 1, 0, 1, 0, 83));
       }else {
          j.getClass();
          co5.o(obj, str);
          j.a.add(gg1.i(p0, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", false, false, true, false, 91));
          j.b.add(gg1.i(p1, 0, 0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", 0, 0, 1, 0, 91));
       }
       return;
    }
    public final void b(String p0,String p1){
       if ("Content-Type".equalsIgnoreCase(p0)) {
          try{
             this.g = gg1.C(p1);
          }catch(java.lang.IllegalArgumentException e3){
             throw new IllegalArgumentException(en6.n("Malformed content type: ", p1), e3);
          }
       }else {
          this.f.b(p0, p1);
       }
       return;
    }
    public final void c(String p0,String p1,boolean p2){
       os2 oos2;
       gv5 tc = this.c;
       String str = null;
       if (tc != null) {
          gv5 tb = this.b;
          oos2 = tb.g(tc);
          this.d = oos2;
          if (oos2 != null) {
             this.c = str;
          }else {
             throw new IllegalArgumentException("Malformed URL. Base: "+tb+", Relative: "+this.c);
          }
       }
       if (p2) {
          this.d.a(p0, p1);
       }else {
          gv5 td = this.d;
          td.getClass();
          co5.o(p0, "name");
          if (td.g == null) {
             td.g = new ArrayList();
          }
          oos2 = td.g;
          co5.i(oos2);
          oos2.add(gg1.i(p0, 0, 0, " !\"#$&\'\(\),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
          os2 g = td.g;
          co5.i(g);
          if (p1 != null) {
             str = gg1.i(p1, 0, 0, " !\"#$&\'\(\),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
          }
          g.add(str);
       }
       return;
    }
}
