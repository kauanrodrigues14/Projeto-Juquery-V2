package org.example.projetojuquery_v2

class WasmPlataform:Platform {
    override val name: String  = "Web com Kotlin/Wasm"
}
actual fun getPlatform(): Platform = WasmPlataform()