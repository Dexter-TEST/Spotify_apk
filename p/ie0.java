package p.ie0;
import p.ge0;
import java.lang.Integer;
import java.lang.String;

public final class ie0 extends ge0	// class@001975 from classes.dex
{
    public static final int D;
    public static final ie0 E;

    static {
       ie0.D = Integer.numberOfLeadingZeros(31);
       ie0.E = new ie0();
    }
    public void ie0(){
       super("CharMatcher.whitespace\(\)");
    }
    public final boolean E(char p0){
       boolean b = ("\x20\x02\x30\x02\r\x85\x20\x02\x20\x02\x20\x02\x30\x02\x20\x02\x0b\x30\x02\x20\x02\x20\x02\x20\x02\x30\x02\x16\x02\t \x20\x02\x20\x02\x20\x02\xa0\f\x20\x02\x30\x02\x20\x02\x30\x02\x30\x02\x20\x02\n\x20\x02\x30\x02".charAt(((0x6449bf0a * p0) >> ie0.D)) == p0)? true: false;
       return b;
    }
}
