package p.qc;
import p.po0;
import java.io.File;
import java.lang.Object;
import p.ge6;
import p.t37;
import java.lang.String;
import java.lang.Class;
import p.xo5;
import p.mm2;
import p.lm2;
import p.dr0;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Closeable;
import java.lang.Throwable;
import p.eb3;
import java.io.FileOutputStream;
import java.util.Objects;

public final class qc implements po0	// class@002378 from classes.dex
{
    public final File a;
    public final File b;

    public void qc(File p0,File p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static void a(File p0){
       Object[] objArray;
       if (!p0.delete()) {
          p0.toString();
          objArray = new Object[0];
          t37.a().getClass();
          ge6.e(objArray);
       }else {
          p0.toString();
          objArray = new Object[0];
          t37.a().getClass();
          ge6.a(objArray);
       }
       return;
    }
    public static xo5 c(File p0){
       Object[] objArray;
       int i = (p0.exists() && (p0.length()))? 0: 1;
       if (i) {
          p0.toString();
          objArray = new Object[0];
          t37.a().getClass();
          ge6.k(objArray);
          return null;
       }else {
          try{
             return dr0.c(lm2.a(qc.d(p0)));
          }catch(p.rc3 e0){
             p0.toString();
             objArray = new Object[v1];
             t37.a().getClass();
             ge6.f(objArray);
             return v2;
          }
       }
    }
    public static byte[] d(File p0){
       int i = (int)p0.length();
       try{
          byte[] uobyteArray = new byte[i];
          DataInputStream uDataInputSt = new DataInputStream(new FileInputStream(p0));
          uDataInputSt.readFully(uobyteArray);
          eb3.d(uDataInputSt, null);
       }catch(java.io.IOException e0){
          p0.toString();
          Object[] objArray = new Object[0];
          t37.a().getClass();
          ge6.f(objArray);
       }
       return e0;
    }
    public synchronized final xo5 b(){
       xo5 oxo5;
       qc tb;
       if ((oxo5 = qc.c(this.a)) != null) {
          return oxo5;
       }
       if ((tb = this.b) != null && (oxo5 = qc.c(tb)) != null) {
          return oxo5;
       }
       return xo5.c;
    }
    public final void e(byte[] p0){
       qc ta = this.a;
       int i = 0;
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(ta);
          Objects.toString(ta);
          Object[] objArray = new Object[i];
          t37.a().getClass();
          ge6.a(objArray);
          uFileOutputS.write(p0);
          eb3.d(uFileOutputS, null);
       }catch(java.io.IOException e0){
          Objects.toString(e0);
          Object[] objArray1 = new Object[i];
          t37.a().getClass();
          ge6.f(objArray1);
       }
       return;
    }
}
