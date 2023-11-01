package p.jh5;
import p.d2;
import android.view.View;
import p.wd5;
import p.p77;
import p.wh7;
import android.widget.ImageView;
import android.widget.TextView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import p.ju2;
import p.uu2;
import p.bt2;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;

public final class jh5 extends d2	// class@001ad9 from classes.dex
{
    public final wd5 j;
    public final p77 k;
    public final ImageView l;
    public final TextView m;
    public final TextView n;

    public void jh5(View p0,wd5 p1,p77 p2){
       super(p0);
       this.j = p1;
       this.k = p2;
       ImageView imageView = wh7.m(p0, R.id.image);
       this.l = imageView;
       TextView textView = wh7.m(p0, R.id.title);
       this.m = textView;
       TextView textView1 = wh7.m(p0, R.id.subtitle);
       this.n = textView1;
       mj5 omj5 = oj5.c(p0);
       View[] viewArray = new View[]{imageView,this.b,this.d,this.c};
       Collections.addAll(omj5.d, viewArray);
       View[] viewArray1 = new View[]{textView,textView1,this.e};
       Collections.addAll(omj5.c, viewArray1);
       omj5.a();
    }
    public final void a(ju2 p0,uu2 p1,bt2 p2){
       super.a(p0, p1, p2);
       this.m.setText(p0.y().d());
       this.n.setText(p0.y().m());
       LiteImageUtil.loadIntoCard(this.j, this.k, this.l, p0, false);
    }
}
