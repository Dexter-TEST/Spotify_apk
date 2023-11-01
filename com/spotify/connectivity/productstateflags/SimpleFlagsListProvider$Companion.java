package com.spotify.connectivity.productstateflags.SimpleFlagsListProvider$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import java.util.Iterator;
import com.spotify.connectivity.productstateflags.FlagsListProvider;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.flags.Flag;
import java.lang.reflect.AccessibleObject;
import com.spotify.connectivity.flags.Source;
import java.lang.IllegalArgumentException;
import java.lang.AssertionError;

public final class SimpleFlagsListProvider$Companion	// class@000808 from classes.dex
{

    private void SimpleFlagsListProvider$Companion(){
       super();
    }
    public void SimpleFlagsListProvider$Companion(DefaultConstructorMarker p0){
       super();
    }
    public static final void access$populateSourceLists(SimpleFlagsListProvider$Companion p0,List p1,List p2,List p3){
       p0.populateSourceLists(p1, p2, p3);
    }
    private final void populateSourceLists(List p0,List p1,List p2){
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Field[] declaredFiel = iterator.next().getClass().getDeclaredFields();
          try{
             co5.l(declaredFiel, "declaredFields");
             int len = declaredFiel.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject = declaredFiel[i];
                   if (Flag.class.isAssignableFrom(oobject.getType())) {
                      if (!oobject.isAccessible()) {
                         oobject.setAccessible(true);
                      }
                      Object obj = oobject.get(null);
                      co5.j(obj, "null cannot be cast to non-null type com.spotify.connectivity.flags.Flag<*>");
                      if (co5.c("product-state", obj.getSource().getSourceType())) {
                         p1.add(obj);
                         p2.add(obj);
                      }else {
                         break ;
                      }
                   }
                   i = i + 1;
                }else {
                   continue ;
                }
             }
             throw new IllegalArgumentException("Failed requirement.".toString());
          }catch(java.lang.IllegalAccessException e7){
             throw new AssertionError(e7);
          }
       }
    }
}
