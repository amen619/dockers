#!/usr/bin/env groovy

println("--> Configuring Locale")
def pluginWrapper = jenkins.model.Jenkins.instance.getPluginManager().getPlugin('locale')
def plugin = pluginWrapper.getPlugin()
plugin.setSystemLocale('en_EN')
plugin.@ignoreAcceptLanguage=true
