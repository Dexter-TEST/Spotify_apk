package p.lz6;
import p.iz6;
import com.google.android.material.tabs.TabLayout;
import p.cz6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class lz6 extends iz6	// class@001df5 from classes.dex
{
    public final TabLayout a;
    public final cz6 b;

    public void lz6(TabLayout p0,cz6 p1){
       co5.q(p0, "view");
       co5.q(p1, "tab");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final cz6 a(){
       return this.b;
    }
    public final boolean equals(Object p0){
       if (this != p0 && (!p0 instanceof lz6 && (co5.c(this.a, p0.a) && co5.c(this.b, p0.b)))) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       lz6 ta;
       lz6 tb;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "TabLayoutSelectionReselectedEvent\(view="+this.a+", tab="+this.b+"\)";
    }
}
