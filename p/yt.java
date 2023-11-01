package p.yt;
import java.lang.Object;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import android.widget.ProgressBar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import p.zt;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import p.kg4;
import java.lang.IllegalStateException;

public final class yt	// class@002e27 from classes.dex
{
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

    public void yt(){
       super();
    }
    public void yt(LinearLayout p0,TextView p1,TextView p2,TextView p3,TextView p4,TextView p5,TextView p6,TextView p7,Group p8,Group p9,TextView p10,ProgressBar p11,TextView p12,TextView p13,TextView p14,TextView p15,GlueToolbarLayout p16){
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
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
    }
    public void yt(zt p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = Long.valueOf(p0.d);
       this.e = Long.valueOf(p0.e);
       this.g = Float.valueOf(p0.f);
       this.f = Long.valueOf(p0.g);
       this.h = Boolean.valueOf(p0.h);
       this.i = Boolean.valueOf(p0.i);
       this.j = Boolean.valueOf(p0.j);
       this.k = Boolean.valueOf(p0.k);
       this.l = Boolean.valueOf(p0.l);
       this.m = Boolean.valueOf(p0.m);
       this.n = Boolean.valueOf(p0.n);
       this.o = Boolean.valueOf(p0.o);
       this.p = Boolean.valueOf(p0.p);
       this.q = Boolean.valueOf(p0.q);
    }
    public final zt a(){
       yt oyt = this;
       String str = (oyt.a == null)? " trackUri": "";
       if (oyt.b == null) {
          str = str.concat(" title");
       }
       if (oyt.c == null) {
          str = kg4.l(str, " artist");
       }
       if (oyt.d == null) {
          str = kg4.l(str, " trackDurationMs");
       }
       if (oyt.e == null) {
          str = kg4.l(str, " trackPositionMs");
       }
       if (oyt.g == null) {
          str = kg4.l(str, " trackPlaybackSpeed");
       }
       if (oyt.f == null) {
          str = kg4.l(str, " trackPositionTimestamp");
       }
       if (oyt.h == null) {
          str = kg4.l(str, " isFavorite");
       }
       if (oyt.i == null) {
          str = kg4.l(str, " isVisible");
       }
       if (oyt.j == null) {
          str = kg4.l(str, " isPlaying");
       }
       if (oyt.k == null) {
          str = kg4.l(str, " isBuffering");
       }
       if (oyt.l == null) {
          str = kg4.l(str, " isWaiting");
       }
       if (oyt.m == null) {
          str = kg4.l(str, " isWaitingForPlaying");
       }
       if (oyt.n == null) {
          str = kg4.l(str, " isPlayPauseEnabled");
       }
       if (oyt.o == null) {
          str = kg4.l(str, " isFavoritingEnabled");
       }
       if (oyt.p == null) {
          str = kg4.l(str, " isSkipNextEnabled");
       }
       if (oyt.q == null) {
          str = kg4.l(str, " isSkipLimitReached");
       }
       if (str.isEmpty()) {
          zt str1 = new zt(oyt.a, oyt.b, oyt.c, oyt.d.longValue(), oyt.e.longValue(), oyt.g.floatValue(), oyt.f.longValue(), oyt.h.booleanValue(), oyt.i.booleanValue(), oyt.j.booleanValue(), oyt.k.booleanValue(), oyt.l.booleanValue(), oyt.m.booleanValue(), oyt.n.booleanValue(), oyt.o.booleanValue(), oyt.p.booleanValue(), oyt.q.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
