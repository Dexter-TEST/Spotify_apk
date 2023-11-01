package p.ua1;
import java.lang.String;
import p.es3;
import java.lang.Object;
import p.co5;
import p.xq7;
import p.or7;
import p.oy6;
import java.util.ArrayList;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import java.util.Iterator;
import p.jr7;
import p.qq7;
import p.ap5;
import p.my6;
import java.lang.Integer;
import java.lang.Class;
import p.zy5;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import java.lang.Iterable;
import p.zf2;
import p.dj0;
import p.en6;
import java.lang.Enum;

public abstract class ua1	// class@002870 from classes.dex
{
    public static final int a;

    static {
       co5.l(es3.d("DiagnosticsWrkr"), "tagWithPrefix\(\"DiagnosticsWrkr\"\)");
    }
    public static final void a(xq7 p0,or7 p1,oy6 p2,ArrayList p3){
       jr7 a;
       xq7 oxq7 = p0;
       StringBuilder str = "";
       String str1 = (Build$VERSION.SDK_INT >= 23)? "Job Id": "Alarm Id";
       str = str+"\n Id \t Class Name\t "+str1+"\t State\t Unique Name\t Tags\t";
       Iterator iterator = p3.iterator();
       while (iterator.hasNext()) {
          jr7 ojr7 = iterator.next();
          my6 omy6 = p2.n(ap5.o(ojr7));
          int i = 0;
          Integer integer = (omy6 != null)? Integer.valueOf(omy6.c): i;
          p0.getClass();
          int i1 = 1;
          zy5 ozy5 = zy5.x(i1, "SELECT name FROM workname WHERE work_spec_id=?");
          if ((a = ojr7.a) == null) {
             ozy5.z(i1);
          }else {
             ozy5.s(i1, a);
          }
          oxq7.b.b();
          boolean b = false;
          Cursor uCursor = vv7.J(oxq7.b, ozy5, b);
          ArrayList uArrayList = new ArrayList(uCursor.getCount());
          while (uCursor.moveToNext()) {
             String str2 = (uCursor.isNull(b))? i: uCursor.getString(b);
             uArrayList.add(str2);
          }
          uCursor.close();
          ozy5.y();
          String str3 = "\t ";
          str = str.append(en6.t("\n", a, str3).append(ojr7.c).append(str3).append(integer).append(str3).append(ojr7.b.name()).append(str3).append(dj0.q0(uArrayList, ",", 0, 0, null, 62)).append(str3).append(dj0.q0(p1.i(a), ",", 0, 0, null, 62)).append(9).toString());
       }
       co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return;
    }
}
