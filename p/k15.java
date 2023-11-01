package p.k15;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import p.wf2;

public abstract class k15	// class@001b89 from classes.dex
{
    public boolean a;
    public final CopyOnWriteArrayList b;
    public wf2 c;

    public void k15(boolean p0){
       super();
       this.a = p0;
       this.b = new CopyOnWriteArrayList();
    }
    public abstract void a();
    public final void b(boolean p0){
       k15 tc;
       this.a = p0;
       if ((tc = this.c) != null) {
          tc.invoke();
       }
       return;
    }
}
