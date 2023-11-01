package p.ta4;
import p.ka4;
import p.nf2;
import java.lang.String;

public final class ta4 extends ka4	// class@002731 from classes.dex
{
    public static final ta4 c;

    static {
       ta4.c = new ta4();
    }
    public void ta4(){
       super(8, 9);
    }
    public final void a(nf2 p0){
       p0.r("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
