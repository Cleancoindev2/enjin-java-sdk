package com.enjin.enjincoin.sdk.model.service.requests.data;

import lombok.Builder;

/**
 * A data model that defines the the type of token and how much is offered
 * in a Create Trade request.
 *
 * @author Evan Lindsay
 * @see CreateTradeData
 * @see com.enjin.enjincoin.sdk.service.requests.RequestsService
 */
@Builder
public class TokenValueData {

    /**
     * The token id.
     *
     * -- SETTER --
     *
     * @param id the token id.
     * @return the builder.
     */
    private String id;

    /**
     * The token index.
     *
     * -- SETTER --
     *
     * @param index the token index.
     * @return the builder.
     */
    private Integer index;

    /**
     * The amount of the token.
     *
     * -- SETTER --
     *
     * @param value the amount.
     * @return the builder.
     */
    private Integer value;

}
