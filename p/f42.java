package p.f42;
import p.e42;
import p.i42;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j42;
import p.k42;
import java.lang.Class;

public final class f42 extends e42	// class@001556 from classes.dex
{
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final i42 f;

    public void f42(i42 p0,File p1){
       co5.o(p1, "rootDir");
       this.f = p0;
       super(p1);
    }
    public final File a(){
       f42 tc;
       j42 ta = this.a;
       boolean b = true;
       f42 tf = this.f;
       if (this.e == null && this.c == null) {
          tf.v.getClass();
          File[] uFileArray = ta.listFiles();
          this.c = uFileArray;
          if (uFileArray == null) {
             tf.v.getClass();
             this.e = b;
          }
       }
       if ((tc = this.c) != null) {
          co5.i(tc);
          if (this.d < tc.length) {
             tc = this.c;
             co5.i(tc);
             f42 td = this.d;
             this.d = td + 1;
             return tc[td];
          }
       }
       if (this.b == null) {
          this.b = b;
          return ta;
       }else {
          tf.v.getClass();
          return null;
       }
    }
}
