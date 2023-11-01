package p.da4;
import java.util.concurrent.Callable;
import p.fa4;
import java.lang.String;
import java.util.Map;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import p.xy5;
import p.ut;
import p.j8;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zk;
import p.kf6;
import p.ko1;
import p.i77;
import p.t63;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MetadataItem;
import p.aq6;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.metadata.proto.Metadata$Track;
import p.yp6;
import p.i80;
import p.p94;
import p.bc3;
import java.util.List;
import p.vf;
import p.xe3;
import java.lang.Iterable;
import p.ab2;
import p.rp;
import p.jg2;
import p.te5;
import com.spotify.metadata.proto.Metadata$ImageGroup;
import com.spotify.metadata.proto.Metadata$Image;
import p.yv;
import p.xe7;
import java.lang.Boolean;
import p.ic;
import java.lang.System;
import java.lang.Long;
import p.zv;
import p.uy;
import p.uw6;
import p.sw6;
import p.z67;
import p.rn1;
import com.spotify.metadata.proto.Metadata$Show;
import p.kv;
import p.lv;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.metadata.proto.Metadata$Date;
import java.util.Calendar;
import p.ys;
import java.lang.Integer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import p.zs;
import java.util.AbstractCollection;

public final class da4 implements Callable	// class@00130d from classes.dex
{
    public final int a;
    public final fa4 b;
    public final String c;
    public final Map t;
    public final Collection v;

