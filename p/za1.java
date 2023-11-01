package p.za1;
import p.ld2;
import androidx.fragment.app.f;
import android.view.View;
import android.app.Dialog;

public final class za1 extends ld2	// class@002eb8 from classes.dex
{
    public final ld2 a;
    public final f b;

    public void za1(f p0,ld2 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final View c(int p0){
       f c;
       za1 ta = this.a;
       if (ta.d()) {
          return ta.c(p0);
       }
       View view = ((c = this.b.C) != null)? c.findViewById(p0): null;
       return view;
    }
    public final boolean d(){
       boolean b = (!this.a.d() && this.b.G == null)? false: true;
       return b;
    }
}
