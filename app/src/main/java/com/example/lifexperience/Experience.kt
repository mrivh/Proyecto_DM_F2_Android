package com.example.lifexperience

import android.os.Parcel
import android.os.Parcelable

class Experience (
    val name: String,
    val description: String,
    val rating: Float,
    val idImage: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readFloat(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeFloat(rating)
        parcel.writeInt(idImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Experience> {
        override fun createFromParcel(parcel: Parcel): Experience {
            return Experience(parcel)
        }

        override fun newArray(size: Int): Array<Experience?> {
            return arrayOfNulls(size)
        }
    }
}