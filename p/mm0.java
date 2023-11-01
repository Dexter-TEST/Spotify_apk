package p.mm0;
import java.lang.Object;
import android.view.View;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Arrays;

public class mm0	// class@001ebf from classes.dex
{
    public final long a;
    public final int b;
    public boolean c;

    public void mm0(int p0,long p1){
       super();
       this.a = p1;
       this.b = p0;
       this.c = true;
    }
    public boolean a(View p0,Observer p1){
       return false;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof mm0 && (!(this.a - p0.a) && (this.b == p0.b && this.c == p0.c))) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Long.valueOf(this.a),Integer.valueOf(this.b),Boolean.valueOf(this.c)};
       return Arrays.hashCode(objArray);
    }
}
