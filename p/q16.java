package p.q16;
import p.r16;
import java.lang.Object;
import android.database.Cursor;
import p.u16;
import java.util.ArrayList;
import p.t63;
import p.fw;
import java.lang.String;
import p.kk5;
import p.nk5;
import android.util.Base64;

public final class q16 implements r16	// class@002313 from classes.dex
{
    public static final q16 a;

    static {
       q16.a = new q16();
    }
    public void q16(){
       super();
    }
    public final Object apply(Object p0){
       String str;
       ArrayList uArrayList = new ArrayList();
       while (p0.moveToNext()) {
          t63 ot63 = fw.a();
          ot63.r(p0.getString(1));
          ot63.t = nk5.b(p0.getInt(2));
          byte[] uobyteArray = ((str = p0.getString(3)) == null)? null: Base64.decode(str, 0);
          ot63.c = uobyteArray;
          uArrayList.add(ot63.j());
       }
       return uArrayList;
    }
}
