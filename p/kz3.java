package p.kz3;
import p.ir0;
import com.spotify.litelyrics.lyrics.widget.LyricsWidgetPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import p.co5;
import p.ab3;
import java.lang.Class;
import p.wo3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LiteInteraction;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;
import p.jc7;
import p.wf2;
import p.wu;
import java.lang.Throwable;
import p.vx3;
import p.rx3;
import p.fn0;
import p.t00;
import p.qw3;
import p.kw3;
import p.ad6;
import com.spotify.lyrics.core.ui.LyricsRecyclerView;
import p.hy3;
import p.gy3;
import p.p87;
import p.px3;
import p.tm5;
import p.zc;
import p.iz3;
import p.q87;
import io.reactivex.rxjava3.core.Observable;
import p.vj3;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import p.v67;
import p.b5;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import p.az5;
import java.util.Objects;
import p.bn5;
import p.mf1;
import p.ap5;
import p.g62;
import p.i72;
import p.mz3;
import p.yf2;
import p.al5;
import io.reactivex.rxjava3.core.Scheduler;
import p.q9;
import android.widget.Button;
import android.widget.TextView;
import p.kb;
import p.ux3;
import p.tx3;
import android.animation.Animator;
import android.view.View;
import android.animation.ObjectAnimator;
import p.tu6;
import com.facebook.shimmer.ShimmerFrameLayout;
import p.g54;
import com.spotify.litelyrics.lyrics.views.LyricsNotTimesyncedIndicatorView;
import android.widget.LinearLayout;
import android.content.res.Resources;
import android.content.Context;
import android.content.res.Resources$Theme;
import p.xw5;
import p.e63;
import p.qx3;
import p.sx3;
import p.r45;
import p.nt0;
import p.ur;
import p.cy3;

public final class kz3 implements ir0	// class@001cb0 from classes.dex
{
    public final int a;
    public final LyricsWidgetPresenter b;

