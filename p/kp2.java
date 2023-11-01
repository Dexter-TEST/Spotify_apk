package p.kp2;
import p.hk2;
import p.jp2;
import p.lj3;
import android.content.Context;
import p.jk2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import java.lang.Object;
import p.y77;
import p.xe7;
import android.widget.TextView;

public final class kp2 extends lj3 implements hk2, jp2	// class@001c59 from classes.dex
{
    public final View a;
    public final y77 b;
    public final TextView c;

    public void kp2(Context p0,jk2 p1){
       View view = LayoutInflater.from(p0).inflate(R.layout.browse_header, p1, false);
       super();
       view.getClass();
       this.a = view;
       this.b = xe7.k(view);
       TextView textView = view.findViewById(R.id.header_title);
       textView.getClass();
       this.c = textView;
    }
    public final void a(float p0){
       this.b.a(p0);
    }
    public final View getView(){
       return this.a;
    }
}
