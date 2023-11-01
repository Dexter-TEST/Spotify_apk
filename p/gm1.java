package p.gm1;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import p.ye7;

public abstract class gm1	// class@001735 from classes.dex
{
    public static final HashMap a;
    public static final HashMap b;
    public static final List c;
    public static final List d;

    static {
       gm1.a = new HashMap();
       gm1.b = new HashMap();
       Integer[] integerArray = new Integer[]{Integer.valueOf(R.font.circular_sp_bold),Integer.valueOf(R.font.circular_sp_title_bold),Integer.valueOf(R.font.circular_sp_title_tall_bold)};
       gm1.c = ye7.K(integerArray);
       integerArray = new Integer[]{Integer.valueOf(R.font.circular_sp_title_black),Integer.valueOf(R.font.circular_sp_title_tall_black)};
       gm1.d = ye7.K(integerArray);
    }
}
