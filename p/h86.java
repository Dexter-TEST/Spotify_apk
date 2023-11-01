package p.h86;
import java.lang.Runnable;
import androidx.appcompat.widget.SearchView;
import java.lang.Object;
import p.uv6;
import android.database.Cursor;
import p.y01;

public final class h86 implements Runnable	// class@001801 from classes.dex
{
    public final int a;
    public final SearchView b;

    public void h86(SearchView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       h86 tb = this.b;
       switch (this.a){
           case 0:
           default:
             SearchView j0 = tb.j0;
             if (j0 instanceof uv6) {
                j0.b(null);
             }
             return;
       }
       tb.s();
       return;
    }
}
