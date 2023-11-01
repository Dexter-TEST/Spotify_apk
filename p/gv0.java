package p.gv0;
import android.content.Context;
import p.gn;
import p.zg0;
import p.mp3;
import java.lang.Object;
import p.an5;
import p.fn0;
import p.is7;
import android.content.res.Resources;
import p.xj0;
import android.content.res.Resources$Theme;
import p.xw5;
import android.graphics.drawable.Drawable;
import p.pw5;
import android.graphics.drawable.StateListDrawable;
import p.i63;
import p.aw6;
import p.xe7;
import java.util.ArrayList;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.CharSequence;
import android.os.Bundle;
import p.or7;
import p.a54;
import p.u44;
import android.support.v4.media.MediaMetadataCompat;

public final class gv0	// class@001784 from classes.dex
{
    public final Context a;
    public final fn0 b;
    public final gn c;
    public final aw6 d;
    public final int e;
    public final an5 f;
    public final an5 g;
    public final zg0 h;
    public or7 i;
    public mo j;
    public nt0 k;
    public wu l;

    public void gv0(Context p0,gn p1,zg0 p2,mp3 p3){
       super();
       this.f = new an5();
       this.g = new an5();
       this.h = p2;
       this.b = new fn0();
       this.c = p1;
       this.a = p0;
       float f = (is7.n(p0) < 2011)? 160.00f: 320.00f;
       this.e = xj0.e0(f, p0.getResources());
       this.d = xe7.I(new i63(this, 1, pw5.a(p0.getResources(), R.drawable.encore_icon_track, p0.getTheme())));
       return;
    }
    public final void a(){
       gv0 i;
       gv0 ogv0 = this;
       if ((i = ogv0.i) == null) {
          return;
       }
       ArrayList uArrayList = v2;
       PlaybackStateCompat ArrayList uArrayList1 = new ArrayList();
       PlaybackStateCompat playbackStat = uArrayList1;
       uArrayList1 = new PlaybackStateCompat(0, 0, 0, 0, 0, 0, null, 0, uArrayList, -1, null);
       i.a.f(playbackStat);
       ogv0.i.o(new MediaMetadataCompat(new u44(0).b));
       ogv0.k = null;
       ogv0.l = null;
       return;
    }
}
