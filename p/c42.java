package p.c42;
import java.lang.String;
import java.lang.Class;
import p.dj4;
import p.yg3;
import p.m95;
import java.lang.System;
import java.lang.Object;
import p.co5;
import p.ir2;
import p.iw5;
import java.lang.ClassLoader;
import p.el6;
import p.i51;
import java.util.List;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import p.xg3;
import p.nn6;

public abstract class c42	// class@00018e from classes2.dex
{
    public static final yg3 a;

    static {
       dj4 uodj4;
       try{
          Class.forName("java.nio.file.Files");
          uodj4 = new dj4();
       }catch(java.lang.ClassNotFoundException e0){
          uodj4 = new yg3();
       }
       c42.a = uodj4;
       String property = System.getProperty("java.io.tmpdir");
       co5.l(property, "getProperty\(\"java.io.tmpdir\"\)");
       ir2.u(property, false);
       ClassLoader classLoader = iw5.class.getClassLoader();
       co5.l(classLoader, "ResourceFileSystem::class.java.classLoader");
       iw5 property1 = new iw5(classLoader);
    }
    public void c42(){
       super();
    }
    public abstract el6 a(m95 p0);
    public abstract void b(m95 p0,m95 p1);
    public abstract void c(m95 p0);
    public abstract void d(m95 p0);
    public final void e(m95 p0){
       co5.o(p0, "path");
       this.d(p0);
    }
    public final boolean f(m95 p0){
       co5.o(p0, "path");
       boolean b = (this.i(p0) != null)? true: false;
       return b;
    }
    public abstract List g(m95 p0);
    public final i51 h(m95 p0){
       i51 oi51;
       co5.o(p0, "path");
       if ((oi51 = this.i(p0)) != null) {
          return oi51;
       }
       throw new FileNotFoundException("no such file: "+p0);
    }
    public abstract i51 i(m95 p0);
    public abstract xg3 j(m95 p0);
    public abstract el6 k(m95 p0);
    public abstract nn6 l(m95 p0);
}
