package com.enjin.enjincoin.sdk.model.service.requests.data;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;

/**
 * A data model for the Decrease Max Transfer Fee request type.
 *
 * @author Evan Lindsay
 * @see com.enjin.enjincoin.sdk.service.requests.RequestsService
 */
@Builder
public class DecreaseMaxTransferFeeData {

    /**
     * The token id.
     *
     * -- SETTER --
     *
     * @param tokenId the token id.
     * @return the builder.
     */
    @SerializedName("token_id")
    private String tokenId;

    /**
     * The token index.
     *
     * -- SETTER --
     *
     * @param tokenIndex the token index.
     * @return the builder.
     */
    @SerializedName("token_index")
    private String tokenIndex;

    /**
     * The new max transfer fee.
     *
     * -- SETTER --
     *
     * @param maxTransferFee the new fee amount.
     * @return the builder.
     */
    private String maxTransferFee;

}
