package p.u36;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.ta3;
import android.content.Context;
import android.content.res.Resources;
import p.co5;
import androidx.fragment.app.Fragment;
import p.az2;
import p.sp6;
import p.wu1;
import com.spotify.eventsender.eventsender.a;
import p.su1;
import p.t74;
import p.f63;
import java.lang.String;
import p.wp5;
import p.d63;
import p.ay6;
import p.wf2;
import p.e63;
import p.an0;
import p.ll1;
import java.util.List;
import p.a81;
import p.ui3;
import p.h63;
import p.nm3;
import p.km3;
import p.cp;
import io.reactivex.rxjava3.core.Observable;
import p.tn6;
import p.bp;
import android.util.DisplayMetrics;
import p.vg0;
import p.x;
import com.squareup.moshi.Moshi;
import p.cd4;
import java.util.Set;
import p.zc4;
import p.rf5;
import p.h13;
import p.vf1;
import android.app.Application;
import p.o60;
import p.xc;
import p.em1;
import p.n61;
import p.sk5;
import p.fk3;
import p.mb1;
import p.nn0;
import p.nz3;
import p.h32;
import p.g32;
import p.xs3;
import p.tp;
import p.yu5;
import p.fp;
import p.rn6;
import p.bt3;
import p.tu1;
import p.go;
import p.yt6;
import p.od4;
import p.i16;
import com.spotify.clientfoundations.esperanto.esperantocosmos.CosmosTransport;
import p.bg0;
import com.spotify.clientfoundations.esperanto.esperantocosmos.EsperantoRxRouter;
import p.ag0;
import p.ds3;
import p.bb7;
import p.ah0;
import p.kf6;
import p.kk5;
import p.or7;
import java.util.Collections;
import java.lang.Long;
import p.gv;
import java.util.Map;
import p.l36;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import p.fv;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import p.wd5;
import p.gn;

public final class u36 implements a02	// class@002837 from classes.dex
{
    public final int a;
    public final tm5 b;

    public void u36(tm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public static u36 a(tm5 p0){
       return new u36(p0, 15);
    }
    public static u36 b(ta3 p0){
       return new u36(p0, 27);
    }
    public static u36 c(ta3 p0){
       return new u36(p0, 28);
    }
    public final Object get(){
       Set set;
       Set set1;
       Set set2;
       h32 oh32;
       Resources resources;
       f63 c1;
       u36 ou36 = this;
       String str = "filefactoryProvider";
       int i = 0;
       int i1 = 1;
       u36 b = ou36.b;
       switch (ou36.a){
           case 0:
             ah0 uoah0 = b.get();
             kf6 okf6 = new kf6(3);
             kk5 a = kk5.a;
             int i2 = 5;
             or7 oor7 = new or7(i2);
             if ((set = Collections.emptySet()) != null) {
                oor7.c = set;
                oor7.a = Long.valueOf(0x7530);
                oor7.b = Long.valueOf(0x5265c00);
                okf6.c.put(a, oor7.d());
                a = kk5.c;
                oor7 = new or7(i2);
                if ((set = Collections.emptySet()) != null) {
                   oor7.c = set;
                   oor7.a = Long.valueOf(1000);
                   oor7.b = Long.valueOf(0x5265c00);
                   okf6.c.put(a, oor7.d());
                   a = kk5.b;
                   oor7 = new or7(i2);
                   if ((set1 = Collections.emptySet()) != null) {
                      oor7.c = set1;
                      oor7.a = Long.valueOf(0x5265c00);
                      oor7.b = Long.valueOf(0x5265c00);
                      l36[] ol36Array = new l36[]{l36.a,l36.b};
                      if ((set2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(ol36Array)))) != null) {
                         oor7.c = set2;
                         okf6.c.put(a, oor7.d());
                         okf6.b = uoah0;
                         if (uoah0 != null) {
                            if (okf6.c.keySet().size() >= kk5.values().length) {
                               kf6 c = okf6.c;
                               okf6.c = new HashMap();
                               return new fv(okf6.b, c);
                            }else {
                               throw new IllegalStateException("Not all priorities have been configured");
                            }
                         }else {
                            throw new NullPointerException("missing required property: clock");
                         }
                      }else {
                         throw new NullPointerException("Null flags");
                      }
                   }else {
                      throw new NullPointerException("Null flags");
                   }
                }else {
                   throw new NullPointerException("Null flags");
                }
             }else {
                throw new NullPointerException("Null flags");
             }
             break;
           case 1:
             return new bb7(b.get());
           case 2:
             i16 oi16 = b.get();
             co5.o(oi16, "rxRouter");
             return new ag0(new CosmosTransport(new bg0(oi16)));
           case 3:
             return new od4(b.get());
           case 4:
             oh32 = b.get();
             co5.o(oh32, str);
             return new yt6(oh32.a("android-appstorage-storageutilsimpl"));
           case 5:
             tu1 otu1 = b.get();
             co5.o(otu1, "eventPublisher");
             return new go(otu1);
           case 6:
             bp uobp = b.get();
             co5.o(uobp, "repositoryPreferences");
             return new bt3(new yu5(uobp.a, fp.a, fp.b, fp.c));
           case 7:
             vg0 ovg0 = b.get();
             co5.o(ovg0, "clientInfo");
             return new tp(i1, ovg0);
           case 8:
             oh32 = b.get();
             co5.o(oh32, str);
             return new nn0(oh32.a("android-compression-extraction"));
           case 9:
             return new nz3(b.get());
           case 10:
             return new mb1(b.get());
           case 11:
             tn6 otn6 = b.get();
             co5.o(otn6, "prefs");
             return new n61(sk5.z.w, otn6);
           case 12:
             xc oxc = b.get();
             co5.o(oxc, "rcsProperties");
             return new em1(oxc);
           case 13:
             Application uApplication = b.get();
             co5.o(uApplication, "application");
             resources = uApplication.getResources();
             co5.l(resources, "application.resources");
             return new o60(resources);
           case 14:
             return new vf1(b.get());
           case 15:
             return new h13(b.get());
           case 16:
             return zc4.a(b.get());
           case 17:
             Moshi moshi = b.get();
             co5.o(moshi, "moshi");
             return new cd4(moshi);
           case 18:
             return new x(b.get());
           case 19:
             return new nm3(b.get());
           case 20:
             DisplayMetrics displayMetri = b.get().getResources().getDisplayMetrics();
             co5.n(displayMetri);
             return displayMetri;
           case 21:
             return new bp(b.get());
           case 22:
             Observable observable = b.get().b();
             co5.n(observable);
             return observable;
           case 23:
             return new nm3(b.get());
           case 24:
             f63 uof63 = b.get();
             co5.o(uof63, "baseImageLoaderBuilder");
             f63 a1 = uof63.a;
             f63 b1 = uof63.b;
             ay6 uoay6 = new ay6(new d63(uof63, i));
             ay6 uoay61 = ((c1 = uof63.c) == null)? new ay6(new d63(uof63, i1)): c1;
             ay6 uoay62 = ((c1 = uof63.d) == null)? new ay6(e63.b): c1;
             ll1 a2 = ll1.a;
             wp5 str1 = new wp5(a1, b1, uoay6, uoay61, uoay62, new an0(a2, a2, a2, a2, a2), uof63.e);
             return str;
             break;
           case 25:
             return new t74(b.get());
           case 26:
             a a3 = b.get().a;
             co5.n(a3);
             return a3;
           case 27:
             return new az2(b.get().requireContext());
           case 28:
             resources = b.get().getResources();
             co5.n(resources);
             return resources;
           default:
             return new gn(b.get());
       }
    }
}
