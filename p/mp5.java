package p.mp5;
import java.net.Proxy$Type;
import java.lang.Enum;

public abstract class mp5	// class@0002bd from classes2.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Proxy$Type.values().length];
       ointArray[Proxy$Type.DIRECT.ordinal()] = 1;
       ointArray[Proxy$Type.HTTP.ordinal()] = 2;
       mp5.a = ointArray;
    }
}
