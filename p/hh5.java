package p.hh5;
import p.d2;
import android.view.View;
import p.wh7;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.ImageView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import p.ju2;
import p.uu2;
import p.bt2;
import p.au2;
import java.lang.String;
import p.tu2;
import java.lang.CharSequence;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;
import java.lang.Integer;
import java.lang.Math;

public final class hh5 extends d2	// class@001852 from classes.dex
{
    public final TextView j;
    public final TextView k;
    public final ProgressBar l;
    public final ImageView m;

    public void hh5(View p0){
       super(p0);
       TextView textView = wh7.m(p0, R.id.title);
       this.j = textView;
       TextView textView1 = wh7.m(p0, R.id.subtitle);
       this.k = textView1;
       this.l = wh7.m(p0, R.id.listening_progress);
       this.m = wh7.m(p0, R.id.check_played_icon);
       mj5 omj5 = oj5.c(p0);
       View[] viewArray = new View[]{this.b,this.d,this.c};
       Collections.addAll(omj5.d, viewArray);
       View[] viewArray1 = new View[]{textView,textView1,this.e};
       Collections.addAll(omj5.c, viewArray1);
       omj5.a();
    }
    public final void a(ju2 p0,uu2 p1,bt2 p2){
       boolean b = false;
       int i = p0.d().c("episode-listening-progress", b);
       int i1 = p0.d().c("episode-duration", b);
       super.a(p0, p1, p2);
       this.j.setText(p0.y().d());
       this.k.setText(p0.y().m());
       hh5 tm = this.m;
       hh5 tl = this.l;
       int i2 = 8;
       if (p0.d().y("episode-fully-played", b)) {
          tm.setVisibility(b);
          tm.setImageDrawable(LiteImageUtil.getCheckedIcon(tm.getContext()));
          tl.setVisibility(i2);
       }else if(i > 0){
          tm.setVisibility(i2);
          tl.setVisibility(b);
          Integer integer = Integer.valueOf(i);
          Integer integer1 = Integer.valueOf(i1);
          integer = (integer1.intValue())? Integer.valueOf((int)Math.ceil(((integer.doubleValue() / (double)integer1.intValue()) * 100.00f))): Integer.valueOf(b);
          tl.setProgress(integer.intValue());
       }else {
          tl.setVisibility(i2);
          tm.setVisibility(i2);
       }
       return;
    }
}
