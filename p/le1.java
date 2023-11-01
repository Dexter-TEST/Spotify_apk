package p.le1;
import java.lang.String;
import java.lang.Class;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public abstract class le1	// class@001d37 from classes.dex
{
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    static {
       Method method;
       Field uField;
       Field uField1;
       Field uField2;
       Field uField3;
       int i1;
       int i = 0;
       try{
          Class uClass = Class.forName("android.graphics.Insets");
          Class[] uClassArray = new Class[i];
          method = Drawable.class.getMethod("getOpticalInsets", uClassArray);
          try{
             uField = uClass.getField("left");
             try{
                uField1 = uClass.getField("top");
                try{
                   uField2 = uClass.getField("right");
                   try{
                      uField3 = uClass.getField("bottom");
                      i1 = 1;
                   label_0055 :
                      if (i1) {
                         le1.b = method;
                         le1.c = uField;
                         le1.d = uField1;
                         le1.e = uField2;
                         le1.f = uField3;
                         le1.a = e0;
                      }else {
                         le1.b = null;
                         le1.c = null;
                         le1.d = null;
                         le1.e = null;
                         le1.f = null;
                         le1.a = i;
                      }
                   }catch(java.lang.NoSuchMethodException e0){
                   }catch(java.lang.ClassNotFoundException e0){
                   }catch(java.lang.NoSuchFieldException e0){
                   }
                }catch(java.lang.NoSuchMethodException e0){
                   uField2 = null;
                label_0053 :
                   uField3 = null;
                   i1 = 0;
                   goto label_0055 ;
                }catch(java.lang.ClassNotFoundException e0){
                }catch(java.lang.NoSuchFieldException e0){
                }
             }catch(java.lang.NoSuchMethodException e0){
                uField1 = null;
             }catch(java.lang.ClassNotFoundException e0){
                uField1 = null;
             }catch(java.lang.NoSuchFieldException e0){
                uField1 = null;
             }
          label_0052 :
             uField2 = uField1;
             goto label_0053 ;
          }catch(java.lang.NoSuchMethodException e0){
             uField = null;
          }catch(java.lang.ClassNotFoundException e0){
             uField = null;
          }catch(java.lang.NoSuchFieldException e0){
             uField = null;
          }
          uField1 = uField;
          goto label_0052 ;
       }catch(java.lang.NoSuchMethodException e0){
          method = null;
          uField = method;
       }catch(java.lang.ClassNotFoundException e0){
          method = null;
          uField = method;
       }catch(java.lang.NoSuchFieldException e0){
          method = null;
          uField = method;
       }
    }
}
