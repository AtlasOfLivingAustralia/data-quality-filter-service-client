# CategoriesApi

All URIs are relative to *https://data-quality-service.ala.org.au*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categories**](CategoriesApi.md#categories) | **GET** api/v1/data-profiles/{profileId}/categories | List all quality categories
[**categoriesId**](CategoriesApi.md#categoriesId) | **GET** api/v1/data-profiles/{profileId}/categories/{id} | Retrieve a single quality category



## categories

> List&lt;QualityCategory&gt; categories(profileId, max)

List all quality categories

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String profileId = "profileId_example"; // String | The id or short name for the quality profile or default for the default profile
        Integer max = 56; // Integer | Maximum results to return
        try {
            List<QualityCategory> result = apiInstance.categories(profileId, max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#categories");
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
 **max** | **Integer**| Maximum results to return | [optional]

### Return type

[**List&lt;QualityCategory&gt;**](QualityCategory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## categoriesId

> List&lt;QualityProfile&gt; categoriesId(profileId, id)

Retrieve a single quality category

### Example

```java
// Import classes:
import au.org.ala.dataquality.client.ApiClient;
import au.org.ala.dataquality.client.ApiException;
import au.org.ala.dataquality.client.Configuration;
import au.org.ala.dataquality.client.models.*;
import au.org.ala.dataquality.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://data-quality-service.ala.org.au");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String profileId = "profileId_example"; // String | The id or short name for the quality profile or default for the default profile
        Integer id = 56; // Integer | The id for the quality category
        try {
            List<QualityProfile> result = apiInstance.categoriesId(profileId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#categoriesId");
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
 **id** | **Integer**| The id for the quality category |

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

