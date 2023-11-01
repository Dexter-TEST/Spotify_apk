package p.ql3;
import android.widget.AdapterView$OnItemSelectedListener;
import java.lang.Object;
import android.widget.AdapterView;
import android.view.View;
import p.wl3;
import p.ue1;
import androidx.appcompat.widget.SearchView;

public final class ql3 implements AdapterView$OnItemSelectedListener	// class@0023c4 from classes.dex
{
    public final int a;
    public final Object b;

    public void ql3(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onItemSelected(AdapterView p0,View p1,int p2,long p3){
       wl3 c;
       ql3 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.o(p2);
             return;
       }
       if (p2 != -1 && (c = tb.c) != null) {
          c.setListSelectionHidden(false);
       }
       return;
    }
    public final void onNothingSelected(AdapterView p0){
    }
}
