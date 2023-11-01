package p.g84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class g84 extends Enum implements tb3	// class@0016bc from classes.dex
{
    public final int a;
    public static final g84[] A;
    public static final g84 b;
    public static final g84 c;
    public static final g84 t;
    public static final g84 v;
    public static final g84 w;
    public static final g84 x;
    public static final g84 y;
    public static final g84 z;

    static {
       g84 og84 = new g84("ARTIST_ROLE_UNKNOWN", 0, 0);
       g84.b = og84;
       g84 og841 = new g84("ARTIST_ROLE_MAIN_ARTIST", 1, 1);
       g84.c = og841;
       g84 og842 = new g84("ARTIST_ROLE_FEATURED_ARTIST", 2, 2);
       g84.t = og842;
       g84 og843 = new g84("ARTIST_ROLE_REMIXER", 3, 3);
       g84.v = og843;
       g84 og844 = new g84("ARTIST_ROLE_ACTOR", 4, 4);
       g84.w = og844;
       g84 og845 = new g84("ARTIST_ROLE_COMPOSER", 5, 5);
       g84.x = og845;
       g84 og846 = new g84("ARTIST_ROLE_CONDUCTOR", 6, 6);
       g84.y = og846;
       g84 og847 = new g84("ARTIST_ROLE_ORCHESTRA", 7, 7);
       g84.z = og847;
       g84[] og84Array = new g84[]{og84,og841,og842,og843,og844,og845,og846,og847};
       g84.A = og84Array;
    }
    public void g84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static g84 a(int p0){
       switch (p0){
           case 0:
             return g84.b;
           case 1:
             return g84.c;
           case 2:
             return g84.t;
           case 3:
             return g84.v;
           case 4:
             return g84.w;
           case 5:
             return g84.x;
           case 6:
             return g84.y;
           case 7:
             return g84.z;
           default:
             return null;
       }
    }
    public static g84 valueOf(String p0){
       return Enum.valueOf(g84.class, p0);
    }
    public static g84[] values(){
       return g84.A.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
