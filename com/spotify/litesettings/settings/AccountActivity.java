package com.spotify.litesettings.settings.AccountActivity;
import p.w53;
import p.fs5;
import p.fn0;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import p.eo5;
import p.lm0;
import p.gg1;
import p.n4;
import p.h10;
import java.lang.Object;
import android.util.SparseArray;
import p.qm0;
import java.lang.String;
import android.content.Context;
import p.mm0;
import java.util.List;
import java.util.Arrays;
import p.yq5;
import p.s4;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.an5;
import p.o4;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import p.ao3;
import p.mp;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.ab0;
import io.reactivex.rxjava3.core.Maybe;
import p.i76;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.yf2;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import p.a44;
import p.ft6;
import p.al5;
import p.p4;
import android.view.KeyEvent$Callback;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;

public class AccountActivity extends fs5 implements w53	// class@00095c from classes.dex
{
    public g54 S;
    public ac T;
    public final fn0 U;
    public static final int V;

    public void AccountActivity(){
       super();
       this.U = new fn0();
    }
    public final void D(Bundle p0,RecyclerView p1){
       eo5.q(this);
       lm0 olm0 = new lm0();
       gg1 ogg1 = new gg1();
       h10 oh10 = eo5.N(1, new n4(0, ogg1));
       lm0 t = olm0.t;
       t.put(oh10.a, oh10);
       oh10 = eo5.N(2, new n4(1, ogg1));
       t.put(oh10.a, oh10);
       n4 oh101 = new n4(2, ogg1);
       h10 oh102 = eo5.N(3, oh101);
       t.put(oh102.a, oh102);
       oh102 = eo5.u(R.layout.divider);
       t.put(oh102.a, oh102);
       qm0 oqm0 = new qm0(2, this.getString(R.string.settings_account_username));
       qm0 oqm01 = new qm0(2, this.getString(R.string.settings_account_email));
       qm0 oqm02 = new qm0(2, this.getString(R.string.settings_account_product_type));
       qm0 oqm03 = new qm0(1, this.getString(R.string.settings_account_upgrade_link));
       oqm03.e = this.getString(R.string.settings_account_upgrade_link_description);
       oqm0.c = false;
       oqm01.c = false;
       oqm02.c = false;
       qm0[] oqm0Array = new qm0[]{oqm0,oqm02};
       olm0.z(Arrays.asList(oqm0Array));
       p1.setAdapter(olm0);
       s4 os4 = this.S.r(this, s4.class);
       an5 oqm0Array1 = new an5();
       olm0.y(oqm0Array1);
       AccountActivity tU = this.U;
       tU.c(oqm0Array1.filter(new o4(oqm03)).observeOn(id.a()).subscribe(new mg1(2, this)));
       s4 t1 = os4.t;
       Objects.requireNonNull(t1);
       Maybe maybe = Single.fromCallable(new ao3(t1, 1)).filter(new ab0(2));
       maybe.getClass();
       k34 ok34 = new k34(maybe, new i76(11), 1);
       Single single = Single.error(new IllegalStateException("Current username is empty"));
       Objects.requireNonNull(single, "other is null");
       a44 uoa44 = new a44(ok34, 0, single);
       single = uoa44.observeOn(id.a());
       tU.c(single.subscribe(new ft6(oqm0, 8, olm0)));
       qm0 oqm04 = oqm02;
       oqm02 = oqm03;
       p4 ok341 = new p4(this, olm0, oqm01, oqm0, oqm04, oqm02, 0);
       tU.c(os4.v.d.distinctUntilChanged().observeOn(id.a()).subscribe(ok34));
    }
    public final vk7 b(){
       return wk7.I;
    }
    public final v55 h(){
       return x55.W;
    }
    public final void onDestroy(){
       this.U.dispose();
       super.onDestroy();
    }
}
