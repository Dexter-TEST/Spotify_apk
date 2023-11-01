package p.an6;
import p.mr5;
import p.g65;
import androidx.recyclerview.widget.RecyclerView;

public final class an6 extends mr5	// class@000fba from classes.dex
{
    public boolean a;
    public final g65 b;

    public void an6(g65 p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public final void a(RecyclerView p0,int p1){
       if (!p1 && this.a != null) {
          this.a = false;
          this.b.h();
       }
       return;
    }
    public final void b(RecyclerView p0,int p1,int p2){
       if (p1 || p2) {
          this.a = true;
       }
       return;
    }
}
