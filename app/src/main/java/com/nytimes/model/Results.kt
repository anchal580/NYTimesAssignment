import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue
import java.io.Serializable
import java.io.SerializablePermission

/*
Copyright (c) 2020 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */

@Parcelize
data class Results
(

		@SerializedName("uri")
		@Expose
		val uri: String? = null,
		@SerializedName("url")
		@Expose
		val url: String? = null,
		@SerializedName("id")
		@Expose
		val id: Double? = null,
		@SerializedName("asset_id")
		@Expose
		val asset_id: Double? = null,
		@SerializedName("source")
		@Expose
		val source: String? = null,
		@SerializedName("published_date")
		@Expose
		val published_date: String? = null,
		@SerializedName("updated")
		@Expose
		val updated: String? = null,
		@SerializedName("section")
		@Expose
		val section: String? = null,
		@SerializedName("subsection")
		@Expose
		val subsection: String? = null,
		@SerializedName("nytdsection")
		@Expose
		val nytdsection: String? = null,
		@SerializedName("adx_keywords")
		@Expose
		val adx_adx_keywordswords: String? = null,
		@SerializedName("column")
		@Expose
		val column: String? = null,
		@SerializedName("byline")
		@Expose
		val byline: String? = null,
		@SerializedName("type")
		@Expose
		val type: String? = null,
		@SerializedName("title")
		@Expose
		val title: String? = null,
		@SerializedName("abstract")
		@Expose
		val abstract: String? = null,
		@SerializedName("des_facet")
		@Expose
		val des_facet: List<String>? = null,
		@SerializedName("org_facet")
		@Expose
		val org_facet: List<String>? = null,
		@SerializedName("per_facet")
		@Expose
		val per_facet: List<String>? = null,
		@SerializedName("geo_facet")
		@Expose
		val geo_facet: List<String>? = null,
		@SerializedName("media")
		@Expose

		val media: @RawValue List<Media>? = null,
		@SerializedName("eta_id")
		@Expose
		val eta_id: Int? = null
): Parcelable