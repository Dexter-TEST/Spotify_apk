package p.q96;
import p.uw5;
import android.widget.SeekBar;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.en6;

public final class q96 extends uw5	// class@00235b from classes.dex
{
    public final SeekBar A;
    public final int B;
    public final boolean C;

    public void q96(SeekBar p0,int p1,boolean p2){
       co5.q(p0, "view");
       super(0);
       this.A = p0;
       this.B = p1;
       this.C = p2;
    }
    public final boolean equals(Object p0){
       if (this != p0 && (!p0 instanceof q96 && (co5.c(this.A, p0.A) && (this.B == p0.B && this.C == p0.C)))) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       q96 tA;
       q96 tC;
       int i = ((tA = this.A) != null)? tA.hashCode(): 0;
       i = ((i * 31) + this.B) * 31;
       if ((tC = this.C) != null) {
          tC = 1;
       }
       return (i + tC);
    }
    public final String toString(){
       return en6.q("SeekBarProgressChangeEvent\(view="+this.A+", progress="+this.B+", fromUser=", this.C, "\)");
    }
}
