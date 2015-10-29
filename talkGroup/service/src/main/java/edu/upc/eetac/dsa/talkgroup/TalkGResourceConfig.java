package edu.upc.eetac.dsa.talkgroup;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

/**
 * Created by SergioGM on 27.10.15.
 */
public class TalkGResourceConfig extends ResourceConfig{
    public TalkGResourceConfig() {
        packages("edu.upc.eetac.dsa.talkgroup");
        packages("edu.upc.eetac.dsa.beeter.auth");
        register(RolesAllowedDynamicFeature.class);
    }
}
