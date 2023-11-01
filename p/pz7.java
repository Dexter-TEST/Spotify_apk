package p.pz7;
import p.jd;
import java.lang.String;
import p.dx7;
import p.hy7;
import java.lang.Object;
import p.oz7;
import p.yy7;
import java.io.File;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;
import p.fx7;
import p.sz7;
import p.gy7;
import p.ap5;
import p.jy7;
import p.i28;
import java.lang.Throwable;
import p.dy7;
import java.lang.Exception;

public final class pz7	// class@002302 from classes.dex
{
    public final dx7 a;
    public final hy7 b;
    public static final jd c;

    static {
       pz7.c = new jd("PatchSliceTaskHandler");
    }
    public void pz7(dx7 p0,hy7 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(oz7 p0){
       pz7 opz7 = this;
       yy7 oyy7 = p0;
       jd c = pz7.c;
       pz7 a = opz7.a;
       sz7 oz7 c1 = oyy7.c;
       oz7 d = oyy7.d;
       File uFile = a.j(c1, d, oyy7.b);
       File uFile1 = a.j(c1, d, oyy7.b);
       File uFile2 = new File(uFile1, "_metadata");
       oz7 h = oyy7.h;
       File uFile3 = new File(uFile2, h);
       c1 = 2;
       try{
          int i = 0;
          oz7 j = oyy7.j;
          oz7 ooz7 = (oyy7.g != c1)? j: new GZIPInputStream(j, 8192);
          fx7 uofx7 = new fx7(uFile, uFile3);
          uFile = opz7.a.k(oyy7.b, oyy7.e, oyy7.f, oyy7.h);
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          c1 = new sz7(opz7.a, oyy7.b, oyy7.e, oyy7.f, oyy7.h);
          ap5.H(uofx7, ooz7, new gy7(uFile, c1), oyy7.i);
          try{
             c1.g(i);
             ooz7.close();
             Object[] objArray1 = new Object[2];
             objArray1[i] = h;
             objArray1[1] = oyy7.b;
             c.e("Patching and extraction finished for slice %s of pack %s.", objArray1);
             i28 oi28 = opz7.b.c();
             yy7 a1 = oyy7.a;
             yy7 b = oyy7.b;
             try{
                oi28.g(a1, b, i, h);
                j.close();
                return;
             }catch(java.io.IOException e0){
                objArray1 = new Object[2];
                objArray1[i] = h;
                objArray1[1] = oyy7.b;
                c.f("Could not close file for slice %s of pack %s.", objArray1);
                return;
             }
          }catch(java.io.IOException e0){
             Object[] objArray = new Object[1];
             objArray[i] = e0.getMessage();
             c.c("IOException during patching %s.", objArray);
             objArray = new Object[2];
             objArray[i] = h;
             objArray[1] = oyy7.b;
             throw new dy7(String.format("Error patching slice %s of pack %s.", objArray), e0, oyy7.a);
          }
       }catch(java.io.IOException e0){
       }
    }
}
