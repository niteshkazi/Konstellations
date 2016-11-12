package com.orobator.konstellations

import java.io.Serializable

enum class Constellation(val constellationName: String, desc: String) : Serializable {
  AQUARIUS(R.string.aquarius.getString(), R.string.aquarius_desc.getString()),
  AQUILA(R.string.aquila.getString(), R.string.aquila_desc.getString()),
  ARIES(R.string.aries.getString(), R.string.aries_desc.getString()),
  AURIGA(R.string.auriga.getString(), R.string.auriga_desc.getString()),
  BOOTES(R.string.bootes.getString(), R.string.bootes_desc.getString()),
  CANCER(R.string.cancer.getString(), R.string.cancer_desc.getString()),
  CANIS_MAJOR(R.string.canis_major.getString(), R.string.canis_major_desc.getString()),
  CAPRICORNUS(R.string.capricornus.getString(), R.string.capricornus_desc.getString()),
  CASSIOPEIA(R.string.cassiopeia.getString(), R.string.cassiopeia_desc.getString()),
  CYGNUS(R.string.cygnus.getString(), R.string.cygnus_desc.getString()),
  GEMINI(R.string.gemini.getString(), R.string.gemini_desc.getString()),
  LEO(R.string.leo.getString(), R.string.leo_desc.getString()),
  LIBRA(R.string.libra.getString(), R.string.libra_desc.getString()),
  LYRA(R.string.lyra.getString(), R.string.lyra_desc.getString()),
  ORION(R.string.orion.getString(), R.string.orion_desc.getString()),
  PEGASUS(R.string.pegasus.getString(), R.string.pegasus_desc.getString()),
  PERSEUS(R.string.perseus.getString(), R.string.perseus_desc.getString()),
  PISCES(R.string.pisces.getString(), R.string.pisces_desc.getString()),
  SAGITTARIUS(R.string.sagittarius.getString(), R.string.sagittarius_desc.getString()),
  SCORPIUS(R.string.scorpius.getString(), R.string.scorpius_desc.getString()),
  TAURUS(R.string.taurus.getString(), R.string.taurus_desc.getString()),
  URSA_MAJOR(R.string.ursa_major.getString(), R.string.ursa_major_desc.getString()),
  VIRGO(R.string.virgo.getString(), R.string.virgo_desc.getString());

  val description = desc + R.string.content_attribution.getString()

  companion object {
    fun fromString(name: String) : Constellation {
      return Constellation.values().filter { it.name == name }.first()
    }
  }
}