package p.fb3;
import java.math.RoundingMode;
import java.lang.Enum;

public abstract class fb3	// class@001595 from classes.dex
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RoundingMode.values().length];
       try{
          fb3.a = ointArray;
          ointArray[RoundingMode.UNNECESSARY.ordinal()] = 1;
          try{
             fb3.a[RoundingMode.DOWN.ordinal()] = 2;
             try{
                fb3.a[RoundingMode.FLOOR.ordinal()] = 3;
                try{
                   fb3.a[RoundingMode.UP.ordinal()] = 4;
                   try{
                      fb3.a[RoundingMode.CEILING.ordinal()] = 5;
                      try{
                         fb3.a[RoundingMode.HALF_DOWN.ordinal()] = 6;
                         try{
                            fb3.a[RoundingMode.HALF_UP.ordinal()] = 7;
                            try{
                               fb3.a[RoundingMode.HALF_EVEN.ordinal()] = 8;
                            }catch(java.lang.NoSuchFieldError e0){
                            }
                         }catch(java.lang.NoSuchFieldError e0){
                         }
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
