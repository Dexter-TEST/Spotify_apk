package p.kn3;
import android.content.DialogInterface$OnClickListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.spotify.litesettings.settings.StorageLocationSettingsActivity;
import p.kt6;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import java.lang.String;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.kk6;
import p.uu2;
import p.ju2;
import p.cu2;
import p.dt5;
import p.m73;
import p.du2;
import p.qn1;
import p.aq6;
import p.bo1;
import io.reactivex.rxjava3.core.Completable;
import p.wn3;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.rk0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.nn1;
import p.b5;
import io.reactivex.rxjava3.disposables.Disposable;
import p.fn0;

public final class kn3 implements DialogInterface$OnClickListener	// class@001c48 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void kn3(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       kn3 tc = this.c;
       kn3 tb = this.b;
       switch (this.a){
           case 0:
             tb.c.a(new cu2("click", tc, dt5.x));
             return;
           case 1:
             StorageLocationSettingsActivity t = tb.T;
             t.getClass();
             wo3 owo3 = LiteInteraction.l();
             owo3.f("lite/settings/storage-location");
             owo3.h("spotify:settings:storage-location:confirm-dialog");
             owo3.g("spotify:undefined");
             owo3.d("hit");
             owo3.c("confirm");
             owo3.e("storage_location_ok_button");
             t.a.a(owo3.build());
             tb.W.onSuccess(tc.j);
             return;
           default:
             Completable uCompletable = tb.C.v.c(tc, false);
             uCompletable.getClass();
             rk0 ork0 = new rk0(uCompletable, id.a(), 1);
             tb.E.c(ork0.subscribe(new nn1(tb, 3)));
             return;
       }
    }
}
