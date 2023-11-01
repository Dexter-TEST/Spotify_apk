package p.g67;
import android.view.View$OnClickListener;
import com.spotify.search.view.ToolbarSearchFieldView;
import java.lang.Object;
import android.view.View;
import p.m67;
import p.j67;
import p.n67;

public final class g67 implements View$OnClickListener	// class@0016ae from classes.dex
{
    public final int a;
    public final ToolbarSearchFieldView b;

    public void g67(ToolbarSearchFieldView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       g67 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.z == j67.a) {
                tb.A.a();
             }else {
                tb.A.b();
             }
             return;
             break;
           case 1:
           default:
             tb.B.b();
             return;
       }
       tb.B.c();
       return;
    }
}
