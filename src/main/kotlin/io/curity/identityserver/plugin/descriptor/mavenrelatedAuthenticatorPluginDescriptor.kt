package io.curity.identityserver.plugin.descriptor

import io.curity.identityserver.plugin.authentication.mavenrelatedAuthenticatorRequestHandler
import io.curity.identityserver.plugin.config.mavenrelatedAuthenticatorPluginConfig
import se.curity.identityserver.sdk.authentication.AuthenticatorRequestHandler
import se.curity.identityserver.sdk.plugin.descriptor.AuthenticatorPluginDescriptor

class mavenrelatedAuthenticatorPluginDescriptor : AuthenticatorPluginDescriptor<mavenrelatedAuthenticatorPluginConfig>
{
    override fun getAuthenticationRequestHandlerTypes(): Map<String, Class<out AuthenticatorRequestHandler<*>>> =
            mapOf("index" to mavenrelatedAuthenticatorRequestHandler::class.java)
    
    override fun getConfigurationType(): Class<out mavenrelatedAuthenticatorPluginConfig> =
        mavenrelatedAuthenticatorPluginConfig::class.java
    
    override fun getPluginImplementationType(): String = "mavenrelated"
}