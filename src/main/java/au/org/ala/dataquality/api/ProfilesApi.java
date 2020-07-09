package au.org.ala.dataquality.api;

import au.org.ala.dataquality.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import au.org.ala.dataquality.model.QualityProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProfilesApi {
  /**
   * List all quality profiles
   * 
   * @param max Maximum results to return (optional)
   * @return Call&lt;List&lt;QualityProfile&gt;&gt;
   */
  @GET("api/v1/profiles")
  Call<List<QualityProfile>> profiles(
    @retrofit2.http.Query("max") Integer max
  );

  /**
   * List all quality profiles
   * 
   * @param id The id or short name for the quality profile or default for the default profile (required)
   * @param max Maximum results to return (optional)
   * @return Call&lt;List&lt;QualityProfile&gt;&gt;
   */
  @GET("api/v1/profiles/{id}")
  Call<List<QualityProfile>> profilesId(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("max") Integer max
  );

}
