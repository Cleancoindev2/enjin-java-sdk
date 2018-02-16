package io.enjincoin.sdk.client.vo.transactionrequest;

import com.google.gson.annotations.SerializedName;
import org.immutables.gson.Gson;
import org.immutables.value.Value;

import java.util.Map;
import java.util.Optional;

/**
 * <p>
 * Get Transaction Response class.
 * </p>
 */
@Value.Immutable
@Gson.TypeAdapters
public abstract class GetTransactionRequestResponseVO {

    /**
     * Method to get the txrId.
     *
     * @return Optional
     */
    @SerializedName("txr_id")
    public abstract Optional<String> getTxrId();

    /**
     * Method to get the identityMap.
     *
     * @return Optional
     */
    @SerializedName("identity")
    public abstract Optional<Map<String, Object>> getIdentityMap();

    /**
     * Method to get the recipientMap.
     *
     * @return Optional
     */
    @SerializedName("recipient")
    public abstract Optional<Map<String, Object>> getRecipientMap();

    /**
     * Method to get the type.
     *
     * @return Optional
     */
    @SerializedName("type")
    public abstract Optional<String> getType();

    /**
     * Method to get the icon.
     *
     * @return Optional
     */
    @SerializedName("icon")
    public abstract Optional<String> getIcon();

    /**
     * Method to get the title.
     *
     * @return Optional
     */
    @SerializedName("title")
    public abstract Optional<String> getTitle();

    /**
     * Method to get the valueMap.
     *
     * @return Optional
     */
    @SerializedName("value")
    public abstract Optional<Map<String, Object>> getValueMap();

    /**
     * Method to get the state.
     *
     * @return Optional
     */
    @SerializedName("state")
    public abstract Optional<String> getState();

    /**
     * Class toString method.
     */
    @Override
    public String toString() {
        return "GetTransactionRequestResponseVO [txrId=" + this.getTxrId().orElse(null) + ", identityMap=" + this.getIdentityMap().orElse(null) + ", recipientMap="
                + this.getRecipientMap().orElse(null) + ", type=" + this.getType().orElse(null) + ", icon=" + this.getIcon().orElse(null) + ", title="
                + this.getTitle().orElse(null) + ", valueMap=" + this.getValueMap().orElse(null) + ", state=" + this.getState().orElse(null) + "]";
    }

}
