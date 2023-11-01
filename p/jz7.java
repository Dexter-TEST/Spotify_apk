package p.jz7;
import p.dx7;
import p.hy7;
import p.xy7;
import p.iy7;
import p.xv7;
import p.lz7;
import java.lang.Object;
import p.hz7;
import p.yy7;
import java.lang.String;
import java.lang.Class;
import java.io.File;
import p.jy7;
import java.util.concurrent.Executor;
import p.iz7;
import java.lang.Runnable;
import p.dy7;
import java.lang.Throwable;
import p.em0;
import p.my7;
import p.wy7;
import p.i28;

public final class jz7	// class@001b78 from classes.dex
{
    public final dx7 a;
    public final hy7 b;
    public final xy7 c;
    public final hy7 d;
    public final iy7 e;
    public final xv7 f;
    public final lz7 g;

    public void jz7(dx7 p0,hy7 p1,xy7 p2,hy7 p3,iy7 p4,xv7 p5,lz7 p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final void a(hz7 p0){
       jz7 ojz7 = this;
       yy7 oyy7 = p0;
       hz7 c = oyy7.c;
       hz7 d = oyy7.d;
       jz7 a = ojz7.a;
       a.getClass();
       File uFile = new File(a.c(c, d, oyy7.b), "_packs");
       String str = "_metadata";
       File uFile1 = new File(new File(a.c(c, d, oyy7.b), "_slices"), str);
       if (uFile.exists() && uFile1.exists()) {
          my7 File uFile2 = a.j(c, d, oyy7.b);
          uFile2.mkdirs();
          if (!uFile.renameTo(uFile2)) {
             throw new dy7("Cannot move merged pack files to final location.", oyy7.a);
          }
          new File(a.j(c, d, oyy7.b), "merge.tmp").delete();
          uFile2 = new File(a.j(c, d, oyy7.b), str);
          uFile2.mkdirs();
          if (!uFile1.renameTo(uFile2)) {
             throw new dy7("Cannot move metadata files to final location.", oyy7.a);
          }
          jz7 d1 = ojz7.d;
          if (ojz7.f.a()) {
             try{
                ojz7.g.b(oyy7.b, oyy7.c, oyy7.d, oyy7.e);
                d1.c().execute(new iz7(ojz7, 0, oyy7));
             }catch(java.io.IOException e0){
                Object[] objArray = new Object[]{oyy7.b,e0.getMessage()};
                throw new dy7(String.format("Could not write asset pack version tag for pack %s: %s", objArray), oyy7.a);
             }
          }else {
             d1.c().execute(new em0(18, a));
          }
          jz7 c1 = ojz7.c;
          c1.getClass();
          uFile2 = new my7(c1, oyy7.b, c, d);
          c1.c(uFile2);
          ojz7.e.a(oyy7.b);
          ojz7.b.c().d(oyy7.a, oyy7.b);
          return;
       }else {
          Object[] objArray1 = new Object[]{oyy7.b};
          throw new dy7(String.format("Cannot find pack files to move for pack %s.", objArray1), oyy7.a);
       }
    }
}
