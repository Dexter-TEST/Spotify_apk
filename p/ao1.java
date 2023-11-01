package p.ao1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ao1 extends Enum implements tb3	// class@000fbe from classes.dex
{
    public final int a;
    public static final ao1 A;
    public static final ao1 B;
    public static final ao1 C;
    public static final ao1[] D;
    public static final ao1 b;
    public static final ao1 c;
    public static final ao1 t;
    public static final ao1 v;
    public static final ao1 w;
    public static final ao1 x;
    public static final ao1 y;
    public static final ao1 z;

    static {
       ao1 uoao1 = new ao1("ENTITY_TYPE_UNKNOWN", 0, 0);
       ao1.b = uoao1;
       ao1 uoao11 = new ao1("ENTITY_TYPE_ARTIST", 1, 1);
       ao1.c = uoao11;
       ao1 uoao12 = new ao1("ENTITY_TYPE_TRACK", 2, 2);
       ao1.t = uoao12;
       ao1 uoao13 = new ao1("ENTITY_TYPE_ALBUM", 3, 3);
       ao1.v = uoao13;
       ao1 uoao14 = new ao1("ENTITY_TYPE_PLAYLIST", 4, 4);
       ao1.w = uoao14;
       ao1 uoao15 = new ao1("ENTITY_TYPE_GENRE", 5, 5);
       ao1.x = uoao15;
       ao1 uoao16 = new ao1("ENTITY_TYPE_AUDIO_SHOW", 6, 6);
       ao1.y = uoao16;
       ao1 uoao17 = new ao1("ENTITY_TYPE_AUDIO_EPISODE", 7, 7);
       ao1.z = uoao17;
       ao1 uoao18 = new ao1("ENTITY_TYPE_PROFILE", 8, 8);
       ao1.A = uoao18;
       ao1 uoao19 = new ao1("ENTITY_TYPE_AUDIOBOOK", 9, 10);
       ao1.B = uoao19;
       ao1 uoao110 = new ao1("UNRECOGNIZED", 10, -1);
       ao1.C = uoao110;
       ao1[] uoao1Array = new ao1[11];
       uoao1Array[0] = uoao1;
       uoao1Array[1] = uoao11;
       uoao1Array[2] = uoao12;
       uoao1Array[3] = uoao13;
       uoao1Array[4] = uoao14;
       uoao1Array[5] = uoao15;
       uoao1Array[6] = uoao16;
       uoao1Array[7] = uoao17;
       uoao1Array[8] = uoao18;
       uoao1Array[9] = uoao19;
       uoao1Array[10] = uoao110;
       ao1.D = uoao1Array;
    }
    public void ao1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static ao1 a(int p0){
       switch (p0){
           case 0:
             return ao1.b;
           case 1:
             return ao1.c;
           case 2:
             return ao1.t;
           case 3:
             return ao1.v;
           case 4:
             return ao1.w;
           case 5:
             return ao1.x;
           case 6:
             return ao1.y;
           case 7:
             return ao1.z;
           case 8:
             return ao1.A;
           case 10:
             return ao1.B;
           default:
             return null;
       }
    }
    public static ao1 valueOf(String p0){
       return Enum.valueOf(ao1.class, p0);
    }
    public static ao1[] values(){
       return ao1.D.clone();
    }
    public final int getNumber(){
       if (this != ao1.C) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
