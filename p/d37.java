package p.d37;
import android.widget.TextView;
import android.view.KeyEvent;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class d37	// class@0012d1 from classes.dex
{
    public final TextView a;
    public final int b;
    public final KeyEvent c;

    public void d37(TextView p0,int p1,KeyEvent p2){
       co5.q(p0, "view");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this != p0 && (!p0 instanceof d37 && (co5.c(this.a, p0.a) && (this.b == p0.b && co5.c(this.c, p0.c))))) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       d37 ta;
       d37 tc;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       if ((tc = this.c) != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "TextViewEditorActionEvent\(view="+this.a+", actionId="+this.b+", keyEvent="+this.c+"\)";
    }
}
