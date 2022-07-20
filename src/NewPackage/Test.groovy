package NewPackage

import groovy.json.JsonOutput

/**
* Тестовое задание для ООО "РТ-ИНФОРМ"  (Подсчитать количество всех элементов списка/массива
* и вернуть ассоциативных массив, где ключ – элемент списка, значение – количество этих
* элементов в списке. Порядок не имеет значения.
* Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
* @author Разумова Ирина
*/
class Test {
    /**
     * @param arr входной массив
     * @return возврт ассоциативного массива (в виде json) где ключ – элемент входного
     * массива, значение – количество этих элементов в массиве
     */

    static  def assArr(arr) {

        def rez = arr.countBy{it}

        return JsonOutput.toJson(rez).toString().replace('"','')
    }

    static void main(String[] args) {

        def arr = [1, 2, 3, 1, 5, 6, 6, 8, 9, 10, 10, 1, 1, 6]
        println assArr(arr)
    }

}
