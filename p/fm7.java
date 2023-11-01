package p.fm7;
import android.content.DialogInterface$OnClickListener;
import p.uv1;
import android.webkit.JsResult;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;

public final class fm7 implements DialogInterface$OnClickListener	// class@0015f9 from classes.dex
{
    public final int a;
    public final uv1 b;
    public final JsResult c;

    public void fm7(uv1 p0,JsResult p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       fm7 tc = this.c;
       fm7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.getClass();
             tc.cancel();
             tb.b = null;
             return;
       }
       tb.getClass();
       tc.confirm();
       tb.b = null;
       return;
    }
}
