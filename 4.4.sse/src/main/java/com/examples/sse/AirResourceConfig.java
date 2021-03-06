package com.examples.sse;

import org.glassfish.jersey.media.sse.SseFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/event/*")
public class AirResourceConfig extends ResourceConfig {

    public AirResourceConfig() {
        super(SseFeature.class, // 開啓sse 功能
              AirSsePubSubResource.class, 
              AirSseBroadcastResource.class);
    }
}