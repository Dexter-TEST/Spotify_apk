package p.qm0;
import p.mm0;
import java.lang.String;
import java.lang.Object;
import p.io2;
import java.lang.Integer;
import java.util.Arrays;

public class qm0 extends mm0	// class@0023ca from classes.dex
{
    public final String d;
    public String e;

    public void qm0(int p0,long p1,String p2){
       super(p0, p1);
       this.d = p2;
    }
    public void qm0(int p0,String p1){
       super(p0, -1, p1);
    }
    public boolean equals(Object p0){
       if (!p0 instanceof qm0) {
          return super.equals(p0);
       }
       qm0 oqm0 = p0;
       boolean b = (super.equals(p0) && (io2.j(this.d, oqm0.d) && io2.j(this.e, oqm0.e)))? true: false;
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(super.hashCode()),this.d,this.e};
       return Arrays.hashCode(objArray);
    }
}
