package com.enjin.enjincoin.sdk.service.identities;

import com.enjin.enjincoin.sdk.http.HttpResponse;
import com.enjin.enjincoin.sdk.graphql.GraphQLResponse;
import com.enjin.enjincoin.sdk.model.service.identities.CreateIdentity;
import com.enjin.enjincoin.sdk.model.service.identities.DeleteIdentity;
import com.enjin.enjincoin.sdk.model.service.identities.GetIdentities;
import com.enjin.enjincoin.sdk.model.service.identities.Identity;
import com.enjin.enjincoin.sdk.model.service.identities.UpdateIdentity;

import java.io.IOException;
import java.util.List;

/**
 * Synchronous methods for querying and mutating app identities.
 *
 * @author Evan Lindsay
 */
public interface SynchronousIdentitiesService {

    /**
     * Gets identities of an app that match the query parameters.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<List<Identity>>> getIdentitiesSync(GetIdentities query) throws IOException;

    /**
     * Creates a new identity.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<Identity>> createIdentitySync(CreateIdentity query) throws IOException;

    /**
     * Deletes or unlinks an identity.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<Identity>> deleteIdentitySync(DeleteIdentity query) throws IOException;

    /**
     * Updates an identity.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<Identity>> updateIdentitySync(UpdateIdentity query) throws IOException;

}
