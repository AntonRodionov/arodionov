package ru.job4j.testingtask;

/**
* Class ArrayDuplicate.
* @author arodionov
* @since 14.05.2017
*/

public class SubString {
/**
*Проверка строки на содержание подстроки.
*@param origin - строка.
*@param sub - подстрока.
*@return - возвращает ответ на вопрос в виде логического да/нет.
*/
    public boolean contains(String origin, String sub) {
		char[] subchar = sub.toCharArray();
        char[] originchar = origin.toCharArray();
        int i = 0;
        int k = 0;
        boolean itog = false;
        while (i < (originchar.length - subchar.length)) {
            if (originchar[i] == subchar[0]) {
                k = 1;
                int li = i + 1;
                for (int j = 1; j < subchar.length; j++) {
                    if (originchar[li] == subchar[j]) {
                        k++;
                        li++;
                    }
                }
            }
            if (k == subchar.length) {
                itog = true;
                break;
            }
            i++;
            k = 0;
		}
		return itog;
	}
}
