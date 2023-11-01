package p.yv2;
import p.us2;
import android.view.ViewGroup;
import p.uu2;
import p.ju2;
import p.bt2;
import p.au2;
import java.lang.String;
import p.te5;
import p.jl;
import android.graphics.Color;
import p.ut2;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import p.uw5;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import p.lj0;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;

public final class yv2 extends us2	// class@002e33 from classes.dex
{

    public void yv2(ViewGroup p0,uu2 p1){
       super(p0, p1);
    }
    public final void a(ju2 p0,uu2 p1,bt2 p2){
       int i;
       int i1;
       String str = p0.b().q("backgroundColor");
       jl.h((te5.a(str) ^ 1), "background color missing ");
       super.a(p0, p1, p2);
       try{
          i = 0;
          i1 = Color.parseColor(str);
       }catch(java.lang.IllegalArgumentException e0){
          i1 = 0;
       }
       ut2 ta = this.a;
       int[] ointArray = new int[2];
       ointArray[i] = lj0.f(Color.argb((int)102.00f, i, i, i), i1);
       ointArray[1] = uw5.k(ta.getContext(), 0x1010054);
       dh7.q(ta, new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, ointArray));
       return;
    }
}
