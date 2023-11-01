package p.bf4;
import p.cf4;
import java.lang.String;

public final class bf4 extends cf4	// class@0010b3 from classes.dex
{
    public final int b;

    public void bf4(int p0){
       this.b = p0;
       super();
    }
    public final String b(){
       switch (this.b){
           case 0:
             return "com.facebook.arstudio.player";
           case 1:
             return "com.instagram.android";
           case 2:
             return "com.facebook.katana";
           case 3:
             return "com.facebook.orca";
           default:
             return "com.facebook.wakizashi";
       }
    }
}
