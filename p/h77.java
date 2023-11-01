package p.h77;
import p.uy;
import p.xy5;
import java.lang.String;

public final class h77 extends uy	// class@0017f9 from classes.dex
{
    public final int d;

    public void h77(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
           default:
             return "DELETE FROM track_rows WHERE parent_uri = ?";
       }
       return "DELETE FROM track_artists WHERE track_uri = ?";
    }
}
