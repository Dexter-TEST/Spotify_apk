package p.t67;
import p.p65;
import java.lang.Object;
import p.fv1;
import android.content.Context;
import android.view.WindowManager$LayoutParams;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import p.id0;
import p.p77;
import p.ty5;
import p.tk2;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ProgressBar;
import com.spotify.legacyglue.icons.SpotifyIconView;
import p.a70;
import p.o08;
import p.x18;
import p.ly7;
import p.jy7;
import p.li5;
import p.tx7;
import p.t63;
import p.k08;
import p.j65;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import java.util.ArrayList;
import p.fn0;
import p.t00;
import p.uf;
import p.lu;
import java.lang.Long;
import p.zr5;
import p.al2;
import com.spotify.webapi.service.models.Entity;
import p.d06;
import android.text.TextUtils;
import com.spotify.webapi.service.models.Track;
import com.spotify.webapi.service.models.TrackSimple;
import p.ox7;
import com.spotify.webapi.service.models.Episode;
import com.spotify.webapi.service.models.EpisodeSimple;
import p.n06;
import p.kg4;
import p.sp6;
import p.lp6;
import p.mi;
import p.or6;
import p.p06;
import android.view.View$OnTouchListener;
import p.o65;
import p.ze;
import androidx.recyclerview.widget.RecyclerView;
import p.o85;
import p.xj0;
import p.a06;
import p.zk2;
import p.eo5;
import p.xz5;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.h65;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.la5;
import java.lang.IllegalStateException;
import java.util.Objects;
import p.fj7;
import p.b5;
import java.lang.NullPointerException;
import p.aw1;
import p.lv1;
import p.na6;
import p.r45;
import p.oe7;
import p.g54;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import p.c0;
import p.uv1;
import p.i70;
import p.hs3;

public final class t67 implements p65	// class@00270f from classes.dex
{
    public final int a;
    public Object b;
    public Object c;
    public Object t;
    public Object v;
    public Object w;
    public Object x;
    public Object y;

