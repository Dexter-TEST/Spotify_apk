package p.wo2;
import p.fs0;
import p.vo2;
import android.view.View;
import android.widget.ImageView;
import android.content.res.Resources;
import android.content.res.Configuration;

public class wo2 extends vo2 implements fs0	// class@002b76 from classes.dex
{
    public final ImageView t;
    public final boolean v;

    public void wo2(View p0){
       int i = 0;
       super(p0, i);
       this.t = p0.findViewById(R.id.cover_art_image);
       if (p0.getResources().getConfiguration().orientation != 2) {
          i = true;
       }
       this.v = i;
       return;
    }
    public final int b(){
       return (this.getView().getMeasuredWidth() / 2);
    }
    public final boolean c(){
       return this.v;
    }
    public final int f(){
       wo2 tt = this.t;
       int top = tt.getTop();
       return ((tt.getHeight() / 2) + top);
    }
}
