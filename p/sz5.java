package p.sz5;
import p.qz5;
import p.o85;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import p.ze;
import p.f6;
import p.lb0;

public abstract class sz5 implements qz5	// class@0026cd from classes.dex
{
    public final View a;
    public final ze b;

    public void sz5(o85 p0){
       super();
       this.a = p0;
       this.b = new ze(p0.findViewById(R.id.accessory));
    }
    public final void d(View p0){
       sz5 tb = this.b;
       tb.b(p0);
       tb.c();
    }
    public final View getView(){
       return this.a;
    }
    public final View h(){
       return this.b.c;
    }
    public final void setActive(boolean p0){
       sz5 ta = this.a;
       if (ta instanceof f6) {
          ta.setActive(p0);
       }
       return;
    }
    public final void setAppearsDisabled(boolean p0){
       sz5 ta = this.a;
       if (ta instanceof lb0) {
          ta.setAppearsDisabled(p0);
       }
       return;
    }
}
