package com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime$Companion;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime$Companion$UNRESOLVED$1;

public interface abstract Lifetime	// class@00056b from classes.dex
{
    public static final Lifetime$Companion Companion;
    public static final Lifetime UNRESOLVED;

    static {
       Lifetime.Companion = Lifetime$Companion.$$INSTANCE;
       Lifetime.UNRESOLVED = new Lifetime$Companion$UNRESOLVED$1();
    }
    void release();
}
