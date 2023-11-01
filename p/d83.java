package p.d83;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.KeyEvent$Callback;
import java.lang.Object;
import android.widget.CompoundButton;
import com.spotify.litesettings.settings.InAppMessagingDebugActivity;
import p.co3;
import java.lang.Boolean;
import p.tn6;
import p.ok0;
import p.ko1;
import p.p20;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.liteui.entityview.hubs.DownloadHeaderView;
import p.zh0;
import p.uu2;
import p.ju2;
import p.w51;
import p.xs5;
import p.cu2;
import java.lang.String;
import p.m73;
import p.du2;

public final class d83 implements CompoundButton$OnCheckedChangeListener	// class@0012f9 from classes.dex
{
    public final int a;
    public final KeyEvent$Callback b;

    public void d83(KeyEvent$Callback p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       InAppMessagingDebugActivity q;
       p20 op20;
       DownloadHeaderView b;
       d83 tb = this.b;
       switch (this.a){
           case 0:
             q = tb.Q;
             op20 = new p20();
             q.e.s(q.i, Boolean.valueOf(p1)).subscribe(op20);
             op20.a();
             return;
           case 1:
             q = tb.Q;
             op20 = new p20();
             q.d.s(q.i, Boolean.valueOf(p1)).subscribe(op20);
             op20.a();
             return;
           default:
             if ((b = tb.B) != null) {
                Boolean uBoolean = Boolean.valueOf(tb.y.isChecked());
                w51.f("download", uBoolean);
                Object[] objArray = new Object[]{"download",uBoolean};
                b.b.c.a(new cu2("click", b.c, new xs5(1, objArray)));
             }
             return;
       }
    }
}
