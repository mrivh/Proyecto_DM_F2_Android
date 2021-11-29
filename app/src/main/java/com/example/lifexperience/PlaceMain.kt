package com.example.lifexperience

import android.os.Parcel
import android.os.Parcelable

data class PlaceMain(
    var name: String,
    var description: String,
    var idImage: Int
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeInt(idImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlaceMain> {
        override fun createFromParcel(parcel: Parcel): PlaceMain {
            return PlaceMain(parcel)
        }

        override fun newArray(size: Int): Array<PlaceMain?> {
            return arrayOfNulls(size)
        }
    }
}