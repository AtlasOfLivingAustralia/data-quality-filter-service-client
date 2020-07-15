package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.model.QualityProfile;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfilesApi
 */
public class ProfilesApiTest {

    private ProfilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProfilesApi.class);
    }

    /**
     * List all quality profiles
     *
     * 
     */
    @Test
    public void profilesTest() {
        Integer max = null;
        Integer offset = null;
        String sort = null;
        String desc = null;
        Boolean enabled = null;
        String name = null;
        String shortName = null;
        // List<QualityProfile> response = api.profiles(max, offset, sort, desc, enabled, name, shortName);

        // TODO: test validations
    }
    /**
     * Retrieve a single quality profile
     *
     * 
     */
    @Test
    public void profilesIdTest() {
        String id = null;
        // List<QualityProfile> response = api.profilesId(id);

        // TODO: test validations
    }
}
