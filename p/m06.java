package p.m06;
import p.r16;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import p.pl;
import java.lang.Boolean;
import android.database.Cursor;
import p.u16;
import java.lang.Long;
import java.util.Set;
import java.util.HashSet;
import p.s16;
import java.lang.Integer;
import p.xo5;
import p.dr0;

public final class m06 implements r16	// class@001dfe from classes.dex
{
    public final Map a;

    public void m06(Map p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0,String p1,boolean p2){
       pl opl;
       if ((opl = this.c(p0, p1, 1)) != null && (opl = opl.c) != null) {
          p2 = opl.booleanValue();
       }
       return p2;
    }
    public Object apply(Object p0){
       Set set;
       xl1 v = u16.v;
       while (p0.moveToNext()) {
          long longx = p0.getLong(0);
          m06 ta = this.a;
          if ((set = ta.get(Long.valueOf(longx))) == null) {
             set = new HashSet();
             ta.put(Long.valueOf(longx), set);
          }
          set.add(new s16(p0.getString(1), p0.getString(2)));
       }
       return null;
    }
    public int b(String p0,String p1,int p2,int p3,int p4){
       pl opl;
       if ((opl = this.c(p0, p1, 2)) != null && (opl = opl.d) != null) {
          int i = opl.intValue();
          int i1 = (p2 <= i && i <= p3)? 1: 0;
          if (i1) {
             p4 = i;
          }
       }
       return p4;
    }
    public pl c(String p0,String p1,int p2){
       pl opl;
       int i;
       if ((opl = this.a.get(dr0.d(p0, p1))) != null) {
          if (opl.c != null) {
             i = 1;
          }else if(opl.d != null){
             i = 2;
          }else if(opl.e != null){
             i = 3;
          }else {
             i = 4;
          }
          if (p2 == i) {
          label_0027 :
             return opl;
          }
       }
       opl = null;
       goto label_0027 ;
    }
}
