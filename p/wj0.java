package p.wj0;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;

public final class wj0 extends Enum	// class@002b47 from classes.dex
{
    public static final wj0 a;
    public static final HashMap b;
    public static final wj0[] c;

    static {
       wj0 owj0 = new wj0("X86_32", 0);
       wj0 owj01 = new wj0("ARMV6", 5);
       wj0 owj02 = new wj0("ARMV7", 6);
       wj0 owj03 = new wj0("UNKNOWN", 7);
       wj0.a = owj03;
       wj0 owj04 = new wj0("ARM64", 9);
       wj0[] owj0Array = new wj0[10];
       owj0Array[0] = owj0;
       owj0Array[1] = new wj0("X86_64", 1);
       owj0Array[2] = new wj0("ARM_UNKNOWN", 2);
       owj0Array[3] = new wj0("PPC", 3);
       owj0Array[4] = new wj0("PPC64", 4);
       owj0Array[5] = owj01;
       owj0Array[6] = owj02;
       owj0Array[7] = owj03;
       owj0Array[8] = new wj0("ARMV7S", 8);
       owj0Array[9] = owj04;
       wj0.c = owj0Array;
       HashMap hashMap = new HashMap(4);
       wj0.b = hashMap;
       hashMap.put("armeabi-v7a", owj02);
       hashMap.put("armeabi", owj01);
       hashMap.put("arm64-v8a", owj04);
       hashMap.put("x86", owj0);
    }
    public void wj0(String p0,int p1){
       super(p0, p1);
    }
    public static wj0 valueOf(String p0){
       return Enum.valueOf(wj0.class, p0);
    }
    public static wj0[] values(){
       return wj0.c.clone();
    }
}