    public void da4(fa4 p0,String p1,Map p2,Collection p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       super();
    }
    public final Object call(){
       HashSet hashSet2;
       HashSet hashSet3;
       da4 uoda41;
       HashSet hashSet4;
       j8 oj81;
       aq6 uoaq6;
       HashSet hashSet5;
       fa4 uofa4;
       boolean i;
       String str;
       aq6 uoaq61;
       String str1;
       String name;
       Metadata$Date obj3;
       aq6 uoaq62;
       String str3;
       aq6 key;
       int b1;
       Calendar uCalendar;
       Boolean fALSE;
       da4 uoda4 = this;
       da4 b = uoda4.b;
       switch (uoda4.a){
           case 0:
           default:
             fa4 a = b.a;
             j8 oj8 = a.t();
             zk ozk = a.u();
             kf6 okf6 = a.A();
             ko1 oko1 = a.v();
             i77 oi77 = a.B();
             t63 ot63 = a.x();
             HashSet hashSet = new HashSet(uoda4.v);
             HashSet hashSet1 = new HashSet();
             Iterator iterator = uoda4.t.entrySet().iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                MetadataCosmos$MetadataItem value = obj.getValue();
                if (value.l()) {
                   hashSet2 = hashSet1;
                   hashSet3 = hashSet;
                   b.b(obj.getKey(), oj8, ozk, ot63, value.g(), hashSet, hashSet2);
                label_00a5 :
                   uoda41 = b;
                   hashSet4 = hashSet3;
                   oj81 = oj8;
                }else {
                   hashSet2 = hashSet1;
                   hashSet3 = hashSet;
                   if (value.m()) {
                      b.c(obj.getKey(), ozk, ot63, value.h(), hashSet3, hashSet2);
                      goto label_00a5 ;
                   }else {
                      uoda41 = 0;
                      da4 c = uoda4.c;
                      fa4 c1 = b.c;
                      if (value.p()) {
                         Metadata$ImageGroup obj1 = obj.getKey();
                         Metadata$Track track = value.k();
                         if ((uoaq6 = p94.b(yp6.t, track.f().i())) != null) {
                            hashSet4 = hashSet3;
                            if (hashSet4.contains(obj1)) {
                               hashSet5 = hashSet4;
                            }else {
                               hashSet4.add(obj1);
                               hashSet5 = hashSet4;
                               Metadata$Track track1 = track;
                               Object obj2 = obj1;
                               uofa4 = c1;
                               uoda4 = c;
                               oj81 = oj8;
                               i = 0;
                               b.b(uoaq6, oj8, ozk, ot63, track.f(), hashSet5, hashSet2);
                               bc3 uobc3 = track1.h();
                               if (!uobc3.isEmpty()) {
                                  str = new xe3(new vf(", "), new vf(", ")).r(ab2.b(uobc3).m(new rp(19)));
                                  if (te5.a(str)) {
                                     str = uoda41;
                                  }
                                  uoaq61 = p94.b(yp6.b, uobc3.get(i).g());
                               }else {
                                  str = uoda41;
                                  uoaq61 = str;
                               }
                               obj1 = track1.f().g();
                               str1 = (obj1.h() > 0)? p94.a(obj1.g().f()): uoda41;
                               String str2 = obj2.toString();
                               yv oyv = new yv();
                               oyv.d(str2);
                               oyv.a(uoaq6.toString());
                               oyv.c(xe7.J(track1.getName()));
                               if (track1.m() && track1.j()) {
                                  i = true;
                               }
                               oyv.e = Boolean.valueOf(i);
                               Metadata$Track track2 = track1;
                               oyv.f = Boolean.valueOf(p94.c(track2, uoda4));
                               uofa4.getClass();
                               oyv.g = Long.valueOf(System.currentTimeMillis());
                               oyv.h = p94.e(track2.k());
                               name = track2.f().getName();
                               if (te5.a(name)) {
                                  name = uoda41;
                               }
                               oyv.i = name;
                               oyv.j = str1;
                               oyv.k = str;
                               if (uoaq61 != null) {
                                  str3 = uoaq61.toString();
                               }
                               oyv.l = uoda41;
                               oi77.u(oyv.b());
                               oi77.a.b();
                               uw6 ouw6 = oi77.e.c();
                               ouw6.s(1, str2);
                               oi77.a.c();
                               ouw6.u();
                               oi77.a.r();
                               oi77.a.m();
                               oi77.e.f(ouw6);
                               Iterator iterator1 = uobc3.iterator();
                               while (iterator1.hasNext()) {
                                  obj3 = iterator1.next();
                                  if ((uoaq62 = p94.b(yp6.b, obj3.g())) != null) {
                                     b.c(uoaq62, ozk, ot63, obj3, hashSet5, hashSet2);
                                     oi77.a.b();
                                     oi77.a.c();
                                     oi77.c.h(new z67(str2, uoaq62.toString()));
                                     oi77.a.r();
                                     oi77.a.m();
                                  }
                               }
                               hashSet4 = hashSet5;
                            }
                         }else {
                            hashSet5 = hashSet3;
                         }
                         oj81 = oj8;
                      }else {
                         uofa4 = c1;
                         uoda4 = c;
                         hashSet5 = hashSet3;
                         oj81 = oj8;
                         if (value.o()) {
                            key = obj.getKey();
                            Metadata$Show show = value.j();
                            hashSet4 = hashSet5;
                            if (!hashSet4.contains(key)) {
                               hashSet4.add(key);
                               name = key.toString();
                               kv okv = new kv();
                               okv.e(name);
                               okv.c(xe7.J(show.getName()));
                               okv.b(xe7.J(show.h()));
                               okv.d(xe7.J(show.k()));
                               uofa4.getClass();
                               okv.f = Long.valueOf(System.currentTimeMillis());
                               b1 = (show.m() && show.i())? true: false;
                               okv.g = Boolean.valueOf(b1);
                               okf6.j(okv.a());
                               if (show.l()) {
                                  fa4.d(ot63, name, show.f());
                               }
                            }
                         }else {
                            hashSet4 = hashSet5;
                            str1 = "";
                            if (value.n()) {
                               uoaq61 = obj.getKey();
                               Metadata$Episode uEpisode = value.i();
                               if (!hashSet4.contains(uoaq61)) {
                                  hashSet4.add(uoaq61);
                                  String str4 = uoaq61.toString();
                                  if ((obj3 = uEpisode.m()) != null && obj3.p()) {
                                     uofa4.getClass();
                                     uCalendar = Calendar.getInstance();
                                     if (obj3.p()) {
                                        b1 = 1;
                                        uCalendar.set(b1, obj3.k());
                                     }else {
                                        b1 = 1;
                                     }
                                     if (obj3.o()) {
                                        int i1 = obj3.j() - b1;
                                        uCalendar.set(2, i1);
                                     }
                                     if (obj3.l()) {
                                        uCalendar.set(5, obj3.f());
                                     }
                                     if (obj3.m()) {
                                        uCalendar.set(11, obj3.h());
                                     }
                                     if (obj3.n()) {
                                        uCalendar.set(12, obj3.i());
                                     }
                                  }else {
                                     uCalendar = uoda41;
                                  }
                                  aq6 uoaq63 = p94.b(yp6.l0, uEpisode.o().j());
                                  Metadata$ImageGroup imageGroup = uEpisode.h();
                                  if (imageGroup.h() > 0) {
                                     str3 = p94.a(imageGroup.g().f());
                                  }
                                  String str5 = str3;
                                  ys oys = new ys();
                                  oys.g(str4);
                                  oys.c(xe7.J(uEpisode.getName()));
                                  oys.b(xe7.J(uEpisode.j()));
                                  i = (uEpisode.q() && uEpisode.l())? true: false;
                                  oys.j = Boolean.valueOf(i);
                                  boolean b2 = (p94.d(uEpisode.n(), uoda4) && !uEpisode.f().isEmpty())? true: false;
                                  oys.i = Boolean.valueOf(b2);
                                  oys.h = Integer.valueOf(uEpisode.k());
                                  if (uCalendar == null) {
                                     name = str1;
                                     uoda41 = b;
                                  }else {
                                     uoda41 = b;
                                     name = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(uCalendar.getTime());
                                  }
                                  oys.f(name);
                                  oys.d(xe7.J(uEpisode.o().getName()));
                                  if (uoaq63 != null) {
                                     str1 = uoaq63.toString();
                                  }
                                  oys.e(str1);
                                  uofa4.getClass();
                                  oys.k = Long.valueOf(System.currentTimeMillis());
                                  oys.l = p94.e(uEpisode.g());
                                  oys.m = str5;
                                  oko1.o(oys.a());
                                  if (uEpisode.p()) {
                                     fa4.d(ot63, str4, uEpisode.h());
                                  }
                               }
                            }else {
                               uoda41 = b;
                               obj.getKey();
                               if ((key = obj.getKey().b) == yp6.w) {
                                  yv oyv1 = new yv();
                                  oyv1.d(obj.getKey().toString());
                                  oyv1.a(str1);
                                  oyv1.c(str1);
                                  fALSE = Boolean.FALSE;
                                  oyv1.f = fALSE;
                                  oyv1.e = fALSE;
                                  uofa4.getClass();
                                  oyv1.g = Long.valueOf(System.currentTimeMillis());
                                  oi77.u(oyv1.b());
                               }else if(key == yp6.m0){
                                  ys oys1 = new ys();
                                  oys1.g(obj.getKey().toString());
                                  uofa4.getClass();
                                  oys1.k = Long.valueOf(System.currentTimeMillis());
                                  oys1.e(str1);
                                  oys1.c(str1);
                                  oys1.d(str1);
                                  oys1.b(str1);
                                  oys1.f(str1);
                                  oys1.h = Integer.valueOf(0);
                                  fALSE = Boolean.FALSE;
                                  oys1.i = fALSE;
                                  oys1.j = fALSE;
                                  oko1.o(oys1.a());
                               }
                            }
                         }
                      }
                      uoda41 = b;
                   }
                }
                hashSet4.add(obj.getKey());
                uoda4 = this;
                hashSet2 = hashSet4;
                hashSet1 = hashSet2;
                oj8 = oj81;
                b = uoda41;
             }
             HashSet hashSet6 = hashSet1;
             hashSet4 = hashSet;
             hashSet6.removeAll(hashSet4);
             return fa4.a(hashSet4, hashSet6);
       }
       b.getClass();
       da4 v0 = new da4(b, uoda4.c, uoda4.t, uoda4.v, 1);
       return b.a.p(v0);
    }
}
