package p.xk2;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.kb;
import android.content.Context;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.j17;
import p.kf6;

public final class xk2	// class@002c93 from classes.dex
{
    public final Activity a;

    public void xk2(Activity p0){
       co5.o(p0, "activity");
       super();
       this.a = p0;
    }
    public final void a(kb p0){
       xk2 ta = this.a;
       tj2 otj2 = xe7.k0(ta, ta.getString(R.string.smartlock_nudge_heading_spotify), ta.getString(R.string.smartlock_nudge_body_spotify));
       otj2.e = false;
       otj2.a = ta.getString(R.string.smartlock_nudge_cta);
       otj2.c = new j17(2, p0);
       otj2.a().l();
    }
}
