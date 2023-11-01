package p.ys2;
import p.bt2;
import p.ej5;
import p.e33;
import p.jt2;
import android.os.Parcelable;
import java.util.Map;
import android.os.Bundle;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import android.os.BaseBundle;
import android.util.SparseArray;
import p.it2;
import java.lang.Object;
import java.lang.Integer;
import com.spotify.base.java.logging.Logger;
import p.ju2;
import java.util.WeakHashMap;

public final class ys2 extends bt2	// class@002e19 from classes.dex
{
    public final int c;
    public final Object d;

    public void ys2(ej5 p0,e33 p1){
       this.c = 1;
       this.d = p0;
       super(p1);
    }
    public void ys2(jt2 p0){
       this.c = 0;
       super(p0.c);
       this.d = p0;
    }
    public final void c(Parcelable p0,Map p1){
       int i2;
       String str1;
       ej5 g;
       ys2 td = this.d;
       switch (this.c){
           case 0:
             if (p0 instanceof Bundle) {
                p0.setClassLoader(ys2.class.getClassLoader());
                String str = "hubs_adapter_states";
                if (p0.containsKey(str)) {
                   jt2 sparseParcel = p0.getSparseParcelableArray(str);
                   jt2 t = td.t;
                   int i = t.size();
                   int i1 = 0;
                   while (i1 < sparseParcel.size()) {
                      if ((i2 = sparseParcel.keyAt(i1)) >= i) {
                         Object[] objArray = new Object[]{Integer.valueOf(i2),Integer.valueOf(i)};
                         Logger.i("Inconsistent saved state: position is %d but size is %d", objArray);
                         break ;
                      }else if((str1 = t.get(i2).c()) != null){
                         p1.put(str1, sparseParcel.valueAt(i1));
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             break;
           default:
             if ((g = td.g) != null && g.c() != null) {
                p1.put(td.g.c(), p0);
             }
             return;
       }
       return;
    }
    public final Parcelable d(WeakHashMap p0){
       String str;
       Parcelable parcelable1;
       ej5 g;
       Parcelable parcelable = null;
       ys2 td = this.d;
       switch (this.c){
           case 0:
             if (!p0.isEmpty()) {
                SparseArray sparseArray = new SparseArray();
                jt2 t = td.t;
                int i = 0;
                while (i < t.size()) {
                   if ((str = t.get(i).c()) != null && (parcelable1 = p0.get(str)) != null) {
                      sparseArray.put(i, parcelable1);
                   }
                   i = i + 1;
                }
                parcelable = new Bundle();
                parcelable.putSparseParcelableArray("hubs_adapter_states", sparseArray);
             }
             break;
           default:
             if ((g = td.g) != null && g.c() != null) {
                parcelable = p0.get(td.g.c());
             }
             return parcelable;
       }
       return parcelable;
    }
}
