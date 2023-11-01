package p.iw7;
import p.e28;
import p.pw7;
import p.l08;
import android.os.Bundle;
import p.ow7;
import java.lang.Object;
import java.lang.String;
import p.jd;
import java.util.ArrayList;
import java.lang.Boolean;
import android.os.BaseBundle;
import java.lang.Integer;
import p.ll;
import java.lang.Exception;

public abstract class iw7 extends e28	// class@001a1c from classes.dex
{
    public final l08 b;
    public final pw7 c;

    public void iw7(pw7 p0,l08 p1){
       this.c = p0;
       this.b = p1;
    }
    public void c(Bundle p0,Bundle p1){
       this.c.d.c(this.b);
       Object[] objArray = new Object[0];
       pw7.g.e("onGetChunkFileDescriptor", objArray);
    }
    public void r(ArrayList p0){
       this.c.d.c(this.b);
       Object[] objArray = new Object[0];
       pw7.g.e("onGetSessionStates", objArray);
    }
    public void t(Bundle p0,Bundle p1){
       this.c.e.c(this.b);
       Object[] objArray = new Object[]{Boolean.valueOf(p0.getBoolean("keep_alive"))};
       pw7.g.e("onKeepAlive\(%b\)", objArray);
    }
    public void u(Bundle p0){
       iw7 tb = this.b;
       this.c.d.c(tb);
       int intx = p0.getInt("error_code");
       Object[] objArray = new Object[]{Integer.valueOf(intx)};
       pw7.g.c("onError\(%d\)", objArray);
       tb.a(new ll(intx, 0));
    }
}
