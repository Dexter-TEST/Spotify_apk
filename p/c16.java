package p.c16;
import p.yf2;
import java.lang.Object;
import java.lang.String;
import p.x15;
import p.al5;
import p.ah1;
import p.y15;
import java.lang.Class;
import p.aq6;
import p.yp6;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.Observable;
import p.k12;
import p.f37;
import p.qn3;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.sd5;
import p.vc5;
import p.eb5;
import p.zg0;
import p.sa5;
import p.wc5;
import p.xj0;
import p.xc5;
import p.qg2;
import p.db5;
import p.kl4;
import p.qf6;
import io.reactivex.rxjava3.core.Single;
import p.sb5;
import p.tf6;
import p.rh6;
import p.uf;
import io.reactivex.rxjava3.core.SingleTransformer;
import p.ab0;
import p.g96;
import com.spotify.searchview.proto.MainViewResponse;
import p.f96;
import p.sp6;
import android.content.Context;
import p.b43;
import p.e43;
import com.spotify.searchview.proto.Entity;
import com.google.common.collect.c;
import p.d73;
import java.util.List;
import java.lang.Iterable;
import com.spotify.searchview.proto.Recommendations;
import java.util.Collections;
import p.oq5;
import java.lang.Enum;
import p.iu2;
import p.ty0;
import java.lang.StringBuilder;
import p.x03;
import p.fu2;
import p.su2;
import p.k23;
import p.a73;
import p.bc3;
import java.util.Iterator;
import p.td7;
import p.ay2;
import p.gu2;
import p.j13;
import p.st2;
import java.io.Serializable;
import p.ry2;
import p.ys5;
import p.zb3;
import java.util.AbstractCollection;
import p.w51;
import java.util.AbstractList;
import p.ao1;
import p.c03;
import p.lv1;
import p.do5;
import java.util.Arrays;
import p.a43;
import p.z23;
import p.c01;
import p.r45;
import com.spotify.playlist4.proto.Playlist4ApiProto$CreateListReply;
import p.pe0;
import java.nio.charset.Charset;
import p.ox7;
import p.hg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Item;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.eg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Add;
import p.pg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import p.rg5;
import p.gg5;
import com.spotify.playlist4.proto.Playlist4ApiProto$Delta;
import com.spotify.playlist4.proto.Playlist4ApiProto$ChangeInfo;
import p.bh5;
import p.og5;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import io.reactivex.rxjava3.core.Completable;
import p.ah5;
import p.bo3;
import p.g16;
import p.b5;
import p.ok0;
import p.jk0;
import p.pl0;
import p.a44;
import p.pe6;
import p.am4;
import p.lp3;
import p.si5;
import io.reactivex.rxjava3.core.CompletableSource;
import p.s05;
import p.q05;
import p.cw0;
import p.m73;
import p.gv0;
import p.aw6;
import android.graphics.Bitmap;
import p.en;
import p.gn;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.oe7;
import p.up0;
import android.os.PowerManager;
import p.rp;
import p.bi5;
import p.au2;
import p.bu2;
import p.ju2;
import java.lang.Long;
import p.tv;
import p.wt;
import p.cm7;
import com.spotify.webapi.service.models.Pager;
import p.nx6;
import p.n94;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Maybe;
import p.e16;
import p.m94;
import p.ew0;
import p.hv;
import java.util.Map;
import com.spotify.connectivity.productstateesperanto.RxProductStateImpl;
import p.rp3;
import p.dh1;
import p.fx6;

