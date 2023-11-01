package p.d2;
import p.ut2;
import android.view.View;
import p.wh7;
import android.widget.ImageView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import android.widget.TextView;
import p.mj5;
import p.oj5;
import p.c2;
import p.aw6;
import p.xe7;
import p.ju2;
import p.uu2;
import p.bt2;
import p.e43;
import p.au2;
import java.lang.String;
import p.mi;
import p.f6;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.lang.CharSequence;
import p.l03;
import p.lb0;
import p.ry7;
import p.tu2;
import p.v27;
import android.content.Context;
import p.eo5;
import p.sp6;
import android.content.res.ColorStateList;
import p.n6;
import p.co5;
import java.util.Map;
import p.b2;
import android.view.View$OnClickListener;
import p.dv2;
import p.du2;

public abstract class d2 extends ut2	// class@0012ca from classes.dex
{
    public final ImageView b;
    public final View c;
    public final SpotifyIconView d;
    public final TextView e;
    public final aw6 f;
    public final aw6 g;
    public final aw6 h;
    public final aw6 i;

    public void d2(View p0){
       super(p0);
       View view = p0.findViewById(R.id.podcast_controls);
       ImageView imageView = wh7.m(view, R.id.play_button);
       this.b = imageView;
       SpotifyIconView spotifyIconV = wh7.m(view, R.id.download_button);
       this.d = spotifyIconV;
       View view1 = wh7.m(view, R.id.context_menu_button);
       this.c = view1;
       this.e = wh7.m(view, R.id.label);
       oj5.a(imageView).a();
       oj5.a(spotifyIconV).a();
       oj5.a(view1).a();
       this.f = xe7.I(new c2(p0, 0));
       this.g = xe7.I(new c2(p0, 1));
       this.h = xe7.I(new c2(p0, 2));
       this.i = xe7.I(new c2(p0, 3));
    }
    public void a(ju2 p0,uu2 p1,bt2 p2){
       dv2 uodv2;
       dv2 uodv21;
       boolean b = false;
       boolean b1 = p0.b().y("lite:playing", b);
       int b2 = mi.J(p0);
       ut2 ta = this.a;
       if (ta instanceof f6) {
          ta.setActive(b2);
       }
       d2 tf = (b1)? this.f: this.g;
       d2 tb = this.b;
       tb.setImageDrawable(tf.get());
       Resources resources = ta.getResources();
       int i = (b1)? 0x7f1201af: 0x7f1201b0;
       tb.setContentDescription(resources.getText(i));
       b2 = p0.b().y("appearDisabled", b);
       if (ta instanceof lb0) {
          ta.setAppearsDisabled(b2);
       }
       ry7.d(ta);
       ry7.d(tb);
       tf = this.c;
       ry7.d(tf);
       d2 td = this.d;
       ry7.d(td);
       d2 te = this.e;
       te.setText(p0.y().j());
       boolean b3 = p0.b().y("startedListening", b);
       if (p0.b().y("fullyPlayed", b)) {
          v27.g(te, this.i.get(), null, null, null);
       }else if(b3){
          v27.g(te, this.h.get(), null, null, null);
       }else {
          v27.e(te, null, null, null, null);
       }
       String str = p0.b().q("label");
       Context context = ta.getContext();
       if (str == null) {
          str = "";
       }
       eo5.a(context, te, str);
       if (p0.b().u("availability") != null) {
          td.setIcon(sp6.K);
          td.setColorStateList(n6.c(ta.getContext(), R.color.cat_accessory_green));
       }else {
          td.setIcon(sp6.J);
          td.setColorStateList(n6.c(ta.getContext(), R.color.glue_button_text));
       }
       co5.e(ta, p0, p1);
       if (p0.m().containsKey("downloadClick")) {
          td.setVisibility(b);
          td.setOnClickListener(new b2(p0, p1));
       }else {
          td.setVisibility(8);
       }
       str = "contextMenuClick";
       if (p0.m().containsKey(str)) {
          tf.setVisibility(b);
          uodv2 = new dv2(p1.c);
          uodv2.c(str);
          uodv2.g(p0);
          uodv2.f(tf);
          uodv2.d();
       }else {
          tf.setVisibility(8);
       }
       resources = 1;
       if (!b1) {
          str = "playClick";
          if (p0.m().containsKey(str)) {
             uodv2 = new dv2(p1.c);
             uodv2.c(str);
             uodv2.g(p0);
             uodv2.f(tb);
             uodv2.d();
             td = 1;
          label_015d :
             if (b1 && p0.m().containsKey("pauseClick")) {
                uodv21 = new dv2(p1.c);
                uodv21.c("pauseClick");
                uodv21.g(p0);
                uodv21.f(tb);
                uodv21.d();
             }else {
                b2 = td;
             }
             if (!resources) {
                b = 8;
             }
             tb.setVisibility(b);
             if (p0.m().containsKey("longClick")) {
                dv2 uodv22 = new dv2(p1.c);
                uodv22.c("longClick");
                uodv22.g(p0);
                uodv22.f(ta);
                uodv22.e();
             }
             return;
          }
       }
       uodv21 = 0;
       goto label_015d ;
    }
}
