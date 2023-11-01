package p.oq6;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;
import java.util.Arrays;

public final class oq6	// class@002170 from classes.dex
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final StaggeredGridLayoutManager g;

    public void oq6(StaggeredGridLayoutManager p0){
       this.g = p0;
       super();
       this.a();
    }
    public final void a(){
       oq6 tf;
       this.a = -1;
       this.b = Integer.MIN_VALUE;
       this.c = false;
       this.d = false;
       this.e = false;
       if ((tf = this.f) != null) {
          Arrays.fill(tf, -1);
       }
       return;
    }
}
