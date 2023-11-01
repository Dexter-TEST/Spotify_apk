package p.d96;
import java.lang.Enum;
import p.sp6;
import p.rm;
import java.lang.String;
import p.au2;
import p.ez2;
import p.a23;
import java.lang.Class;
import java.lang.Object;

public final class d96 extends Enum	// class@001305 from classes.dex
{
    public final sp6 a;
    public final a23 b;
    public final e96 c;
    public static final d96 A;
    public static final d96 B;
    public static final d96[] C;
    public static final d96 t;
    public static final d96 v;
    public static final d96 w;
    public static final d96 x;
    public static final d96 y;
    public static final d96 z;

    static {
       d96 v6 = new d96("ALBUM", 0, sp6.x, null, new rm(8));
       d96.t = v6;
       v6 = new d96("ARTIST", 1, sp6.z, ez2.c.a, new rm(9));
       d96.v = v6;
       sp6 b0 = sp6.b0;
       d96 v1 = new d96("EPISODE", 2, b0, null, new rm(10));
       d96.w = v1;
       sp6 z = sp6.Z;
       d96 v2 = new d96("GENRE", 3, z, null, new rm(11));
       d96.x = v2;
       sp6 osp6 = z;
       d96 v4 = new d96("PLAYLIST", 4, osp6, null, new rm(12));
       d96.y = v4;
       d96 v5 = new d96("SHOW", 5, b0, null, new rm(13));
       d96.z = v5;
       v5 = new d96("TRACK", 6, sp6.o0, null, new rm(14));
       d96.A = v5;
       v4 = new d96("UNKNOWN", 7, osp6, null, new rm(15));
       d96.B = v9;
       d96[] uod96Array = new d96[]{v6,v6,v1,v2,v4,v5,v5,v9};
       d96.C = uod96Array;
    }
    public void d96(String p0,int p1,sp6 p2,au2 p3,rm p4){
       super(p0, p1);
       this.a = p2;
       this.b = a23.W(p3);
       this.c = p4;
    }
    public static d96 valueOf(String p0){
       return Enum.valueOf(d96.class, p0);
    }
    public static d96[] values(){
       return d96.C.clone();
    }
}
