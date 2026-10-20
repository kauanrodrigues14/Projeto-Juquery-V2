@file:OptIn(InternalResourceApi::class)

package projetojuquery_v2.shared.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceContentHash
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/projetojuquery_v2.shared.generated.resources/"

@delegate:ResourceContentHash(470_159_096)
internal val Res.drawable.compose_multiplatform: DrawableResource by lazy {
      DrawableResource("drawable:compose_multiplatform", setOf(
        ResourceItem(setOf(), "${MD}drawable/compose-multiplatform.xml", -1, -1),
      ))
    }

@delegate:ResourceContentHash(-2_049_175_674)
internal val Res.drawable.ic_home: DrawableResource by lazy {
      DrawableResource("drawable:ic_home", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_home.png", -1, -1),
      ))
    }

@delegate:ResourceContentHash(-615_731_537)
internal val Res.drawable.ic_news: DrawableResource by lazy {
      DrawableResource("drawable:ic_news", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_news.png", -1, -1),
      ))
    }

@delegate:ResourceContentHash(861_099_187)
internal val Res.drawable.ic_weather: DrawableResource by lazy {
      DrawableResource("drawable:ic_weather", setOf(
        ResourceItem(setOf(), "${MD}drawable/ic_weather.png", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", Res.drawable.compose_multiplatform)
  map.put("ic_home", Res.drawable.ic_home)
  map.put("ic_news", Res.drawable.ic_news)
  map.put("ic_weather", Res.drawable.ic_weather)
}
