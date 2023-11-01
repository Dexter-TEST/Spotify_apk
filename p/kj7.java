package p.kj7;
import android.view.View;
import java.lang.Object;
import p.wh7;

public final class kj7	// class@001c28 from classes.dex
{
    public final View a;
    public int b;
    public int c;
    public int d;

    public void kj7(View p0){
       super();
       this.a = p0;
    }
    public final void a(){
       kj7 ta = this.a;
       wh7.i(ta, (this.d - (ta.getTop() - this.b)));
       wh7.h(ta, ((ta.getLeft() - this.c) - 0));
    }
    public final boolean b(int p0){
       if (this.d == p0) {
          return false;
       }
       this.d = p0;
       this.a();
       return true;
    }
}
