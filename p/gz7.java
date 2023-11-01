package p.gz7;
import p.jd;
import java.lang.String;
import p.dx7;
import java.lang.Object;
import java.io.File;
import p.dy7;
import p.fz7;
import p.yy7;
import java.lang.Class;
import java.util.Properties;
import java.util.Dictionary;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Throwable;
import java.lang.Exception;

public final class gz7	// class@0017af from classes.dex
{
    public final dx7 a;
    public static final jd b;

    static {
       gz7.b = new jd("MergeSliceTaskHandler");
    }
    public void gz7(dx7 p0){
       this.a = p0;
    }
    public static void b(File p0,File p1){
       if (p0.isDirectory()) {
          p1.mkdirs();
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             gz7.b(oobject, new File(p1, oobject.getName()));
          }
          if (!p0.delete()) {
             throw new dy7("Unable to delete directory: ".concat(String.valueOf(p0)));
          }
       }else if(!p1.exists()){
          if (!p0.renameTo(p1)) {
             throw new dy7("Unable to move file: ".concat(String.valueOf(p0)));
          }
       }else {
          throw new dy7("File clashing with existing file from other slice: ".concat(p1.toString()));
       }
       return;
    }
    public final void a(fz7 p0){
       Object[] objArray;
       File uFile = this.a.l(p0.b, p0.c, p0.d, p0.e);
       int i = 0;
       int i1 = 1;
       if (uFile.exists()) {
          gz7 ta = this.a;
          ta.getClass();
          fz7 c = p0.c;
          fz7 d = p0.d;
          File uFile1 = new File(ta.c(c, d, p0.b), "_packs");
          if (!uFile1.exists()) {
             uFile1.mkdirs();
          }
          try{
             gz7.b(uFile, uFile1);
             uFile1 = new File(new File(ta.c(c, d, p0.b), "_packs"), "merge.tmp");
             Properties properties = new Properties();
             properties.put("numberOfMerges", String.valueOf((ta.h(c, d, p0.b) + i1)));
             uFile1.getParentFile().mkdirs();
             uFile1.createNewFile();
             FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
             properties.store(uFileOutputS, null);
             uFileOutputS.close();
             return;
          }catch(java.io.IOException e0){
             objArray = new Object[i1];
             objArray[i] = e0.getMessage();
             gz7.b.c("Writing merge checkpoint failed with %s.", objArray);
             throw new dy7("Writing merge checkpoint failed.", e0, p0.a);
          }
       }else {
          objArray = new Object[i1];
          objArray[i] = p0.e;
          throw new dy7(String.format("Cannot find verified files for slice %s.", objArray), p0.a);
       }
    }
}
