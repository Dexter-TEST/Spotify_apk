package p.xd0;
import p.ir0;
import com.spotify.litesettings.settings.ChangeOfflineModeFragment;
import java.lang.Object;
import p.be0;
import java.lang.Class;
import java.lang.Iterable;
import p.ab2;
import p.zh0;
import p.jg2;
import com.google.common.collect.c;
import java.util.List;
import p.lm0;
import p.ae0;
import androidx.fragment.app.k;
import androidx.fragment.app.Fragment;
import p.yd0;
import com.spotify.litesettings.settings.ChangeOfflineModeActivity;
import android.app.Activity;

public final class xd0 implements ir0	// class@002c52 from classes.dex
{
    public final int a;
    public final ChangeOfflineModeFragment b;

    public void xd0(ChangeOfflineModeFragment p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       xd0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             p0 = tb.requireActivity();
             if (p0 instanceof yd0) {
                p0.finish();
             }
             return;
       }
       tb.getClass();
       tb.c.A(ab2.b(p0.a).m(new zh0(tb, 1, p0)).d());
       return;
    }
}
