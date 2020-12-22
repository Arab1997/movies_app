package barissaglam.client.movieapp.data.model.response

import com.daisybell.movies_app.data.Cast
import com.google.gson.annotations.SerializedName

data class CastResponse(
    @SerializedName("cast") val cast: List<Cast>?,
    @SerializedName("id") val id: Int?
)