    public void kz3(LyricsWidgetPresenter p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       LyricsWidgetPresenter d;
       LyricsWidgetPresenter l;
       LyricsRecyclerView b1;
       LyricsWidgetPresenter l1;
       LyricsWidgetPresenter l2;
       Animator[] uAnimatorArr;
       ad6 c2;
       LyricsWidgetPresenter l3;
       ad6 h;
       ad6 j;
       g54 a2;
       LyricsWidgetPresenter l4;
       kz3 okz3 = this;
       int i = 2;
       int i1 = 1;
       kz3 b = okz3.b;
       switch (okz3.a){
           case 0:
             rx3 orx3 = p0;
             int i2 = 0;
             if (orx3 instanceof rx3) {
                orx3 = orx3.a;
                d = b.D;
                d.e();
                LyricsWidgetPresenter q = b.Q;
                q.onNext(Boolean.FALSE);
                qw3 x = orx3.x;
                kw3 c = x.c;
                b.f(x.a, c);
                if ((l = b.L) != null) {
                   ad6 c1 = l.c;
                   kw3 okw3 = new kw3(x.a, x.b, c);
                   c1.getClass();
                   if ((b1 = c1.b1) != null) {
                      hy3 a = b1.a;
                      a.getClass();
                      a.c.onNext(okw3);
                      LyricsWidgetPresenter lyricsWidget = q;
                      iz3 okw31 = new iz3(orx3, true, 1, p87.a, 0, 1, b.z.a.get().b(), b.c, null, false);
                      b.a.a(okw3);
                      Disposable[] uDisposableA = new Disposable[i];
                      if ((l1 = b.L) != null) {
                         Disposable uDisposable = l1.c.getMinimumCharactersDisplayedCompletable().subscribe(new v67(i1, b));
                         co5.l(uDisposable, "private fun listenForCha…splayed\(\)\n        }\n    }");
                         uDisposableA[i2] = uDisposable;
                         BackpressureStrategy a1 = BackpressureStrategy.a;
                         Flowable uFlowable = b.N.toFlowable(a1);
                         Flowable uFlowable1 = b.O.toFlowable(a1);
                         Flowable uFlowable2 = lyricsWidget.toFlowable(a1);
                         Objects.requireNonNull(uFlowable, "source1 is null");
                         Objects.requireNonNull(uFlowable1, "source2 is null");
                         Objects.requireNonNull(uFlowable2, "source3 is null");
                         q = b.R;
                         Objects.requireNonNull(q, "source4 is null");
                         bn5[] uobn5Array = new bn5[]{uFlowable,uFlowable1,uFlowable2,q};
                         i2 = Flowable.a;
                         ap5.E(i2, "bufferSize");
                         uDisposableA[i1] = new g62(i2, new mf1(16, az5.y), uobn5Array).g().w(new mz3(b, i1)).g().subscribe(new kz3(b, 5));
                         d.d(uDisposableA);
                         b.h();
                         b.C.c(b.A.d.distinctUntilChanged().observeOn(b.t).map(new q9(orx3, i, b)).subscribe());
                         if ((l2 = b.L) != null) {
                            l2.j.setText(R.string.lyrics_widget_button_open_fullscreen);
                            b.H = new kb(b, 4, orx3);
                            b.I.onNext(orx3);
                         }else {
                            co5.N("views");
                            throw null;
                         }
                      }else {
                         co5.N("views");
                         throw null;
                      }
                   }else {
                      co5.N("presenter");
                      throw null;
                   }
                }else {
                   co5.N("views");
                   throw null;
                }
             }else if(orx3 instanceof ux3){
                LyricsWidgetPresenter.b(b);
             }else {
                String str = "views.lyricsContainer";
                if (orx3 instanceof tx3) {
                   b.h();
                   uAnimatorArr = new Animator[8];
                   if ((d = b.L) != null) {
                      c2 = d.c;
                      co5.l(c2, str);
                      uAnimatorArr[i2] = tu6.n(c2, i2, 6);
                      if ((d = b.L) != null) {
                         c2 = d.i;
                         co5.l(c2, "views.lyricsPromotionBannerText");
                         uAnimatorArr[i1] = tu6.n(c2, i2, 6);
                         if ((l3 = b.L) != null) {
                            h = l3.h;
                            co5.l(h, "views.lyricsPromotionBannerButton");
                            uAnimatorArr[i] = tu6.n(h, i2, 6);
                            if ((l2 = b.L) != null) {
                               j = l2.j;
                               co5.l(j, "views.lyricsWidgetButton");
                               uAnimatorArr[3] = tu6.n(j, i2, 6);
                               if ((l2 = b.L) != null) {
                                  j = l2.b;
                                  co5.l(j, "views.loadingIndicator");
                                  uAnimatorArr[4] = tu6.n(j, i2, 6);
                                  if ((l2 = b.L) != null) {
                                     j = l2.f;
                                     co5.l(j, "views.lyricsErrorText");
                                     uAnimatorArr[5] = tu6.e(j);
                                     if ((l2 = b.L) != null) {
                                        j = l2.e;
                                        co5.l(j, "views.lyricsErrorDescription");
                                        uAnimatorArr[6] = tu6.e(j);
                                        if ((l2 = b.L) != null) {
                                           a2 = l2.g.a;
                                           co5.l(a2, "views.lyricsNotTimesyncedIndicator.root");
                                           uAnimatorArr[7] = tu6.n(a2, i2, 6);
                                           b.e(uAnimatorArr);
                                           if ((l2 = b.L) != null) {
                                              l2.f.setText(R.string.lyrics_error_no_connection);
                                              if ((l2 = b.L) != null) {
                                                 l2.e.setText(R.string.lyrics_error_no_connection_description);
                                                 if ((l2 = b.L) != null) {
                                                    Resources resources = l2.a.getResources();
                                                    if ((l4 = b.L) != null) {
                                                       i = xw5.b(resources, R.color.lyrics_background_default, l4.a.getContext().getTheme());
                                                       if ((l4 = b.L) != null) {
                                                          Resources resources1 = l4.a.getResources();
                                                          if ((l3 = b.L) != null) {
                                                             b.f(i, xw5.b(resources1, R.color.lyrics_text_color_default, l3.a.getContext().getTheme()));
                                                             b.H = e63.x;
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
                }else if(orx3 instanceof qx3){
                   LyricsWidgetPresenter.b(b);
                }else if(orx3 instanceof sx3){
                   b.H = e63.w;
                   uAnimatorArr = new Animator[6];
                   if ((d = b.L) != null) {
                      c2 = d.c;
                      co5.l(c2, str);
                      uAnimatorArr[i2] = tu6.n(c2, i2, 6);
                      if ((d = b.L) != null) {
                         c2 = d.j;
                         co5.l(c2, "views.lyricsWidgetButton");
                         uAnimatorArr[i1] = tu6.n(c2, i2, 6);
                         if ((l3 = b.L) != null) {
                            h = l3.b;
                            co5.l(h, "views.loadingIndicator");
                            uAnimatorArr[i] = tu6.e(h);
                            if ((l2 = b.L) != null) {
                               j = l2.f;
                               co5.l(j, "views.lyricsErrorText");
                               uAnimatorArr[3] = tu6.n(j, i2, 6);
                               if ((l2 = b.L) != null) {
                                  j = l2.e;
                                  co5.l(j, "views.lyricsErrorDescription");
                                  uAnimatorArr[4] = tu6.n(j, i2, 6);
                                  if ((l2 = b.L) != null) {
                                     a2 = l2.g.a;
                                     co5.l(a2, "views.lyricsNotTimesyncedIndicator.root");
                                     uAnimatorArr[5] = tu6.n(a2, i2, 6);
                                     b.e(uAnimatorArr);
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
             }
             return;
             break;
           case 1:
             LyricsWidgetPresenter.b(b);
             return;
           case 2:
             b.J = p0;
             return;
           case 3:
             b.H.invoke();
             return;
           case 4:
             Object obj = p0;
             co5.l(obj, "viewed");
             if (obj.booleanValue() && b.K == null) {
                l2 = b.B;
                l2.getClass();
                wo3 owo3 = LiteInteraction.l();
                owo3.f("lite/now-playing-view");
                owo3.h("spotify:now-playing-view");
                owo3.g("spotify:undefined");
                owo3.d("scroll");
                owo3.c("item-viewed");
                owo3.e("lyrics_upsell_promo_message");
                l2.a.a(owo3.build());
                b.K = i1;
             }
             return;
             break;
           default:
             Object obj1 = p0;
             if ((l3 = b.J) != null) {
                nt0 ont0 = l3.g.f();
                String str1 = l3.h.f();
                if (ont0 != null && str1 != null) {
                   co5.l(obj1, "response");
                   ur a3 = ont0.a;
                   co5.l(a3, "track.uri\(\)");
                   b.y.a(obj1, a3, str1, i);
                }
             }
             return;
       }
    }
}
