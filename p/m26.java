package p.m26;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import android.os.Binder;
import android.os.Bundle;
import java.lang.Byte;
import java.lang.Character;
import java.lang.CharSequence;
import java.util.ArrayList;
import java.lang.Float;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.Short;
import android.util.SparseArray;
import android.util.Size;
import android.util.SizeF;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.k26;
import java.util.HashMap;
import java.util.Map;
import p.co5;
import p.q14;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.s26;
import p.t65;
import p.do5;
import p.ne4;
import p.l26;
import p.mr6;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class m26	// class@001e12 from classes.dex
{
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final k26 e;
    public static final Class[] f;

    static {
       Class[] uClassArray = new Class[29];
       uClassArray[0] = Boolean.TYPE;
       uClassArray[1] = boolean[].class;
       uClassArray[2] = Double.TYPE;
       uClassArray[3] = double[].class;
       uClassArray[4] = Integer.TYPE;
       uClassArray[5] = int[].class;
       uClassArray[6] = Long.TYPE;
       uClassArray[7] = long[].class;
       uClassArray[8] = String.class;
       uClassArray[9] = String[].class;
       uClassArray[10] = Binder.class;
       uClassArray[11] = Bundle.class;
       uClassArray[12] = Byte.TYPE;
       uClassArray[13] = byte[].class;
       uClassArray[14] = Character.TYPE;
       uClassArray[15] = char[].class;
       uClassArray[16] = CharSequence.class;
       uClassArray[17] = CharSequence[].class;
       uClassArray[18] = ArrayList.class;
       uClassArray[19] = Float.TYPE;
       uClassArray[20] = float[].class;
       uClassArray[21] = Parcelable.class;
       uClassArray[22] = Parcelable[].class;
       uClassArray[23] = Serializable.class;
       uClassArray[24] = Short.TYPE;
       uClassArray[25] = short[].class;
       uClassArray[26] = SparseArray.class;
       uClassArray[27] = Size.class;
       uClassArray[28] = SizeF.class;
       m26.f = uClassArray;
    }
    public void m26(){
       super();
       this.a = new LinkedHashMap();
       this.b = new LinkedHashMap();
       this.c = new LinkedHashMap();
       this.d = new LinkedHashMap();
       this.e = new k26(this, 1);
    }
    public void m26(HashMap p0){
       super();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       this.a = linkedHashMa;
       this.b = new LinkedHashMap();
       this.c = new LinkedHashMap();
       this.d = new LinkedHashMap();
       this.e = new k26(this, 0);
       linkedHashMa.putAll(p0);
    }
    public static Bundle a(m26 p0){
       co5.o(p0, "this$0");
       Iterator iterator = q14.r0(p0.b).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          p0.e(uEntry.getValue().a(), key);
       }
       p0 = p0.a;
       Set set = p0.keySet();
       ArrayList uArrayList = new ArrayList(set.size());
       ArrayList uArrayList1 = new ArrayList(uArrayList.size());
       iterator = set.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          uArrayList.add(str);
          uArrayList1.add(p0.get(str));
       }
       t65[] ot65Array = new t65[]{new t65("keys", uArrayList),new t65("values", uArrayList1)};
       return do5.g(ot65Array);
    }
    public final Object b(String p0){
       try{
          p0 = this.a.get(p0);
       }catch(java.lang.ClassCastException e0){
          this.d(p0);
          p0 = null;
       }
       return p0;
    }
    public final ne4 c(String p0){
       m26 tc = this.c;
       m26 obj = tc.get(p0);
       if (obj instanceof ne4) {
       }else {
          obj = null;
       }
       if (obj == null) {
          obj = this.a;
          obj = (obj.containsKey(p0))? new l26(this, p0, obj.get(p0)): new l26(this, p0);
          tc.put(p0, obj);
       }
       return obj;
    }
    public final void d(String p0){
       l26 ol26;
       this.a.remove(p0);
       if ((ol26 = this.c.remove(p0)) != null) {
          ol26.m = null;
       }
       this.d.remove(p0);
       return;
    }
    public final void e(Object p0,String p1){
       int i;
       mr6 omr6;
       co5.o(p1, "key");
       if (p0 == null) {
       }else {
          Class[] obj = m26.f;
          i = 0;
          int i1 = 0;
          while (i1 < 29) {
             object oobject = obj[i1];
             co5.i(oobject);
             if (!oobject.isInstance(p0)) {
                i1 = i1 + 1;
             }
          }
          if (i) {
             obj = this.c.get(p1);
             if (obj instanceof ne4) {
             }else {
                obj = null;
             }
             if (obj != null) {
                obj.k(p0);
             }else {
                this.a.put(p1, p0);
             }
             if ((omr6 = this.d.get(p1)) != null) {
                omr6.E(p0);
             }
             return;
          }else {
             co5.i(p0);
             throw new IllegalArgumentException("Can\'t put value with type "+p0.getClass()+" into saved state");
          }
       }
       i = 1;
    }
}
