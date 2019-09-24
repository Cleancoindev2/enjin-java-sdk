package com.enjin.enjincoin.sdk.graphql;

import com.enjin.testing.utils.RuntimeUtils;
import org.junit.Test;
import static com.google.common.truth.Truth.*;

public class GraphQLProcessorTest {

    @Test
    public void getInstance_returnsInstance() {
        assertThat(GraphQLProcessor.getInstance()).isNotNull();
    }

    @Test
    @GraphQuery("GetBalances")
    public void getTemplate_returnsRegisteredTemplate() {
        GraphQLProcessor processor = GraphQLProcessor.getInstance();
        assertThat(processor.getTemplate(RuntimeUtils.getCurrentMethod().getDeclaredAnnotations()))
                .isNotNull();
    }

    @Test
    @GraphQuery("DoesNotExist")
    public void getTemplate_returnsNullTemplate() {
        GraphQLProcessor processor = GraphQLProcessor.getInstance();
        assertThat(processor.getTemplate(RuntimeUtils.getCurrentMethod().getDeclaredAnnotations()))
                .isNull();
    }

    @Test
    public void getTemplate_noAnnotation() {
        GraphQLProcessor processor = GraphQLProcessor.getInstance();
        assertThat(processor.getTemplate(RuntimeUtils.getCurrentMethod().getDeclaredAnnotations()))
                .isNull();
    }

}
