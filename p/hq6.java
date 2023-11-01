package p.hq6;
import p.z61;
import java.lang.Class;
import java.util.Date;
import java.sql.Date;
import java.sql.Timestamp;

public final class hq6 extends z61	// class@0018a4 from classes.dex
{
    public final int a;

    public void hq6(int p0,Class p1){
       this.a = p0;
       super(p1);
    }
    public final Date a(Date p0){
       switch (this.a){
           case 0:
           default:
             return new Timestamp(p0.getTime());
       }
       return new Date(p0.getTime());
    }
}
