package p.pr3;
import java.lang.Iterable;
import java.lang.Object;
import java.util.ArrayDeque;
import p.vr3;
import java.util.Iterator;

public final class pr3 implements Iterable	// class@0022b7 from classes.dex
{
    public final ArrayDeque a;
    public final int b;
    public final int c;

    public void pr3(int p0,int p1){
       super();
       this.a = new ArrayDeque();
       this.b = p0;
       this.c = p1;
    }
    public final vr3 a(long p0){
       vr3 ovr31;
       pr3 ta = this.a;
       vr3 ovr3 = (ta.size() >= this.c)? ta.removeFirst(): null;
       while ((ovr31 = ta.peekFirst()) != null) {
          long l = p0 - (long)this.b;
          if ((ovr31.f - l) >= 0) {
             break ;
          }
          ovr3 = ta.removeFirst();
       }
       if (ovr3 == null) {
          ovr3 = new vr3();
       }
       ovr3.f = p0;
       ta.addLast(ovr3);
       return ovr3;
    }
    public final Iterator iterator(){
       return this.a.iterator();
    }
}
