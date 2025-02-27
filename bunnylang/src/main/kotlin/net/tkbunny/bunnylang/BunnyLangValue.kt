package net.tkbunny.bunnylang

import net.tkbunny.bunnylang.values.BunnyLangString

open class BunnyLangValue(private val value: Any?) {
  open val isFunction: Boolean = false
  open val type: String = "generic"

  open fun add(operand: BunnyLangValue): BunnyLangValue {
    return BunnyLangString(this.toString() + " " + operand.toString())
  }
  open fun sub(operand: BunnyLangValue): BunnyLangValue {error("This value does not support subtracting")}
  open fun mul(operand: BunnyLangValue): BunnyLangValue {error("This value does not support multiplication")}
  open fun div(operand: BunnyLangValue): BunnyLangValue {error("This value does not support division")}
  open fun mod(operand: BunnyLangValue): BunnyLangValue {error("This value does not support modulo")}

  open fun getKotlinValue(): Any? {
    return value
  }

  open override fun toString(): String {
    return getKotlinValue().toString()
  }

  open fun copy(): BunnyLangValue {
    return BunnyLangValue(value)
  }
}

