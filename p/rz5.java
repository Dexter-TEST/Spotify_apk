package p.rz5;
import p.p65;
import p.wd5;
import java.lang.Object;
import p.sp6;
import p.zr5;
import p.al2;
import p.yz5;
import android.content.Context;
import android.view.View;
import p.go1;
import com.spotify.webapi.service.models.EpisodeSimple;
import com.spotify.webapi.service.models.TrackSimple;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import p.a06;
import p.ox7;
import p.sz5;
import p.n06;
import p.kg4;
import p.lp6;
import p.mi;
import p.or6;
import android.content.res.Resources;
import p.xj0;
import android.graphics.drawable.Drawable;
import java.util.List;
import com.spotify.webapi.service.models.Track;
import com.spotify.webapi.service.models.AlbumSimple;
import p.hv5;
import p.zz5;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import p.o85;
import p.zk2;
import p.eo5;
import p.xz5;

public abstract class rz5 implements p65	// class@00258b from classes.dex
{
    public final wd5 a;
    public final Object b;
    public final sp6 c;
    public sp6 t;
    public Drawable v;
    public n06 w;

    public void rz5(wd5 p0,Object p1,sp6 p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = sp6.q0;
    }
    public final void a(int p0,zr5 p1,Object p2){
       EpisodeSimple name;
       rz5 tt;
       rz5 tw;
       String str;
       al2 u = p1.u;
       Context context = p1.a.getContext();
       go1 x = this.x;
       switch (x){
           case 0:
             name = p2.name;
             break;
           default:
             TrackSimple trackSimple = p2;
             if (TextUtils.isEmpty(trackSimple.name)) {
                str = context.getString(R.string.track_list_track_has_no_name);
             }else {
                trackSimple = trackSimple.name;
             }
       }
       al2 uoal2 = u;
       uoal2.setTitle(name);
       switch (x){
           case 0:
             name = p2.description;
             break;
           default:
             str = ox7.p(p2);
       }
       uoal2.setSubtitle(name);
       al2 uoal21 = u;
       n06 on06 = null;
       kg4.c(p0, uoal21.a, on06, p2);
       if ((tt = this.t) != null) {
          or6 oor6 = mi.j(context, mi.i(context, tt));
          uoal21.d(oor6);
          if ((tw = this.w) != null) {
             kg4.c(p0, oor6, tw, p2);
          }
       }else {
          uoal21.d(on06);
       }
       if (this.v == null) {
          this.v = ox7.b(context, this.c, Float.NaN, (float)xj0.e0(32.00f, context.getResources()));
       }
       switch (x){
           case 0:
             on06 = ox7.l(p2.images);
             break;
           default:
             if (p2 instanceof Track) {
                on06 = ox7.l(p2.album.images);
             }
       }
       hv5 ohv5 = this.a.g(on06);
       ohv5.i(this.b);
       ohv5.h(this.v);
       ohv5.b(this.v);
       ohv5.e(u.v);
       return;
    }
    public final al2 b(RecyclerView p0){
       zz5 ozz5 = new zz5(xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_2_image));
       eo5.P(ozz5);
       return new al2(ozz5);
    }
}
