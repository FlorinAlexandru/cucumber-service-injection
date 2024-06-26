package org.example.cucumberseviceinjection;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.springframework.stereotype.Component;

@Component
public class CucumberTestRunner {

    public void run() {
        var request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectClasspathResource("features"))
                .configurationParameter("cucumber.glue", "org.example.glue")
                .configurationParameter("cucumber.plugin", "pretty")
                .build();
        var initialLauncher = LauncherFactory.create();
        initialLauncher.execute(request);
    }
}
