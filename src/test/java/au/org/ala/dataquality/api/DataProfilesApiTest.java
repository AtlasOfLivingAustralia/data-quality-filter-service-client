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
 * API tests for DataProfilesApi
 */
public class DataProfilesApiTest {

    private DataProfilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DataProfilesApi.class);
    }

    /**
     * List all quality profiles
     *
     * 
     */
    @Test
    public void dataProfilesTest() {
        Integer max = null;
        Integer offset = null;
        String sort = null;
        String order = null;
        Boolean enabled = null;
        String name = null;
        String shortName = null;
        // List<QualityProfile> response = api.dataProfiles(max, offset, sort, order, enabled, name, shortName);

        // TODO: test validations
    }
    /**
     * Retrieve a single quality profile
     *
     * 
     */
    @Test
    public void dataProfilesIdTest() {
        String id = null;
        // List<QualityProfile> response = api.dataProfilesId(id);

        // TODO: test validations
    }
}
