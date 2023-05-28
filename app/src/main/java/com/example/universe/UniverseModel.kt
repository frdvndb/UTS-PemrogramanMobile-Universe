package com.example.universe

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// Model Data
@Parcelize
data class UniverseModel(
    val gambarUniverse: Int,
    val judulUniverse: String,
    val deskripsiUniverse: String,
    val deskripsiPanjangUniverse: String,
    val tipeUniverse: String,
    val namaAlternatifUniverse: String
) : Parcelable
