package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.model.QualityCategory;
import au.org.ala.dataquality.model.QualityProfile;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
public class CategoriesApiTest {

    private CategoriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CategoriesApi.class);
    }

    /**
     * List all quality categories
     *
     * 
     */
    @Test
    public void categoriesTest() {
        String profileId = null;
        Integer max = null;
        // List<QualityCategory> response = api.categories(profileId, max);

        // TODO: test validations
    }
    /**
     * Retrieve a single quality category
     *
     * 
     */
    @Test
    public void categoriesIdTest() {
        String profileId = null;
        Integer id = null;
        // List<QualityProfile> response = api.categoriesId(profileId, id);

        // TODO: test validations
    }
}
