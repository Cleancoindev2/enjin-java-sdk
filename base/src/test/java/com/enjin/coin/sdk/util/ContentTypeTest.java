package com.enjin.coin.sdk.util;

import com.enjin.coin.sdk.util.http.ContentType;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ContentTypeTest {

    @Test
    public void testConstructor() {
        ContentType contentType = new ContentType();
        assertThat(contentType).isNotNull();
    }

}
