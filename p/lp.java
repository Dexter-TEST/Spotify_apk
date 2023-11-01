package p.lp;
import p.fw1;
import p.aw1;
import p.u44;
import p.yu1;
import p.hs3;
import p.ou1;
import java.lang.Object;
import java.util.HashSet;
import java.util.AbstractCollection;
import p.is7;
import p.bb3;
import p.vp;
import p.r45;
import java.lang.String;
import p.dw1;
import java.lang.Class;
import p.pu1;
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

public final class lp implements fw1	// class@001d9e from classes.dex
{
    public final aw1 a;
    public final u44 b;
    public final hs3 c;
    public final cw1 d;
    public final ou1 e;

    public void lp(aw1 p0,u44 p1,yu1 p2,hs3 p3,ou1 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       this.e = p4;
    }
    public final void a(HashSet p0){
       this.a.f(p0);
    }
    public final is7 get(){
       dw1 uodw1;
       Boolean uBoolean;
       lp olp = this;
       r45 or45 = olp.e.a.a();
       int i = 1;
       boolean b = false;
       int i1 = (or45.c() && !or45.b().isEmpty())? 1: 0;
       dw1 g = dw1.G;
       if (!i1) {
          return g;
       }else {
          lp a = olp.a;
          a.getClass();
          String str = pu1.a(or45.b());
          int i2 = 3;
          zy5 ozy5 = zy5.x(i2, "SELECT * FROM Events WHERE CASE WHEN authenticated IS NULL THEN 1 ELSE authenticated END = 1 AND  CASE WHEN owner IS NULL THEN ? ELSE owner END IS ? ORDER BY id ASC LIMIT ?");
          if (str == null) {
             ozy5.z(i);
          }else {
             ozy5.s(i, str);
          }
          int i3 = 2;
          if (str == null) {
             ozy5.z(i3);
          }else {
             ozy5.s(i3, str);
          }
          ozy5.P(i2, (long)20);
          a.b.b();
          Cursor uCursor = vv7.J(a.b, ozy5, b);
          int i4 = ej4.z(uCursor, "id");
          i3 = ej4.z(uCursor, "authenticated");
          int i5 = ej4.z(uCursor, "eventName");
          int i6 = ej4.z(uCursor, "sequenceId");
          int i7 = ej4.z(uCursor, "sequenceNumber");
          int i8 = ej4.z(uCursor, "fragments");
          int i9 = ej4.z(uCursor, "owner");
          int i10 = ej4.z(uCursor, "deviceId");
          ArrayList uArrayList = new ArrayList(uCursor.getCount());
          while (uCursor.moveToNext()) {
             fu1 uofu1 = new fu1();
             uodw1 = g;
             uofu1.a = uCursor.getLong(i4);
             String str1 = null;
             Integer integer = (uCursor.isNull(i3))? str1: Integer.valueOf(uCursor.getInt(i3));
             if (integer == null) {
                uBoolean = str1;
             }else if(integer.intValue()){
                b = true;
             }else {
                b = false;
             }
             uBoolean = Boolean.valueOf(b);
             uofu1.b = uBoolean;
             uofu1.c = (uCursor.isNull(i5))? str1: uCursor.getString(i5);
             uofu1.d = (uCursor.isNull(i6))? str1: uCursor.getBlob(i6);
             int i11 = i3;
             uofu1.e = uCursor.getLong(i7);
             uofu1.f = (uCursor.isNull(i8))? str1: uCursor.getBlob(i8);
             uofu1.g = (uCursor.isNull(i9))? str1: uCursor.getString(i9);
             uofu1.h = (uCursor.isNull(i10))? str1: uCursor.getString(i10);
             uArrayList.add(uofu1);
             g = uodw1;
             i3 = i11;
             i2 = 3;
          }
          uodw1 = g;
          uCursor.close();
          ozy5.y();
          if (uArrayList.size() > 0) {
             olp.c.a(uArrayList.size()+" Authenticated events to be sent to server: "+new vf(" ").r(ab2.b(uArrayList).m(new rp(3))));
             lp b1 = olp.b;
             Objects.requireNonNull(b1);
             return new ew1(olp.d, ab2.b(uArrayList).m(new kp(0, b1)).d());
          }else {
             return uodw1;
          }
       }
    }
}
