package p.hn0;
import java.lang.RuntimeException;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Collection;
import java.util.Set;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.util.Arrays;
import p.gn0;
import java.lang.Character;
import java.lang.StackTraceElement;
import java.lang.Integer;
import java.lang.System;
import java.util.IdentityHashMap;
import java.lang.Class;
import java.lang.CharSequence;
import java.lang.Boolean;
import p.cd2;
import java.io.PrintStream;
import java.io.PrintWriter;

public final class hn0 extends RuntimeException	// class@001883 from classes.dex
{
    public final List a;
    public final String b;
    public Throwable c;

    public void hn0(List p0){
       Iterator iterator;
       super();
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       if (p0 != null) {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             Throwable throwable = iterator.next();
             if (throwable instanceof hn0) {
                linkedHashSe.addAll(throwable.a);
             }else if(throwable != null){
                linkedHashSe.add(throwable);
             }else {
                linkedHashSe.add(new NullPointerException("Throwable was null!"));
             }
          }
       }else {
          linkedHashSe.add(new NullPointerException("errors was null"));
       }
       if (!linkedHashSe.isEmpty()) {
          iterator = Collections.unmodifiableList(new ArrayList(linkedHashSe));
          this.a = iterator;
          this.b = iterator.size()+" exceptions occurred. ";
          return;
       }else {
          throw new IllegalArgumentException("errors is empty");
       }
    }
    public void hn0(Throwable[] p0){
       super(Arrays.asList(p0));
    }
    public static void a(gn0 p0,Throwable p1,String p2){
       p0.p(p2);
       p0.p(p1);
       Character uCharacter = Character.valueOf(10);
       p0.p(uCharacter);
       StackTraceElement[] stackTrace = p1.getStackTrace();
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          p0.p("\t\tat ");
          p0.p(stackTrace[i]);
          p0.p(uCharacter);
       }
       if (p1.getCause() != null) {
          p0.p("\tCaused by: ");
          hn0.a(p0, p1.getCause(), "");
       }
       return;
    }
    public final void b(gn0 p0){
       p0.p(this);
       p0.p("\n");
       StackTraceElement[] stackTrace = this.getStackTrace();
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          p0.p("\tat ");
          p0.p(stackTrace[i]);
          p0.p("\n");
       }
       Iterator iterator = this.a.iterator();
       i = 1;
       while (iterator.hasNext()) {
          p0.p("  ComposedException ");
          p0.p(Integer.valueOf(i));
          p0.p(" :\n");
          hn0.a(p0, iterator.next(), "\t");
          i = i + 1;
       }
       p0.p("\n");
       return;
    }
    public synchronized final Throwable getCause(){
       String message;
       int len;
       if (this.c == null) {
          String property = System.getProperty("line.separator");
          if (this.a.size() > 1) {
             IdentityHashMap identityHash = new IdentityHashMap();
             StringBuilder str = "Multiple exceptions \("+this.a.size()+"\)"+property;
             Iterator iterator = this.a.iterator();
             while (iterator.hasNext()) {
                Throwable throwable = iterator.next();
                int i = 0;
                while (throwable != null) {
                   for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                      str = str.append("  ");
                   }
                   str = str.append("|-- ").append(throwable.getClass().getCanonicalName()).append(": ");
                   if ((message = throwable.getMessage()) != null && message.contains(property)) {
                      str = str.append(property);
                      String[] stringArray = message.split(property);
                      len = stringArray.length;
                      for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                         object oobject = stringArray[i2];
                         int i3 = 0;
                         while (true) {
                            int i4 = i + 2;
                            if (i3 < i4) {
                               str = str.append("  ");
                               i3 = i3 + 1;
                            }else {
                               break ;
                            }
                         }
                         str = str.append(oobject).append(property);
                      }
                   }else {
                      str = str.append(message).append(property);
                   }
                   i1 = 0;
                   while (true) {
                      len = i + 2;
                      if (i1 < len) {
                         str = str.append("  ");
                         i1 = i1 + 1;
                      }else {
                         break ;
                      }
                   }
                   StackTraceElement[] stackTrace = throwable.getStackTrace();
                   if (stackTrace.length > 0) {
                      str = str.append("at ").append(stackTrace[0]).append(property);
                   }
                   if (!identityHash.containsKey(throwable)) {
                      identityHash.put(throwable, Boolean.TRUE);
                      throwable = throwable.getCause();
                      i = i + 1;
                   }else if((throwable = throwable.getCause()) != null){
                      for (i = 0; i < len; i = i + 1) {
                         str = str.append("  ");
                      }
                      str = str.append("|-- ").append("\(cause not expanded again\) ").append(throwable.getClass().getCanonicalName()).append(": ").append(throwable.getMessage()).append(property);
                   }else {
                      continue ;
                   }
                }
             }
             this.c = new cd2(str.trim(), 8);
          }else {
             this.c = this.a.get(0);
          }
       }
       return this.c;
    }
    public final String getMessage(){
       return this.b;
    }
    public final void printStackTrace(){
       this.printStackTrace(System.err);
    }
    public final void printStackTrace(PrintStream p0){
       this.b(new gn0(0, p0));
    }
    public final void printStackTrace(PrintWriter p0){
       this.b(new gn0(1, p0));
    }
}
