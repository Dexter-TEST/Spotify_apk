package p.i76;
import p.yf2;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import com.spotify.litesettings.settings.StorageSettingsActivity;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import p.tv;
import java.util.Iterator;
import p.hw;
import java.util.Set;
import p.sv;
import p.ae0;
import p.be0;
import p.ce0;
import p.ys5;
import p.zd0;
import com.spotify.litesettings.settings.ChangeOfflineModeFragment;
import p.jc7;
import com.spotify.litesettings.settings.ChangeCellularLimitFragment;
import p.r45;
import java.lang.String;
import p.r56;
import p.cv2;
import java.lang.Class;
import p.vu2;
import p.av2;
import p.z66;
import p.b96;
import p.u76;
import java.lang.CharSequence;
import p.l66;
import p.k66;
import p.i66;
import p.s66;
import p.oa0;
import p.gc5;

public final class i76 implements yf2	// class@00193d from classes.dex
{
    public final int a;

    public void i76(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       int i = 1;
       switch (this.a){
           case 0:
             return new s66(p0.a);
           case 1:
             return new i66();
           case 2:
             return new k66(p0);
           case 3:
             return new l66();
           case 4:
             return p0.b.toString().trim();
           case 5:
             return new z66(p0);
           case 6:
             p0.getClass();
             return p0;
           case 7:
             p0.getClass();
             return p0;
           case 8:
             p0.getClass();
             return p0;
           case 9:
             p0.getClass();
             return p0;
           case 10:
             return p0.H;
           case 11:
             return p0.b();
           case 12:
             return Long.valueOf(ChangeCellularLimitFragment.v);
           case 13:
             return Long.valueOf(ChangeCellularLimitFragment.w);
           case 14:
             return Long.valueOf(ChangeCellularLimitFragment.x);
           case 15:
             return Long.valueOf(ChangeCellularLimitFragment.y);
           case 16:
             return Long.valueOf(ChangeCellularLimitFragment.z);
           case 17:
             return Long.valueOf(ChangeCellularLimitFragment.A);
           case 18:
             return p0.g;
           case 19:
             return new be0(ce0.v, p0);
           case 20:
             return Boolean.valueOf(p0.e);
           case 21:
             return Boolean.valueOf(p0.e);
           case 22:
             return Boolean.valueOf((p0.isEmpty() ^ i));
           case 23:
             return p0.b;
           case 24:
             p0 = p0.iterator();
             long l = 0;
             while (p0.hasNext()) {
                tv otv = p0.next();
                if (otv.h == null && otv.f == null) {
                   continue ;
                }
                l = l + otv.d;
             }
             return Long.valueOf(l);
             break;
           case 25:
             if (p0.f == null || p0.g == null) {
                i = false;
             }
             return Boolean.valueOf(i);
             break;
           case 26:
             return Observable.intervalRange(0, 2, 100, 400, TimeUnit.MILLISECONDS, s36.b);
           case 27:
             return Long.valueOf(((long)p0.intValue() * 0x100000));
           case 28:
             return Boolean.valueOf((p0.isEmpty() ^ i));
           default:
             return new gc5();
       }
    }
}
