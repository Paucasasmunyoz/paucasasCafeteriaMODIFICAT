package com.pcmdam.paucasascafeteria


object cartmanager {

    private val selectedItems = mutableMapOf<String, Int>()

    fun addItem(name: String) {
        selectedItems[name] = (selectedItems[name] ?: 0) + 1
    }

    fun removeitem(name: String) {
        val currentCount = selectedItems[name] ?: 0
        if (currentCount > 1) {
            selectedItems[name] =currentCount - 1
        } else {
            selectedItems.remove(name)
        }
    }

    fun getTotalItems(): Int = selectedItems.values.sum()

}