    public void t67(int p0){
       this.a = p0;
       if (p0 != 2) {
          if (p0 != 3) {
             if (p0 != 5) {
                if (p0 != 11) {
                   super();
                   this.b = null;
                   this.c = null;
                   this.t = null;
                   this.v = null;
                   this.w = null;
                   this.x = null;
                   this.y = null;
                   return;
                }else {
                   super();
                   this.b = new fv1();
                   return;
                }
             }else {
                super();
                return;
             }
          }else {
             super();
             return;
          }
       }else {
          super();
          return;
       }
    }
    public void t67(Context p0){
       this.a = 0;
       super();
       this.v = new WindowManager$LayoutParams();
       this.w = new Rect();
       int[] ointArray = new int[2];
       this.x = ointArray;
       int[] ointArray1 = new int[2];
       this.y = ointArray1;
       this.b = p0;
       View view = LayoutInflater.from(p0).inflate(R.layout.abc_tooltip, null);
       this.c = view;
       this.t = view.findViewById(R.id.message);
       this.v.setTitle(t67.class.getSimpleName());
       view.packageName = this.b.getPackageName();
       t67 tv = this.v;
       tv.type = 1002;
       tv.width = -2;
       tv.height = -2;
       tv.format = -3;
       tv.windowAnimations = 0x7f130009;
       tv.flags = 24;
    }
    public void t67(Context p0,id0 p1,p77 p2,p77 p3){
       this.a = 7;
       super();
       this.b = new ty5(p0, true);
       this.c = new ty5(p0, false);
       this.t = new tk2(p0, true);
       this.v = new tk2(p0, false);
       this.y = p1;
       this.w = p2;
       this.x = p3;
    }
    public void t67(ConstraintLayout p0,ProgressBar p1,SpotifyIconView p2,SpotifyIconView p3,SpotifyIconView p4,ProgressBar p5,TextView p6){
       this.a = 9;
       super();
       this.b = p0;
       this.c = p1;
       this.v = p2;
       this.w = p3;
       this.x = p4;
       this.y = p5;
       this.t = p6;
    }
    public void t67(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,int p7){
       this.a = p7;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.x = p5;
       this.y = p6;
       super();
    }
    public void t67(a70 p0){
       this.a = 4;
       super();
       this.b = this;
       o08 oo08 = new o08(p0);
       this.c = oo08;
       ly7 oly7 = jy7.b(new x18(oo08, 0));
       this.t = oly7;
       this.v = jy7.b(new li5(this.c, 5, oly7));
       oly7 = jy7.b(new tx7(this.c, 0));
       this.w = oly7;
       oly7 = jy7.b(new t63(this.v, oly7, this.c, 5));
       this.x = oly7;
       this.y = jy7.b(new k08(oly7, 0));
    }
    public void t67(j65 p0,InternetMonitor p1){
       this.a = 10;
       super();
       this.b = new ArrayList(50);
       this.c = new fn0();
       this.w = t00.a();
       this.x = t00.a();
       this.t = p0;
       this.v = new uf(p1);
    }
    public void t67(lu p0){
       this.a = 5;
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.t = p0.c;
       this.v = p0.d;
       this.w = Long.valueOf(p0.e);
       this.x = Long.valueOf(p0.f);
       this.y = p0.g;
    }
    public void t67(lu p0,int p1){
       this.a = 5;
       super(p0);
    }
    public final void a(int p0,zr5 p1,Object p2){
       t67 tc;
       t67 tw;
       t67 tx;
       al2 u = p1.u;
       Context context = p1.a.getContext();
       CharSequence text = (TextUtils.isEmpty(p2.name()))? context.getText(R.string.track_list_track_has_no_name): p2.name();
       u.setTitle(text);
       if (p2 instanceof Track) {
          u.setSubtitle(ox7.p(p2));
       }else if(p2 instanceof Episode){
          u.setSubtitle(p2.description);
       }
       kg4.c(p0, u.a, this.v, p2);
       if ((tc = this.c) != null) {
          or6 oor6 = mi.j(context, mi.i(context, tc));
          u.d(oor6);
          if ((tw = this.w) != null) {
             kg4.c(p0, oor6, tw, p2);
          }else if((tw = this.v) != null){
             kg4.c(p0, oor6, tw, p2);
          }
          if ((tw = this.y) == null) {
             oor6.setOnTouchListener(null);
          }else {
             oor6.setOnTouchListener(new o65(tw, p0, p2));
          }
       }else {
          u.d(null);
       }
       tc = this.t;
       d06 c = u.c;
       if (tc != null) {
          or6 oor61 = mi.j(context, mi.i(context, tc));
          c.b(oor61);
          c.c();
          if ((tx = this.x) != null) {
             kg4.c(p0, oor61, tx, p2);
          }else if((tx = this.v) != null){
             kg4.c(p0, oor61, tx, p2);
          }
       }else {
          c.b(null);
          c.c();
       }
       return;
    }
    public final al2 b(RecyclerView p0){
       Context context = p0.getContext();
       this.b.getClass();
       a06 uoa06 = new a06(xj0.x0(context, p0, R.layout.glue_listtile_2));
       eo5.P(uoa06);
       d06 uod06 = new d06(LayoutInflater.from(context).inflate(R.layout.row_two_accessories, p0, false), uoa06);
       eo5.P(uod06);
       return new al2(uod06);
    }
    public final void c(Single p0){
       this.c.c(ox7.C(p0.compose(this.v).toObservable()).observeOn(id.a()).subscribe(new h65(this, 0), new h65(this, 1)));
    }
    public final lu d(){
       String str = (this.c == null)? " registrationStatus": "";
       if (this.w == null) {
          str = str.concat(" expiresInSecs");
       }
       if (this.x == null) {
          str = kg4.l(str, " tokenCreationEpochInSecs");
       }
       if (str.isEmpty()) {
          lu str1 = new lu(this.b, this.c, this.t, this.v, this.w.longValue(), this.x.longValue(), this.y);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final ConstraintLayout e(){
       switch (this.a){
           case 8:
           default:
             return this.b;
       }
       return this.b;
    }
    public final Observable f(){
       t67 tc = this.c;
       Objects.requireNonNull(tc);
       return this.w.doOnSubscribe(new h65(this, 2)).doFinally(new fj7(tc, 3)).hide();
    }
    public final void g(la5 p0){
       if (p0 == null) {
          throw new NullPointerException("Null registrationStatus");
       }
       this.c = p0;
       return;
    }
    public final void h(long p0,String p1,String p2,String p3,boolean p4,byte[] p5){
       aw1 c;
       t67 ot67 = this;
       t67 ot671 = ot67.v;
       t67 ot672 = ot67.c;
       t67 b = ot67.b;
       r45 or45 = r45.a(p2);
       String str = b.b.j();
       String str1 = b.c.d();
       na6 d = b.d;
       int i = (!d.a.r())? 1: 0;
       String str2 = "database_id";
       if (!i) {
          if ((c = d.c) == null && (c = d.b.s(str2)) == null) {
             c = UUID.randomUUID().toString();
             d.b.u(str2, c);
             d.c = c;
          }
       }else {
          c = UUID.randomUUID().toString();
          d.b.u(str2, c);
          d.c = c;
       }
       byte[] uobyteArray = b.a(or45, str, str1, c);
       if (or45.c() && !b.a.containsKey("")) {
          b.a(c0.a, str, str1, c);
       }
       ot671.j(p1, p5, ot672, uobyteArray, ot67.t, ot67.y, ot67.x, p4, p2, ot67.w.j(), p0, p3);
       return;
    }
}
