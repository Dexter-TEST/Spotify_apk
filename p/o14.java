package p.o14;
import p.en6;
import p.x4;

public abstract class o14	// class@00208e from classes.dex
{
    public static final int[] a;
    public static final int[] b;

    static {
       int i = 7;
       int[] ointArray = new int[en6.H(i).length];
       try{
          int i1 = 1;
          ointArray[0] = i1;
          int i2 = 2;
          try{
             ointArray[i1] = i2;
             int i3 = 3;
             try{
                ointArray[i2] = i3;
                int i4 = 4;
                try{
                   ointArray[i3] = i4;
                   int i5 = 5;
                   try{
                      ointArray[i4] = i5;
                      i4 = 6;
                      try{
                         ointArray[i5] = i4;
                         try{
                            ointArray[i4] = e0;
                            o14.a = ointArray;
                            i = x4.values().length;
                            try{
                               int[] ointArray1 = new int[i];
                               ointArray1[0] = i1;
                               try{
                                  e0[i1] = i2;
                                  try{
                                     e0[i2] = i3;
                                     o14.b = e0;
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
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
