package p.r96;
import p.uw5;
import android.widget.SeekBar;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class r96 extends uw5	// class@0024a3 from classes.dex
{
    public final SeekBar A;

    public void r96(SeekBar p0){
       co5.q(p0, "view");
       super(0);
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (this != p0 && (!p0 instanceof r96 && co5.c(this.A, p0.A))) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       r96 tA;
       int i = ((tA = this.A) != null)? tA.hashCode(): 0;
       return i;
    }
    public final String toString(){
       return "SeekBarStartChangeEvent\(view="+this.A+"\)";
    }
}
