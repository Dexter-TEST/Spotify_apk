package p.nt7;
import p.uw;
import p.ol2;
import java.lang.Object;
import java.lang.Boolean;
import android.os.Message;
import android.os.Handler;

public final class nt7 implements uw	// class@002049 from classes.dex
{
    public final ol2 a;

    public void nt7(ol2 p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0){
       ol2 n = this.a.n;
       n.sendMessage(n.obtainMessage(1, Boolean.valueOf(p0)));
    }
}
