# DataProfilesApi

All URIs are relative to *https://data-quality-service.ala.org.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataProfiles**](DataProfilesApi.md#dataProfiles) | **GET** api/v1/data-profiles | List all quality profiles
[**dataProfilesId**](DataProfilesApi.md#dataProfilesId) | **GET** api/v1/data-profiles/{id} | Retrieve a single quality profile



## dataProfiles

> List&lt;QualityProfile&gt; dataProfiles(max, offset, sort, order, enabled, name, shortName)

List all quality profiles

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.DataProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        DataProfilesApi apiInstance = new DataProfilesApi(defaultClient);
        Integer max = 56; // Integer | Maximum results to return
        Integer offset = 56; // Integer | Offset results by
        String sort = "sort_example"; // String | Property to sort results by
        String order = "order_example"; // String | Direction to sort results by
        Boolean enabled = true; // Boolean | Only return enabled profiles
        String name = "name_example"; // String | Search for profiles by name
        String shortName = "shortName_example"; // String | Search for profiles by short name
        try {
            List<QualityProfile> result = apiInstance.dataProfiles(max, offset, sort, order, enabled, name, shortName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataProfilesApi#dataProfiles");
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
 **offset** | **Integer**| Offset results by | [optional]
 **sort** | **String**| Property to sort results by | [optional]
 **order** | **String**| Direction to sort results by | [optional]
 **enabled** | **Boolean**| Only return enabled profiles | [optional]
 **name** | **String**| Search for profiles by name | [optional]
 **shortName** | **String**| Search for profiles by short name | [optional]

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


## dataProfilesId

> List&lt;QualityProfile&gt; dataProfilesId(id)

Retrieve a single quality profile

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.DataProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        DataProfilesApi apiInstance = new DataProfilesApi(defaultClient);
        String id = "id_example"; // String | The id or short name for the quality profile or default for the default profile
        try {
            List<QualityProfile> result = apiInstance.dataProfilesId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataProfilesApi#dataProfilesId");
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
 **id** | **String**| The id or short name for the quality profile or default for the default profile |

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

