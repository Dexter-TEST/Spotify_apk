package p.z86;
import p.n86;
import p.wz3;
import androidx.appcompat.widget.SearchView;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.b96;
import java.lang.CharSequence;

public final class z86 extends wz3 implements n86	// class@002eab from classes.dex
{
    public final SearchView b;
    public final Observer c;

    public void z86(SearchView p0,Observer p1){
       co5.q(p0, "view");
       co5.q(p1, "observer");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean c(String p0){
       co5.q(p0, "s");
       if (this.isDisposed()) {
          return false;
       }
       this.c.onNext(new b96(this.b, p0, false));
       return true;
    }
    public final boolean d(String p0){
       CharSequence query;
       co5.q(p0, "query");
       if (this.isDisposed()) {
          return false;
       }
       z86 tb = this.b;
       query = tb.getQuery();
       co5.h(query, "view.query");
       b96 uob96 = new b96(tb, query, true);
       this.c.onNext(uob96);
       return true;
    }
    public final void f(){
       this.b.setOnQueryTextListener(null);
    }
}
