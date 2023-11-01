package p.ap7;
import p.wq0;
import java.util.ArrayList;
import p.oy6;
import java.lang.Object;

public abstract class ap7 extends wq0	// class@000fcd from classes.dex
{
    public ArrayList q0;

    public void ap7(){
       super();
       this.q0 = new ArrayList();
    }
    public void D(){
       this.q0.clear();
       super.D();
    }
    public final void G(oy6 p0){
       super.G(p0);
       int i = this.q0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.q0.get(i1).G(p0);
       }
       return;
    }
    public abstract void R();
}
