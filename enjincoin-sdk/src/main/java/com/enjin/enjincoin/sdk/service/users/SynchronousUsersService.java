package com.enjin.enjincoin.sdk.service.users;

import com.enjin.enjincoin.sdk.http.HttpResponse;
import com.enjin.enjincoin.sdk.graphql.GraphQLResponse;
import com.enjin.enjincoin.sdk.model.service.users.CreateUser;
import com.enjin.enjincoin.sdk.model.service.users.DeleteUser;
import com.enjin.enjincoin.sdk.model.service.users.GetUsers;
import com.enjin.enjincoin.sdk.model.service.users.AuthUser;
import com.enjin.enjincoin.sdk.model.service.users.UpdateUser;
import com.enjin.enjincoin.sdk.model.service.users.User;

import java.io.IOException;
import java.util.List;

public interface SynchronousUsersService {

    /**
     * Gets users that match the query parameters.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<List<User>>> getUsersSync(GetUsers query) throws IOException;

    /**
     * Creates a new user.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<User>> createUserSync(CreateUser query) throws IOException;

    HttpResponse<GraphQLResponse<User>> updateUserSync(UpdateUser query) throws IOException;

    HttpResponse<GraphQLResponse<User>> deleteUserSync(DeleteUser query) throws IOException;

    /**
     * Authenticates a user and returns the users access tokens.
     *
     * @param query the query.
     *
     * @return the response.
     *
     * @throws IOException if a communication error occurred.
     */
    HttpResponse<GraphQLResponse<User>> authUserSync(AuthUser query) throws IOException;

}
