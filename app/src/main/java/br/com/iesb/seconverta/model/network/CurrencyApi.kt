package br.com.iesb.seconverta.model.network

import br.com.iesb.seconverta.model.CountryCode
import com.google.gson.internal.LinkedTreeMap
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CurrencyApi {
    companion object {
        const val BASE_URL = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/"
    }

    @GET("{date}/currencies.json")
    suspend fun fetchAllCountries(@Path("date") date: String): Response<LinkedTreeMap<String, String>>

    @GET("{date}/currencies/{firstCountry}/{secondCountry}.json")
    suspend fun fetchCurrency(
        @Path("date") date: String,
        @Path("firstCountry") fistrCountry: String,
        @Path("secondCountry") secondCountry: String
    )
}