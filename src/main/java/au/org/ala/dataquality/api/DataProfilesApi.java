package au.org.ala.dataquality.api;

import au.org.ala.dataquality.model.QualityProfile;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface DataProfilesApi {
  /**
   * List all quality profiles
   * 
   * @param max Maximum results to return (optional)
   * @param offset Offset results by (optional)
   * @param sort Property to sort results by (optional)
   * @param order Direction to sort results by (optional)
   * @param enabled Only return enabled profiles (optional)
   * @param name Search for profiles by name (optional)
   * @param shortName Search for profiles by short name (optional)
   * @param userId the userId used to search private profiles (optional)
   * @return Call&lt;List&lt;QualityProfile&gt;&gt;
   */
  @GET("api/v1/data-profiles")
  Call<List<QualityProfile>> dataProfiles(
    @retrofit2.http.Query("max") Integer max, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("sort") String sort, @retrofit2.http.Query("order") String order, @retrofit2.http.Query("enabled") Boolean enabled, @retrofit2.http.Query("name") String name, @retrofit2.http.Query("shortName") String shortName, @retrofit2.http.Query("userId") String userId
  );

  /**
   * Retrieve a single quality profile
   * 
   * @param id The id or short name for the quality profile (required)
   * @return Call&lt;QualityProfile&gt;
   */
  @GET("api/v1/data-profiles/{id}")
  Call<QualityProfile> dataProfilesId(
    @retrofit2.http.Path("id") String id
  );

}
