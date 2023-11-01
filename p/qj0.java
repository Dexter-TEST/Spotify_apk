package p.qj0;
import p.vt2;
import p.wd5;
import p.p77;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import p.wh7;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.ju2;
import p.uu2;
import p.bt2;
import p.tu2;
import android.widget.ImageView;
import com.spotify.hubs.liteintegration.util.LiteImageUtil;
import p.ry7;
import p.co5;
import android.view.ViewGroup;
import p.et0;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;

public final class qj0 implements vt2	// class@0023af from classes.dex
{
    public final int a;
    public final wd5 b;
    public final p77 c;

    public void qj0(wd5 p0,p77 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public static void e(int p0,View p1,String p2){
       TextView textView = wh7.m(p1, p0);
       textView.setText(p2);
       int i = (TextUtils.isEmpty(p2))? 8: 0;
       textView.setVisibility(i);
       return;
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       qj0 tc = this.c;
       qj0 tb = this.b;
       int i = 0x7f0a016b;
       int i1 = 0x7f0a062e;
       switch (this.a){
           case 0:
           default:
             String str = p1.y().d();
             TextView textView = wh7.m(p0, i1);
             textView.setText(str);
             int i2 = 8;
             int i3 = (TextUtils.isEmpty(str))? 8: 0;
             textView.setVisibility(i3);
             str = p1.y().e();
             TextView textView1 = wh7.m(p0, i);
             textView1.setText(str);
             if (!TextUtils.isEmpty(str)) {
                i2 = 0;
             }
             textView1.setVisibility(i2);
             LiteImageUtil.loadIntoCard(tb, tc, p0.findViewById(R.id.image), p1, true);
             ry7.d(p0);
             co5.e(p0, p1, p2);
             return;
       }
       qj0.e(i1, p0, p1.y().d());
       qj0.e(R.id.subtitle, p0, p1.y().m());
       qj0.e(i, p0, p1.y().e());
       LiteImageUtil.loadIntoCard(tb, tc, p0.findViewById(R.id.image), p1, true);
       ry7.d(p0);
       co5.e(p0, p1, p2);
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       View view;
       mj5 omj5;
       View[] viewArray1;
       int i = 0x7f0a03f8;
       int i1 = 2;
       int i2 = 0x7f0a016b;
       int i3 = 0x7f0a062e;
       switch (this.a){
           case 0:
           default:
             view = et0.n(p0, R.layout.component_premium_feature, p0, false);
             omj5 = oj5.b(view);
             viewArray1 = new View[i1];
             viewArray1[0] = wh7.m(view, i3);
             viewArray1[1] = wh7.m(view, i2);
             Collections.addAll(omj5.c, viewArray1);
             viewArray1 = new View[]{wh7.m(view, i)};
             Collections.addAll(omj5.d, viewArray1);
             omj5.a();
             return view;
       }
       view = et0.n(p0, R.layout.component_premium_coming_feature, p0, false);
       omj5 = oj5.b(view);
       View[] viewArray = new View[]{wh7.m(view, i3),wh7.m(view, R.id.subtitle),wh7.m(view, i2)};
       Collections.addAll(omj5.c, viewArray);
       viewArray1 = new View[]{wh7.m(view, i)};
       Collections.addAll(omj5.d, viewArray1);
       omj5.a();
       return view;
    }
}
