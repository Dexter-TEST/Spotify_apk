package p.qk4;
import java.lang.Object;
import p.c0;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ProgressBar;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.litecomponents.nowplayingwidgets.RepeatButton;
import com.spotify.litecomponents.nowplayingwidgets.ShuffleButton;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import android.widget.SeekBar;
import p.wu;
import java.lang.Long;
import java.lang.String;
import p.kg4;
import p.qx5;
import p.kf5;
import java.lang.Boolean;
import p.uu;
import p.vw6;
import com.google.common.collect.c;
import p.m73;
import p.to;
import p.r45;
import java.lang.IllegalStateException;

public final class qk4	// class@0023bc from classes.dex
{
    public Object A;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public void qk4(){
       super();
       c0 a = c0.a;
       this.f = a;
       this.g = a;
       this.h = a;
       this.i = a;
       this.j = a;
       this.k = a;
       this.l = a;
    }
    public void qk4(ConstraintLayout p0,ProgressBar p1,SpotifyIconView p2,SpotifyIconView p3,SpotifyIconView p4,SpotifyIconView p5,SpotifyIconView p6,SpotifyIconView p7,SpotifyIconView p8,RepeatButton p9,SpotifyIconView p10,SpotifyIconView p11,ShuffleButton p12,CardView p13,CoordinatorLayout p14,TextView p15,TextView p16,ImageView p17,TextView p18,FrameLayout p19,Guideline p20,FrameLayout p21,TextView p22,SeekBar p23,TextView p24,TextView p25,TextView p26){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.l = p9;
       i.j = p10;
       i.k = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
       i.w = p17;
       i.r = p18;
       i.x = p19;
       i.z = p20;
       i.y = p21;
       i.s = p22;
       i.A = p23;
       i.t = p24;
       i.u = p25;
       i.v = p26;
    }
    public final wu a(){
       qk4 oqk4 = this;
       String str = (oqk4.a == null)? " timestamp": "";
       if (oqk4.b == null) {
          str = str.concat(" contextUri");
       }
       if (oqk4.c == null) {
          str = kg4.l(str, " contextUrl");
       }
       if (oqk4.d == null) {
          str = kg4.l(str, " contextRestrictions");
       }
       if (oqk4.e == null) {
          str = kg4.l(str, " playOrigin");
       }
       if (oqk4.m == null) {
          str = kg4.l(str, " isPlaying");
       }
       if (oqk4.n == null) {
          str = kg4.l(str, " isPaused");
       }
       if (oqk4.o == null) {
          str = kg4.l(str, " isBuffering");
       }
       if (oqk4.p == null) {
          str = kg4.l(str, " isSystemInitiated");
       }
       if (oqk4.q == null) {
          str = kg4.l(str, " options");
       }
       if (oqk4.r == null) {
          str = kg4.l(str, " restrictions");
       }
       if (oqk4.s == null) {
          str = kg4.l(str, " suppressions");
       }
       if (oqk4.t == null) {
          str = kg4.l(str, " prevTracks");
       }
       if (oqk4.u == null) {
          str = kg4.l(str, " nextTracks");
       }
       if (oqk4.v == null) {
          str = kg4.l(str, " contextMetadata");
       }
       if (oqk4.w == null) {
          str = kg4.l(str, " pageMetadata");
       }
       if (oqk4.x == null) {
          str = kg4.l(str, " sessionId");
       }
       if (oqk4.y == null) {
          str = kg4.l(str, " queueRevision");
       }
       if (oqk4.z == null) {
          str = kg4.l(str, " audioStream");
       }
       if (oqk4.A == null) {
          str = kg4.l(str, " signals");
       }
       if (str.isEmpty()) {
          wu str1 = new wu(oqk4.a.longValue(), oqk4.b, oqk4.c, oqk4.d, oqk4.e, oqk4.f, oqk4.g, oqk4.h, oqk4.i, oqk4.j, oqk4.k, oqk4.l, oqk4.m.booleanValue(), oqk4.n.booleanValue(), oqk4.o.booleanValue(), oqk4.p.booleanValue(), oqk4.q, oqk4.r, oqk4.s, oqk4.t, oqk4.u, oqk4.v, oqk4.w, oqk4.x, oqk4.y, oqk4.z, oqk4.A);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
