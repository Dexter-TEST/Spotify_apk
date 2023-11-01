package p.tp3;
import p.xt2;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import com.spotify.liteui.entityview.hubs.DownloadHeaderView;
import p.au2;
import java.lang.String;
import p.o05;
import java.lang.Class;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.zh0;
import p.pd1;
import android.widget.LinearLayout;
import android.widget.TextView;
import p.tu2;
import java.lang.CharSequence;
import android.view.ViewGroup;
import p.et0;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;
import android.content.Context;
import android.view.LayoutInflater;
import p.o85;
import p.xj0;
import p.zz5;
import p.zk2;
import p.eo5;
import p.a06;
import p.sp6;
import android.content.res.Resources;
import p.ox7;
import android.widget.ImageView;
import p.or6;
import p.lp6;
import p.sg;
import p.sz5;
import java.util.EnumSet;
import p.nk2;

public final class tp3 implements xt2	// class@0027b6 from classes.dex
{
    public final int a;

    public void tp3(int p0){
       this.a = p0;
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       int i1;
       switch (this.a){
           case 0:
             p0.setText(p1.y().d());
             return;
           case 1:
             p0.findViewById(R.id.text).setText(p1.y().d());
             return;
           case 2:
             o05 oo05 = p1.b().u("availability");
             int i = p1.b().c("progress", 0);
             if (oo05 == null) {
                oo05 = o05.z;
             }
             p0.getClass();
             if (i1 = oo05.ordinal()) {
                switch (i1){
                    case 2:
                      p0.d(4, i);
                      break;
                    case 3:
                      p0.d(6, i);
                      break;
                    case 4:
                      p0.d(7, i);
                      break;
                    case 5:
                      p0.d(8, i);
                      break;
                    case 6:
                      p0.d(9, i);
                      break;
                    case 7:
                      p0.d(10, i);
                      break;
                    case 8:
                    case 10:
                    case 11:
                    case 9:
                      p0.d(3, 0);
                      break;
                    default:
                      throw new IllegalArgumentException("invalid state, "+oo05);
                }
             }else {
                p0.d(5, 0);
             }
             p0.setSongsOnly(0);
             p0.setObserver(new zh0(p2, 8, p1));
             return;
             break;
           default:
             p0.findViewById(R.id.description).setText(p1.y().e());
             return;
       }
    }
    public final View c(ViewGroup p0,uu2 p1){
       boolean b = false;
       switch (this.a){
           case 0:
             return et0.n(p0, R.layout.lite_section_header, p0, b);
           case 1:
             return et0.n(p0, R.layout.lite_home_section_header, p0, b);
           case 2:
             DownloadHeaderView uDownloadHea = et0.n(p0, R.layout.component_download_header, p0, b);
             dh7.q(uDownloadHea, null);
             return uDownloadHea;
           default:
             Context context = p0.getContext();
             ViewGroup viewGroup = LayoutInflater.from(context).inflate(R.layout.component_shuffled_track, p0, b);
             o85 oo85 = xj0.x0(p0.getContext(), viewGroup, R.layout.glue_listtile_2_image);
             zz5 ozz5 = new zz5(oo85);
             eo5.P(ozz5);
             ozz5.setTitle(context.getString(R.string.component_shuffled_track_row_title));
             ozz5.setSubtitle(context.getString(R.string.component_shuffled_track_row_subtitle));
             ozz5.v.setImageDrawable(ox7.b(p0.getContext(), sp6.o0, Float.NaN, (float)xj0.e0(32.00f, p0.getResources())));
             or6 oor6 = new or6(p0.getContext());
             oor6.setImageDrawable(new lp6(p0.getContext(), sp6.G, (float)xj0.e0(24.00f, p0.getResources())));
             dh7.q(oor6, null);
             ozz5.d(oor6);
             viewGroup.findViewById(R.id.row).addView(oo85);
             return viewGroup;
       }
    }
    public final EnumSet d(){
       nk2 y = nk2.y;
       nk2 c = nk2.c;
       switch (this.a){
           case 0:
             return EnumSet.of(c);
           case 1:
             return EnumSet.of(c);
           case 2:
             return EnumSet.of(y);
           default:
             return EnumSet.of(y);
       }
    }
}
