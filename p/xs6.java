package p.xs6;
import android.content.Context;
import p.rc6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.xb4;
import p.yb4;
import p.eb2;
import java.io.File;
import p.qc;
import java.lang.StringBuilder;
import p.oh5;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.nh5;
import p.cd2;
import p.pc;
import p.ll5;
import java.lang.Class;
import p.ge6;
import p.t37;
import p.xo5;
import java.util.Objects;
import p.mm2;

public final class xs6	// class@002cdd from classes.dex
{
    public final rc6 a;
    public final eb2 b;
    public final qc c;
    public final qc d;
    public final ll5 e;

    public void xs6(Context p0,rc6 p1){
       String str3;
       String str5;
       File uFile1;
       super();
       this.a = p1;
       rc6 a = p1.a;
       String str = "<this>";
       co5.o(a, str);
       String str1 = "unauth";
       StringBuilder str2 = "auth";
       if (a instanceof xb4) {
          str3 = str2;
       }else if(a instanceof yb4){
          str3 = str1;
       }else {
          throw new cd2(10);
       }
       File dir = p0.getDir("remote-config", 0);
       co5.l(dir, "this.getDir\(DEFAULT_DIRE…RY, Context.MODE_PRIVATE\)");
       File uFile = new File(dir, str3);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       this.b = new eb2(new qc(uFile, null));
       if (a instanceof xb4) {
          str1 = str2;
       }else if(a instanceof yb4){
          throw new cd2(10);
       }
       p1 = p1.c;
       str3 = Integer.toHexString(p1.hashCode())+".pb";
       oh5 a1 = p1.a;
       if (!a1 instanceof Collection || !a1.isEmpty()) {
          Iterator iterator = a1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().a()) {
                   iterator = 1;
                   break ;
                }
             }
          }
          String str4 = "unauth-";
          if (a1) {
             str2 = "";
             co5.o(a, str);
             if (a instanceof xb4) {
                str4 = "";
             }else if(a instanceof yb4){
                throw new cd2(10);
             }
             str5 = str2+str4+Integer.toHexString(p1.hashCode())+"-identifiers.pb";
          }else {
             co5.o(a, str);
             if (a instanceof xb4) {
                str4 = "";
             }else if(a instanceof yb4){
                throw new cd2(10);
             }
             str5 = str4.concat("remote-config-fetched.pb");
          }
          this.c = pc.f(p0, str3, str1, str5);
          co5.o(this.a, str);
          this.d = pc.f(p0, "remote-config-debug.pb", "", null);
          File dir1 = p0.getDir("remote-config", 0);
          co5.l(dir1, "directory");
          if (!dir1.exists()) {
             dir1.mkdirs();
          }else {
             uFile1 = new File(dir1, "product-state.pb");
             if (uFile1.exists()) {
                uFile1.delete();
             }
          }
          uFile1 = new File(dir1, "ps");
          if (!uFile1.exists()) {
             uFile1.mkdirs();
          }
          this.e = new ll5(new File(uFile1, "product-state.pb"));
          return;
       }
       a1 = 0;
    }
    public final void a(){
       File[] uFileArray;
       eb2 a = this.b.a;
       a.getClass();
       int i = 0;
       Object[] objArray = new Object[i];
       t37.a().getClass();
       ge6.a(objArray);
       qc a1 = a.a;
       if (a1.exists()) {
          if (a1.isDirectory()) {
             objArray = new Object[i];
             t37.a().getClass();
             ge6.a(objArray);
             if ((uFileArray = a1.listFiles()) != null) {
                int len = uFileArray.length;
                for (; i < len; i = i + 1) {
                   object oobject = uFileArray[i];
                   co5.l(oobject, "it");
                   qc.a(oobject);
                }
             }
          }else {
             qc.a(a1);
          }
       }
       return;
    }
    public final xo5 b(){
       return this.c.b();
    }
    public final void c(xo5 p0){
       co5.o(p0, "configuration");
       xs6 tc = this.c;
       _monitor_enter(tc);
       Objects.toString(tc.a);
       Object[] objArray = new Object[0];
       t37.a().getClass();
       ge6.a(objArray);
       tc.e(p0.a.a());
       _monitor_exit(tc);
    }
}
