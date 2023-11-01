package p.xz6;
import java.lang.String;
import p.yt6;
import java.lang.Object;
import p.co5;
import p.a32;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import p.p32;
import p.f32;
import p.pe0;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.io.Closeable;
import p.g53;
import p.ox6;
import java.lang.Throwable;
import p.t32;
import p.fv1;
import java.lang.Class;
import p.o42;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import p.u32;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Hashtable;
import java.lang.System;

public final class xz6	// class@002d1c from classes.dex
{
    public final a32 a;
    public final yt6 b;
    public final HashMap c;

    public void xz6(String p0,yt6 p1){
       co5.o(p0, "path");
       co5.o(p1, "fileFactory");
       super(p1.a(p0), p1);
    }
    public void xz6(a32 p0,yt6 p1){
       co5.o(p0, "dir");
       co5.o(p1, "fileFactory");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new HashMap();
       p0 = p1.d(p0, ".tag");
       if (p0.exists() && (p0.isFile() && p0.canRead())) {
          try{
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(p1.a.b(p0), pe0.b));
             Properties properties = new Properties();
             properties.load(uBufferedRea);
             Iterator iterator = properties.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Object key = uEntry.getKey();
                this.c.put(key.toString(), uEntry.getValue().toString());
             }
             g53.a(uBufferedRea);
          }catch(java.io.IOException e4){
             String message = e4.getMessage();
             co5.i(message);
             throw new ox6(message);
          }
       }
       return;
    }
    public final void a(){
       boolean b;
       try{
          this.c.clear();
          xz6 tb = this.b;
          a32 uoa32 = tb.d(this.a, ".tag");
          if (uoa32.exists()) {
             fv1 uofv1 = tb.i();
             try{
                uofv1.getClass();
                if (uoa32.isDirectory()) {
                   fv1.q(uoa32);
                }
                try{
                   b = uoa32.delete();
                }catch(java.lang.Exception e0){
                   b = false;
                }
                if (!b) {
                   e0.a.h(uoa32).close();
                }
             }catch(java.lang.Exception e0){
             }
          }
          return;
       }catch(java.io.FileNotFoundException e0){
       }catch(java.io.IOException e0){
       }
    }
    public final void b(){
       xz6 tb = this.b;
       xz6 ta = this.a;
       a32 uoa32 = tb.d(ta, ".tag");
       if (ta.exists() && (ta.isDirectory() && ta.canWrite())) {
          try{
             BufferedWriter uBufferedWri = new BufferedWriter(new OutputStreamWriter(tb.e(uoa32, false), pe0.b));
             Properties properties = new Properties();
             properties.putAll(this.c);
             properties.store(uBufferedWri, String.valueOf(System.currentTimeMillis()));
             g53.a(uBufferedWri);
          }catch(java.io.IOException e0){
             String message = e0.getMessage();
             co5.i(message);
             throw new ox6(message);
          }
       }
       return;
    }
}
