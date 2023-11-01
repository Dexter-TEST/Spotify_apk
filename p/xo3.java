package p.xo3;
import p.kj3;
import java.lang.Enum;

public abstract class xo3	// class@002cb8 from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[kj3.values().length];
       try{
          xo3.a = ointArray;
          ointArray[kj3.ON_START.ordinal()] = 1;
          try{
             xo3.a[kj3.ON_STOP.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
