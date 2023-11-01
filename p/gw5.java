package p.gw5;
import p.ew5;
import p.zb4;
import p.xs6;
import p.ku1;
import p.ll1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wc;
import p.ay6;
import p.wf2;
import p.go0;
import p.i40;
import p.yc;
import p.cm5;
import java.lang.Class;
import java.lang.CharSequence;
import p.av6;
import p.xo5;
import p.m06;
import java.util.Map;
import p.st5;
import p.vc;
import p.oo0;
import p.wy6;
import p.pp3;
import p.zo3;
import p.xc;
import p.uc;
import p.tc;
import p.ed;
import p.zc;
import p.ot5;
import p.qc;
import p.mm2;
import java.lang.Long;
import java.util.concurrent.atomic.AtomicBoolean;
import p.yo5;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import p.pl;
import java.util.ArrayList;
import java.util.List;
import p.xe7;
import java.util.Map$Entry;
import p.aj0;
import java.lang.StringBuilder;
import java.util.AbstractCollection;
import p.cj0;
import p.dj0;
import java.lang.Integer;
import p.za3;
import p.ok0;
import p.v67;
import p.b5;
import io.reactivex.rxjava3.core.Completable;
import p.yb4;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import p.lm2;
import p.dr0;
import p.ge6;
import p.t37;
import java.lang.IllegalStateException;
import java.lang.Boolean;

public final class gw5 implements ew5	// class@001792 from classes.dex
{
    public final zb4 a;
    public final ku1 b;
    public final List c;
    public final ay6 d;
    public final go0 e;
    public final i40 f;
    public Integer g;

