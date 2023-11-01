package com.spotify.connectivity.flags.Flag$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.connectivity.flags.Flag;
import p.co5;
import java.util.Map;
import java.lang.IllegalStateException;
import p.tp2;
import java.util.Set;

public final class Flag$Companion	// class@000706 from classes.dex
{

    private void Flag$Companion(){
       super();
    }
    public void Flag$Companion(DefaultConstructorMarker p0){
       super();
    }
    private static void getIdentifierSet$annotations(){
    }
    public final Flag getFlagForIdentifier(String p0){
       Flag uFlag;
       co5.o(p0, "identifier");
       if ((uFlag = Flag.access$getFlagIdentifiers$cp().get(p0)) != null) {
          return uFlag;
       }
       throw new IllegalStateException(tp2.m("Flag ", p0, " does not exist"));
    }
    public final void resetFlagIdentifiers(){
       Flag.access$getFlagIdentifiers$cp().clear();
       Flag.access$getIdentifierSet$cp().clear();
    }
}
