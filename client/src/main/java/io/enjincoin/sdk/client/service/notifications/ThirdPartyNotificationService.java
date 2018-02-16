package io.enjincoin.sdk.client.service.notifications;

import io.enjincoin.sdk.client.vo.platform.GetPlatformAuthDetailsResponseVO;

import java.util.List;

/**
 * <p>Interface for any third party notification systems such as pusher.</p>
 */
public interface ThirdPartyNotificationService {

    /**
     * Method to initialize the notification service.
     *
     * @param getPlatformAuthDetailsResponseVO notification details config
     *
     * @return boolean
     */
    boolean initializeNotificationService(GetPlatformAuthDetailsResponseVO getPlatformAuthDetailsResponseVO);

    /**
     * Method to set the notification listeners.
     *
     * @param notificationListeners the new list of listeners to set
     */
    void setNotificationListeners(List<NotificationListenerRegistration> notificationListeners);
}
