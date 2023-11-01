package p.m07;
import java.lang.Object;
import p.a28;
import java.lang.Exception;
import java.lang.Class;
import p.j07;
import p.l18;
import java.lang.NullPointerException;
import java.lang.String;

public final class m07	// class@001dff from classes.dex
{
    public final a28 a;

    public void m07(){
       super();
       this.a = new a28();
    }
    public final void a(Exception p0){
       m07 ta = this.a;
       ta.getClass();
       String str = "Exception must not be null";
       if (p0 == null) {
          throw new NullPointerException(str);
       }
       a28 a = ta.a;
       _monitor_enter(a);
       if (ta.c != null) {
          _monitor_exit(a);
       }else {
          ta.c = true;
          ta.f = p0;
          _monitor_exit(a);
          ta.b.a(ta);
       }
       return;
    }
    public final void b(Object p0){
       m07 ta = this.a;
       a28 a = ta.a;
       _monitor_enter(a);
       if (ta.c != null) {
          _monitor_exit(a);
       }else {
          ta.c = true;
          ta.e = p0;
          _monitor_exit(a);
          ta.b.a(ta);
       }
       return;
    }
}
