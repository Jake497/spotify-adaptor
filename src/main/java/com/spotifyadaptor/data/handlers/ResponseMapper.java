package com.spotifyadaptor.data.handlers;

import java.util.function.Function;

public interface ResponseMapper<T,Q> extends Function<T, Q> {

}
