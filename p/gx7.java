package p.gx7;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import java.lang.StringBuilder;

public final class gx7	// class@00179d from classes.dex
{
    public final String a;
    public final String b;

    public void gx7(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       gx7 ta;
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof gx7) {
          p0.getClass();
          gx7 a = p0.a;
          if ((ta = this.a) == null) {
             if (a != null) {
             label_002d :
                return false;
             }
          }else if(ta.equals(a)){
          }
          p0 = p0.b;
          if ((a = this.b) == null) {
             if (p0 != null) {
             }
          }else if(!a.equals(p0)){
             goto label_002d ;
          }
          return true;
       }else {
          goto label_002d ;
       }
    }
    public final int hashCode(){
       gx7 ta;
       gx7 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = (i1 ^ -721379959) * 0xf4243;
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       gx7 ta = this.a;
       gx7 tb = this.b;
       StringBuilder str = new StringBuilder(((String.valueOf(ta).length() + 68) + String.valueOf(tb).length()))+"AssetPackLocation{packStorageMethod=0, path="+ta;
       return str+", assetsPath="+tb+"}";
    }
}
