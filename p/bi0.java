package p.bi0;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;

public final class bi0	// class@0010ca from classes.dex
{
    public final WeakReference a;
    public final String b;

    public void bi0(View p0,String p1){
       co5.o(p0, "view");
       co5.o(p1, "viewMapKey");
       super();
       this.a = new WeakReference(p0);
       this.b = p1;
    }
    public final View a(){
       bi0 ta;
       View view = ((ta = this.a) == null)? null: ta.get();
       return view;
    }
}
