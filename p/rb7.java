package p.rb7;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class rb7 extends Enum	// class@0024b7 from classes.dex
{
    private final int value;
    private static final rb7[] $VALUES;
    public static final rb7 a;
    public static final rb7 b;
    public static final rb7 c;

    static {
       rb7 orb7 = new rb7("SUCCESS", 0, 1);
       rb7.a = orb7;
       rb7 orb71 = new rb7("ERROR", 1, 2);
       rb7.b = orb71;
       rb7 orb72 = new rb7("RESULT_NOT_SET", 2, 0);
       rb7.c = orb72;
       rb7[] orb7Array = new rb7[]{orb7,orb71,orb72};
       rb7.$VALUES = orb7Array;
    }
    public void rb7(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static rb7 valueOf(String p0){
       return Enum.valueOf(rb7.class, p0);
    }
    public static rb7[] values(){
       return rb7.$VALUES.clone();
    }
}
