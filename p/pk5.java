package p.pk5;
import java.lang.String;
import java.util.regex.Pattern;

public abstract class pk5	// class@00227d from classes.dex
{
    public static final Pattern a;

    static {
       pk5.a = Pattern.compile("\\s*\(\\p{XDigit}+\)-\\s*\(\\p{XDigit}+\)\\s+\(.{4}\)\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+\(.*\)");
    }
}
