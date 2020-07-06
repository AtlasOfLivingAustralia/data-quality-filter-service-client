# ProfilesApi

All URIs are relative to *https://devt.ala.org.au/dataquality-filter*

Method | HTTP request | Description
------------- | ------------- | -------------
[**profiles**](ProfilesApi.md#profiles) | **GET** api/v1/profiles | List all quality profiles
[**profilesId**](ProfilesApi.md#profilesId) | **GET** api/v1/profiles/{id} | List all quality profiles



## profiles

> List&lt;QualityProfile&gt; profiles(max)

List all quality profiles

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        Integer max = 56; // Integer | Maximum results to return
        try {
            List<QualityProfile> result = apiInstance.profiles(max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#profiles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **max** | **Integer**| Maximum results to return | [optional]

### Return type

[**List&lt;QualityProfile&gt;**](QualityProfile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## profilesId

> List&lt;QualityProfile&gt; profilesId(id, max)

List all quality profiles

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.ProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://devt.ala.org.au/dataquality-filter");

        ProfilesApi apiInstance = new ProfilesApi(defaultClient);
        String id = "id_example"; // String | The id for the quality profile or default for the default profile
        Integer max = 56; // Integer | Maximum results to return
        try {
            List<QualityProfile> result = apiInstance.profilesId(id, max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesApi#profilesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id for the quality profile or default for the default profile |
 **max** | **Integer**| Maximum results to return | [optional]

### Return type

[**List&lt;QualityProfile&gt;**](QualityProfile.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

