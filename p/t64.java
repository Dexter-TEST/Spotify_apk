package p.t64;
import android.widget.PopupWindow$OnDismissListener;
import p.v64;
import java.lang.Object;

public final class t64 implements PopupWindow$OnDismissListener	// class@00270c from classes.dex
{
    public final v64 a;

    public void t64(v64 p0){
       this.a = p0;
       super();
    }
    public final void onDismiss(){
       this.a.c();
    }
}
