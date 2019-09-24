package com.enjin.enjincoin.sdk.serialization.converter;

import com.enjin.enjincoin.sdk.serialization.Json;
import com.google.gson.Gson;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * A converter factory for {@link DelegateToStringConverter}.
 */
public class JsonStringConverter extends Converter.Factory {

    private final Converter.Factory delegate;

    /**
     * Creates a new factory instance.
     *
     * @param delegate the delegate converter factory.
     */
    protected JsonStringConverter(Converter.Factory delegate) {
        this.delegate = delegate;
    }

    @Override
    public Converter<?, String> stringConverter(Type type,
                                                Annotation[] annotations,
                                                Retrofit retrofit) {
        for (Annotation annotation : annotations) {
            if (annotation instanceof Json) {
                final Converter<?, RequestBody> converter =
                        this.delegate.requestBodyConverter(type, annotations, new Annotation[0], retrofit);
                return new DelegateToStringConverter<>(converter);
            }
        }
        return null;
    }

    /**
     * Converts an object to json.
     *
     * @param <T> the type of the object being converted.
     */
    public static class DelegateToStringConverter<T> implements Converter<T, String> {

        private final Converter<T, RequestBody> delegate;

        /**
         * Creates a new converter instance.
         *
         * @param delegate the delegate converter.
         */
        public DelegateToStringConverter(Converter<T, RequestBody> delegate) {
            this.delegate = delegate;
        }

        @Override
        public String convert(T value) throws IOException {
            Buffer buffer = new Buffer();
            this.delegate.convert(value).writeTo(buffer);
            return buffer.readUtf8();
        }
    }

    public static JsonStringConverter create(Converter.Factory delegate) {
        return new JsonStringConverter(delegate);
    }
}
