package p.z80;
import java.util.Iterator;
import p.ch3;
import p.a90;
import java.lang.Object;
import p.dc1;
import p.i42;
import java.io.Closeable;
import p.xb1;
import java.util.List;
import p.nn6;
import p.hp5;
import p.xe7;
import java.lang.String;
import java.lang.Throwable;
import p.eb3;
import p.co5;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public final class z80 implements Iterator, ch3	// class@002ea6 from classes.dex
{
    public final i42 a;
    public String b;
    public boolean c;

    public void z80(a90 p0){
       super();
       p0 = p0.a;
       _monitor_enter(p0);
       p0.J();
       _monitor_exit(p0);
       this.a = new i42(p0);
    }
    public final boolean hasNext(){
       if (this.b != null) {
          return true;
       }
       this.c = false;
    label_0009 :
       z80 ta = this.a;
       if (!ta.hasNext()) {
          return false;
       }
       try{
          Closeable uCloseable = ta.next();
          this.b = xe7.f(uCloseable.c.get(false)).B();
          eb3.d(uCloseable, null);
          return true;
       }catch(java.io.IOException e0){
          goto label_0009 ;
       }
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       z80 tb = this.b;
       co5.i(tb);
       this.b = null;
       this.c = true;
       return tb;
    }
    public final void remove(){
       if (this.c == null) {
          throw new IllegalStateException("remove\(\) before next\(\)".toString());
       }
       this.a.remove();
       return;
    }
}
