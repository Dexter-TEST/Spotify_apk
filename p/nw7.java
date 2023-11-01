package p.nw7;
import p.iw7;
import p.pw7;
import p.l08;
import java.lang.String;
import android.os.Bundle;
import p.ow7;
import android.os.BaseBundle;
import java.lang.Object;
import java.lang.Integer;
import p.jd;

public final class nw7 extends iw7	// class@002064 from classes.dex
{
    public final int d;
    public final String e;
    public final int f;
    public final pw7 g;

    public void nw7(pw7 p0,l08 p1,int p2,String p3,int p4){
       this.g = p0;
       super(p0, p1);
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void u(Bundle p0){
       nw7 tf;
       nw7 tg = this.g;
       tg.d.c(this.b);
       Object[] objArray = new Object[]{Integer.valueOf(p0.getInt("error_code"))};
       pw7.g.c("onError\(%d\), retrying notifyModuleCompleted...", objArray);
       if ((tf = this.f) > null) {
          tf--;
          tg.j(this.e, this.d, tf);
       }
       return;
    }
}
