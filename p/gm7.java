package p.gm7;
import android.content.DialogInterface$OnCancelListener;
import p.uv1;
import android.webkit.JsResult;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;

public final class gm7 implements DialogInterface$OnCancelListener	// class@00173b from classes.dex
{
    public final uv1 a;
    public final JsResult b;

    public void gm7(uv1 p0,JsResult p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onCancel(DialogInterface p0){
       gm7 ta = this.a;
       ta.getClass();
       this.b.cancel();
       ta.b = null;
    }
}
