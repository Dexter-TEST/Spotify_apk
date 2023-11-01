package p.d06;
import p.xz5;
import android.view.View;
import p.a06;
import java.lang.Object;
import android.view.ViewGroup;
import p.sz5;
import p.ze;
import p.qz5;
import java.lang.CharSequence;
import android.widget.TextView;
import p.d6;
import p.lb0;

public final class d06 implements xz5	// class@0012b4 from classes.dex
{
    public final View a;
    public final xz5 b;
    public final ze c;

    public void d06(View p0,a06 p1){
       super();
       this.a = p0;
       this.b = p1;
       p0.findViewById(R.id.container).addView(p1.a);
       this.c = new ze(p0.findViewById(R.id.second_accessory));
    }
    public final void d(View p0){
       this.b.d(p0);
    }
    public final void e(CharSequence p0){
       this.b.e(p0);
    }
    public final TextView getSubtitleView(){
       return this.b.getSubtitleView();
    }
    public final View getView(){
       return this.a;
    }
    public final View h(){
       return this.b.h();
    }
    public final void setActive(boolean p0){
       this.b.setActive(p0);
    }
    public final void setAppearsDisabled(boolean p0){
       this.b.setAppearsDisabled(p0);
    }
    public final void setSubtitle(CharSequence p0){
       this.b.setSubtitle(p0);
    }
    public final void setTitle(CharSequence p0){
       this.b.setTitle(p0);
    }
}
