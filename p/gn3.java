package p.gn3;
import p.j61;
import p.by1;
import p.nf5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Intent;
import p.aq6;
import p.td7;
import p.jl;
import java.lang.Class;
import android.os.Parcelable;
import android.net.Uri;
import android.os.Build$VERSION;
import p.k61;
import com.spotify.deeplinkimpl.events.proto.DeeplinkOpen;
import p.l61;
import p.n61;
import p.kb;
import java.util.concurrent.locks.ReentrantLock;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import com.spotify.litelisteningexperience.share.logging.a;
import p.fd1;
import p.sa6;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import p.dk3;
import p.vj3;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.rp;
import p.bi5;
import p.up0;
import p.v05;
import p.ir0;

public final class gn3	// class@001740 from classes.dex
{
    public final j61 a;
    public final by1 b;
    public final nf5 c;

    public void gn3(j61 p0,by1 p1,nf5 p2){
       co5.o(p0, "deeplinkEventLogger");
       co5.o(p1, "externalReferrerProvider");
       co5.o(p2, "playbackFromDeeplinkTracker");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(Intent p0,String p1){
       aq6 uoaq6;
       Uri parcelableEx;
       String str3;
       co5.o(p1, "uri");
       co5.o(p0, "request");
       if ((uoaq6 = td7.d(p1)) == null) {
          jl.d("Request had a bad URI, ".concat(p1));
          return;
       }else {
          String str = td7.a(uoaq6.toString());
          this.b.getClass();
          String str1 = "android.intent.extra.REFERRER";
          String str2 = "";
          if (p0.hasExtra(str1) && (parcelableEx = p0.getParcelableExtra(str1)) != null) {
             str3 = parcelableEx.toString();
             co5.l(str3, "referrerUri.toString\(\)");
          }else if(Build$VERSION.SDK_INT >= 22){
             str1 = "android.intent.extra.REFERRER_NAME";
             if (!p0.hasExtra(str1) || (str3 = p0.getStringExtra(str1)) == null) {
             }
          }else {
          }
          if (str == null) {
             str = str2;
          }
          gn3 ta = this.a;
          ta.getClass();
          k61 ok61 = DeeplinkOpen.j();
          ok61.d(str);
          ok61.e(p1);
          j61 b = ta.b;
          b.getClass();
          n61 b1 = b.b;
          b1.lock();
          b1.unlock();
          ok61.c(new kb(l61.c, 2, b).invoke());
          b1 = (!str3.length())? 1: 0;
          if (!b1) {
             ok61.f(str3);
          }
          DeeplinkOpen uDeeplinkOpe = ok61.build();
          co5.l(uDeeplinkOpe, "message");
          ta.a.a(uDeeplinkOpe);
          gn3 tc = this.c;
          cd1.d(tc.d.a.a, null);
          a e = tc.e;
          a b2 = tc.b;
          b2.c(e);
          b2.a(e);
          e = tc.a;
          tc.d.a(Observable.combineLatest(e.j.hide(), e.i.hide(), new bm(8)).filter(new rp(3)).scan(new up0(3, tc)).subscribe(new v05(5)));
          return;
       }
    }
}
