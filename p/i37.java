package p.i37;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.en6;

public final class i37	// class@00191b from classes.dex
{
    public final TextView a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final int e;

    public void i37(TextView p0,CharSequence p1,int p2,int p3,int p4){
       co5.q(p0, "view");
       co5.q(p1, "text");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean equals(Object p0){
       if (this != p0 && (!p0 instanceof i37 && (co5.c(this.a, p0.a) && (co5.c(this.b, p0.b) && (this.c == p0.c && (this.d == p0.d && this.e == p0.e)))))) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       i37 ta;
       i37 tb;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (((((((i1 + i) * 31) + this.c) * 31) + this.d) * 31) + this.e);
    }
    public final String toString(){
       return en6.o("TextViewTextChangeEvent\(view="+this.a+", text="+this.b+", start="+this.c+", before="+this.d+", count=", this.e, "\)");
    }
}