    public void gw5(zb4 p0,xs6 p1,ku1 p2,int p3){
       ll1 a = ((p3 & 8))? ll1.a: null;
       co5.o(a, "exposablePropertyIds");
       super();
       this.a = p0;
       this.b = p2;
       this.c = a;
       this.d = new ay6(new wc(8, this));
       go0 ogo0 = new go0(p1);
       this.e = ogo0;
       this.f = new i40(ogo0);
       return;
    }
    public final cm5 a(yc p0){
       int i3;
       zc ozc;
       String name = yc.class.getName();
       int i = 0;
       int i1 = av6.q0(name, '.', i, 6);
       int i2 = 1;
       oo0 ooo0 = null;
       if (i1 >= 0 && (i3 = av6.m0(name, '$', i1, i, 4)) >= 0) {
          name = name.substring((i1 + i2), i3);
          co5.l(name, "this as java.lang.String…ing\(startIndex, endIndex\)");
       }else {
          oo0 ooo01 = ooo0;
       }
       xo5 b = this.e.a(name).b;
       co5.o(b, "properties");
       m06 om06 = new m06(b);
       String str = "use_content_stack";
       p0 = p0.b;
       switch (p0.a){
           case 0:
             p0.getClass();
             om06.a("android-libs-lyrics", "enable_fullscreen_track_change", i);
             om06.a("android-libs-lyrics", "show_lyrics_badge", i2);
             ozc = new zc(om06.a("android-libs-lyrics", "enable_lyrics_v2", i), om06.a("android-libs-lyrics", "enable_new_lyrics_fonts", i), om06.a("android-libs-lyrics", "enable_syllable_sync", i), ooo0);
             break;
           case 1:
             p0.getClass();
             ozc = new ed(om06.a("android-lyrics-endpoint-retrofit", "request_all_translations", i), ooo0);
             break;
           case 3:
             p0.getClass();
             ozc = new tc(om06.a("android-libs-allboarding", str, i), ooo0);
             break;
           case 4:
             p0.getClass();
             om06.a("android-libs-appstorage", "is_shared_preferences_instrumentation_enabled", i);
             ozc = new uc(om06.a("android-libs-appstorage", "is_instrumentation_enabled", i), ooo0);
             break;
           case 5:
             p0.getClass();
             om06.a("android-libs-encore-consumer-entrypoint", "enable_haptic_feedback_on_heart", i);
             ozc = new xc(ooo0);
             break;
           case 6:
             p0.getClass();
             ozc = new zo3(om06.a("lite-lyrics", "enabled", i), ooo0);
             break;
           case 7:
             p0.getClass();
             m06 om061 = om06;
             int i4 = om061.b("lite-remote-config", "glitter_pony_database_cleanup_max_age_hours", 0, 8760, 336);
             int i5 = om061.b("lite-remote-config", "glitter_pony_database_cleanup_max_tracks", 0, Integer.MAX_VALUE, 0x7530);
             int i6 = i4;
             pp3 om062 = new pp3(om06.a("lite-remote-config", "blocking_dialog_migration_experiment_enabled", i), om06.a("lite-remote-config", "event_sender_skew_optimizations_enabled", i), i6, i5, om06.a("lite-remote-config", "in_app_messaging_debug_tools_enabled", i), om06.a("lite-remote-config", "reinvent_free_enabled", i), 0);
             break;
           case 8:
             p0.getClass();
             ozc = new wy6(om06.a("systems-zero-rating-identification-impl-reporter-impl", "zero_rating_identification_enabled", i), ooo0);
             break;
           case 9:
             p0.getClass();
             ozc = new vc(om06.a("android-libs-contextualaudio", str, i), ooo0);
             break;
           case 10:
             p0.getClass();
             ozc = new st5(om06.a("remote-configuration-client-android", "fetch_inject_ps", i), om06.b("remote-configuration-client-android", "reconnect_throttle_seconds", 1, 0x8ca0, 1200));
             break;
           default:
             p0.getClass();
             ozc = new ot5(om06.a("remote-config-snapshot-id", "enable_snapshot_id_sdk_api", i), ooo0);
       }
       return ozc;
    }
    public final void b(boolean p0){
       LinkedHashMap linkedHashMa;
       Iterator iterator;
       Map$Entry obj;
       ArrayList uArrayList;
       List key;
       gw5 te = this.e;
       _monitor_enter(te);
       xo5 oxo5 = te.a.b();
       xo5 oxo51 = co5.D(oxo5, te.a.d.b());
       te.b = oxo51;
       te.d = Long.valueOf(oxo5.a.d);
       boolean b = true;
       te.c.set(b);
       Set set = oxo5.a();
       oxo5 = oxo5.a;
       yo5 v3 = new yo5(oxo5.a().isEmpty(), set, oxo5.b, oxo5.a);
       _monitor_exit(te);
       if ((this.c.isEmpty() ^ b)) {
          linkedHashMa = new LinkedHashMap();
          iterator = oxo51.a.c.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             Long longx = Long.valueOf(obj.f);
             if ((uArrayList = linkedHashMa.get(longx)) == null) {
                uArrayList = new ArrayList();
                linkedHashMa.put(longx, uArrayList);
             }
             uArrayList.add(obj);
          }
          LinkedHashMap linkedHashMa1 = new LinkedHashMap(xe7.F(linkedHashMa.size()));
          Iterator iterator1 = linkedHashMa.entrySet().iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             key = obj.getKey();
             Iterable value = obj.getValue();
             uArrayList = new ArrayList(aj0.b0(value));
             Iterator iterator2 = value.iterator();
             while (iterator2.hasNext()) {
                pl opl = iterator2.next();
                uArrayList.add("".append(opl.b).append('.').append(opl.a).toString());
             }
             linkedHashMa1.put(key, uArrayList);
          }
          linkedHashMa = new LinkedHashMap();
          iterator = linkedHashMa1.entrySet().iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             key = obj.getValue();
             if (!key instanceof Collection || !key.isEmpty()) {
                Iterator iterator3 = key.iterator();
                while (true) {
                   if (iterator3.hasNext()) {
                      if (!this.c.contains(iterator3.next())) {
                         iterator3 = 0;
                         break ;
                      }
                   }
                }
                if (key) {
                   linkedHashMa.put(obj.getKey(), obj.getValue());
                }
             }
             key = 1;
          }
          Collection uCollection = linkedHashMa.values();
          co5.o(uCollection, "<this>");
          ArrayList uArrayList1 = new ArrayList();
          iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             cj0.c0(iterator.next(), uArrayList1);
          }
          this.d.getValue().clear();
          this.d.getValue().addAll(dj0.g0(uArrayList1));
       }
       if (!p0) {
          List value1 = this.d.getValue();
          if (!value1.isEmpty()) {
             linkedHashMa = new LinkedHashMap();
             iterator = oxo51.b.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (value1.contains(av6.x0(uEntry.getKey(), ":", "."))) {
                   linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
                }
             }
             ArrayList uArrayList2 = new ArrayList(linkedHashMa.size());
             iterator = linkedHashMa.entrySet().iterator();
             while (iterator.hasNext()) {
                uArrayList2.add(Integer.valueOf((int)iterator.next().getValue().f));
             }
             yo5 oyo5 = yo5.a(v3, dj0.F0(dj0.g0(uArrayList2)), 13);
          }
          int i = yo5.a(v3, null, 11).hashCode();
          if ((te = this.g) == null || i != te.intValue()) {
             te = this.b;
             switch (te.a){
                 case 0:
                   if (v3.a != null) {
                      te.b(v3);
                   }else {
                      te.a(v3);
                   }
                   break;
                 default:
                   if (v3.a != null) {
                      te.b(v3);
                   }else {
                      te.a(v3);
                   }
             }
             this.g = Integer.valueOf(i);
          }
       }
       return;
    }
    public final ok0 c(){
       return Completable.i(new v67(2, this));
    }
    public final void clear(){
       gw5 te = this.e;
       _monitor_enter(te);
       te.a.a();
       _monitor_exit(te);
       te.b();
    }
    public final boolean d(byte[] p0){
       boolean i;
       co5.o(p0, "configuration");
       if (co5.c(this.a, yb4.a)) {
          throw new IllegalStateException("Not possible for UnAuthResolver".toString());
       }
       gw5 tf = this.f;
       tf.getClass();
       boolean b = tf.a.a.d.b().a.c.isEmpty();
       try{
          i = 0;
          Configuration uConfigurati = Configuration.k(p0);
          co5.l(uConfigurati, "parseFrom\(configuration\)");
          xo5 oxo5 = dr0.c(lm2.b(uConfigurati));
          if (!oxo5.b.isEmpty() || !b) {
             int i1 = (!p0.length)? 1: 0;
             if ((i1 ^ 1)) {
                i40 a = tf.a;
                _monitor_enter(a);
                a.a.c(oxo5);
                _monitor_exit(a);
             }
             tf.a.b();
             i = true;
          }
       }catch(p.rc3 e0){
          Object[] objArray = new Object[i];
          t37.a().getClass();
          ge6.f(objArray);
       }
       return i;
    }
    public final pl e(String p0,String p1){
       pl opl;
       if (co5.c(this.a, yb4.a)) {
          throw new IllegalStateException("Not possible for UnAuthResolver".toString());
       }
       if ((opl = this.e.a("esperanto").b.get(dr0.d(p0, p1))) == null) {
          opl = new pl("", "", null, null, null, 0, 0);
       }
       return opl;
    }
    public final Long getSnapshotId(){
       go0 d = (new ot5(false, this).a())? this.e.d: null;
       return d;
    }
}
