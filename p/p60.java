package p.p60;
import p.ye4;
import java.lang.String;
import java.nio.charset.Charset;
import android.content.Context;
import p.we4;
import p.x3;
import java.lang.Object;
import java.io.File;
import p.zb6;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.StringBuilder;
import java.io.Closeable;
import p.xj0;

public final class p60 implements ye4	// class@0021fa from classes.dex
{
    public final Context a;
    public final we4 b;
    public final x3 c;
    public static final Charset d;

    static {
       p60.d = Charset.forName("UTF-8");
    }
    public void p60(Context p0,we4 p1,x3 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static File b(File p0,String p1){
       object oobject;
       File[] uFileArray = p0.listFiles();
       int len = uFileArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = uFileArray[i];
          if (oobject.getName().endsWith(p1)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public final zb6 a(String p0){
       File uFile = this.c.a(p0);
       zb6 ozb6 = new zb6();
       if (uFile != null && uFile.exists()) {
          ozb6.a = p60.b(uFile, ".dmp");
          ozb6.b = p60.b(uFile, ".maps");
          ozb6.c = p60.b(uFile, ".device_info");
          ozb6.d = new File(uFile, "session.json");
          ozb6.e = new File(uFile, "app.json");
          ozb6.f = new File(uFile, "device.json");
          ozb6.g = new File(uFile, "os.json");
       }
       return new zb6(ozb6);
    }
    public final void c(String p0,String p1,String p2){
       BufferedWriter uBufferedWri;
       File uFile = new File(this.c.a(p0), p2);
       p0 = "Failed to close ";
       try{
          int i = 0;
          OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(uFile), p60.d);
          try{
             uBufferedWri = new BufferedWriter(outputStream);
             uBufferedWri.write(p1);
             xj0.l(uBufferedWri, p0+uFile);
          }catch(java.io.IOException e0){
             Closeable uCloseable = uBufferedWri;
             xj0.l(i, p0+e0);
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
