package p.hh0;
import java.io.FileOutputStream;
import p.ey0;
import java.io.File;
import java.lang.String;
import p.kg4;
import java.lang.StringBuilder;
import java.lang.Object;
import p.en6;
import java.io.IOException;

public final class hh0 extends FileOutputStream	// class@00184d from classes.dex
{
    public final String a;
    public File b;
    public boolean c;
    public static final ey0 t;

    static {
       hh0.t = new ey0(4);
    }
    public void hh0(File p0,String p1){
       super(new File(p0, kg4.l(p1, ".cls_temp")));
       this.c = false;
       String str = en6.p(p0, File.separator, p1);
       this.a = str;
       this.b = new File(kg4.l(str, ".cls_temp"));
    }
    public final void b(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.flush();
       super.close();
       return;
    }
    public synchronized final void close(){
       String str = "Could not rename temp file: ";
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.flush();
       super.close();
       File uFile = new File(this.a+".cls");
       if (this.b.renameTo(uFile)) {
          this.b = null;
          return;
       }else {
          String str1 = "";
          if (!uFile.exists()) {
             if (!this.b.exists()) {
                str1 = " \(source does not exist\)";
             }
          }else {
             str1 = " \(target already exists\)";
          }
          throw new IOException(str+this.b+" -> "+uFile+str1);
       }
    }
}
