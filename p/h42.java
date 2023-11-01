package p.h42;
import p.e42;
import p.i42;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.j42;
import p.k42;
import java.lang.Class;

public final class h42 extends e42	// class@0017da from classes.dex
{
    public boolean b;
    public File[] c;
    public int d;
    public final i42 e;

    public void h42(i42 p0,File p1){
       co5.o(p1, "rootDir");
       this.e = p0;
       super(p1);
    }
    public final File a(){
       h42 tc;
       j42 ta = this.a;
       h42 te = this.e;
       if (this.b == null) {
          te.v.getClass();
          this.b = true;
          return ta;
       }else if((tc = this.c) != null){
          co5.i(tc);
          if (this.d >= tc.length) {
             te.v.getClass();
             return null;
          }
       }
       if (this.c == null) {
          File[] uFileArray = ta.listFiles();
          this.c = uFileArray;
          if (uFileArray == null) {
             te.v.getClass();
          }
          if ((tc = this.c) != null) {
             co5.i(tc);
             if (tc.length) {
             label_004e :
                tc = this.c;
                co5.i(tc);
                h42 td = this.d;
                this.d = td + 1;
                return tc[td];
             }
          }
          te.v.getClass();
          return null;
       }else {
          goto label_004e ;
       }
    }
}
