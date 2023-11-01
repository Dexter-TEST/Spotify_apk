package p.q42;
import java.lang.String;
import java.lang.Character;
import java.io.File;

public abstract class q42	// class@00030a from classes2.dex
{
    public static final char a;

    static {
       Character.toString('.');
       q42.a = File.separatorChar;
    }
}
