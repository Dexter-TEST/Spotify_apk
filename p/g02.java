package p.g02;
import p.vt2;
import java.lang.Object;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.lh5;
import p.tu2;
import p.wh7;
import p.ry7;
import p.co5;
import p.au2;
import android.graphics.drawable.Drawable;
import p.dh7;
import android.graphics.Color;
import java.util.List;
import java.util.Collection;
import p.w51;
import android.text.Spanned;
import p.eb3;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.content.Context;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;
import java.lang.Integer;
import java.lang.Math;
import p.et0;
import p.mj5;
import p.oj5;
import java.util.Collections;
import p.l95;
import android.widget.LinearLayout;
import java.util.Map;
import p.k95;
import java.lang.Class;
import android.util.AttributeSet;
import p.hm1;
import p.bc2;
import android.view.ViewGroup$LayoutParams;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;

public final class g02 implements vt2	// class@001671 from classes.dex
{
    public final int a;

    public void g02(int p0){
       this.a = p0;
       super();
    }
    public static void e(TextView p0,String p1){
       p0.setText(p1);
       int i = (TextUtils.isEmpty(p1))? 8: 0;
       p0.setVisibility(i);
       return;
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       TextView textView;
       String str;
       String str1;
       int i = 8;
       boolean b = false;
       int i1 = 0x7f0a062e;
       CharSequence uCharSequenc = null;
       switch (this.a){
           case 0:
             return;
           case 1:
             ry7.d(p0);
             co5.e(p0, p1, p2);
             textView = wh7.m(p0, i1);
             if ((str = p1.y().d()) != null) {
                uCharSequenc = eb3.k(str);
             }
             textView.setText(uCharSequenc);
             return;
             break;
           case 2:
             str1 = p1.y().d();
             TextView textView1 = wh7.m(p0, i1);
             textView1.setText(str1);
             int i2 = (TextUtils.isEmpty(str1))? 8: 0;
             textView1.setVisibility(i2);
             str1 = p1.y().e();
             textView1 = wh7.m(p0, R.id.description);
             textView1.setText(str1);
             i2 = (TextUtils.isEmpty(str1))? 8: 0;
             textView1.setVisibility(i2);
             ry7.d(p0);
             co5.e(p0, p1, p2);
             if ((str1 = p1.b().q("backgroundColor")) != null) {
                try{
                   p0.setBackgroundColor(Color.parseColor(str1));
                }catch(java.lang.IllegalArgumentException e0){
                   dh7.q(p0, uCharSequenc);
                }
             }
             p1 = w51.w(p1.j());
             textView = wh7.m(p0, R.id.button);
             ry7.d(textView);
             if (p1 != null) {
                i = 0;
             }
             textView.setVisibility(i);
             if (p1 != null) {
                uCharSequenc = p1.y().d();
             }
             textView.setText(uCharSequenc);
             if (p1 != null) {
                co5.e(textView, p1, p2);
             }
             return;
             break;
           case 3:
             lh5 tag = p0.getTag(R.id.podcast_description_component);
             tag.f = p1;
             tag.a.setText(p1.y().e());
             return;
           default:
             str1 = p1.y().m();
             String str2 = p1.y().e();
             boolean b1 = p1.d().y("episode-fully-played", b);
             int i3 = p1.d().c("episode-listening-progress", b);
             int i4 = p1.d().c("episode-duration", b);
             g02.e(wh7.m(p0, R.id.show_name), p1.y().d());
             g02.e(wh7.m(p0, R.id.episode_date), str1);
             TextView textView2 = wh7.m(p0, R.id.episode_separator);
             if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2)) {
                uCharSequenc = "\x95";
             }
             g02.e(textView2, uCharSequenc);
             ImageView imageView = wh7.m(p0, R.id.episode_check_played_icon);
             ProgressBar progressBar = wh7.m(p0, R.id.episode_listening_progress);
             wh7.m(p0, R.id.episode_duration).setText(str2);
             if (b1) {
                imageView.setVisibility(b);
                imageView.setImageDrawable(LiteImageUtil.getCheckedIcon(imageView.getContext()));
                progressBar.setVisibility(i);
             }else if(i3 > 0){
                progressBar.setVisibility(b);
                Integer integer = Integer.valueOf(i3);
                Integer integer1 = Integer.valueOf(i4);
                integer = (integer1.intValue())? Integer.valueOf((int)Math.ceil(((integer.doubleValue() / (double)integer1.intValue()) * 100.00f))): Integer.valueOf(b);
                progressBar.setProgress(integer.intValue());
                imageView.setVisibility(i);
             }else {
                progressBar.setVisibility(i);
                imageView.setVisibility(i);
             }
             return;
       }
    }
    public final View c(ViewGroup p0,uu2 p1){
       View view1;
       boolean b = false;
       switch (this.a){
           case 0:
             Context context = p0.getContext();
             k95 ok95 = l95.c.get(LinearLayout.class);
             ok95.getClass();
             View view = ok95.a(context, null, ok95.b());
             if (view instanceof TextView && !view instanceof hm1) {
                bc2.a(view, context);
             }
             view.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentLayoutParams(context, p0));
             return view;
             break;
           case 1:
             view1 = et0.n(p0, R.layout.component_premium_text_link, p0, b);
             mj5 omj5 = oj5.c(view1);
             View[] viewArray = new View[]{wh7.m(view1, R.id.title)};
             Collections.addAll(omj5.c, viewArray);
             omj5.a();
             return view1;
           case 2:
             return et0.n(p0, R.layout.component_premium_upsell, p0, b);
           case 3:
             view1 = et0.n(p0, R.layout.component_podcast_description, p0, b);
             view1.setTag(R.id.podcast_description_component, new lh5(view1, p1));
             return view1;
           default:
             return et0.n(p0, R.layout.component_podcast_episode_metadata, p0, b);
       }
    }
}
