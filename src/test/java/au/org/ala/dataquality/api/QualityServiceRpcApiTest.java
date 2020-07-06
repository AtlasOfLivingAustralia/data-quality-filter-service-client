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
 * API tests for QualityServiceRpcApi
 */
public class QualityServiceRpcApiTest {

    private QualityServiceRpcApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QualityServiceRpcApi.class);
    }

    /**
     * Retrieve the filter qualityProfile for a given qualityProfile name
     *
     * 
     */
    @Test
    public void activeProfileTest() {
        String profileName = null;
        // QualityProfile response = api.activeProfile(profileName);

        // TODO: test validations
    }
    /**
     * Find All Enabled Categories
     *
     * 
     */
    @Test
    public void findAllEnabledCategoriesTest() {
        String profileName = null;
        // List<QualityCategory> response = api.findAllEnabledCategories(profileName);

        // TODO: test validations
    }
    /**
     * Get enabled filters, grouped by category label
     *
     * 
     */
    @Test
    public void getEnabledFiltersByLabelTest() {
        String profileName = null;
        // Map<String, String> response = api.getEnabledFiltersByLabel(profileName);

        // TODO: test validations
    }
    /**
     * Get Enabled Quality Filters
     *
     * 
     */
    @Test
    public void getEnabledQualityFiltersTest() {
        String profileName = null;
        // List<String> response = api.getEnabledQualityFilters(profileName);

        // TODO: test validations
    }
    /**
     * Get Grouped Enabled Filters
     *
     * 
     */
    @Test
    public void getGroupedEnabledFiltersTest() {
        String profileName = null;
        // Map<String, List<QualityFilter>> response = api.getGroupedEnabledFilters(profileName);

        // TODO: test validations
    }
    /**
     * Get the full inverse filter string for a given quality qualityProfile
     *
     * 
     */
    @Test
    public void getInverseCategoryFilterTest() {
        String profileName = null;
        // String response = api.getInverseCategoryFilter(profileName);

        // TODO: test validations
    }
    /**
     * Get the full filter string for a given quality qualityProfile
     *
     * 
     */
    @Test
    public void getJoinedQualityFilterTest() {
        String profileName = null;
        // String response = api.getJoinedQualityFilter(profileName);

        // TODO: test validations
    }
}
