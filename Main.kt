fun qSort(items: List<Int>): List<Int> {
    // если в массиве меньше 2х элементов, то он уже отсортирован
    if (items.count() < 2) {
        return items
    }


    val pivot = items[items.count()/2]
    val equals: MutableList<Int> = mutableListOf()
    val less: MutableList<Int> = mutableListOf()
    val greater: MutableList<Int> = mutableListOf()

    // сортируем элементы по 3м массивам - меньшие, равные и большие опорного
    for (i in items) {
        if (i == pivot) {
            equals.add(i)
        }
    }

    for (i in items) {
        if (i < pivot) {
            less.add(i)
        }
    }

    for (i in items) {
        if (i > pivot) {
            greater.add(i)
        }
    }

    // рекурсивно вызываем функцию для меньших и больших элементов
    return qSort(less) + equals + qSort(greater)
}

fun main() {

    val array = listOf(8, 5, 2, 5, 3, 4)

    println(qSort(array))

}