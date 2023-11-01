package p.g76;
import p.n67;
import p.h76;
import java.lang.Object;
import com.spotify.search.view.BackKeyEditText;
import android.view.View;
import android.text.Editable;
import p.pg;
import com.spotify.search.view.ToolbarSearchFieldView;
import p.l67;
import p.yy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p.d76;

public final class g76 implements n67	// class@0016b5 from classes.dex
{
    public final h76 a;

    public void g76(h76 p0){
       this.a = p0;
       super();
    }
    public final void a(){
       g76 ta = this.a;
       if (!ta.a().hasFocus()) {
          ta.b();
       }
       if (ta.a().hasFocus()) {
          ta.a().getText().clear();
       }else {
          ta.d.C.e();
       }
       Iterator iterator = ta.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void b(){
    }
}
