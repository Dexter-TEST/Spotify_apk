package p.q9;
import p.yf2;
import java.lang.Object;
import p.w00;
import p.z47;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import java.util.Map;
import java.lang.String;
import p.co5;
import p.dp2;
import com.spotify.zorro.telco.v2.proto.TelcoResponse;
import p.ea0;
import com.spotify.zorro.telco.v2.proto.CallbackBody;
import com.google.protobuf.c;
import com.google.protobuf.b;
import io.reactivex.rxjava3.core.Completable;
import p.xs7;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicInteger;
import p.i70;
import p.f72;
import io.reactivex.rxjava3.core.Flowable;
import p.ge6;
import p.t37;
import java.lang.Integer;
import java.lang.Long;
import p.s36;
import java.util.Objects;
import p.d82;
import java.lang.Math;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import p.bs1;
import p.bc3;
import java.util.List;
import com.spotify.playerlimited.player.models.OfflineTracksResourceResponse;
import java.util.ArrayList;
import com.spotify.playerlimited.player.models.OfflineTracksResource;
import com.spotify.playerlimited.player.models.OfflineResource;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map$Entry;
import p.dj0;
import p.hw;
import p.qw3;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import android.animation.Animator;
import p.ad6;
import android.widget.TextView;
import android.view.View;
import android.animation.ObjectAnimator;
import p.tu6;
import android.widget.Button;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.litelyrics.lyrics.views.TouchBlockingFrameLayout;
import p.yk5;
import p.kz3;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.jz3;
import p.wf2;
import p.vv7;
import p.g54;
import com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import p.jc7;
import p.wu;
import p.zg0;
import p.ic;
import java.lang.System;
import p.r45;
import p.c0;
import java.lang.Double;
import p.jj5;
import p.ux5;
import p.v9;
import p.x8;
import p.ls6;
import p.e55;
import p.qb;
import p.f55;
import p.m46;
import p.aa;
import p.fa;
import p.d55;
import p.ca;
import p.h9;
import io.reactivex.rxjava3.core.ObservableSource;
import p.nr4;

