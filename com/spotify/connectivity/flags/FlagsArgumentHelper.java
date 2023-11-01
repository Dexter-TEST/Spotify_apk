package com.spotify.connectivity.flags.FlagsArgumentHelper;
import java.lang.Object;
import android.content.Intent;
import com.spotify.connectivity.flags.Flags;
import java.lang.String;
import p.co5;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.app.Activity;
import p.jl;
import java.lang.StringBuilder;
import android.os.BaseBundle;
import java.lang.IllegalStateException;

public final class FlagsArgumentHelper	// class@00070b from classes.dex
{
    private static final String FLAGS = "FlagsArgumentHelper.Flags";
    public static final FlagsArgumentHelper INSTANCE;

    static {
       FlagsArgumentHelper.INSTANCE = new FlagsArgumentHelper();
    }
    private void FlagsArgumentHelper(){
       super();
    }
    public static final void addFlagsArgument(Intent p0,Flags p1){
       co5.o(p0, "intent");
       co5.o(p1, "flags");
       p0.putExtra("FlagsArgumentHelper.Flags", p1);
    }
    public static final void addFlagsArgument(Fragment p0,Flags p1){
       Bundle arguments;
       co5.o(p0, "fragment");
       co5.o(p1, "flags");
       if ((arguments = p0.getArguments()) == null) {
          arguments = new Bundle();
          p0.setArguments(arguments);
       }
       arguments.putParcelable("FlagsArgumentHelper.Flags", p1);
       return;
    }
    public static final void addFlagsFromOnSaveInstanceState(Bundle p0,Flags p1){
       co5.o(p0, "bundle");
       p0.putParcelable("FlagsArgumentHelper.Flags", p1);
    }
    public static final void addFlagsToBundle(Bundle p0,Flags p1){
       co5.o(p0, "bundle");
       co5.o(p1, "flags");
       p0.putParcelable("FlagsArgumentHelper.Flags", p1);
    }
    public static final Flags getFlags(Activity p0){
       co5.o(p0, "activity");
       jl.b(p0);
       Intent intent = p0.getIntent();
       jl.c(intent, "The activity must have an Intent");
       co5.l(intent, "intent");
       return FlagsArgumentHelper.getFlags(intent);
    }
    public static final Flags getFlags(Intent p0){
       co5.o(p0, "intent");
       jl.c(p0, "The Intent must not be null");
       Flags parcelableEx = p0.getParcelableExtra("FlagsArgumentHelper.Flags");
       jl.c(parcelableEx, "The Intent must have a Flags argument. Actual intent: "+p0);
       co5.i(parcelableEx);
       return parcelableEx;
    }
    public static final Flags getFlags(Bundle p0){
       jl.b(p0);
       co5.i(p0);
       jl.g("The Bundle must have a Flags argument", p0.containsKey("FlagsArgumentHelper.Flags"));
       return p0.getParcelable("FlagsArgumentHelper.Flags");
    }
    public static final Flags getFlags(Fragment p0){
       co5.o(p0, "fragment");
       jl.b(p0);
       Bundle arguments = p0.getArguments();
       jl.c(arguments, "The Fragment must have an argument Bundle");
       Flags flags = FlagsArgumentHelper.getFlags(arguments);
       jl.c(flags, "The Fragment must have a Flags argument");
       if (flags != null) {
          return flags;
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public static final Flags getFlagsIfPresent(Fragment p0){
       Bundle arguments;
       co5.o(p0, "fragment");
       jl.b(p0);
       Flags parcelable = ((arguments = p0.getArguments()) != null && arguments.containsKey("FlagsArgumentHelper.Flags"))? arguments.getParcelable("FlagsArgumentHelper.Flags"): null;
       return parcelable;
    }
    public static final void updateFlagsIfNecessary(Fragment p0,Flags p1){
       Bundle arguments;
       co5.o(p0, "fragment");
       if ((arguments = p0.getArguments()) != null && arguments.containsKey("FlagsArgumentHelper.Flags")) {
          arguments.putParcelable("FlagsArgumentHelper.Flags", p1);
       }
       return;
    }
    public final boolean hasFlags(Intent p0){
       co5.o(p0, "intent");
       return p0.hasExtra("FlagsArgumentHelper.Flags");
    }
}
