package p.w60;
import p.ut2;
import android.view.View;
import p.c33;
import p.wd5;
import android.widget.TextView;
import com.spotify.hubs.liteintegration.browse.BrowseRoundedCornerImageView;
import p.do5;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import p.p77;
import p.wh7;
import android.widget.ImageView;
import p.ju2;
import p.uu2;
import p.bt2;
import p.tu2;
import java.lang.String;
import p.hu2;
import p.j13;
import p.au2;
import android.graphics.Color;
import p.bz2;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.lang.Class;
import p.hv5;
import androidx.appcompat.widget.AppCompatImageView;
import p.co5;
import java.lang.CharSequence;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;

public final class w60 extends ut2	// class@002ad2 from classes.dex
{
    public final int b;
    public final wd5 c;
    public final TextView d;
    public final Object e;
    public final Object f;

    public void w60(View p0,c33 p1,wd5 p2){
       this.b = 0;
       super(p0);
       TextView textView = p0.findViewById(R.id.find_title_text);
       this.d = textView;
       BrowseRoundedCornerImageView uBrowseRound = p0.findViewById(R.id.find_category_card_background);
       this.e = uBrowseRound;
       this.f = p1;
       this.c = p2;
       TextView[] textViewArra = new TextView[]{textView};
       do5.z0(textViewArra);
       do5.x0(p0);
       mj5 omj5 = oj5.b(p0);
       View[] viewArray = new View[]{uBrowseRound};
       Collections.addAll(omj5.d, viewArray);
       View[] viewArray1 = new View[]{textView};
       Collections.addAll(omj5.c, viewArray1);
       omj5.a();
    }
    public void w60(View p0,wd5 p1,p77 p2){
       this.b = 1;
       super(p0);
       this.c = p1;
       this.e = p2;
       this.f = wh7.m(p0, R.id.image);
       this.d = wh7.m(p0, R.id.title);
    }
    public final void a(ju2 p0,uu2 p1,bt2 p2){
       w60 td = this.d;
       w60 tf = this.f;
       w60 tc = this.c;
       w60 te = this.e;
       switch (this.b){
           case 0:
             break;
           default:
             td.setText(p0.y().d());
             co5.e(td, p0, p1);
             LiteImageUtil.loadIntoCard(tc, te, tf, p0, false);
             return;
       }
       String str = p0.y().d();
       j13 oj13 = p0.u().c();
       String str1 = "color";
       if (p0.d().q(str1) != null) {
          te.setBackgroundColor(Color.parseColor(p0.d().q(str1)));
       }else {
          w60 ow60 = te;
          if (oj13 != null) {
             Drawable uDrawable = tf.a(oj13.c(), bz2.t);
             tc.getClass();
             hv5 ohv5 = new hv5(tc, c33.d(oj13.a()));
             ohv5.h(uDrawable);
             ohv5.b(uDrawable);
             ohv5.e(ow60);
          }else {
             tc.b(ow60);
             ow60.setImageDrawable(null);
          }
       }
       co5.e(this.a, p0, p1);
       td.setText(str);
       te.setRoundedCorners(true);
       return;
    }
}
