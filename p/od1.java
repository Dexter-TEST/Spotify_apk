package p.od1;
import p.xe7;
import java.lang.CharSequence;
import java.lang.String;
import java.util.regex.Pattern;

public abstract class od1 extends xe7	// class@0020f8 from classes.dex
{
    public static final int F;

    static {
       Pattern.compile("[+-]?\(?:NaN|Infinity|\(?:\\d+#\(?:\\.\\d*#\)?|\\.\\d+#\)\(?:[eE][+-]?\\d+#\)?[fFdD]?|0[xX]\(?:[0-9a-fA-F]+#\(?:\\.[0-9a-fA-F]*#\)?|\\.[0-9a-fA-F]+#\)[pP][+-]?\\d+#[fFdD]?\)".replace("#", "+"));
    }
}
