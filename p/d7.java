package p.d7;
import p.c7;
import androidx.activity.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import p.co5;
import p.b7;
import p.ml1;
import android.content.Context;
import p.n6;
import p.xe7;
import java.util.LinkedHashMap;
import java.lang.Boolean;
import java.util.Map;
import java.util.ArrayList;
import p.uk;
import java.util.Iterator;
import java.lang.Iterable;
import p.aj0;
import java.lang.Math;
import p.t65;
import p.q14;

public final class d7 extends c7	// class@0012f5 from classes.dex
{

    public void d7(){
       super();
    }
    public final Intent a(a p0,Object p1){
       co5.o(p0, "context");
       co5.o(p1, "input");
       Intent intent = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", p1);
       co5.l(intent, "Intent\(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input\)");
       return intent;
    }
    public final b7 b(a p0,Object p1){
       b7 uob7;
       int i4;
       co5.o(p0, "context");
       co5.o(p1, "input");
       int i = 1;
       int i1 = (!p1.length)? 1: 0;
       if (i1) {
          uob7 = new b7(0, ml1.a);
       }else {
          i1 = p1.length;
          int i2 = 0;
          while (i2 < i1) {
             int i3 = (!n6.a(p0, p1[i2]))? 1: 0;
             if (!i3) {
                i = 0;
                break ;
             }
             i2 = i2 + 1;
          }
          if (i) {
             if ((i4 = xe7.F(p1.length)) < 16) {
                i4 = 16;
             }
             LinkedHashMap linkedHashMa = new LinkedHashMap(i4);
             i4 = p1.length;
             for (i = 0; i < i4; i = i + 1) {
                linkedHashMa.put(p1[i], Boolean.TRUE);
             }
             uob7 = new b7(0, linkedHashMa);
          }else {
             uob7 = null;
          }
       }
       return uob7;
    }
    public final Object c(Intent p0,int p1){
       int[] intArrayExtr;
       ml1 a = ml1.a;
       if (p1 != -1) {
       }else if(p0 == null){
          String[] stringArrayE = p0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
          if ((intArrayExtr = p0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null && stringArrayE != null) {
             ArrayList uArrayList = new ArrayList(intArrayExtr.length);
             int len = intArrayExtr.length;
             for (int i = 0; i < len; i = i + 1) {
                boolean b = (!intArrayExtr[i])? true: false;
                uArrayList.add(Boolean.valueOf(b));
             }
             ArrayList uArrayList1 = uk.n0(stringArrayE);
             Iterator iterator = uArrayList1.iterator();
             Iterator iterator1 = uArrayList.iterator();
             ArrayList uArrayList2 = new ArrayList(Math.min(aj0.b0(uArrayList1), aj0.b0(uArrayList)));
             while (iterator.hasNext() && iterator1.hasNext()) {
                uArrayList2.add(new t65(iterator.next(), iterator1.next()));
             }
             a = q14.q0(uArrayList2);
          }
       }
       return a;
    }
}
