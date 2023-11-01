package p.b42;
import p.d42;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import p.co5;
import java.io.IOException;
import java.lang.StringBuilder;
import p.nn;
import p.i15;
import java.io.FileOutputStream;
import p.b57;
import java.io.OutputStream;

public final class b42 implements d42	// class@000176 from classes2.dex
{

    public void b42(){
       super();
    }
    public final void a(File p0){
       co5.o(p0, "file");
       if (!p0.delete() && p0.exists()) {
          throw new IOException(co5.K(p0, "failed to delete "));
       }
       return;
    }
    public final void b(File p0){
       File[] uFileArray;
       object oobject;
       co5.o(p0, "directory");
       if ((uFileArray = p0.listFiles()) == null) {
          throw new IOException(co5.K(p0, "not a readable directory: "));
       }
       int len = uFileArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          oobject = uFileArray[i];
          i = i + 1;
          if (oobject.isDirectory()) {
             this.b(oobject);
          }
          if (oobject.delete()) {
          }else {
             break ;
          }
       }
       throw new IOException(co5.K(oobject, "failed to delete "));
    }
    public final boolean c(File p0){
       co5.o(p0, "file");
       return p0.exists();
    }
    public final void d(File p0,File p1){
       co5.o(p0, "from");
       co5.o(p1, "to");
       this.a(p1);
       if (p0.renameTo(p1)) {
          return;
       }
       throw new IOException("failed to rename "+p0+" to "+p1);
    }
    public final nn e(File p0){
       nn onn;
       co5.o(p0, "file");
       try{
          int i = 0;
          onn = new nn(new FileOutputStream(p0, i), new b57());
       }catch(java.io.FileNotFoundException e0){
          p0.getParentFile().mkdirs();
          onn = new nn(new FileOutputStream(p0, e0), new b57());
       }
       return onn;
    }
    public final String toString(){
       return "FileSystem.SYSTEM";
    }
}
