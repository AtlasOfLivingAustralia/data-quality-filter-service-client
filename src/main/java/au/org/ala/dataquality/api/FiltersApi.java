package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import au.org.ala.dataquality.model.QualityFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FiltersApi {
  /**
   * List all quality filters
   * 
   * @param profileId The id or short name for the quality profile or default for the default profile (required)
   * @param categoryId The id for the quality category (required)
   * @param max Maximum results to return (optional)
   * @return Call&lt;List&lt;QualityFilter&gt;&gt;
   */
  @GET("api/v1/dataprofiles/{profileId}/categories/{categoryId}/filters")
  Call<List<QualityFilter>> filters(
    @retrofit2.http.Path("profileId") String profileId, @retrofit2.http.Path("categoryId") String categoryId, @retrofit2.http.Query("max") Integer max
  );

  /**
   * Retrieve a single quality filter
   * 
   * @param profileId The id or short name for the quality profile or default for the default profile (required)
   * @param categoryId The id for the quality category (required)
   * @param id The id for the quality category (required)
   * @return Call&lt;List&lt;QualityFilter&gt;&gt;
   */
  @GET("api/v1/dataprofiles/{profileId}/categories/{categoryId}/filters/{id}")
  Call<List<QualityFilter>> filtersId(
    @retrofit2.http.Path("profileId") String profileId, @retrofit2.http.Path("categoryId") String categoryId, @retrofit2.http.Path("id") Integer id
  );

}
