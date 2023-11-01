package p.lz7;
import p.jd;
import java.lang.String;
import p.dx7;
import p.mz7;
import p.xv7;
import java.lang.Object;
import java.lang.Class;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.InputStream;
import java.util.Dictionary;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class lz7	// class@001df6 from classes.dex
{
    public final dx7 a;
    public final mz7 b;
    public final xv7 c;
    public static final jd d;

    static {
       lz7.d = new jd("PackMetadataManager");
    }
    public void lz7(dx7 p0,mz7 p1,xv7 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String a(String p0){
       int i1;
       Properties properties;
       if (this.c.a()) {
          lz7 ta = this.a;
          ta.getClass();
          try{
             int i = 1;
             if (ta.m(p0) != null) {
                i1 = 1;
                try{
                label_0019 :
                   if (i1) {
                      i1 = this.b.a();
                      File uFile = new File(e0.j(i1, e0.i(p0), p0), "_metadata");
                      String str = "properties.dat";
                      File uFile1 = new File(uFile, str);
                      if (!uFile1.exists()) {
                         p0 = String.valueOf(i1);
                      }else {
                         FileInputStream str1 = new FileInputStream(uFile1);
                         properties = new Properties();
                         properties.load(str1);
                         str1.close();
                         p0 = ((str = properties.getProperty("moduleVersionTag")) == null)? String.valueOf(i1): str;
                      }
                      return p0;
                   }
                }catch(java.io.IOException e0){
                   Object[] objArray = new Object[i];
                   objArray[0] = p0;
                   lz7.d.c("Failed to read pack version tag for pack %s", objArray);
                }
             }
          }catch(java.io.IOException e0){
          }
          i1 = 0;
          goto label_0019 ;
       }
       return "";
    }
    public final void b(String p0,int p1,long p2,String p3){
       if (p3 == null || p3.isEmpty()) {
          p3 = String.valueOf(p1);
       }
       Properties properties = new Properties();
       properties.put("moduleVersionTag", p3);
       lz7 ta = this.a;
       ta.getClass();
       File uFile = new File(new File(ta.j(p1, p2, p0), "_metadata"), "properties.dat");
       uFile.getParentFile().mkdirs();
       uFile.createNewFile();
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       properties.store(uFileOutputS, null);
       uFileOutputS.close();
       return;
    }
}
