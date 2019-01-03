package codewars

import spock.lang.Specification

/**
 * Created by murahige on 19/01/03.
 */
class SeparatePositiveNumberTestSpock extends Specification {
    def test(){
        setup:
        def sut = new SeparatePositiveNumber();

        expect:
        sut.wheatFromChaff(values) == expected

        where:
        values              | expected
        [2, -4, 6, -6]      |[-6, -4, 6, 2]
    }
}
