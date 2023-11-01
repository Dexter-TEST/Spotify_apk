package p.as3;
import java.io.Writer;
import java.lang.StringBuilder;
import java.lang.String;

public final class as3 extends Writer	// class@000fe2 from classes.dex
{
    public final StringBuilder a;

    public void as3(){
       super();
       this.a = new StringBuilder(128);
    }
    public final void b(){
       as3 ta = this.a;
       if (ta.length() > 0) {
          ta.delete(0, ta.length());
       }
       return;
    }
    public final void close(){
       this.b();
    }
    public final void flush(){
       this.b();
    }
    public final void write(char[] p0,int p1,int p2){
       char c;
       int i = 0;
       while (i < p2) {
          int i1 = p1 + i;
          if ((c = p0[i1]) == 10) {
             this.b();
          }else {
             StringBuilder str = this.a.append(c);
          }
          i = i + 1;
       }
       return;
    }
}
