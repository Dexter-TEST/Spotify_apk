package p.kj4;
import p.fw1;
import p.aw1;
import p.u44;
import p.yu1;
import p.hs3;
import java.lang.Object;
import java.util.HashSet;
import java.util.AbstractCollection;
import p.is7;
import java.lang.Class;
import java.lang.String;
import p.zy5;
import p.xy5;
import android.database.Cursor;
import p.vv7;
import p.ej4;
import java.util.ArrayList;
import p.fu1;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.StringBuilder;
import p.vf;
import java.lang.Iterable;
import p.ab2;
import p.rp;
import p.jg2;
import p.ew1;
import java.util.Objects;
import p.kp;
import com.google.common.collect.c;
import p.cw1;
import java.util.List;
import p.dw1;

public final class kj4 implements fw1	// class@001c25 from classes.dex
{
    public final aw1 a;
    public final u44 b;
    public final hs3 c;
    public final cw1 d;

    public void kj4(aw1 p0,u44 p1,yu1 p2,hs3 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
    }
    public final void a(HashSet p0){
       this.a.f(p0);
    }
    public final is7 get(){
       Boolean uBoolean;
       boolean i10;
       kj4 okj4 = this;
       kj4 a = okj4.a;
       a.getClass();
       zy5 ozy5 = zy5.x(2, "SELECT * FROM Events WHERE CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = 0 ORDER BY id ASC LIMIT ? OFFSET ?");
       ozy5.P(1, (long)20);
       int i = 0;
       ozy5.P(2, (long)i);
       a.b.b();
       Cursor uCursor = vv7.J(a.b, ozy5, i);
       int i1 = ej4.z(uCursor, "id");
       int i2 = ej4.z(uCursor, "authenticated");
       int i3 = ej4.z(uCursor, "eventName");
       int i4 = ej4.z(uCursor, "sequenceId");
       int i5 = ej4.z(uCursor, "sequenceNumber");
       int i6 = ej4.z(uCursor, "fragments");
       int i7 = ej4.z(uCursor, "owner");
       int i8 = ej4.z(uCursor, "deviceId");
       ArrayList uArrayList = new ArrayList(uCursor.getCount());
       while (uCursor.moveToNext()) {
          fu1 uofu1 = new fu1();
          int i9 = i3;
          uofu1.a = uCursor.getLong(i1);
          String str = null;
          Integer integer = (uCursor.isNull(i2))? str: Integer.valueOf(uCursor.getInt(i2));
          if (integer == null) {
             uBoolean = str;
          }else if(integer.intValue()){
             i10 = true;
          }else {
             i10 = false;
          }
          uBoolean = Boolean.valueOf(i10);
          uofu1.b = uBoolean;
          i10 = i9;
          uofu1.c = (uCursor.isNull(i10))? str: uCursor.getString(i10);
          uofu1.d = (uCursor.isNull(i4))? str: uCursor.getBlob(i4);
          i = i4;
          uofu1.e = uCursor.getLong(i5);
          uofu1.f = (uCursor.isNull(i6))? null: uCursor.getBlob(i6);
          uofu1.g = (uCursor.isNull(i7))? null: uCursor.getString(i7);
          uofu1.h = (uCursor.isNull(i8))? null: uCursor.getString(i8);
          uArrayList.add(uofu1);
          i4 = i;
          i3 = i10;
          i10 = 1;
       }
       uCursor.close();
       ozy5.y();
       if (uArrayList.size() <= 0) {
          return dw1.G;
       }
       okj4.c.a(uArrayList.size()+" Non authenticated events to be sent to server: "+new vf(" ").r(ab2.b(uArrayList).m(new rp(7))));
       kj4 b = okj4.b;
       Objects.requireNonNull(b);
       return new ew1(okj4.d, ab2.b(uArrayList).m(new kp(1, b)).d());
    }
}
