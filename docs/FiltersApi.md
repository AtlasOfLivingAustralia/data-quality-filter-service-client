# FiltersApi

All URIs are relative to *https://data-quality-service.ala.org.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**filters**](FiltersApi.md#filters) | **GET** api/v1/data-profiles/{profileId}/categories/{categoryId}/filters | List all quality filters
[**filtersId**](FiltersApi.md#filtersId) | **GET** api/v1/data-profiles/{profileId}/categories/{categoryId}/filters/{id} | Retrieve a single quality filter



## filters

> List&lt;QualityFilter&gt; filters(profileId, categoryId, max)

List all quality filters

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        String profileId = "profileId_example"; // String | The id or short name for the quality profile or default for the default profile
        String categoryId = "categoryId_example"; // String | The id for the quality category
        Integer max = 56; // Integer | Maximum results to return
        try {
            List<QualityFilter> result = apiInstance.filters(profileId, categoryId, max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#filters");
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
 **profileId** | **String**| The id or short name for the quality profile or default for the default profile |
 **categoryId** | **String**| The id for the quality category |
 **max** | **Integer**| Maximum results to return | [optional]

### Return type

[**List&lt;QualityFilter&gt;**](QualityFilter.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## filtersId

> List&lt;QualityFilter&gt; filtersId(profileId, categoryId, id)

Retrieve a single quality filter

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        String profileId = "profileId_example"; // String | The id or short name for the quality profile or default for the default profile
        String categoryId = "categoryId_example"; // String | The id for the quality category
        Integer id = 56; // Integer | The id for the quality category
        try {
            List<QualityFilter> result = apiInstance.filtersId(profileId, categoryId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#filtersId");
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
 **profileId** | **String**| The id or short name for the quality profile or default for the default profile |
 **categoryId** | **String**| The id for the quality category |
 **id** | **Integer**| The id for the quality category |

### Return type

[**List&lt;QualityFilter&gt;**](QualityFilter.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

