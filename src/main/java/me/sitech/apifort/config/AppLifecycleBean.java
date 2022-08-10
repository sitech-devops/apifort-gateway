package me.sitech.apifort.config;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import me.sitech.apifort.utility.Util;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.security.cert.CertificateException;

@Slf4j
@ApplicationScoped
public class AppLifecycleBean {
    //TODO load Data to caching server
    void onStart(@Observes StartupEvent event) {}

    void onStop(@Observes ShutdownEvent event) {}
}