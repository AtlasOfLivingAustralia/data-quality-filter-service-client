package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.model.QualityFilter;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FiltersApi
 */
public class FiltersApiTest {

    private FiltersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FiltersApi.class);
    }

    /**
     * List all quality filters
     *
     * 
     */
    @Test
    public void filtersTest() {
        String profileId = null;
        String categoryId = null;
        Integer max = null;
        // List<QualityFilter> response = api.filters(profileId, categoryId, max);

        // TODO: test validations
    }
    /**
     * Retrieve a single quality filter
     *
     * 
     */
    @Test
    public void filtersIdTest() {
        String profileId = null;
        String categoryId = null;
        Integer id = null;
        // List<QualityFilter> response = api.filtersId(profileId, categoryId, id);

        // TODO: test validations
    }
}
