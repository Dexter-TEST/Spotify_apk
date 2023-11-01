package p.bg;
import android.window.OnBackInvokedCallback;
import p.jg;
import java.lang.Object;

public final class bg implements OnBackInvokedCallback	// class@0010c0 from classes.dex
{
    public final jg a;

    public void bg(jg p0){
       this.a = p0;
    }
    public final void onBackInvoked(){
       this.a.E();
    }
}
