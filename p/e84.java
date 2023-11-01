package p.e84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class e84 extends Enum implements tb3	// class@00143a from classes.dex
{
    public final int a;
    public static final e84 b;
    public static final e84 c;
    public static final e84 t;
    public static final e84 v;
    public static final e84 w;
    public static final e84 x;
    public static final e84[] y;

    static {
       e84 uoe84 = new e84("ALBUM", 0, 1);
       e84.b = uoe84;
       e84 uoe841 = new e84("SINGLE", 1, 2);
       e84.c = uoe841;
       e84 uoe842 = new e84("COMPILATION", 2, 3);
       e84.t = uoe842;
       e84 uoe843 = new e84("EP", 3, 4);
       e84.v = uoe843;
       e84 uoe844 = new e84("AUDIOBOOK", 4, 5);
       e84.w = uoe844;
       e84 uoe845 = new e84("PODCAST", 5, 6);
       e84.x = uoe845;
       e84[] uoe84Array = new e84[]{uoe84,uoe841,uoe842,uoe843,uoe844,uoe845};
       e84.y = uoe84Array;
    }
    public void e84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static e84 a(int p0){
       switch (p0){
           case 1:
             return e84.b;
           case 2:
             return e84.c;
           case 3:
             return e84.t;
           case 4:
             return e84.v;
           case 5:
             return e84.w;
           case 6:
             return e84.x;
           default:
             return null;
       }
    }
    public static e84 valueOf(String p0){
       return Enum.valueOf(e84.class, p0);
    }
    public static e84[] values(){
       return e84.y.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
