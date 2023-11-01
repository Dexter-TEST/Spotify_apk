package p.pc;
import p.ub3;
import p.yb3;
import p.gl;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import p.lb7;
import android.content.Context;
import p.qc;
import p.co5;
import java.io.File;
import java.lang.Integer;
import p.ao1;
import java.lang.AssertionError;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.il;
import p.hl;

public final class pc implements ub3, yb3, gl	// class@002239 from classes.dex
{
    public final int a;

    public void pc(int p0){
       this.a = p0;
       super();
    }
    public void pc(int p0,int p1){
       this.a = p0;
       p1 = 1;
       if (p0 != p1) {
          p1 = 5;
          if (p0 != p1) {
             p1 = 6;
             if (p0 != p1) {
                if (p0 != 7) {
                   switch (p0){
                       case 11:
                         super(11);
                         return;
                       case 12:
                         super(12);
                         return;
                       case 13:
                         super(13);
                         return;
                       case 14:
                         super(14);
                         return;
                       case 15:
                         super(15);
                         return;
                       case 16:
                         super(16);
                         return;
                       case 17:
                         super(17);
                         return;
                       case 18:
                         super(18);
                         return;
                       case 19:
                         super(19);
                         return;
                       case 20:
                         super(20);
                         return;
                       case 21:
                         super(21);
                         return;
                       case 22:
                         super(22);
                         return;
                       case 23:
                         super(23);
                         return;
                       case 24:
                         super(24);
                         return;
                       case 25:
                         super(25);
                         return;
                       case 26:
                         super(26);
                         return;
                       case 27:
                         super(27);
                         return;
                       case 28:
                         super(28);
                         return;
                       case 29:
                         super(29);
                         return;
                       default:
                         super(0);
                         return;
                   }
                }else {
                   super(7);
                   return;
                }
             }else {
                super(p1);
                return;
             }
          }else {
             super(p1);
             return;
          }
       }else {
          super(p1);
          return;
       }
    }
    public static final boolean e(StringBuilder p0,String p1,Object p2,boolean p3){
       if (p2 != null) {
          if (p3) {
             p0 = p0+",";
          }
          p0 = p0+p1+'='+p2;
       }else {
          p2 = null;
       }
       boolean b = (p2 != null)? true: false;
       return b;
    }
    public static qc f(Context p0,String p1,String p2,String p3){
       File dir1;
       File uFile;
       co5.o(p1, "fileName");
       co5.o(p2, "subfolder");
       int i = 0;
       File dir = p0.getDir("remote-config", i);
       co5.l(dir, "this.getDir\(DEFAULT_DIRE…RY, Context.MODE_PRIVATE\)");
       if (p3 != null) {
          dir1 = p0.getDir("remote-config", i);
          co5.l(dir1, "this.getDir\(DEFAULT_DIRE…RY, Context.MODE_PRIVATE\)");
          uFile = new File(dir1, p3);
       }else {
          uFile = null;
       }
       if (p2.length() > 0) {
          i = 1;
       }
       if (i) {
          dir1 = new File(dir, p2);
          if (!dir1.exists()) {
             dir1.mkdirs();
          }
          dir = dir1;
       }
       if (!dir.exists()) {
          dir.mkdirs();
       }
       return new qc(new File(dir, p1), uFile);
    }
    public final Object a(Object p0){
       if ((p0 = ao1.a(p0.intValue())) == null) {
          p0 = ao1.C;
       }
       return p0;
    }
    public final void b(AssertionError p0){
       Object[] objArray = new Object[0];
       Logger.c(p0, "", objArray);
       throw p0;
    }
    public final void c(il p0){
       Object[] objArray = new Object[0];
       Logger.c(p0, "", objArray);
       throw p0;
    }
    public final void d(hl p0){
       Object[] objArray = new Object[0];
       Logger.c(p0, "", objArray);
    }
}
