package p.zh0;
import p.d32;
import p.m25;
import p.b90;
import p.j10;
import p.pd1;
import p.vc1;
import p.w00;
import p.jg2;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import p.bo1;
import p.aq6;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Map;
import p.lq3;
import p.cm;
import p.zp3;
import p.rm;
import p.yf2;
import p.f43;
import android.content.Context;
import p.aw6;
import p.g15;
import java.lang.Long;
import p.f15;
import p.a90;
import java.io.File;
import p.jl;
import com.spotify.litesettings.settings.ChangeOfflineModeFragment;
import p.be0;
import p.ae0;
import p.zd0;
import androidx.fragment.app.Fragment;
import p.so3;
import p.pu;
import java.lang.Boolean;
import p.ef5;
import p.cf5;
import p.p54;
import io.reactivex.rxjava3.core.Completable;
import p.pl0;
import p.a44;
import p.zd1;
import java.util.List;
import p.rp;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import p.w51;
import p.k73;
import java.util.ArrayList;
import p.du;
import android.content.res.Resources;
import p.zs;
import p.r05;
import p.o05;
import p.lt;
import p.r45;
import p.at;
import com.spotify.hubs.liteintegration.util.PodcastUtil;
import p.iu2;
import p.ty0;
import p.bu2;
import p.c23;
import p.fu2;
import p.su2;
import p.zg0;
import p.uf1;
import p.gu2;
import p.i13;
import p.sp6;
import java.lang.Enum;
import p.st2;
import java.io.Serializable;
import p.dw;
import p.au2;
import p.h13;
import p.k23;
import p.a43;
import p.z23;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.jc4;
import p.gc4;
import p.co5;
import java.lang.Runnable;
import p.zu4;
import p.hr0;
import java.util.concurrent.CopyOnWriteArrayList;
import com.spotify.lite.about.AboutActivity;
import p.yz7;
import p.wj;
import p.g28;
import android.app.PendingIntent;
import p.ej5;
import android.widget.Button;
import android.view.View;
import p.w;
import android.view.View$OnClickListener;

