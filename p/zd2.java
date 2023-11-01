package p.zd2;
import p.yd2;
import androidx.fragment.app.o;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;

public final class zd2 implements yd2	// class@002ed3 from classes.dex
{
    public final String a;
    public final int b;
    public final int c;
    public final o d;

    public void zd2(o p0,String p1,int p2){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = 1;
    }
    public final boolean a(ArrayList p0,ArrayList p1){
       o x;
       if ((x = this.d.x) != null && (this.b < null && (this.a == null && x.getChildFragmentManager().O()))) {
          return false;
       }
       return this.d.Q(p0, p1, this.a, this.b, this.c);
    }
}
