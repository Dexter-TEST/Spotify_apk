package p.ab4;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Object;
import java.util.Arrays;

public final class ab4 extends RuntimeException	// class@000f4d from classes.dex
{

    public void ab4(String p0,String[] p1,String[] p2){
       super(en6.p(en6.t("Could not find \'", p0, "\'. Looked for: ")+Arrays.toString(p1)+", but only found: ", Arrays.toString(p2), "."));
    }
}
