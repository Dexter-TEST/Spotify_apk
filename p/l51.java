package p.l51;
import p.z4;
import java.lang.Throwable;
import java.lang.Object;

public final class l51 extends z4	// class@001ce5 from classes.dex
{
    public final Object c;

    public void l51(boolean p0,Throwable p1,Object p2){
       super(p1, p0);
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof l51) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       l51 tc = this.c;
       p0 = p0.c;
       if (tc != null) {
          if (!tc.equals(p0)) {
          label_0022 :
             return false;
          }
       }else if(p0 != null){
          goto label_0022 ;
       }
       return true;
    }
    public final int hashCode(){
       l51 tc;
       int i = super.hashCode() * 31;
       int i1 = ((tc = this.c) != null)? tc.hashCode(): 0;
       return (i + i1);
    }
}
