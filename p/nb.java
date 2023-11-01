package p.nb;
import java.lang.Enum;
import p.w55;
import p.uk7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class nb extends Enum	// class@001fa9 from classes.dex
{
    public final w55 a;
    public final uk7 b;
    public static final nb c;
    public static final nb t;
    public static final nb v;
    public static final nb w;
    public static final nb x;
    public static final nb[] y;

    static {
       nb onb = new nb("CONTENT_PICKER", 0, w55.b, new uk7("spotify:internal:allboarding:origin:default"));
       nb.c = onb;
       nb onb1 = new nb("SEARCH", 1, w55.c, new uk7("spotify:internal:allboarding:search"));
       nb.t = onb1;
       nb onb2 = new nb("SHOW_LOADING", 2, w55.t, new uk7("spotify:internal:allboarding:send"));
       nb.v = onb2;
       nb onb3 = new nb("NOTIFICATION_PERMISSION", 3, w55.v, new uk7("spotify:internal:push-opt-in"));
       nb.w = onb3;
       nb onb4 = new nb("UNKNOWN", 4, w55.w, null);
       nb.x = onb4;
       nb[] onbArray = new nb[]{onb,onb1,onb2,onb3,onb4};
       nb.y = onbArray;
    }
    public void nb(String p0,int p1,w55 p2,uk7 p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static nb valueOf(String p0){
       return Enum.valueOf(nb.class, p0);
    }
    public static nb[] values(){
       return nb.y.clone();
    }
}
