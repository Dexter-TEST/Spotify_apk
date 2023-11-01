package p.b96;
import androidx.appcompat.widget.SearchView;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.en6;

public final class b96	// class@00107f from classes.dex
{
    public final SearchView a;
    public final CharSequence b;
    public final boolean c;

    public void b96(SearchView p0,CharSequence p1,boolean p2){
       co5.q(p0, "view");
       co5.q(p1, "queryText");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this != p0 && (!p0 instanceof b96 && (co5.c(this.a, p0.a) && (co5.c(this.b, p0.b) && this.c == p0.c)))) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       b96 ta;
       b96 tb;
       b96 tc;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       i1 = (i1 + i) * 31;
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (i1 + tc);
    }
    public final String toString(){
       return en6.q("SearchViewQueryTextEvent\(view="+this.a+", queryText="+this.b+", isSubmitted=", this.c, "\)");
    }
}