public final class q9 implements yf2	// class@00235d from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void q9(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final Object apply(Object p0){
       aa a;
       LyricsWidgetPresenter l2;
       LyricsWidgetPresenter l3;
       LyricsWidgetPresenter l4;
       Disposable uDisposable;
       LyricsWidgetPresenter l5;
       OfflineTracksResourceResponse offlineTrack;
       String str2;
       OfflineResource b1;
       Object[] obj2;
       ArrayList uArrayList2;
       Map$Entry uEntry;
       List value;
       String str3;
       ea0 obj3;
       f72 uof72;
       q9 oq9 = this;
       ux5 obj = p0;
       int i = 2;
       long l = 0;
       int i1 = 7;
       int i2 = 3;
       int i3 = 1;
       q9 c = oq9.c;
       q9 b = oq9.b;
       switch (oq9.a){
           case 0:
             co5.l(obj, "result");
             obj = obj.a;
             if (ux5.a(obj) == null) {
                b.f.a(e55.b);
                a = (obj.c instanceof m46)? aa.a: new fa(obj);
             }else {
                b.f.a(d55.b);
                a = new ca(c);
             }
             return a;
             break;
           case 1:
             c.getClass();
             long l1 = System.currentTimeMillis();
             wu k = b.k;
             c0 a1 = (!k.c())? c0.a: r45.d(Long.valueOf((k.b().longValue() + (long)(b.j.e(Double.valueOf(0)).doubleValue() * (double)(l1 - b.a)))));
             return a1;
             break;
           case 2:
             String str = "views.loadingIndicator";
             String str1 = "views.lyricsPromotionBannerButton";
             if (b.z != null) {
                Animator[] uAnimatorArr = new Animator[i1];
                if ((l2 = c.L) != null) {
                   ad6 i4 = l2.i;
                   co5.l(i4, "views.lyricsPromotionBannerText");
                   uAnimatorArr[0] = tu6.e(i4);
                   if ((l2 = c.L) != null) {
                      i4 = l2.h;
                      co5.l(i4, str1);
                      uAnimatorArr[i3] = tu6.e(i4);
                      if ((l3 = c.L) != null) {
                         ad6 j = l3.j;
                         co5.l(j, "views.lyricsWidgetButton");
                         uAnimatorArr[i] = tu6.n(j, 8, i);
                         if ((l3 = c.L) != null) {
                            j = l3.b;
                            co5.l(j, str);
                            uAnimatorArr[3] = tu6.n(j, 0, 6);
                            if ((l3 = c.L) != null) {
                               j = l3.f;
                               co5.l(j, "views.lyricsErrorText");
                               uAnimatorArr[4] = tu6.n(j, 0, 6);
                               if ((l3 = c.L) != null) {
                                  j = l3.e;
                                  co5.l(j, "views.lyricsErrorDescription");
                                  uAnimatorArr[5] = tu6.n(j, 0, 6);
                                  if ((l3 = c.L) != null) {
                                     j = l3.d;
                                     co5.l(j, "views.lyricsContainerTouchInterceptor");
                                     uAnimatorArr[6] = tu6.n(j, 8, i);
                                     c.e(uAnimatorArr);
                                     if (obj.b.equals(yk5.b)) {
                                        if ((l4 = c.L) != null) {
                                           l4.i.setText(R.string.lyrics_promotion_free_user_message);
                                        }else {
                                           co5.N("views");
                                           throw null;
                                        }
                                     }else if((l4 = c.L) != null){
                                        l4.i.setText(R.string.lyrics_promotion_premium_user_message);
                                     }else {
                                        co5.N("views");
                                        throw null;
                                     }
                                     uDisposable = c.P.subscribe(new kz3(c, 4));
                                  }else {
                                     co5.N("views");
                                     throw null;
                                  }
                               }else {
                                  co5.N("views");
                                  throw null;
                               }
                            }else {
                               co5.N("views");
                               throw null;
                            }
                         }else {
                            co5.N("views");
                            throw null;
                         }
                      }else {
                         co5.N("views");
                         throw null;
                      }
                   }else {
                      co5.N("views");
                      throw null;
                   }
                }else {
                   co5.N("views");
                   throw null;
                }
             }else {
                Animator[] uAnimatorArr1 = new Animator[8];
                if ((l5 = c.L) != null) {
                   ad6 c1 = l5.c;
                   co5.l(c1, "views.lyricsContainer");
                   ObjectAnimator objectAnimat = tu6.e(c1);
                   vv7.D(objectAnimat, new jz3(c, i));
                   uAnimatorArr1[0] = objectAnimat;
                   if ((l5 = c.L) != null) {
                      c1 = l5.j;
                      co5.l(c1, "views.lyricsWidgetButton");
                      uAnimatorArr1[i3] = tu6.e(c1);
                      if ((l5 = c.L) != null) {
                         c1 = l5.i;
                         co5.l(c1, "views.lyricsPromotionBannerText");
                         uAnimatorArr1[i] = tu6.n(c1, 8, i);
                         if ((l5 = c.L) != null) {
                            c1 = l5.h;
                            co5.l(c1, str1);
                            uAnimatorArr1[3] = tu6.n(c1, 8, i);
                            if ((l5 = c.L) != null) {
                               c1 = l5.b;
                               co5.l(c1, str);
                               i = 6;
                               uAnimatorArr1[4] = tu6.n(c1, 0, i);
                               if ((l5 = c.L) != null) {
                                  c1 = l5.f;
                                  co5.l(c1, "views.lyricsErrorText");
                                  uAnimatorArr1[5] = tu6.n(c1, 0, i);
                                  if ((l5 = c.L) != null) {
                                     c1 = l5.e;
                                     co5.l(c1, "views.lyricsErrorDescription");
                                     uAnimatorArr1[i] = tu6.n(c1, 0, i);
                                     if ((l5 = c.L) != null) {
                                        uAnimatorArr1[7] = l5.g.a.o(b);
                                        c.e(uAnimatorArr1);
                                        uDisposable = jc7.a;
                                     }else {
                                        co5.N("views");
                                        throw null;
                                     }
                                  }else {
                                     co5.N("views");
                                     throw null;
                                  }
                               }else {
                                  co5.N("views");
                                  throw null;
                               }
                            }else {
                               co5.N("views");
                               throw null;
                            }
                         }else {
                            co5.N("views");
                            throw null;
                         }
                      }else {
                         co5.N("views");
                         throw null;
                      }
                   }else {
                      co5.N("views");
                      throw null;
                   }
                }else {
                   co5.N("views");
                   throw null;
                }
             }
             return uDisposable;
             break;
           case 3:
             co5.l(obj, "contextResponse");
             b.getClass();
             if ((obj.g() - l) <= 0) {
                i3 = 0;
             }
             if (!i3 && !obj.f().isEmpty()) {
                offlineTrack = new OfflineTracksResourceResponse();
                bc3 uobc3 = obj.f();
                co5.l(uobc3, "contextResponse.contextsList");
                ArrayList uArrayList = bs1.a(b, uobc3);
                OfflineTracksResource offlineTrack1 = new OfflineTracksResource();
                offlineTrack1.a = c;
                ArrayList uArrayList1 = new ArrayList(aj0.b0(uArrayList));
                Iterator iterator = uArrayList.iterator();
                while (true) {
                   str2 = "no";
                   if (iterator.hasNext()) {
                      if ((b1 = iterator.next().b) != null) {
                         str2 = b1;
                      }
                      uArrayList1.add(str2);
                   }else {
                      break ;
                   }
                }
                LinkedHashMap linkedHashMa = new LinkedHashMap();
                Iterator iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   Object obj1 = iterator1.next();
                   obj2 = obj1;
                   if ((uArrayList2 = linkedHashMa.get(obj2)) == null) {
                      uArrayList2 = new ArrayList();
                      linkedHashMa.put(obj2, uArrayList2);
                   }
                   uArrayList2.add(obj1);
                }
                iterator = linkedHashMa.entrySet().iterator();
                if (!iterator.hasNext()) {
                   uEntry = null;
                }else {
                   obj3 = iterator.next();
                   if (iterator.hasNext()) {
                      int i5 = obj3.getValue().size();
                      do {
                         obj2 = iterator.next();
                         i3 = obj2.getValue().size();
                         if (i5 < i3) {
                            obj3 = obj2;
                            i5 = i3;
                         }
                      } while (!iterator.hasNext());
                   }
                   uEntry = obj3;
                }
                if (uEntry != null && ((value = uEntry.getValue()) != null && (str3 = dj0.l0(value)) != null)) {
                   str2 = str3;
                }
                offlineTrack1.b = str2;
                offlineTrack.a = offlineTrack1;
             }else {
                offlineTrack = new OfflineTracksResourceResponse();
             }
             return offlineTrack;
             break;
           case 4:
             int i6 = b.get();
             c.getClass();
             if (((i6 - 1)) == i2) {
                uof72 = Flowable.h(obj);
             }else {
                long l6 = (long)(i6 * 500);
                obj2 = new Object[i2];
                obj2[0] = Integer.valueOf(i6);
                obj2[i3] = obj.getMessage();
                obj2[i] = Long.valueOf(l6);
                t37.a().getClass();
                ge6.a(obj2);
                TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
                Scheduler b2 = s36.b;
                Objects.requireNonNull(mILLISECONDS, "unit is null");
                Objects.requireNonNull(b2, "scheduler is null");
                uof72 = new d82(Math.max(l, l6), mILLISECONDS, b2);
             }
             return uof72;
             break;
           case 5:
             co5.o(obj, "heParameters");
             b.getClass();
             String str4 = c.g();
             co5.l(str4, "telcoResponse.callbackUrl");
             String str5 = c.h();
             co5.l(str5, "telcoResponse.sessionId");
             obj3 = CallbackBody.g();
             obj3.c(obj);
             c uoc = obj3.build();
             co5.l(uoc, "newBuilder\(\).putAllParam…ers\(heParameters\).build\(\)");
             return b.b.d(str4, str5, uoc);
           case 6:
             c.getClass();
             return new z47(obj, Scheduler.a(b), b);
           case 7:
             return b.apply(c, obj);
           default:
             Object obj4 = c.apply(obj);
             Objects.requireNonNull(obj4, "The mapper returned a null ObservableSource");
             return new nr4(obj4, new q9(b, 7, obj), 3);
       }
    }
}
