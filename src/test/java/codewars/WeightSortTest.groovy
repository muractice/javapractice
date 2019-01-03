package codewars

import spock.lang.Specification

/**
 * Created by murahige on 19/01/03.
 */
class WeightSortTest extends Specification {
    def test(){
        setup:
        def sut = new WeightSort()

        expect:
        sut.orderWeight(s) == expected

        where:
        s                                               |  expected
        "103 123 4444 99 2000"                          | "2000 103 123 4444 99"
        "2000 10003 1234000 44444444 9999 11 11 22 123" | "11 11 2000 10003 22 123 1234000 44444444 9999"

    }
}
