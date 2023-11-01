package p.yt1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class yt1 extends Enum	// class@002e20 from classes.dex
{
    public static final yt1[] a;

    static {
       yt1[] oyt1Array = new yt1[]{new yt1("CLICK", 0),new yt1("SELECTED", 1),new yt1("TEXT_CHANGED", 2)};
       yt1.a = oyt1Array;
    }
    public void yt1(String p0,int p1){
       super(p0, p1);
    }
    public static yt1 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(yt1.class, p0);
    }
    public static yt1[] values(){
       return Arrays.copyOf(yt1.a, 3);
    }
}
