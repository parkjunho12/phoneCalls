package com.jun.phonecall.Data

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

class DataClass {
    open class Person(
        // Properties can be annotated with PrimaryKey or Index.
        @PrimaryKey var id: Long = 0,
        var name: String = "",
        var pNumber: String = "",
        var rank : String = "",
        var level : Int = 0

        ): RealmObject()
}