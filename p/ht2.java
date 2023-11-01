package p.ht2;
import p.eo1;
import java.lang.Object;
import p.fu2;
import java.lang.String;
import p.og2;
import java.lang.Class;
import p.xi3;
import p.ft2;
import p.n33;
import p.vf;
import android.util.SparseArray;
import p.vt2;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.tp2;
import java.lang.Enum;
import java.lang.Integer;
import p.et2;
import p.ru2;
import p.fo1;
import p.gt2;

public final class ht2	// class@0018b9 from classes.dex
{
    private static final og2 GET_BINDER_ID;
    private static final og2 GET_ID;

    static {
       ht2.GET_ID = new eo1(2);
       ht2.GET_BINDER_ID = new eo1(3);
    }
    private void ht2(){
       super();
    }
    public static String a(fu2 p0){
       return ht2.lambda$static$0(p0);
    }
    public static og2 access$000(){
       return ht2.getBinderId();
    }
    public static xi3 asLazySparseArray(Class p0){
       return new xi3(new ft2(p0));
    }
    public static n33 asRegistry(Class p0){
       int i2;
       vt2 ovt2;
       vf ovf = new vf();
       SparseArray sparseArray = ht2.asSparseArray(p0);
       sparseArray.getClass();
       int i = sparseArray.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return new n33(ovf.b);
          }
          i2 = sparseArray.keyAt(i1);
          if ((ovt2 = sparseArray.valueAt(i1)) == null) {
             throw new IllegalArgumentException(tp2.k("Null binder for id ", i2));
          }
          if (i2 > 0) {
             ovf.b.put(i2, ovt2);
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       throw new IllegalArgumentException("Illegal id registered: "+i2+'='+ovt2+" \(only positive IDs are allowed");
    }
    public static SparseArray asSparseArray(Class p0){
       Enum[] enumConstant = p0.getEnumConstants();
       SparseArray sparseArray = new SparseArray(enumConstant.length);
       if (enumConstant.length <= 0) {
          return sparseArray;
       }
       tp2.s(enumConstant[0]);
       throw null;
    }
    public static Integer b(){
       return ht2.lambda$static$1(null);
    }
    public static SparseArray c(Class p0){
       return ht2.lambda$asLazySparseArray$2(p0);
    }
    private static og2 getBinderId(){
       return ht2.GET_BINDER_ID;
    }
    public static og2 getId(){
       return ht2.GET_ID;
    }
    private static SparseArray lambda$asLazySparseArray$2(Class p0){
       return ht2.asSparseArray(p0);
    }
    private static String lambda$static$0(fu2 p0){
       p0.getClass();
       return p0.c();
    }
    private static Integer lambda$static$1(et2 p0){
       p0.getClass();
       return Integer.valueOf(p0.a());
    }
    public static ru2 makeResolver(Class p0){
       return new gt2(new fo1(p0, ht2.getId()));
    }
}
