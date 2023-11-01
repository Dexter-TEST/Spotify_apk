package p.qx1;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.lang.Object;
import android.widget.CompoundButton;
import com.spotify.litesettings.settings.PrivateSettingsActivity;
import androidx.recyclerview.widget.RecyclerView;
import p.wp3;
import java.lang.Boolean;
import p.tn6;
import p.ok0;
import p.ko1;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import io.reactivex.rxjava3.core.Completable;
import p.id;
import io.reactivex.rxjava3.core.CompletableSource;
import p.rx1;
import java.lang.Runnable;
import p.jk0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;
import com.spotify.litesettings.settings.OfflineSettingsActivity;
import com.spotify.litesettings.settings.ExplicitContentSettingsActivity;
import p.el5;
import java.lang.Class;
import java.lang.String;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.sm0;
import io.reactivex.rxjava3.core.Observer;

public final class qx1 implements CompoundButton$OnCheckedChangeListener	// class@002430 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void qx1(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       int i = 1;
       qx1 tb = this.b;
       qx1 tc = this.c;
       switch (this.a){
           case 0:
             ExplicitContentSettingsActivity s = tc.S;
             String str = (p1)? "0": "1";
             s.getClass();
             tc.T.c(new rk0(s.a.updateState("filter-explicit-content", str).p(s36.c), id.a(), i).c(Completable.j(new rx1(tb, 0))).subscribe());
             return;
             break;
           case 1:
             OfflineSettingsActivity q = tc.Q;
             tc.S.c(new rk0(q.d.s(q.a, Boolean.valueOf(p1)).p(s36.c), id.a(), i).c(Completable.j(new rx1(tb, i))).subscribe());
             return;
           case 2:
             PrivateSettingsActivity q1 = tc.Q;
             tc.S.c(new rk0(q1.e.s(q1.a, Boolean.valueOf(p1)).p(s36.c), id.a(), i).c(Completable.j(new rx1(tb, 2))).subscribe());
             return;
           default:
             tc.getClass();
             tb.onNext(tc);
             return;
       }
    }
}
