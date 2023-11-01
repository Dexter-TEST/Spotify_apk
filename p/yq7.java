package p.yq7;
import p.uy;
import p.xy5;
import java.lang.String;

public final class yq7 extends uy	// class@002e0d from classes.dex
{
    public final int d;

    public void yq7(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
           default:
             return "DELETE FROM WorkProgress";
       }
       return "DELETE from WorkProgress where work_spec_id=?";
    }
}
