package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import au.org.ala.dataquality.model.QualityCategory;
import au.org.ala.dataquality.model.QualityProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CategoriesApi {
  /**
   * List all quality categories
   * 
   * @param profileId The id or short name for the quality profile or default for the default profile (required)
   * @param max Maximum results to return (optional)
   * @return Call&lt;List&lt;QualityCategory&gt;&gt;
   */
  @GET("api/v1/profiles/{profileId}/categories")
  Call<List<QualityCategory>> categories(
    @retrofit2.http.Path("profileId") String profileId, @retrofit2.http.Query("max") Integer max
  );

  /**
   * Retrieve a single quality category
   * 
   * @param profileId The id or short name for the quality profile or default for the default profile (required)
   * @param id The id for the quality category (required)
   * @return Call&lt;List&lt;QualityProfile&gt;&gt;
   */
  @GET("api/v1/profiles/{profileId}/categories/{id}")
  Call<List<QualityProfile>> categoriesId(
    @retrofit2.http.Path("profileId") String profileId, @retrofit2.http.Path("id") Integer id
  );

}
