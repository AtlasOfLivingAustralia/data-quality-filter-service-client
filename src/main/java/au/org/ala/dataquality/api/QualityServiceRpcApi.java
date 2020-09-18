package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import au.org.ala.dataquality.model.QualityCategory;
import au.org.ala.dataquality.model.QualityFilter;
import au.org.ala.dataquality.model.QualityProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QualityServiceRpcApi {
  /**
   * Retrieve the filter qualityProfile for a given qualityProfile name
   * 
   * @param profileName Profile name (optional)
   * @return Call&lt;QualityProfile&gt;
   */
  @GET("api/v1/quality/activeProfile")
  Call<QualityProfile> activeProfile(
    @retrofit2.http.Query("profileName") String profileName
  );

  /**
   * Find All Enabled Categories
   * 
   * @param profileName Profile name (optional)
   * @return Call&lt;List&lt;QualityCategory&gt;&gt;
   */
  @GET("api/v1/quality/findAllEnabledCategories")
  Call<List<QualityCategory>> findAllEnabledCategories(
    @retrofit2.http.Query("profileName") String profileName
  );

  /**
   * Get all the inverse filter strings for a given quality Profile
   * 
   * @param qualityProfileId Quality Profile Id (optional)
   * @return Call&lt;Map&lt;String, String&gt;&gt;
   */
  @GET("api/v1/quality/getAllInverseCategoryFiltersForProfile")
  Call<Map<String, String>> getAllInverseCategoryFiltersForProfile(
    @retrofit2.http.Query("qualityProfileId") Integer qualityProfileId
  );

  /**
   * Get enabled filters, grouped by category label
   * 
   * @param profileName Profile name (optional)
   * @return Call&lt;Map&lt;String, String&gt;&gt;
   */
  @GET("api/v1/quality/getEnabledFiltersByLabel")
  Call<Map<String, String>> getEnabledFiltersByLabel(
    @retrofit2.http.Query("profileName") String profileName
  );

  /**
   * Get Enabled Quality Filters
   * 
   * @param profileName Profile name (optional)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("api/v1/quality/getEnabledQualityFilters")
  Call<List<String>> getEnabledQualityFilters(
    @retrofit2.http.Query("profileName") String profileName
  );

  /**
   * Get Grouped Enabled Filters
   * 
   * @param profileName Profile name (optional)
   * @return Call&lt;Map&lt;String, List&lt;QualityFilter&gt;&gt;&gt;
   */
  @GET("api/v1/quality/getGroupedEnabledFilters")
  Call<Map<String, List<QualityFilter>>> getGroupedEnabledFilters(
    @retrofit2.http.Query("profileName") String profileName
  );

  /**
   * Get the full inverse filter string for a given quality category
   * 
   * @param qualityCategoryId Quality Category Id (optional)
   * @return Call&lt;String&gt;
   */
  @GET("api/v1/quality/getInverseCategoryFilter")
  Call<String> getInverseCategoryFilter(
    @retrofit2.http.Query("qualityCategoryId") Integer qualityCategoryId
  );

  /**
   * Get the full filter string for a given quality qualityProfile
   * 
   * @param profileName Profile name (optional)
   * @return Call&lt;String&gt;
   */
  @GET("api/v1/quality/getJoinedQualityFilter")
  Call<String> getJoinedQualityFilter(
    @retrofit2.http.Query("profileName") String profileName
  );

}