public final class c16 implements yf2	// class@00117a from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void c16(int p0,Object p1,String p2){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public void c16(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       pl0 opl0;
       b43 uob43;
       Single single;
       s05 os05;
       aq6 uoaq6;
       Recommendations recommendati;
       List list;
       List list1;
       String str4;
       k23 ok23;
       int i9;
       Object[] objArray2;
       String str5;
       aq6 uoaq61;
       aq6 b1;
       Observable observable1;
       c16 uoc16 = this;
       int i = 29;
       int i1 = 4;
       int i2 = 2;
       int i3 = 9;
       int i4 = 5;
       String str = "click";
       String wt str1 = "uri";
       String str2 = "navigate";
       int i5 = 6;
       int i6 = 15;
       int i7 = 0;
       int i8 = 1;
       c16 c = uoc16.c;
       c16 b = uoc16.b;
       switch (uoc16.a){
           case 0:
             return RxProductStateImpl.b(b, c, p0);
           case 1:
             hv ohv = p0;
             opl0 = (((((((ohv.a + ohv.b) + ohv.c) + ohv.d) + ohv.e) + ohv.f)) > 0)? b.c(c).t(ohv): Single.just(ohv);
             return opl0;
             break;
           case 2:
             return b.b.a(c, p0);
           case 3:
             b.getClass();
             Maybe maybe = c.firstElement();
             maybe.getClass();
             return new jk0(maybe, i4, new e16(i6, b));
           case 4:
             Pager pager = p0;
             Observable observable = (pager.next == null)? Observable.just(pager): Observable.just(pager).concatWith(nx6.a(c, b, (pager.offset + pager.limit)));
             return observable;
             break;
           case 5:
             return b.scan(new bm(i5)).map(new c16(p0, i5, c));
           case 6:
             str1 = new wt(false, b.longValue(), p0.longValue(), c);
             return str1;
           case 7:
             uob43 = p0;
             i = c.booleanValue();
             if (uob43.b().y("taste-onboarding", false) && !i) {
                d73 uod73 = new d73();
                bu2 t = bu2.t;
                ju2[] oju2Array = new ju2[]{ty0.k().j("lite:whitePrimaryButton", t.a).s(ty0.z().d(b.getString(R.string.home_taste_onboarding_banner_button))).d(str, ty0.j().d(str2).a(str1, "spotify:internal:taste-onboarding")).g()};
                uod73.D0(ty0.k().o("taste-onboarding-banner").j("lite:banner", t.a).s(ty0.z().d(b.getString(R.string.home_taste_onboarding_banner_title)).b(b.getString(R.string.home_taste_onboarding_banner_description))).i(oju2Array).g());
                uod73.G0(uob43.m());
                uob43 = uob43.a().e(uod73.I0()).g();
             }
             return uob43;
             break;
           case 8:
             b.getClass();
             return c.b.map(new up0(i4, c)).startWithItem(Boolean.valueOf(c.a.isInteractive())).distinctUntilChanged().takeUntil(new rp(i6)).switchMapSingle(new c16(b, i3, p0));
           case 9:
             b.getClass();
             gv0 d = b.d;
             if (p0.booleanValue()) {
                gv0 c1 = b.c;
                c1.getClass();
                single = Single.create(new en(c1, d.get(), c.f(), b.e)).subscribeOn(id.a());
             }else {
                single = Single.just(d.get());
             }
             return single;
             break;
           case 10:
             if ((os05 = p0.m.get(b)) != null) {
                c = os05;
             }
             return c;
             break;
           case 11:
             return lp3.b(b, c, p0);
           case 12:
             am4 uoam4 = p0;
             return b.a(c, uoam4.P, uoam4.Q, uoam4.R);
           case 13:
             Playlist4ApiProto$CreateListReply uCreateListR = p0;
             b.getClass();
             c01 x = b.x;
             x.getClass();
             hg5 ohg5 = Playlist4ApiProto$Item.g();
             ohg5.c(c01.e(uCreateListR));
             Playlist4ApiProto$Item item = ohg5.build();
             eg5 uoeg5 = Playlist4ApiProto$Add.j();
             uoeg5.e();
             uoeg5.c(Collections.singletonList(item));
             Playlist4ApiProto$Add uAdd = uoeg5.build();
             pg5 opg5 = Playlist4ApiProto$Op.j();
             opg5.c(uAdd);
             opg5.d(rg5.c);
             Playlist4ApiProto$Op op = opg5.build();
             gg5 ogg5 = Playlist4ApiProto$Delta.h();
             ogg5.c(op);
             ogg5.d(x.a());
             og5 oog5 = Playlist4ApiProto$ListChanges.g();
             oog5.c(ogg5.build());
             Playlist4ApiProto$ListChanges listChanges = oog5.build();
             Completable uCompletable = b.v.a(ox7.c(c.b(), pe0.b), listChanges);
             if ((uoaq6 = td7.d(c01.e(uCreateListR))) == null) {
                single = Single.just(uCreateListR);
             }else {
                x = b.t;
                x.getClass();
                opl0 = Completable.i(new g16(x, 10, uoaq6)).c(x.b()).t(uCreateListR);
             }
             return uCompletable.d(single);
             break;
           case 14:
             MainViewResponse mainViewResp = p0;
             c.getClass();
             i = mainViewResp.h();
             g96 a = c.a;
             if (!i) {
                Object[] objArray = new Object[i8];
                objArray[i7] = b;
                uob43 = e43.a(a.getString(R.string.search_no_results_title, objArray), a.getString(R.string.search_no_results_subtitle));
             }else {
                Entity uEntity = mainViewResp.g(i7);
                d73 uod731 = new d73();
                uod731.G0(f96.a(a, i7, uEntity));
                if (mainViewResp.j()) {
                   if ((recommendati = mainViewResp.i()) == null) {
                      list = Collections.emptyList();
                   }else if((i9 = recommendati.h().ordinal()) != i8){
                      if (i9 != i2) {
                         list = Collections.emptyList();
                      }else {
                         objArray2 = new Object[i8];
                         objArray2[i7] = uEntity.getName();
                         str5 = a.getString(R.string.search_recommendations_title_genre, objArray2);
                      }
                   }else {
                      objArray2 = new Object[i8];
                      objArray2[i7] = uEntity.getName();
                      str5 = a.getString(R.string.search_recommendations_title_artist, objArray2);
                   }
                   d73 uod732 = new d73();
                   uod732.D0(ty0.k().o("recs-header-"+recommendati.h()).k(x03.b).s(ty0.z().d(str5)).g());
                   d73 uod733 = new d73();
                   Iterator iterator1 = recommendati.g().iterator();
                   while (iterator1.hasNext()) {
                      Entity uEntity1 = iterator1.next();
                      List list2 = ((uoaq61 = td7.d(uEntity1.k())) == null)? Collections.emptyList(): Collections.singletonList(ty0.k().o(uEntity1.k()).k(ay2.b).p(ty0.o().d(f96.b(uoaq61.b, uEntity1))).s(ty0.z().d(uEntity1.getName())).d(str, ty0.j().d(str2).a(str1, uEntity1.k())).g());
                      uod733.G0(list2);
                      ok23 = 4;
                   }
                   uod732.D0(ty0.k().o("recs-cards").k(ry2.c).h(uod733.I0()).g());
                   list = uod732.I0();
                   uod731.G0(list);
                }
                for (i8 = 1; i8 < i; i8 = i8 + 1) {
                   uod731.G0(f96.a(a, i8, mainViewResp.g(i8)));
                }
                zb3 ozb3 = mainViewResp.f();
                if (ozb3.isEmpty()) {
                   list1 = Collections.emptyList();
                }else {
                   i1 = 4;
                   w51.h(i1, "initialCapacity");
                   Object[] objArray1 = new Object[i1];
                   Iterator iterator = ozb3.iterator();
                   i7 = 0;
                   while (iterator.hasNext()) {
                      ao1 uoao1 = iterator.next();
                      switch (uoao1.ordinal()){
                          case 1:
                            i2 = 0x7f1202f7;
                         label_02de :
                            iu2 oiu2 = ty0.k().o("see-more-".append(uoao1).toString()).k(c03.c).s(ty0.z().d(a.getString(i2)));
                            st2 ost2 = ty0.j().d(str2);
                            String str3 = lv1.l(b);
                            switch (uoao1.ordinal()){
                                case 1:
                                  str4 = "spotify:search:artists:".concat(str3);
                                  break;
                                case 2:
                                  str4 = "spotify:search:tracks:".concat(str3);
                                  break;
                                case 3:
                                  str4 = "spotify:search:albums:".concat(str3);
                                  break;
                                case 4:
                                  str4 = "spotify:search:playlists:".concat(str3);
                                  break;
                                case 5:
                                  str4 = "spotify:search:genres:".concat(str3);
                                  break;
                                case 6:
                                  str4 = "spotify:search:audioshows:".concat(str3);
                                  break;
                                case 7:
                                  str4 = "spotify:search:audioepisodes:".concat(str3);
                                  break;
                                case 8:
                                  str4 = "spotify:search:profiles:".concat(str3);
                                  break;
                                case 9:
                                  str4 = "spotify:search:audiobook:".concat(str3);
                                  break;
                                case 10:
                                  str4 = "unrecognized";
                                  break;
                                default:
                                  str4 = "unknown";
                            }
                            ok23 = oiu2.d(str, ost2.a(str1, str4)).g();
                            ok23.getClass();
                            i2 = i7 + 1;
                            if (objArray1.length < i2) {
                               objArray1 = Arrays.copyOf(objArray1, do5.t(objArray1.length, i2));
                            }
                            break;
                          case 2:
                            i2 = 0x7f1202fc;
                            goto label_02de ;
                            break;
                          case 3:
                            i2 = 0x7f1202f6;
                            goto label_02de ;
                            break;
                          case 4:
                            i2 = 0x7f1202fa;
                            goto label_02de ;
                            break;
                          case 5:
                            i2 = 0x7f1202f9;
                            goto label_02de ;
                            break;
                          case 6:
                            i2 = 0x7f1202fb;
                            goto label_02de ;
                            break;
                          case 7:
                            i2 = 0x7f1202f8;
                            goto label_02de ;
                            break;
                          default:
                      }
                      objArray1[i7] = ok23;
                      i7 = i2;
                   }
                   list1 = c.m(i7, objArray1);
                }
                uod731.G0(list1);
                z23 oz23 = ty0.B().j(b).e(uod731.I0()).g();
             }
             return uob43;
             break;
           case 15:
             return b.a.e(b.c).compose(new uf()).flatMapObservable(new ab0(19)).startWith(c.map(new ab0(20)).toObservable()).onErrorResumeWith(Observable.empty());
           case 16:
             return p0.a(new wc5(b, i7, c), new kl4(i), new xc5(i7), new xc5(i8), new xc5(i2));
           case 17:
             return p0.a(new wc5(b, i8, c), new xc5(3), new xc5(i1), new xc5(i4), new xc5(i5));
           case 18:
             ah1 uoah1 = p0;
             ah1 f = uoah1.F;
             b.getClass();
             if ((b1 = f.b) != yp6.B && b1 != yp6.A) {
                observable1 = Observable.just(Boolean.FALSE);
             }else {
                y15 a1 = b.a;
                a1.getClass();
                observable1 = new f37(a1, i1, new k12(26)).map(new qn3(f, i8));
             }
             return Observable.combineLatest(observable1, c.c.distinctUntilChanged(), new bm(22)).distinctUntilChanged().map(new sd5(i)).onErrorReturn(new vc5(13, uoah1));
             break;
           default:
             return Observable.combineLatest(b.c.distinctUntilChanged(), c.a().map(new fx6(16)).toObservable(), new bm(21)).distinctUntilChanged().map(new sd5(25)).onErrorReturn(new vc5(i3, p0));
       }
    }
}
