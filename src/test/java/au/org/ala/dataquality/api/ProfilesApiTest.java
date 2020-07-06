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
        // List<QualityProfile> response = api.profiles(max);

        // TODO: test validations
    }
    /**
     * List all quality profiles
     *
     * 
     */
    @Test
    public void profilesIdTest() {
        String id = null;
        Integer max = null;
        // List<QualityProfile> response = api.profilesId(id, max);

        // TODO: test validations
    }
}
