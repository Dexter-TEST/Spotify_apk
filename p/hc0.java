package p.hc0;
import p.ic0;
import p.dc0;
import p.jc0;
import p.gc0;
import java.lang.Object;
import android.view.View;
import p.p85;

public final class hc0 implements ic0, dc0	// class@001820 from classes.dex
{
    public final jc0 a;

    public void hc0(jc0 p0,gc0 p1){
       super();
       this.a = p0;
       p0.setAppearance(p1);
    }
    public final View getView(){
       return this.a;
    }
    public final void setActive(boolean p0){
       this.a.setActive(p0);
    }
}
