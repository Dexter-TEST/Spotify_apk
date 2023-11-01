package p.jj3;
import p.kj3;
import java.lang.Enum;

public abstract class jj3	// class@001ae9 from classes.dex
{
    public static final int[] a;

    static {
       int len = kj3.values().length;
       try{
          int[] ointArray = new int[len];
          ointArray[kj3.ON_CREATE.ordinal()] = 1;
          try{
             e0[kj3.ON_STOP.ordinal()] = 2;
             try{
                e0[kj3.ON_START.ordinal()] = 3;
                try{
                   e0[kj3.ON_PAUSE.ordinal()] = 4;
                   try{
                      e0[kj3.ON_RESUME.ordinal()] = 5;
                      try{
                         e0[kj3.ON_DESTROY.ordinal()] = 6;
                         try{
                            e0[kj3.ON_ANY.ordinal()] = 7;
                            jj3.a = e0;
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
