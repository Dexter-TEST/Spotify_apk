package com.spotify.cosmos.cosmonaut.annotations.Path;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract Path implements Annotation	// class@00088b from classes.dex
{

    boolean encoded();
    String value();
}
