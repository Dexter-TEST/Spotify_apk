package p.lq2;
import p.mq2;
import android.content.Context;
import android.view.ViewGroup;
import p.wd5;
import p.nq2;
import java.lang.Object;
import java.lang.Class;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p.lp6;
import p.sp6;
import android.content.res.Resources;
import p.xj0;
import p.n6;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;

public final class lq2 implements mq2	// class@001da1 from classes.dex
{
    public final int A;
    public final int B;
    public final wd5 C;
    public final nq2 D;
    public final Context a;
    public final View b;
    public final ConstraintLayout c;
    public final ImageView t;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final lp6 y;
    public final int z;

    public void lq2(Context p0,ViewGroup p1,wd5 p2,nq2 p3){
       super();
       this.a = p0;
       p0.getClass();
       View view = LayoutInflater.from(p0).inflate(R.layout.home_card_component_layout, p1, false);
       this.b = view;
       ConstraintLayout uConstraintL = view.findViewById(R.id.home_card_root_view);
       this.c = uConstraintL;
       ImageView imageView = view.findViewById(R.id.image);
       this.t = imageView;
       TextView textView = view.findViewById(R.id.title);
       this.v = textView;
       TextView textView1 = view.findViewById(R.id.sub_title);
       this.w = textView1;
       TextView textView2 = view.findViewById(R.id.recsplanation);
       this.x = textView2;
       this.B = textView2.getCurrentTextColor();
       lp6 olp6 = new lp6(p0, sp6.Q, (float)xj0.e0((float)10, p0.getResources()));
       olp6.b(n6.b(p0, R.color.cat_accessory_green));
       this.y = olp6;
       this.z = p0.getResources().getColor(R.color.home_green_highlight);
       this.A = p0.getResources().getColor(R.color.home_title_text_default);
       this.C = p2;
       p3.getClass();
       this.D = p3;
       mj5 omj5 = oj5.b(uConstraintL);
       View[] viewArray = new View[]{imageView};
       Collections.addAll(omj5.d, viewArray);
       viewArray = new View[]{textView,textView1};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
    }
    public final View getView(){
       return this.b;
    }
}