public final class zh0 implements d32, m25, b90, j10, pd1, vc1, w00, jg2	// class@002ef5 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void zh0(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public Single a(dt5 p0){
       zh0 tc = this.c;
       zh0 tb = this.b;
       switch (this.a){
           case 4:
             tb.getClass();
             return tb.w.e(cm.e(tc), p0).map(new rm(10));
           case 6:
             tb.getClass();
             return tb.D.k("userURI:"+tc, p0);
           default:
             return tb.t.b(tc, p0);
       }
    }
    public Object apply(Object p0){
       f15 uof15;
       zh0 tc = this.c;
       zh0 tb = this.b;
       switch (this.a){
           case 0:
             long l = tc.get().longValue();
             p0.getClass();
             uof15 = new f15(p0);
             if ((l) > 0) {
                File uFile = new File(tb.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!uFile.exists()) {
                   uFile.mkdirs();
                }
                uof15.k = new a90(uFile, l);
             }else {
                jl.p("No disk space for image cache");
             }
             break;
           default:
             tb.getClass();
             if (p0 == null) {
                p0 = null;
             }else {
                String str = tb.getString(p0.a);
                String str1 = tb.getString(p0.b);
                boolean b = (p0 == tc.b)? true: false;
                p0 = new zd0(p0, str, str1, b);
             }
             return p0;
       }
       return new g15(uof15);
    }
    public Object apply(Object p0,Object p1){
       Single single;
       z23 t;
       zs obj;
       r05 or05;
       du b1;
       du a;
       zh0 ozh0 = this;
       zh0 c = ozh0.c;
       zh0 b = ozh0.b;
       switch (ozh0.a){
           case 0:
             Boolean uBoolean = p1;
             b.getClass();
             if (p0.booleanValue()) {
                single = Single.just(new ef5());
             }else if(uBoolean.booleanValue()){
                single = Single.just(new cf5());
             }else {
                single = b.b.j(c).d(b.b());
             }
             break;
           default:
             List list = p0;
             List list1 = p1;
             b.getClass();
             if (!list.isEmpty() && !list1.isEmpty()) {
                rp orp = new rp(20);
                Iterator iterator = list1.iterator();
                boolean i = list1.size();
                w51.h(i, "expectedSize");
                k73 ok73 = new k73(i);
                while (iterator.hasNext()) {
                   obj = iterator.next();
                   ok73.d(orp.apply(obj), obj);
                }
                i = true;
                try{
                   dt5 uodt5 = ok73.b(i);
                   ArrayList uArrayList = new ArrayList(list.size());
                   Iterator iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      du uodu = iterator1.next();
                      Resources resources = c.getResources();
                      o05 z = ((or05 = uodt5.get(uodu.a.b)) == null)? o05.z: or05.n;
                      o05 oo05 = z;
                      boolean i1 = 0;
                      lt a1 = ((b1 = uodu.b) != null && !b1.isEmpty())? b1.get(i1).a: 0;
                      Object obj1 = r45.a(uodu.d).e(zd1.B);
                      a = uodu.a;
                      obj = a.b;
                      Iterator iterator2 = iterator1;
                      zs d = a.d;
                      zs f = a.f;
                      zh0 ozh01 = c;
                      dt5 uodt51 = uodt5;
                      zh0 ozh02 = b;
                      du uodu1 = a;
                      ArrayList uArrayList1 = uArrayList;
                      lt olt = b1;
                      p1 = uodu;
                      zs ozs = d;
                      String str = "uri";
                      dw obj2 = obj1;
                      at c1 = obj2.c;
                      iu2 oiu2 = ty0.k().o(obj).k(ty0.l("podcast:cardImage", bu2.t.a)).s(ty0.z().d(d).a(f).c(PodcastUtil.formatDateAndListeningProgressStatus(b.z, b.A, resources, a.h, PodcastUtil.formatReleaseDate(a.g).longValue(), obj1.c, obj1.b))).p(ty0.o().c(ty0.n().g(olt).e(sp6.b0))).d("click", ty0.j().d("navigate").a(str, obj)).d("contextMenuClick", ty0.j().d("contextMenu").a("showUri", uodu1.c).a("title", ozs).a("subtitle", f).a(str, obj).a("imageUri", olt)).d("downloadClick", ty0.j().d("delete").a(str, obj)).b("availability", oo05).b("fullyPlayed", Boolean.valueOf(c1));
                      i1 = (obj2.b > null && c1 == null)? true: false;
                      oiu2 = oiu2.b("startedListening", Boolean.valueOf(i1));
                      if ((obj2 = r45.a(p1.c).f()) != null) {
                         dw d1 = obj2.d;
                         dw b2 = obj2.b;
                         oiu2 = oiu2.d("playClick", ty0.j().d("playFromContext").a(str, d1).a("uid", b2).a("offline_uri", obj2.a)).c(h13.b(d1)).c(h13.c(b2));
                      }
                      ArrayList uArrayList2 = uArrayList1;
                      uArrayList2.add(oiu2.g());
                      uArrayList = uArrayList2;
                      iterator1 = iterator2;
                      c = ozh01;
                      uodt5 = uodt51;
                      b = ozh02;
                      int i2 = this;
                   }
                   t = ty0.B().j("downloaded-episodes").e(uArrayList).g();
                }catch(java.lang.IllegalArgumentException e0){
                   throw new IllegalArgumentException(e0.getMessage()+". To index multiple values under a key, use Multimaps.index.");
                }
             }else {
                t = z23.t;
             }
             return t;
       }
       return single;
    }
    public void b(File p0){
       jc4 h;
       zh0 tb = this.b;
       co5.o(tb, "$slave");
       co5.o(p0, "file");
       tb.g = this.c;
       tb.f = p0;
       if ((h = tb.h) == null) {
       }else {
          h.run();
       }
       return;
    }
    public void dispose(){
       this.b.l.remove(this.c);
    }
    public void onSuccess(Object p0){
       int i1;
       zh0 tb = this.b;
       zh0 tc = this.c;
       tb.getClass();
       int i = 0;
       if (p0.a == 2) {
          i1 = 1;
          int i2 = (p0.a(g28.a()) != null)? 1: 0;
          if (i2) {
          label_0027 :
             ej5 e = tb.R.e;
             if (!i1) {
                i = 8;
             }
             e.setVisibility(i);
             if (i1) {
                tb.R.e.setOnClickListener(new w(tb, tc, p0));
             }
             return;
          }
       }
       i1 = 0;
       goto label_0027 ;
    }
}
