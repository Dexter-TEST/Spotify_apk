package p.q;
import p.en6;
import android.widget.ImageView$ScaleType;
import java.lang.Enum;

public abstract class q	// class@00235e from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[en6.H(4).length];
       ointArray[0] = 1;
       ointArray[1] = 2;
       ointArray[2] = 3;
       ointArray[3] = 4;
       ointArray = new int[ImageView$ScaleType.values().length];
       ointArray[ImageView$ScaleType.FIT_START.ordinal()] = 1;
       ointArray[ImageView$ScaleType.FIT_CENTER.ordinal()] = 2;
       ointArray[ImageView$ScaleType.FIT_END.ordinal()] = 3;
       ointArray[ImageView$ScaleType.CENTER_INSIDE.ordinal()] = 4;
       q.a = ointArray;
       int[] ointArray1 = new int[en6.H(2).length];
       ointArray1[0] = 1;
       ointArray1[1] = 2;
    }
}
