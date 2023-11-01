package p.ws3;
import p.yf2;
import java.lang.Object;
import p.i96;
import java.lang.String;
import com.spotify.searchview.proto.DrillDownViewResponse;
import java.lang.Class;
import p.f96;
import p.sp6;
import android.content.Context;
import p.b43;
import p.e43;
import com.google.common.collect.c;
import p.d73;
import com.spotify.searchview.proto.Entity;
import java.util.List;
import java.lang.Iterable;
import p.a43;
import p.ty0;
import p.ys5;
import p.z23;
import p.d86;
import p.av2;
import p.f86;
import p.al5;
import p.t00;
import p.sv;
import java.util.HashMap;
import p.ox7;
import p.pe0;
import java.nio.charset.Charset;
import p.h96;
import p.b90;
import io.reactivex.rxjava3.core.Observable;
import p.d90;
import p.ft6;
import p.ir0;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.c01;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListChanges;
import com.spotify.playlist4.proto.Playlist4ApiProto$CreateListReply;
import p.aq6;
import p.td7;
import io.reactivex.rxjava3.core.Completable;
import p.ah5;
import p.ce7;
import p.ss;
import io.reactivex.rxjava3.core.Single;
import p.a44;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import p.al4;
import p.xk4;
import android.support.v4.media.MediaMetadataCompat;
import p.ft0;
import p.vs0;
import android.net.Uri;
import p.co5;
import p.yp6;
import p.bo3;
import java.util.Set;
import p.lp6;
import p.zk4;
import p.h25;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.si4;
import p.wl6;
import p.x37;
import p.ic;
import android.os.SystemClock;
import java.lang.Math;
import java.lang.Integer;
import p.n6;
import android.content.res.Resources;
import p.cw0;
import p.ow0;
import p.tv0;
import p.hc6;
import com.spotify.limited_offlining_esperanto.proto.SetOfflineRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.mk3;
import p.s74;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.pp;
import p.ir2;
import p.fa4;
import java.util.Map;
import java.util.Collection;
import p.da4;
import java.util.concurrent.Callable;
import p.en3;
import android.content.Intent;
import android.app.Activity;
import java.lang.Boolean;
import java.lang.StringBuilder;
import p.te5;
import p.jl;
import p.ef6;
import p.bm0;
import p.fp6;
import p.wf2;
import p.px1;
import p.gn3;
import p.hn3;
import android.os.Parcelable;
import p.r45;
import p.so3;
import p.zu2;
import p.pu;
import p.i77;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zy5;
import p.f77;
import p.n34;
import p.s36;
import java.util.Objects;
import p.t34;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import p.d16;
import p.k34;
import p.e16;
import p.xs3;
import com.spotify.login5.v3.proto.LoginRequest;
import com.spotify.login5.v3.proto.Challenges;
import com.spotify.login5.v3.proto.LoginResponse;
import p.xp;
import p.ys3;
import p.ij;
import java.lang.Runnable;
import p.ok0;
import p.pa5;
import p.bc3;
import java.util.Iterator;
import com.spotify.login5.v3.proto.Challenge;
import com.spotify.login5.v3.challenges.proto.CodeChallenge;
import p.ko1;
import p.i80;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import p.mu;
import p.na5;
import p.h;
import p.rt3;
import p.qa5;
import p.ra5;
import com.spotify.base.java.logging.Logger;
import p.op;
import p.oa5;
import p.ps6;
import com.spotify.login5.v3.proto.UserInfo;
import p.li5;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import p.bx5;
import p.c0;
import p.cr0;
import p.fx5;
import com.spotify.messaging.inappmessagingsdk.proto.Preview$PreviewResponseV1;
import com.spotify.messaging.inappmessagingsdk.proto.Messages$MessageV1;
import com.spotify.messaging.inappmessagingsdk.proto.ClickActions$ClickActionV1;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import p.jg0;
import p.u73;
import java.util.Locale;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import p.w87;
import p.u65;
import p.jj5;

