package p.oq5;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class oq5 extends Enum implements tb3	// class@00216f from classes.dex
{
    public final int a;
    public static final oq5 b;
    public static final oq5 c;
    public static final oq5 t;
    public static final oq5 v;
    public static final oq5 w;
    public static final oq5 x;
    public static final oq5 y;
    public static final oq5[] z;

    static {
       oq5 ooq5 = new oq5("RECOMMENDATIONS_TYPE_UNKNOWN", 0, 0);
       oq5.b = ooq5;
       oq5 ooq51 = new oq5("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST", 1, 1);
       oq5.c = ooq51;
       oq5 ooq52 = new oq5("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE", 2, 2);
       oq5.t = ooq52;
       oq5 ooq53 = new oq5("RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY", 3, 3);
       oq5.v = ooq53;
       oq5 ooq54 = new oq5("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK", 4, 4);
       oq5.w = ooq54;
       oq5 ooq55 = new oq5("RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY", 5, 6);
       oq5.x = ooq55;
       oq5 ooq56 = new oq5("UNRECOGNIZED", 6, -1);
       oq5.y = ooq56;
       oq5[] ooq5Array = new oq5[]{ooq5,ooq51,ooq52,ooq53,ooq54,ooq55,ooq56};
       oq5.z = ooq5Array;
    }
    public void oq5(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static oq5 a(int p0){
       if (!p0) {
          return oq5.b;
       }
       if (p0 == 1) {
          return oq5.c;
       }
       if (p0 == 2) {
          return oq5.t;
       }
       if (p0 == 3) {
          return oq5.v;
       }
       if (p0 == 4) {
          return oq5.w;
       }
       if (p0 != 6) {
          return null;
       }
       return oq5.x;
    }
    public static oq5 valueOf(String p0){
       return Enum.valueOf(oq5.class, p0);
    }
    public static oq5[] values(){
       return oq5.z.clone();
    }
    public final int getNumber(){
       if (this != oq5.y) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
