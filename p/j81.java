package p.j81;
import java.lang.Runnable;
import p.af2;
import android.view.View;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;

public final class j81 implements Runnable	// class@001a84 from classes.dex
{
    public final af2 a;
    public final View b;
    public final Rect c;

    public void j81(af2 p0,View p1,Rect p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void run(){
       this.a.getClass();
       af2.g(this.b, this.c);
    }
}