public final class ws3 implements yf2	// class@002b98 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void ws3(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Object apply(Object p0){
       LoginResponse loginRespons;
       Single single;
       a44 uoa44;
       String str2;
       CodeChallenge uCodeChallen;
       i80 oi80;
       PhoneNumber phoneNumber;
       Challenges uChallenges1;
       i80 oi801;
       PhoneNumber phoneNumber1;
       Object[] objArray;
       int b1;
       int i7;
       String str4;
       hc6 ohc6;
       al4 x;
       Uri uri;
       aq6 uoaq6;
       aq6 b2;
       String str5;
       lp6 olp6;
       aq6 b3;
       long l1;
       String str6;
       int i8;
       Object[] objArray2;
       aq6 uoaq62;
       Observable observable;
       Object[] objArray3;
       b43 uob43;
       ws3 ows3 = this;
       Challenges uChallenges = null;
       boolean i = 3;
       String str = "tracks";
       String str1 = "Unexpected response: ";
       int h96 i1 = 2;
       int i2 = 1;
       int i3 = 6;
       boolean i4 = 9;
       ws3 t = ows3.t;
       ws3 c = ows3.c;
       ws3 b = ows3.b;
       int u73 i5 = 0;
       switch (ows3.a){
           case 0:
             loginRespons = p0;
             b.getClass();
             if (loginRespons.k() == 1) {
                single = Single.just(ys3.a(loginRespons));
             }else if(loginRespons.k() == i){
                single = b.d(ys3.b(c, loginRespons), t);
             }else if(loginRespons.k() == i1){
                loginRespons.l().g();
                single = Single.error(new op(loginRespons.g()));
             }else {
                single = Single.error(new IllegalStateException(str1+loginRespons));
             }
             return single;
             break;
           case 1:
             loginRespons = p0;
             b.getClass();
             if (loginRespons.k() == 1) {
                xp oxp = ys3.a(loginRespons);
                uoa44 = Completable.j(new ij(b, 27, oxp)).d(Single.just(new pa5(oxp)));
             }else {
                str2 = "Null challenges";
                String str3 = "Null phoneNumber";
                if (loginRespons.k() == i) {
                   Iterator iterator = loginRespons.f().f().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Challenge uChallenge = iterator.next();
                         if (uChallenge.f() == i1) {
                            uCodeChallen = uChallenge.g();
                         }
                      }else {
                         uCodeChallen = uChallenges;
                      }
                      if (uCodeChallen == null) {
                         uoa44 = b.c(ys3.b(c, loginRespons), uChallenges);
                         break ;
                      }else {
                         ko1 oko1 = new ko1(7, 0);
                         if ((oi80 = loginRespons.i()) != null) {
                            oko1.b = oi80;
                            if ((phoneNumber = c.o()) != null) {
                               oko1.t = phoneNumber;
                               if ((uChallenges1 = loginRespons.f()) != null) {
                                  oko1.c = uChallenges1;
                                  uoa44 = Single.just(new na5(oko1.k(), uCodeChallen.f(), uCodeChallen.i(), uCodeChallen.g()));
                                  break ;
                               }else {
                                  throw new NullPointerException(str2);
                               }
                            }else {
                               throw new NullPointerException(str3);
                            }
                         }else {
                            throw new NullPointerException("Null loginContext");
                         }
                      }
                   }
                }else if(loginRespons.k() != i1 || loginRespons.g() != rt3.c){
                   uCodeChallen = 0;
                }else {
                   objArray = 1;
                }
                if (uCodeChallen) {
                   ko1 oko11 = new ko1(7, 0);
                   if ((oi801 = c.n()) != null) {
                      oko11.b = oi801;
                      if ((phoneNumber1 = c.o()) != null) {
                         oko11.t = phoneNumber1;
                         if (t != null) {
                            oko11.c = t;
                            uoa44 = Single.just(new qa5(oko11.k()));
                         }else {
                            throw new NullPointerException(str2);
                         }
                      }else {
                         throw new NullPointerException(str3);
                      }
                   }else {
                      throw new NullPointerException("Null loginContext");
                   }
                }else if(loginRespons.k() != i1 || loginRespons.g() != rt3.x){
                   phoneNumber1 = 0;
                }else {
                   objArray = 1;
                }
                if (phoneNumber1) {
                   uoa44 = Single.just(new ra5(loginRespons.h()));
                }else if(loginRespons.k() == i1){
                   objArray = new Object[]{loginRespons.g()};
                   Logger.b("handlePhoneNumberLoginResponse: error %s", objArray);
                   uoa44 = Single.just(new oa5(new op(loginRespons.g())));
                }else {
                   uoa44 = Single.just(new oa5(new IllegalStateException(str1+loginRespons)));
                }
             }
             return uoa44;
             break;
           case 2:
             b.getClass();
             if (p0.booleanValue()) {
                zu2 a = c.a;
                i77 oi77 = b.d.B();
                oi77.getClass();
                zy5 ozy5 = zy5.x(1, "SELECT\n    track_rows.*\nFROM track_rows\nWHERE track_rows.parent_uri = ?\nORDER BY track_rows.position ASC");
                if (a == null) {
                   ozy5.z(1);
                }else {
                   ozy5.s(1, a);
                }
                Scheduler c1 = s36.c;
                Objects.requireNonNull(c1, "scheduler is null");
                Objects.requireNonNull(t, "defaultItem is null");
                uoa44 = new a44(new k34(new k34(new t34(new n34(new f77(oi77, ozy5, 1)), c1, 1), new d16(a, i1), 1), new e16(9, t), 1), 1, t);
             }else {
                single = Single.just(t);
             }
             return uoa44;
             break;
           case 3:
             b.getClass();
             b1 = p0.booleanValue();
             Challenges uChallenges2 = (c == null)? uChallenges: c.getDataString();
             if (uChallenges2 == null) {
                uChallenges2 = uChallenges;
             }else {
                String[] i6 = en3.i;
                i7 = 0;
                while (i7 < i1) {
                   if (uChallenges2.startsWith(i6[i7])) {
                      i6 = uChallenges2.split("\(intl-[a-zA-Z\\d]*\)");
                      if (i6.length == i1) {
                         uChallenges2 = i6[0]+i6[1].replaceFirst("/", "");
                         break ;
                      }else if(i6.length == 1){
                         uChallenges2 = i6[0];
                         break ;
                      }
                   }
                   i7 = i7 + 1;
                }
             }
             if (te5.a(uChallenges2)) {
                jl.d("Request had no URI, \""+c+'"');
             }else if(b.e.a(uChallenges2) && b.a.e(t, c, new bm0(1, b), b1)){
                throw new px1();
             }else {
                b.f.a(c, uChallenges2);
                uChallenges = b.g.a(uChallenges2);
             }
             if (uChallenges != null) {
                uChallenges = uChallenges.putExtra("EXTRA_DEEP_LINK", c);
             }
             return r45.a(uChallenges);
             break;
           case 4:
             ws3 ows31 = b;
             ows31.getClass();
             da4 v1 = new da4(ows31, p0, c, t, 0);
             return Single.fromCallable(v1);
           case 5:
             b.getClass();
             str4 = c.toString();
             ow0 n = b.n;
             n.getClass();
             co5.o(str4, "contextUri");
             co5.o(t, str);
             tv0 k = n.k;
             k.getClass();
             ohc6 = SetOfflineRequest.h();
             ohc6.d(str4);
             ohc6.c(t);
             SetOfflineRequest setOfflineRe = ohc6.build();
             co5.l(setOfflineRe, "request");
             mk3 a1 = k.a;
             a1.getClass();
             single = a1.callSingle("spotify.limited_offlining_esperanto.proto.LimitedOfflining", "SetOffline", setOfflineRe);
             single = single.map(new pp(17));
             co5.l(single, "callSingle\(\"spotify.limi…     }\n                }\)");
             Completable uCompletable = single.flatMapCompletable(ir2.X);
             co5.l(uCompletable, "single.flatMapCompletabl…)\n            }\n        }");
             return uCompletable;
           case 6:
             MediaMetadataCompat mediaMetadat = p0;
             b.getClass();
             if (ox7.s(mediaMetadat) == null) {
                x = b.x;
             }else {
                ft0 uoft0 = new ft0(i5);
                uoft0.c = i2;
                sp6 o0 = sp6.o0;
                ft0 a2 = uoft0.a;
                a2.f = o0;
                if ((str = ox7.o(mediaMetadat, "android.media.metadata.ALBUM_ART_URI")) != null) {
                   uri = Uri.parse(str);
                   co5.o(uri, "<set-?>");
                   a2.e = uri;
                }
                if ((str = ox7.o(mediaMetadat, "android.media.metadata.TITLE")) != null) {
                   a2.a = str;
                }
                if ((str = ox7.o(mediaMetadat, "android.media.metadata.ARTIST")) != null) {
                   a2.b = str;
                }
                uri = ((uoaq6 = td7.d(ox7.s(mediaMetadat))) != null && ((b2 = uoaq6.b) == yp6.I && b2 != yp6.J))? 1: 0;
                if (!uri) {
                   if (uoaq6 != null) {
                      b.v.getClass();
                      if ((bo3.q.contains(uoaq6.b) ^ i2)) {
                         str = c.getString(R.string.player_menu_like);
                         sp6 q = (ox7.v(mediaMetadat))? sp6.Q: sp6.P;
                         uoft0.b(R.id.action_like, str, al4.e(c, q), new zk4(t, i5));
                      }
                   }
                   if (uoaq6 != null && uoaq6.b == yp6.w) {
                      uoft0.b(R.id.action_add_to_playlist, c.getString(R.string.player_menu_add_to_playlist), al4.e(c, sp6.v), new zk4(t, i1));
                   }
                   if (uoaq6 != null && uoaq6.b == yp6.w) {
                      uoft0.b(R.id.action_add_to_queue, c.getString(R.string.player_menu_add_to_queue), al4.e(c, sp6.w), new zk4(t, i));
                   }
                   ohc6 = (uoaq6 != null && uoaq6.b == yp6.m0)? 1: 0;
                   str5 = ox7.o(mediaMetadat, "spotify.media.metadata.ALBUM_URI");
                   str1 = "spotify";
                   str5 = (TextUtils.isEmpty(str5))? 0: TextUtils.equals(str1, Uri.parse(str5).getScheme());
                   if (str5 && !ohc6) {
                      uoft0.b(R.id.action_view_album, c.getString(R.string.player_menu_view_album), al4.e(c, sp6.x), new zk4(t, 4));
                   }
                   i = 0x7f1202a8;
                   if (ohc6) {
                      sp6 b0 = sp6.b0;
                      uoft0.b(R.id.action_view_show, c.getString(R.string.player_menu_view_show), al4.e(c, b0), new zk4(t, 5));
                      olp6 = al4.e(c, b0);
                      uoft0.b(R.id.action_view_episode, c.getString(R.string.player_menu_view_episode), olp6, new zk4(t, i3));
                      uoft0.b(R.id.action_share, c.getString(i), al4.e(c, sp6.h0), new zk4(t, 7));
                   }
                   str4 = ox7.o(mediaMetadat, "spotify.media.metadata.ARTIST_URI");
                   x = (TextUtils.isEmpty(str4))? 0: TextUtils.equals(str1, Uri.parse(str4).getScheme());
                   if (x) {
                      uoft0.b(R.id.action_view_artist, c.getString(R.string.player_menu_view_artist), al4.e(c, sp6.z), new zk4(t, 8));
                   }
                   if (uoaq6 != null && uoaq6.b == yp6.w) {
                      uoft0.b(R.id.action_view_track, c.getString(R.string.player_menu_view_track), al4.e(c, o0), new zk4(t, 9));
                      uoft0.b(R.id.action_share, c.getString(i), al4.e(c, sp6.h0), new zk4(t, 10));
                   }
                   x = (uoaq6 != null && ((b3 = uoaq6.b) == yp6.w && b3 != yp6.m0))? 1: 0;
                   if (x) {
                      si4 osi4 = new si4(c, b.w, 0);
                      if ((b3 = uoaq6.a) == null) {
                         str2 = uoaq6.toString();
                      }
                      aq6 uoaq61 = new aq6(str2);
                      if (osi4.a.b()) {
                         si4 b4 = osi4.b;
                         Object[] objArray1 = new Object[1];
                         wl6 a3 = osi4.a.a;
                         olp6 = (a3.d != null)? 1: 0;
                         long l = -1;
                         if (olp6) {
                            a3.a.getClass();
                            l1 = (a3.f + a3.e) - SystemClock.elapsedRealtime();
                         }else {
                            l1 = l;
                         }
                         a3 = ((l1) < 0)? 1: 0;
                         if (a3) {
                            str6 = (uoaq61.b == yp6.m0)? osi4.b.getString(R.string.context_menu_sleep_timer_end_of_episode): osi4.b.getString(R.string.context_menu_sleep_timer_end_of_track);
                            i1 = 0;
                         }else {
                            wl6 a4 = osi4.a.a;
                            a3 = (a4.d != null)? 1: 0;
                            if (a3) {
                               a4.a.getClass();
                               l = (a4.f + a4.e) - SystemClock.elapsedRealtime();
                            }
                            i8 = (int)Math.ceil(((double)l / 60000.00f));
                            i7 = 60;
                            if (i8 < i7) {
                               objArray2 = new Object[]{Integer.valueOf(i8)};
                               i1 = 0;
                               str6 = String.format(osi4.b.getString(R.string.context_menu_sleep_timer_mins_left), objArray2);
                            }else {
                               i1 = 0;
                               objArray2 = new Object[]{Integer.valueOf((i8 / i7))};
                               str6 = String.format(osi4.b.getString(R.string.context_menu_sleep_timer_hours_left), objArray2);
                            }
                         }
                         objArray1[i1] = str6;
                         str2 = b4.getString(R.string.context_menu_sleep_timer_active_title, objArray1);
                      }else {
                         str2 = osi4.b.getString(R.string.context_menu_sleep_timer);
                      }
                      i7 = 0x7f0600bb;
                      if (osi4.a.b()) {
                         osi4 = osi4.b;
                         olp6 = new lp6(osi4, sp6.k0, (float)osi4.getResources().getDimensionPixelSize(i7));
                         olp6.b(n6.b(osi4, R.color.green_light));
                      }else {
                         osi4 = osi4.b;
                         olp6 = new lp6(osi4, sp6.j0, (float)osi4.getResources().getDimensionPixelSize(i7));
                         olp6.b(n6.b(osi4, R.color.dark_base_text_subdued));
                      }
                      uoft0.b(R.id.action_sleep_timer, str2, olp6, new zk4(t, 1));
                   }
                }
                x = uoft0;
             }
             return x;
             break;
           case 7:
             Playlist4ApiProto$CreateListReply uCreateListR = p0;
             b.getClass();
             if ((uoaq62 = td7.d(c01.e(uCreateListR))) != null) {
                Completable uCompletable1 = b.v.c(uoaq62.t, c);
                ce7 uoce7 = new ce7(uChallenges);
                if (t != null) {
                   uoce7.a = t;
                   uoce7.b = c01.e(uCreateListR);
                   return uCompletable1.d(Single.just(uoce7.i()));
                }else {
                   throw new NullPointerException("Null name");
                }
             }else {
                throw new IllegalStateException("Unable to parse SpotifyUri from CreateListReply");
             }
             break;
           case 8:
             d86 t1 = b.t;
             av2 a5 = p0.a;
             t1.getClass();
             if (c != null && t != null) {
                f86 uof86 = t1.t;
                sv osv = uof86.c.c.c();
                osv.getClass();
                HashMap hashMap = new HashMap(i3);
                hashMap.put("locale", ox7.k(uof86.a));
                hashMap.put("catalogue", osv.d);
                hashMap.put("country", osv.c);
                hashMap.put("limit", "20");
                hashMap.put("platform", "android");
                hashMap.put("entityVersion", "6");
                i1 = new h96(uof86, c, ox7.c(t, pe0.b), hashMap, a5);
                observable = d90.a(i1).map(new ws3(uof86, c, t, i4)).doOnError(new ft6(c, t));
             }else {
                observable = Observable.error(new IllegalArgumentException());
             }
             return observable.compose(t1.w);
             break;
           case 9:
             DrillDownViewResponse uDrillDownVi = p0;
             b.getClass();
             int i9 = uDrillDownVi.g();
             i96 a6 = b.a;
             if (!i9) {
                objArray3 = new Object[i2];
                objArray3[i5] = t;
                uob43 = e43.a(a6.getString(R.string.search_no_results_title, objArray3), a6.getString(R.string.search_no_results_subtitle));
             }else {
                d73 uod73 = new d73();
                for (b1 = 0; b1 < i9; b1 = b1 + 1) {
                   uod73.G0(f96.a(a6, b1, uDrillDownVi.f(b1)));
                }
                c.getClass();
                switch (c.hashCode()){
                    case 0x90c9b8e1:
                      if (c.equals("playlists")) {
                         b1 = 0;
                      }
                      break;
                    case 0xaba64fe4:
                      if (c.equals("albums")) {
                         b1 = 1;
                      }
                      break;
                    case 0xb5862750:
                      if (c.equals("genres")) {
                         b1 = 2;
                      }
                      break;
                    case 0xcc663888:
                      if (c.equals(str)) {
                         b1 = 3;
                      }
                      break;
                    case 0xd4590a0c:
                      if (c.equals("artists")) {
                         b1 = 4;
                      }
                      break;
                    case 0x5d6ddf00:
                      if (c.equals("audioshows")) {
                         b1 = 5;
                      }
                      break;
                    case 0x633d67ae:
                      if (c.equals("audioepisodes")) {
                         b1 = 6;
                      }
                      break;
                    default:
                      b1 = -1;
                }
                switch (b1){
                    case 0:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_playlists, objArray3);
                      break;
                    case 1:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_albums, objArray3);
                      break;
                    case 2:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_genres, objArray3);
                      break;
                    case 3:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_tracks, objArray3);
                      break;
                    case 4:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_artists, objArray3);
                      break;
                    case 5:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_shows, objArray3);
                      break;
                    case 6:
                      objArray3 = new Object[i2];
                      objArray3[i5] = t;
                      str6 = a6.getString(R.string.search_see_more_title_episodes, objArray3);
                      break;
                    default:
                }
                uob43 = ty0.B().j(t).l(str6).e(uod73.I0()).g();
             }
             return uob43;
             break;
           default:
             i8 = 0;
             bx5 uobx5 = p0;
             b.getClass();
             c0 a7 = c0.a;
             if (uobx5.a() && (uobx5 = uobx5.b) != null) {
                Preview$PreviewResponseV1 previewRespo = Preview$PreviewResponseV1.h(uobx5.b());
                b.c.getClass();
                if (previewRespo.g()) {
                   Messages$MessageV1 messageV1 = previewRespo.f();
                   Map map = messageV1.g();
                   HashMap hashMap1 = new HashMap(messageV1.f());
                   Iterator iterator1 = messageV1.g().keySet().iterator();
                   while (iterator1.hasNext()) {
                      str5 = iterator1.next();
                      ClickActions$ClickActionV1 uClickAction = map.get(str5);
                      ActionType uActionType = ActionType.valueOf(uClickAction.f());
                      String str7 = uClickAction.i();
                      str1 = uClickAction.h();
                      co5.o(uActionType, "actionType");
                      i4 = (ActionType.EXTERNAL_URL != uActionType && ActionType.SELECT_OPTION != uActionType)? true: false;
                      hashMap1.put(str5, new jg0(uActionType, str7, str1, i4));
                   }
                   String str8 = messageV1.h();
                   if (str8.equals("cards") && messageV1.j()) {
                      str8 = "fullscreen";
                   }
                   Locale uS = Locale.US;
                   i5 = new u73(messageV1.k(), hashMap1, messageV1.m(), messageV1.l(), messageV1.n(), FormatType.valueOf(str8.toUpperCase(uS)));
                   a7 = new jj5(new u65(new w87(t, c, FormatType.valueOf(str8.toUpperCase(uS))), i5));
                }
                observable = Observable.just(a7);
             }else {
                observable = Observable.just(a7);
             }
             return observable;
       }
    }
}
