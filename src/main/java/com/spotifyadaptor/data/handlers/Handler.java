package com.spotifyadaptor.data.handlers;

public interface Handler <Q,S>{

    S handle(Q request);
}
