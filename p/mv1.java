package p.mv1;
import p.lv1;
import p.xy5;
import p.m91;
import java.lang.Object;
import java.util.LinkedList;
import java.util.AbstractList;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Collection;
import p.mi;
import p.uw6;
import java.util.Iterator;
import p.sw6;
import p.zy5;
import android.database.Cursor;
import p.vv7;
import p.kv1;
import p.rn1;

public final class mv1 extends lv1	// class@001f0f from classes.dex
{
    public final xy5 P;
    public final m91 Q;

    public void mv1(xy5 p0){
       super();
       this.P = p0;
       this.Q = new m91(this, p0, 7);
    }
    public final void j(LinkedList p0){
       mv1 tP = this.P;
       tP.c();
       super.j(p0);
       tP.r();
       tP.m();
    }
    public final void k(AbstractList p0){
       byte[] uobyteArray;
       mv1 tP = this.P;
       tP.b();
       StringBuilder str = "DELETE FROM EventSequenceNumbers WHERE sequenceId IN \(";
       mi.c(p0.size(), str);
       uw6 ouw6 = tP.e(str+"\)");
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          if ((uobyteArray = iterator.next()) == null) {
             ouw6.z(i);
          }else {
             ouw6.d0(uobyteArray, i);
          }
          i = i + 1;
       }
       tP.c();
       ouw6.u();
       tP.r();
       tP.m();
       return;
    }
    public final long p(String p0,byte[] p1){
       int i = 2;
       zy5 ozy5 = zy5.x(i, "SELECT sequenceNumberNext FROM EventSequenceNumbers WHERE eventName = ? AND sequenceId = ?");
       if (p0 == null) {
          ozy5.z(1);
       }else {
          ozy5.s(1, p0);
       }
       if (p1 == null) {
          ozy5.z(i);
       }else {
          ozy5.d0(p1, i);
       }
       mv1 tP = this.P;
       tP.b();
       Cursor uCursor = vv7.J(tP, ozy5, false);
       long longx = (uCursor.moveToFirst())? uCursor.getLong(false): 0;
       uCursor.close();
       ozy5.y();
       return longx;
    }
    public final int r(){
       int i = 0;
       zy5 ozy5 = zy5.x(i, "SELECT 1 FROM EventSequenceNumbers LIMIT 1");
       mv1 tP = this.P;
       tP.b();
       Cursor uCursor = vv7.J(tP, ozy5, i);
       if (uCursor.moveToFirst()) {
          i = uCursor.getInt(i);
       }
       uCursor.close();
       ozy5.y();
       return i;
    }
    public final void s(kv1 p0){
       mv1 tP = this.P;
       tP.b();
       tP.c();
       this.Q.h(p0);
       tP.r();
       tP.m();
    }
}
