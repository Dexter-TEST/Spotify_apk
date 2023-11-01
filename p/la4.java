package p.la4;
import p.ka4;
import p.nf2;
import java.lang.String;

public final class la4 extends ka4	// class@001d16 from classes.dex
{
    public static final la4 c;

    static {
       la4.c = new la4();
    }
    public void la4(){
       super(11, 12);
    }
    public final void a(nf2 p0){
       p0.r("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
