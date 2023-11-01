package p.ny6;
import p.uy;
import p.xy5;
import java.lang.String;

public final class ny6 extends uy	// class@002075 from classes.dex
{
    public final int d;

    public void ny6(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
           default:
             return "DELETE FROM SystemIdInfo where work_spec_id=?";
       }
       return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
